package com.zam.servicioClima.repository.Impl;

import com.zam.servicioClima.model.WeatherResponse;
import com.zam.servicioClima.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class WeatherRepositoryImpl implements WeatherRepository {

    @Value("${openweathermap.apikey}")
    private String apikey;

    private final String apiUrl = "http://api.openweathermap.org/data/2.5/weather";

    private RestTemplate restTemplate;

    public WeatherRepositoryImpl(){
        restTemplate = new RestTemplate();
    }

    public WeatherResponse getWeather(double lat, double lon) {
        String url = String.format("%s?lat=%f&lon=%f&appid=%s&units=metric", apiUrl, lat, lon, this.apikey);
        return restTemplate.getForObject(url, WeatherResponse.class);
    }

}
