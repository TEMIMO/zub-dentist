package com.zubclinic.zubdentist.controller;

import com.zubclinic.zubdentist.config.DentistConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DentistController {

    @Autowired
    DentistConfig dentistConfig;

    @GetMapping("/getById")
    public String getConfigValue() {
        System.out.println(dentistConfig.getOne());
        return dentistConfig.getOne();
    }
}
