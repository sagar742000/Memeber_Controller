package stepdefinition;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutCuccuClibSpark {
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@Given("user is able to provide the data in database")
	public void user_is_able_to_provide_the_data_in_database() {
   JSONObject obj = new JSONObject();
    obj.put("email", "seenu@gmail.com");
	obj.put("password", "seenu");
	obj.put("phone", "8848765423");
	 req = RestAssured.given();
	 req.body(obj);
	 req.contentType(ContentType.JSON);
	}

	@When("user is able to put a data by using an api is {string}")
	public void user_is_able_to_put_a_data_by_using_an_api_is(String url) {
		 res = req.post(url);
	}

	@Then("user can validates statuscode is {int}")
	public void user_can_validates_statuscode_is(Integer int1) {
		 validate = res.then();
		   validate.assertThat().statusCode(int1).log().all();
	}

}
