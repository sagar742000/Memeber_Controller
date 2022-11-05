package crud_operation_TESTNG;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetMethodEmail {
    
	@Test
	public void getEmailMethod() {
		baseURI = "http://localhost:8080";
		when()
		.get("/members/email/khadar@gmail.com")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
