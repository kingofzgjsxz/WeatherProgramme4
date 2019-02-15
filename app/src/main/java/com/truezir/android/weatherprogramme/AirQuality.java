package com.truezir.android.weatherprogramme;

import java.util.List;

public class AirQuality {


    /**
     * basic : {"cid":"CN101190801","location":"徐州","parent_city":"徐州","admin_area":"江苏","cnty":"中国","lat":"34.26179123","lon":"117.18481445","tz":"+8.00"}
     * update : {"loc":"2019-02-06 09:58","utc":"2019-02-06 01:58"}
     * status : ok
     * air_now_city : {"aqi":"220","qlty":"重度污染","main":"PM2.5","pm25":"170","pm10":"213","no2":"36","so2":"8","co":"1.5","o3":"18","pub_time":"2019-02-06 09:00"}
     * air_now_station : [{"air_sta":"黄河新村","aqi":"231","asid":"CNA1177","co":"1.8","lat":"34.2761","lon":"117.167","main":"PM2.5","no2":"39","o3":"8","pm10":"221","pm25":"181","pub_time":"2019-02-06 09:00","qlty":"重度污染","so2":"16"},{"air_sta":"淮塔","aqi":"206","asid":"CNA1178","co":"1.3","lat":"34.2417","lon":"117.192","main":"PM2.5","no2":"41","o3":"14","pm10":"168","pm25":"156","pub_time":"2019-02-06 09:00","qlty":"重度污染","so2":"8"},{"air_sta":"新城区","aqi":"217","asid":"CNA1180","co":"1.4","lat":"34.2153","lon":"117.256","main":"PM2.5","no2":"23","o3":"24","pm10":"208","pm25":"167","pub_time":"2019-02-06 09:00","qlty":"重度污染","so2":"3"},{"air_sta":"桃园路","aqi":"235","asid":"CNA1181","co":"1.1","lat":"34.2911","lon":"117.244","main":"PM2.5","no2":"24","o3":"25","pm10":"237","pm25":"185","pub_time":"2019-02-06 09:00","qlty":"重度污染","so2":"6"},{"air_sta":"农科院","aqi":"223","asid":"CNA1182","co":"1.4","lat":"34.2778","lon":"117.2933","main":"PM2.5","no2":"34","o3":"20","pm10":"207","pm25":"173","pub_time":"2019-02-06 09:00","qlty":"重度污染","so2":"4"},{"air_sta":"鼓楼区政府","aqi":"235","asid":"CNA3005","co":"1.6","lat":"34.29","lon":"117.1814","main":"PM2.5","no2":"52","o3":"10","pm10":"235","pm25":"185","pub_time":"2019-02-06 09:00","qlty":"重度污染","so2":"12"},{"air_sta":"铜山区招生办","aqi":"189","asid":"CNA3006","co":"1.3","lat":"34.1781","lon":"117.1694","main":"PM2.5","no2":"34","o3":"21","pm10":"214","pm25":"142","pub_time":"2019-02-06 09:00","qlty":"中度污染","so2":"2"}]
     */

    private BasicBean basic;
    private UpdateBean update;
    private String status;
    private AirNowCityBean air_now_city;
    private List<AirNowStationBean> air_now_station;

    public BasicBean getBasic() {
        return basic;
    }

    public void setBasic(BasicBean basic) {
        this.basic = basic;
    }

    public UpdateBean getUpdate() {
        return update;
    }

