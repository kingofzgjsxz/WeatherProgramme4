package com.truezir.android.weatherprogramme;

import android.net.Uri;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AirQualityFetch {

    //测试信息:TAG
    private static final String TAG = "AirQualityFetch";


    //API信息:Key
    private static final String API_KEY = "4f9115957d7c408eb7c3cc1b68bb783e";

    //API信息:网址
    private static final String uri="https://api.heweather.net/s6/air/now?";

    //API信息:第一个参数（在此应用中是地址）
    private static final String location="徐州";




    //类的内部信息：获取从网页的数据
    private String mFetchItems;

    //用来构建网址交给getUrlString函数，并且获取getUrlString函数所得的字符串
    private String fetchItems(){
        try {
            String url = Uri.parse(uri)
                    .buildUpon()
                    .appendQueryParameter("location",location)
                    .appendQueryParameter("key", API_KEY)
                    .build().toString();
            Log.i(TAG, "fetchItems: "+url);
            String jsonString = getUrlString(url);
            Log.i(TAG, "Received JSON: " + jsonString);
            return jsonString;
        } catch (IOException ioe) {
            Log.e(TAG, "Failed to fetch items", ioe);
        }
        Log.i(TAG, "fetchItems: Fail to receive from WebSite");
        return null;
    }

    //用来接收网站上所给的字符串
    private byte[] getUrlBytes(String urlSpec) throws IOException {
        URL url = new URL(urlSpec);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            InputStream in = connection.getInputStream();
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new IOException(connection.getResponseMessage() +
                        ": with " +
                        urlSpec);
            }
            int bytesRead = 0;
            byte[] buffer = new byte[1024];
            while ((bytesRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, bytesRead);
            }
            out.close();
            return out.toByteArray();
        } finally {
            connection.disconnect();
        }
    }

    private String getUrlString(String urlSpec) throws IOException {
        return new String(getUrlBytes(urlSpec));
    }

    //解析Gson数据
    private static AirQuality handleAirQuality(String response){
        try{
            JSONObject jsonObject = new JSONObject(response);
            Log.i(TAG,"handlejsonObject: good");


//            JSONArray jsonArray=new JSONArray(response);
            JSONArray jsonArray = jsonObject.getJSONArray("HeWeather6");
            //JSONArray jsonArray= (JSONArray) list;

            Log.i(TAG,"handlejsonArray: good");
            String weatherContent = jsonArray.getJSONObject(0).toString();

            Log.i(TAG, weatherContent);

            Log.i(TAG, "handleWeatherResponse: good");


            /**注意更改此处的类的类型*/

            return new Gson().fromJson(weatherContent, AirQuality.class);

        }catch (JSONException e){
            e.printStackTrace();
            Log.i(TAG, "handleWeatherResponse: bad");
        }
        return null;
    }

    public AirQuality getAirQuality(){

        mFetchItems=fetchItems();//接收网络所传的字符串;

        /**注意更改此处的类的类型*/

        AirQuality mAirQuality=handleAirQuality(mFetchItems);

        return mAirQuality;
    }

}
