package com.hcl.ing.stepdefination;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetDataAPI {

	static Response response;

	static String URL = "https://api-pub.bitfinex.com/v2/tickers?symbols=tBTCUSD";
	@Given("GetBase URL for Get Operations")
	public void getbase_URL_for_Get_Operations() {
//		RestAssured.useRelaxedHTTPSValidation();
		System.out.println("Test>>>>>>>>");
		
	}

	@When("Send the Request for Get Operations")
	public void send_the_Request_for_Get_Operations() {
		response = given().when().get(URL);
		System.out.println("Get Response for tickername :-" + response.getBody().asString());

	}

	@Then("Validate the Get Operations")
	public void validate_the_Get_Operations() {
		String resp = response.getBody().asString();
		Assert.assertEquals("Ticker Name Macthed", true, resp.contains("tBTCUSD"));
	}

}
