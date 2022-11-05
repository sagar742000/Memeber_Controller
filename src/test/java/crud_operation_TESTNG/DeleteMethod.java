package crud_operation_TESTNG;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class DeleteMethod {
@Test
	public void delete() {
		baseURI = "http://localhost:8080";
		when()
		.delete("http://localhost:8080/members/5")
		
		.then()
		.assertThat().statusCode(404)
		.log().all();
	}

}
