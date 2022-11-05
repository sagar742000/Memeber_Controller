package authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;
public class BearerToken {
@Test

public void bearertoken() {
	baseURI = "https://api.github.com";
	JSONObject object = new JSONObject();
    object.put("name" , "member");
    
    given().auth().oauth2("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")
    .body(object).contentType(ContentType.JSON)
    .when().post("user/repos")
    .then().log().all();
	
}
}
