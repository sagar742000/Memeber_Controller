package crud_operation_TESTNG;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetMethodPhone {

	@Test
	public void getMethodPhone() {
		baseURI = "http://localhost:8080";
		when()
		.get("/members/phone/0")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
