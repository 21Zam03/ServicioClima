package com.zam.servicioClima.controller;

import com.zam.servicioClima.model.WeatherResponse;
import com.zam.servicioClima.service.impl.WeatherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherServiceImpl weatherService;

    @GetMapping("/{lat}/{lon}")
    @ResponseBody
    public WeatherResponse getWeather(@PathVariable(value = "lat") double latitud,
                                      @PathVariable(value = "lon") double longitud) {
        return weatherService.getWeather(latitud, longitud);
    }
}
