
## API Automation Framework for Reqres.in

This project is an API automation framework built with **RestAssured**, **TestNG**, **Gson**, and **Log4j**.
It demonstrates how to automate a POST API request (for creating a user) against the (https://reqres.in/) API.

# Base URI for API requests
baseURI=https://reqres.in

# Endpoint for creating a user
createUserEndpoint=/api/users


## Overview

This framework uses:
- **RestAssured**: For making API requests.
- **TestNG**: For test execution and assertions.
- **Gson**: For building JSON payloads.
- **Log4j**: For logging test execution details.
- **Maven**: For dependency management and build automation.

The main example in this project demonstrates how to send a POST request to create a user on the Reqres.in API, validate the response, and log the results.

## Features

- **API Testing**: Automate and validate POST API requests.
- **Configuration Management**: Use a `config.properties` file to manage base URI and endpoints.
- **Logging**: Integrated Log4j logging for both console and file outputs.
- **Validation Utility**: Centralized response validation to ensure consistency.
- **Maven-based**: Easy dependency management and build with Maven.
- **Extensible Framework**: Easily add more endpoints and tests as needed.


## Installation

1. **Clone the repository:**

   ```bash
   git clone "https://github.com/QASIDDHESH/Assignmnet2-_POST-API.git"
  
