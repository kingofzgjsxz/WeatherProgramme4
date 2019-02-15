package com.truezir.android.weatherprogramme.Weather;

import java.util.List;

public class WeatherForecastByDay {

    /**
     * basic : {"cid":"CN101190801","location":"徐州","parent_city":"徐州","admin_area":"江苏","cnty":"中国","lat":"34.26179123","lon":"117.18481445","tz":"+8.00"}
     * update : {"loc":"2019-02-15 20:56","utc":"2019-02-15 12:56"}
     * status : ok
     * daily_forecast : [{"cond_code_d":"104","cond_code_n":"101","cond_txt_d":"阴","cond_txt_n":"多云","date":"2019-02-15","hum":"90","pcpn":"0.0","pop":"25","pres":"1029","sr":"06:55","ss":"17:55","tmp_max":"3","tmp_min":"-4","uv_index":"1","vis":"20","wind_deg":"5","wind_dir":"北风","wind_sc":"1-2","wind_spd":"8"},{"cond_code_d":"104","cond_code_n":"101","cond_txt_d":"阴","cond_txt_n":"多云","date":"2019-02-16","hum":"47","pcpn":"1.0","pop":"55","pres":"1033","sr":"06:54","ss":"17:56","tmp_max":"5","tmp_min":"-3","uv_index":"0","vis":"20","wind_deg":"57","wind_dir":"东北风","wind_sc":"1-2","wind_spd":"5"},{"cond_code_d":"104","cond_code_n":"401","cond_txt_d":"阴","cond_txt_n":"中雪","date":"2019-02-17","hum":"34","pcpn":"0.0","pop":"6","pres":"1033","sr":"06:53","ss":"17:57","tmp_max":"6","tmp_min":"-2","uv_index":"2","vis":"20","wind_deg":"100","wind_dir":"东风","wind_sc":"1-2","wind_spd":"1"}]
     */

    private BasicBean basic;
    private UpdateBean update;
    private String status;
    private List<DailyForecastBean> daily_forecast;

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

    public List<DailyForecastBean> getDaily_forecast() {
        return daily_forecast;
    }

    public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
        this.daily_forecast = daily_forecast;
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
         * loc : 2019-02-15 20:56
         * utc : 2019-02-15 12:56
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

    public static class DailyForecastBean {
        /**
         * cond_code_d : 104
         * cond_code_n : 101
         * cond_txt_d : 阴
         * cond_txt_n : 多云
         * date : 2019-02-15
         * hum : 90
         * pcpn : 0.0
         * pop : 25
         * pres : 1029
         * sr : 06:55
         * ss : 17:55
         * tmp_max : 3
         * tmp_min : -4
         * uv_index : 1
         * vis : 20
         * wind_deg : 5
         * wind_dir : 北风
         * wind_sc : 1-2
         * wind_spd : 8
         */

        private String cond_code_d;
        private String cond_code_n;
        private String cond_txt_d;
        private String cond_txt_n;
        private String date;
        private String hum;
        private String pcpn;
        private String pop;
        private String pres;
        private String sr;
        private String ss;
        private String tmp_max;
        private String tmp_min;
        private String uv_index;
        private String vis;
        private String wind_deg;
        private String wind_dir;
        private String wind_sc;
        private String wind_spd;

        public String getCond_code_d() {
            return cond_code_d;
        }

        public void setCond_code_d(String cond_code_d) {
            this.cond_code_d = cond_code_d;
        }

        public String getCond_code_n() {
            return cond_code_n;
        }

        public void setCond_code_n(String cond_code_n) {
            this.cond_code_n = cond_code_n;
        }

        public String getCond_txt_d() {
            return cond_txt_d;
        }

        public void setCond_txt_d(String cond_txt_d) {
            this.cond_txt_d = cond_txt_d;
        }

        public String getCond_txt_n() {
            return cond_txt_n;
        }

        public void setCond_txt_n(String cond_txt_n) {
            this.cond_txt_n = cond_txt_n;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getHum() {
            return hum;
        }

        public void setHum(String hum) {
            this.hum = hum;
        }

        public String getPcpn() {
            return pcpn;
        }

        public void setPcpn(String pcpn) {
            this.pcpn = pcpn;
        }

        public String getPop() {
            return pop;
        }

        public void setPop(String pop) {
            this.pop = pop;
        }

        public String getPres() {
            return pres;
        }

        public void setPres(String pres) {
            this.pres = pres;
        }

        public String getSr() {
            return sr;
        }

        public void setSr(String sr) {
            this.sr = sr;
        }

        public String getSs() {
            return ss;
        }

        public void setSs(String ss) {
            this.ss = ss;
        }

        public String getTmp_max() {
            return tmp_max;
        }

        public void setTmp_max(String tmp_max) {
            this.tmp_max = tmp_max;
        }

        public String getTmp_min() {
            return tmp_min;
        }

        public void setTmp_min(String tmp_min) {
            this.tmp_min = tmp_min;
        }

        public String getUv_index() {
            return uv_index;
        }

        public void setUv_index(String uv_index) {
            this.uv_index = uv_index;
        }

        public String getVis() {
            return vis;
        }

        public void setVis(String vis) {
            this.vis = vis;
        }

        public String getWind_deg() {
            return wind_deg;
        }

        public void setWind_deg(String wind_deg) {
            this.wind_deg = wind_deg;
        }

        public String getWind_dir() {
            return wind_dir;
        }

        public void setWind_dir(String wind_dir) {
            this.wind_dir = wind_dir;
        }

        public String getWind_sc() {
            return wind_sc;
        }

        public void setWind_sc(String wind_sc) {
            this.wind_sc = wind_sc;
        }

        public String getWind_spd() {
            return wind_spd;
        }

        public void setWind_spd(String wind_spd) {
            this.wind_spd = wind_spd;
        }
    }
}
