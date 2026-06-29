package com.cognizant.springlearn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Country {
    private static final Logger LOGGER = LogManager.getLogger(Country.class);

    private String code;
    private String name;

    public Country() {
        LOGGER.info("Inside Country Constructor.");
    }

    public String getCode() {
        LOGGER.info("Inside getCode() method.");
        return code;
    }

    public void setCode(String code) {
        LOGGER.info("Inside setCode() method with value: {}", code);
        this.code = code;
    }

    public String getName() {
        LOGGER.info("Inside getName() method.");
        return name;
    }

    public void setName(String name) {
        LOGGER.info("Inside setName() method with value: {}", name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{code='" + code + "', name='" + name + "'}";
    }
}
