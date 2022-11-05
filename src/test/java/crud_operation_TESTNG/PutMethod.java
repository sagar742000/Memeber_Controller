package crud_operation_TESTNG;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutMethod {
	@Test
	public void putMethod() {
JSONObject object = new JSONObject();
		
		object.put("email", "khadar@gmail.com");
		object.put("password", "srinu");
		object.put("phone", "9848765400");
		
		given()
		.contentType(ContentType.JSON)
		.body(object)
		
		.when()
		.post("http://localhost:8080/members")
		
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}
		

}
