package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetbyPhoneCucuClubSpark {
	 Response response;
	 ValidatableResponse val;
	@When("user should be able to get the data by using an url is {string}")
	public void user_should_be_able_to_get_the_data_by_using_an_url_is(String url) {
		response = RestAssured.get(url);
	}

	@Then("user validates the status code of the id is {int}")
	public void user_validates_the_status_code_of_the_id_is(Integer int1) {
		val = response.then();
		   val.assertThat().statusCode(int1).log().all();
	}
}
