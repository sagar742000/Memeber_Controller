package crud_operation_TESTNG;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetMethodEmailOtp {

	@Test
	public void getMethodEmailOtp() {
		baseURI = "http://localhost:8080";
		when()
		.get("/members/email/pavan1@gmail.com/otp/0")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();

	}
}
