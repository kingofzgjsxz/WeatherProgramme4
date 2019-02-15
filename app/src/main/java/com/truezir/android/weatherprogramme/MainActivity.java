package com.truezir.android.weatherprogramme;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.truezir.android.weatherprogramme.Voice.VoiceProduce;
import com.truezir.android.weatherprogramme.Weather.WeatherForecastByDayDetail;

public class MainActivity extends AppCompatActivity {

    Button mGetAirQualityDescriptionBtn;

    Button mGetWeatherForecastByDayDayOneDayBtn;

    Button mGetWeatherForecastByDayDayOneNightBtn;

    String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        StrictMode.ThreadPolicy policy=new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGetAirQualityDescriptionBtn=findViewById(R.id.get_Air_Quality_Description_Btn);
        mGetAirQualityDescriptionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO 刷新数据
                GetAirQulityDetail mgetAirQulityDetail=new GetAirQulityDetail();
                String airQualityDescription=mgetAirQulityDetail.getAirQualityDescription();

                VoiceProduce voiceProduce=new VoiceProduce();
                voiceProduce.initialize();
                voiceProduce.startSynthesizer(v,"徐州市今天的空气质量是:"+airQualityDescription);
                voiceProduce.onDestroy();
            }
        });

        mGetWeatherForecastByDayDayOneDayBtn=findViewById(R.id.get_Weather_ForeCast_ByDay_Today_Day_Btn);
        mGetWeatherForecastByDayDayOneDayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeatherForecastByDayDetail mWeatherForecastByDayDetail=new WeatherForecastByDayDetail();
                String forecastByDayDayOneDayDetail=mWeatherForecastByDayDetail.getWeatherForecastByDayDayOneDayDescription();
                VoiceProduce voiceProduce=new VoiceProduce();
                voiceProduce.initialize();
                voiceProduce.startSynthesizer(v,"徐州市今天白天的天气是:"+forecastByDayDayOneDayDetail);
                voiceProduce.onDestroy();
            }
        });

        mGetWeatherForecastByDayDayOneNightBtn=findViewById(R.id.get_Weather_ForeCast_ByDay_Today_Night_Btn);
        mGetWeatherForecastByDayDayOneNightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeatherForecastByDayDetail mWeatherForecastByDayDetail=new WeatherForecastByDayDetail();
                String forecastByDayDayOneNightDeatil=mWeatherForecastByDayDetail.getWeatherForecastByDayDayOneNightDescription();
                VoiceProduce voiceProduce=new VoiceProduce();
                voiceProduce.initialize();
                voiceProduce.startSynthesizer(v,"徐州市今天夜晚的天气是:"+forecastByDayDayOneNightDeatil);
                voiceProduce.onDestroy();
            }
        });



    }
}
