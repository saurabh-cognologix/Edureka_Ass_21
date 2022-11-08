package com.web.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class MyDbHealthService implements HealthIndicator {

    public boolean isHealthGood(){
        return true;
    }
    @Override
    public Health health() {
        if(isHealthGood()){
            return Health.up().withDetail("Database Service","Database Service is Running").build();
        }
        return Health.down().withDetail("Database Service","Database Service is Running Down").build();
    }
}
