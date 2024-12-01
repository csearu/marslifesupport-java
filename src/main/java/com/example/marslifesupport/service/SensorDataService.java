package com.example.marslifesupport.service;

import com.example.marslifesupport.model.SensorData;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SensorDataService {
    private final Random random = new Random();

    public SensorData getSensorData() {
        SensorData data = new SensorData();
        data.setOxygenLevel(18 + random.nextDouble() * 5); // 18% - 23%
        data.setCo2Level(300 + random.nextInt(200)); // 300 ppm - 500 ppm
        data.setTemperature(20 + random.nextDouble() * 10); // 20°C - 30°C
        data.setPressure(95 + random.nextDouble() * 10); // 95 kPa - 105 kPa
        data.setWaterSupply(400 + random.nextInt(100)); // 400 - 500 liters
        return data;
    }
}
