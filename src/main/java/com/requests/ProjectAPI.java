package java.com.requests;

import java.com.models.Cct_project;

import java.util.ArrayList;

import static io.restassured.RestAssured.authentication;
import static io.restassured.RestAssured.given;

public class ProjectAPI {
    private static final String BASE_URI = "https://test02-platform.kino-mo.com/api";
    private static final String BASE_PATH_TOKEN = "/user/0/session";
    private static final String BASE_PATH_PROJECTS = "/v1/cct-projects/";
    private static final String BASE_PATH_CUSTOM_MODEL = "/v1/cct-projects/custom_model";
//    private String BASE_URI = "https://stage-platform.kino-mo.com/api/v1/cct-projects/5ccb0720e75d1a0009865af3";


    public static String getBaseUri() {
        return BASE_URI;
    }

    public static String getBasePathToken() {
        return BASE_PATH_TOKEN;
    }

    public static String getBasePathProjects() {
        return BASE_PATH_PROJECTS;
    }

    public static String getBasePathCustomModel() {
        return BASE_PATH_CUSTOM_MODEL;
    }

    public static Cct_project createProject(String km_auth, Cct_project cct_project) {

        return given()
                .baseUri(BASE_URI)
                .basePath(BASE_PATH_PROJECTS)
                .header("km-auth", km_auth)
                .contentType("application/json")
                .body(cct_project)
                .get()
                .then()
                .statusCode(200)
                .extract().body().as(Cct_project.class);

    }

    public static String getAllProjects(String km_auth) {
        return given()
                .baseUri(BASE_URI)
                .basePath(BASE_PATH_PROJECTS)
                .header("km-auth", km_auth)
                .contentType("application/json")
                .get()
                .then()
                .statusCode(200)
                .extract().body().toString();

    }

    public static String getProjectById(String km_auth, String id) {
        return given()
                .baseUri(BASE_URI)
                .basePath(BASE_PATH_PROJECTS)
                .header("km-auth", km_auth)
                .contentType("application/json")
                .get(id)
                .then()
                .statusCode(200)
                .extract().body().toString();

    }

    public void updateProject() {

    }

    public void deleteProject() {

    }

}
