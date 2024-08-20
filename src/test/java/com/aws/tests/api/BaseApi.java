package com.aws.tests.api;

import com.aws.config.App;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BaseApi {
    @BeforeAll
    static void init() {
        RestAssured.baseURI = App.appConfig.apiUrl();
    }
}
