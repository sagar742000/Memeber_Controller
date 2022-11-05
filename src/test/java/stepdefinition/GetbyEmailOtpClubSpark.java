package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetbyEmailOtpClubSpark {
	 Response response;
	 ValidatableResponse val;
	@When("user is able to get data from database by using url {string}")
	public void user_is_able_to_get_data_from_database_by_using_url(String url) {
		response = RestAssured.get(url);
	}

	@Then("User Validate the Statuscode of the Id is {int}")
	public void user_validate_the_statuscode_of_the_id_is(Integer int1) {
		val = response.then();
		   val.assertThat().statusCode(int1).log().all();
	}
}
