package com.DriverManager.com;

import org.apache.log4j.Logger;

import com.Config.com.*;

import io.restassured.RestAssured;

public class RestAssuredManager {
    private static final Logger log = Logger.getLogger(RestAssuredManager.class);

    public static void init() {
        String baseURI = ConfigReader.getProperty("baseURI");
        log.info("Initializing RestAssured with base URI: " + baseURI);
        RestAssured.baseURI = baseURI;
    }
}
