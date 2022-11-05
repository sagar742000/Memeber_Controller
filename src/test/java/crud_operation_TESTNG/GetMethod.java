package crud_operation_TESTNG;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetMethod {
	
	@Test
	public void getMethod() {
		baseURI = "http://localhost:8080";
		when()
		.get("http://localhost:8080/members/10")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
