/*
 * Copyright Notice
 * ================
 * This file contains proprietary information of Discovery Health.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018.
 */
package com.in28minutes.microservices.limitsservice;

import com.in28minutes.microservices.limitsservice.bean.LimitsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO - Add some information about the class.
 *
 * @author Rahul Vij
 */
@RestController
public class LimitsConfigurationController {

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations() {
        return new LimitsConfiguration(1000, 1);
    }
}
