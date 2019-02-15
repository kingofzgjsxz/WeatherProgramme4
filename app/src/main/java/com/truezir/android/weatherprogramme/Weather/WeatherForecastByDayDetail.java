package com.truezir.android.weatherprogramme.Weather;

public class WeatherForecastByDayDetail {
    private WeatherForecastByDay mWeatherForecastByDay;

    private WeatherForecastByDayFetch mWeatherForecastByDayFetch;

    private void initialize(){

        mWeatherForecastByDayFetch=new WeatherForecastByDayFetch();

        mWeatherForecastByDay=mWeatherForecastByDayFetch.getWeatherForecastByDay();

    }

    public String getWeatherForecastByDayDayOneDayDescription(){

        initialize();

        return mWeatherForecastByDay.getDaily_forecast().get(0).getCond_txt_d();
    }

    public String getWeatherForecastByDayDayOneNightDescription(){

        initialize();

        return mWeatherForecastByDay.getDaily_forecast().get(0).getCond_txt_n();
    }
}
