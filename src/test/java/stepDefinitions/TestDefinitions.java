package stepDefinitions;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class TestDefinitions {

	@Given("^User is on landing Page$")	
	public void landing() {
		System.out.println("Landing Page");
	}
	
	@When("^user logs into application$")
	public void login() {
		System.out.println("Login");
	}
	@Then("^Home page is displayed$")
	public void homePage() {
		System.out.println("Home Page");
	}
	
	@And("^logout from application$")
	public void logout() {
		System.out.println("logout application");
	}
}
