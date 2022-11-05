package authentication;

import io.cucumber.java.en.Given;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicAuth {
@Test

public void basicAuth()
{
	baseURI = "https://github.com";
	given().auth().basic("sagar742000", "Mrfolie@742000")
	.when().get("/login")
	.then().log().all();
	
}
}
