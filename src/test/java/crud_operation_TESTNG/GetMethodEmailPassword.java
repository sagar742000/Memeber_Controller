package crud_operation_TESTNG;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetMethodEmailPassword {

	@Test
	public void getMethodEmailPassword() {
		baseURI = "http://localhost:8080";
		when()
		.get("/members/email/khadar@gmail.com/password/TEyu9FZYEEWI7uxg8a+KYg=="
)
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
