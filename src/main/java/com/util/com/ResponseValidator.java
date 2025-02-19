package com.util.com;

import org.apache.log4j.Logger;
import org.testng.Assert;

import io.restassured.response.Response;

public class ResponseValidator {
    private static final Logger log = Logger.getLogger(ResponseValidator.class);

    public static void validateCreateUserResponse(Response response, String expectedName, String expectedJob) {
        log.info("Validating create user response...");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 201, "Status code should be 201");

        String name = response.jsonPath().getString("name");
        String job = response.jsonPath().getString("job");
        Assert.assertEquals(name, expectedName, "Expected name mismatch");
        Assert.assertEquals(job, expectedJob, "Expected job mismatch");

        log.info("Response validation successful. User ID: " + response.jsonPath().getString("id"));
    }
}
