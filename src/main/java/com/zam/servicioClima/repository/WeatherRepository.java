package com.zam.servicioClima.repository;

import com.zam.servicioClima.model.WeatherResponse;

public interface WeatherRepository {
    public WeatherResponse getWeather(double lat, double lon);
}
