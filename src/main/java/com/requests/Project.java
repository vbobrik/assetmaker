package com.requests;

import com.models.Cct_project;
import com.models.Custom_model;
import io.restassured.response.Response;

import static io.restassured.RestAssured.authentication;
import static io.restassured.RestAssured.given;

public class Project {
    private static final String BASE_URI = "https://stage-platform.kino-mo.com/api/v1";
    private static final String BASE_PATH = "/cct-projects/";
    private static String km_auth;
//    private String BASE_URI = "https://stage-platform.kino-mo.com/api/v1/cct-projects/5ccb0720e75d1a0009865af3";



    public static Cct_project createProject(String token, Cct_project cct_project) {

Response response = given()
        .baseUri(BASE_URI)
        .basePath(BASE_PATH)
        .header("km-auth", token)
        .contentType("application/json")
        .body(cct_project)
        .post();

        return response.jsonPath().getJsonObject("message");

    }

    public void getProject() {

    }

    public void updateProject() {

    }

    public void deleteProject() {

    }

}
