package com.zam.servicioClima.service;


import com.zam.servicioClima.model.WeatherResponse;

public interface WeatherService {
    public WeatherResponse getWeather(double lat, double lon);
}
