package com.requests.autenthication;

import com.requests.Project;

import javax.xml.ws.Response;

import static io.restassured.RestAssured.given;

public class Token {
private static String
  public static String getToken() {
      Response response =  given()
              .baseUri(Credentials.)
      return given().toString();

  }

}
