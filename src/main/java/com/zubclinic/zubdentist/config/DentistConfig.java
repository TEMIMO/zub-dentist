package com.zubclinic.zubdentist.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "example")
public class DentistConfig {
    private String one;

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }
}

