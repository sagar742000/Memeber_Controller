package crud_operation_TESTNG;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class Post_Method {
@Test
	public void postMethod() {
JSONObject object = new JSONObject();
		
		object.put("email", "arjun@gmail.com");
		object.put("password", "arjun@456");
		object.put("phone", "7654321890");
		
		given()
		.contentType(ContentType.JSON)
		.body(object)
		
		
		.when()
		.post("http://localhost:8080/members")
		
		.then()
		.assertThat().statusCode(201).body("data.email",equalTo("arjun@gmail.com"))
		.log().all();
	}
		
	

}
