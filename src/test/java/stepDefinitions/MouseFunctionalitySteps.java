package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MouseFunctionalitySteps {

	@Given("User has mouse")
	public void user_has_mouse() {
	    System.out.println();
	    //System.out.println("Step 1");
	}

	@When("User clicks mouse")
	public void user_clicks_mouse() {
		System.out.println();
	    System.out.println("Step 2");
	}

	@When("User moves it")
	public void user_moves_it() {
		System.out.println();
	    System.out.println("Step 3");
	}

	@Then("User should be able to use the mouse")
	public void user_should_be_able_to_use_the_mouse() {
		System.out.println();
	    System.out.println("Step 4");
	}
	
}
