package com.example.marslifesupport.controller;

import com.example.marslifesupport.model.SensorData;
import com.example.marslifesupport.service.SensorDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensor-data")
public class SensorDataController {

    private final SensorDataService sensorDataService;

    public SensorDataController(SensorDataService sensorDataService) {
        this.sensorDataService = sensorDataService;
    }

    @GetMapping
    public SensorData getSensorData() {
        return sensorDataService.getSensorData();
    }
}
