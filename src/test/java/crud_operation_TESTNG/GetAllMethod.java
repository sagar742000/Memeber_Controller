package crud_operation_TESTNG;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class GetAllMethod {

	@Test
	public void getAllMethod() {
	baseURI = "http://localhost:8080";
	when()
	.get("/members/all")
	
	.then()
	.assertThat().statusCode(200)
	.log().all();
	
	}
}
