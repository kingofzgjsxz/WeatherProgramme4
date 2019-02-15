package com.truezir.android.weatherprogramme;

public  class GetAirQulityDetail {

    private AirQuality mAirQuality;

    private AirQualityFetch mAirQualityFetch;

    private void initialize(){

        mAirQualityFetch=new AirQualityFetch();

        mAirQuality=mAirQualityFetch.getAirQuality();

    }

    public String getAirQualityDescription(){

        initialize();

        return mAirQuality.getAir_now_city().getQlty();

    }
}
