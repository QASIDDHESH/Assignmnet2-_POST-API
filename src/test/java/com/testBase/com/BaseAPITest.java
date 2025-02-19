package com.testBase.com;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.DriverManager.com.RestAssuredManager;

public class BaseAPITest {
    private static final Logger log = Logger.getLogger(BaseAPITest.class);

    @BeforeMethod
    public void setUp() {
        log.info("Initializing RestAssured for API testing...");
        RestAssuredManager.init(); 
    }

    @AfterMethod
    public void tearDown() {
        log.info("Teardow.");
    }
}
