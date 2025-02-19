package com.testClasses.com;

import static io.restassured.RestAssured.given;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.Config.com.ConfigReader;
import com.google.gson.JsonObject;
import com.testBase.com.BaseAPITest;
import com.util.com.ResponseValidator;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateUserTest extends BaseAPITest {

    private static final Logger log = Logger.getLogger(CreateUserTest.class);

    @Test
    public void createUserTest() {
        log.info("Building JSON payload for create user request...");
        JsonObject payload = new JsonObject();
        payload.addProperty("name", "morpheus");
        payload.addProperty("job", "leader");

        String endpoint = ConfigReader.getProperty("createUserEndpoint");
        log.info("Sending POST request to: " + endpoint);

        Response response = given()
                .contentType(ContentType.JSON)
                .body(payload.toString())
                .when()
                .post(endpoint)
                .then()
                .extract().response();

        log.info("Received response: " + response.asString());

        ResponseValidator.validateCreateUserResponse(response, "morpheus", "leader");
    }
}
