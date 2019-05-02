package com.requests.autenthication;

import com.requests.Project;

import static io.restassured.RestAssured.given;

public class Token {

  public static String getToken() {
      return given().toString();

  }

}
