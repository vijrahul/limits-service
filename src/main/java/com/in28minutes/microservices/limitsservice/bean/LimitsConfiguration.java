/*
 * Copyright Notice
 * ================
 * This file contains proprietary information of Discovery Health.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018.
 */
package com.in28minutes.microservices.limitsservice.bean;

/**
 * TODO - Add some information about the class.
 *
 * @author Rahul Vij
 */
public class LimitsConfiguration {
    private int maximum;
    private int minimum;

    protected LimitsConfiguration() {
    }

    public LimitsConfiguration(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