    public void setUpdate(UpdateBean update) {
        this.update = update;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AirNowCityBean getAir_now_city() {
        return air_now_city;
    }

    public void setAir_now_city(AirNowCityBean air_now_city) {
        this.air_now_city = air_now_city;
    }

    public List<AirNowStationBean> getAir_now_station() {
        return air_now_station;
    }

    public void setAir_now_station(List<AirNowStationBean> air_now_station) {
        this.air_now_station = air_now_station;
    }

    public static class BasicBean {
        /**
         * cid : CN101190801
         * location : 徐州
         * parent_city : 徐州
         * admin_area : 江苏
         * cnty : 中国
         * lat : 34.26179123
         * lon : 117.18481445
         * tz : +8.00
         */

        private String cid;
        private String location;
        private String parent_city;
        private String admin_area;
        private String cnty;
        private String lat;
        private String lon;
        private String tz;

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getParent_city() {
            return parent_city;
        }

        public void setParent_city(String parent_city) {
            this.parent_city = parent_city;
        }

        public String getAdmin_area() {
            return admin_area;
        }

        public void setAdmin_area(String admin_area) {
            this.admin_area = admin_area;
        }

        public String getCnty() {
            return cnty;
        }

        public void setCnty(String cnty) {
            this.cnty = cnty;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getTz() {
            return tz;
        }

        public void setTz(String tz) {
            this.tz = tz;
        }
    }

    public static class UpdateBean {
        /**
         * loc : 2019-02-06 09:58
         * utc : 2019-02-06 01:58
         */

        private String loc;
        private String utc;

        public String getLoc() {
            return loc;
        }

        public void setLoc(String loc) {
            this.loc = loc;
        }

        public String getUtc() {
            return utc;
        }

        public void setUtc(String utc) {
            this.utc = utc;
        }
    }

    public static class AirNowCityBean {
        /**
         * aqi : 220
         * qlty : 重度污染
         * main : PM2.5
         * pm25 : 170
         * pm10 : 213
         * no2 : 36
         * so2 : 8
         * co : 1.5
         * o3 : 18
         * pub_time : 2019-02-06 09:00
         */

        private String aqi;
        private String qlty;
        private String main;
        private String pm25;
        private String pm10;
        private String no2;
        private String so2;
        private String co;
        private String o3;
        private String pub_time;

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getQlty() {
            return qlty;
        }

        public void setQlty(String qlty) {
            this.qlty = qlty;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public String getPm10() {
            return pm10;
        }

        public void setPm10(String pm10) {
            this.pm10 = pm10;
        }

        public String getNo2() {
            return no2;
        }

        public void setNo2(String no2) {
            this.no2 = no2;
        }

        public String getSo2() {
            return so2;
        }

        public void setSo2(String so2) {
            this.so2 = so2;
        }

        public String getCo() {
            return co;
        }

        public void setCo(String co) {
            this.co = co;
        }

        public String getO3() {
            return o3;
        }

        public void setO3(String o3) {
            this.o3 = o3;
        }

        public String getPub_time() {
            return pub_time;
        }

        public void setPub_time(String pub_time) {
            this.pub_time = pub_time;
        }
    }

    public static class AirNowStationBean {
        /**
         * air_sta : 黄河新村
         * aqi : 231
         * asid : CNA1177
         * co : 1.8
         * lat : 34.2761
         * lon : 117.167
         * main : PM2.5
         * no2 : 39
         * o3 : 8
         * pm10 : 221
         * pm25 : 181
         * pub_time : 2019-02-06 09:00
         * qlty : 重度污染
         * so2 : 16
         */

        private String air_sta;
        private String aqi;
        private String asid;
        private String co;
        private String lat;
        private String lon;
        private String main;
        private String no2;
        private String o3;
        private String pm10;
        private String pm25;
        private String pub_time;
        private String qlty;
        private String so2;

        public String getAir_sta() {
            return air_sta;
        }

        public void setAir_sta(String air_sta) {
            this.air_sta = air_sta;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getAsid() {
            return asid;
        }

        public void setAsid(String asid) {
            this.asid = asid;
        }

        public String getCo() {
            return co;
        }

        public void setCo(String co) {
            this.co = co;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getNo2() {
            return no2;
        }

        public void setNo2(String no2) {
            this.no2 = no2;
        }

        public String getO3() {
            return o3;
        }

        public void setO3(String o3) {
            this.o3 = o3;
        }

        public String getPm10() {
            return pm10;
        }

        public void setPm10(String pm10) {
            this.pm10 = pm10;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public String getPub_time() {
            return pub_time;
        }

        public void setPub_time(String pub_time) {
            this.pub_time = pub_time;
        }

        public String getQlty() {
            return qlty;
        }

        public void setQlty(String qlty) {
            this.qlty = qlty;
        }

        public String getSo2() {
            return so2;
        }

        public void setSo2(String so2) {
            this.so2 = so2;
        }
    }
}
