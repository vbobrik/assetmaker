package java.com.requests.autenthication;


import io.restassured.response.Response;
import org.json.JSONObject;

import java.com.requests.ProjectAPI;

import static io.restassured.RestAssured.given;

public class Token {
    private static String km_auth;

  public static String getToken(String username, String password) {
      if(km_auth != null){
          return km_auth;
      } else {
          JSONObject jsonObject = new JSONObject();
          jsonObject.put("username", username);
          jsonObject.put("password", password);

          Response response = given()
                  .baseUri(ProjectAPI.getBaseUri())
                  .basePath(ProjectAPI.getBasePathToken())
                  .contentType("application/json").log().all()
                  .body(jsonObject.toString())
                  .put();

          km_auth = response.jsonPath().getString("message.sessionToken");
          return km_auth;
      }
  }

}
