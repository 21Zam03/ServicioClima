package com.zam.servicioClima.service.impl;

import com.zam.servicioClima.model.WeatherResponse;
import com.zam.servicioClima.repository.WeatherRepository;
import com.zam.servicioClima.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    @Override
    public WeatherResponse getWeather(double lat, double lon) {
        return weatherRepository.getWeather(lat, lon);
    }

}
