package stepDefination;

import org.junit.Assert;

import com.files.Initializer;

import com.pom.ConferenceRegistration;
import com.pom.PaymentDetails;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	static ConferenceRegistration register =null;
	 static PaymentDetails paymentDetails= null; 
	@Given("^user is registering$")
	public void user_is_registering() throws Throwable {
		//starting the browser 
		Initializer.setBrowser();
		Initializer.setBrowserConfig();
		Initializer.runTest();
		register =  new ConferenceRegistration(Initializer.driver);
		paymentDetails = new PaymentDetails(Initializer.driver);
	}

	//calling the respective methods from the respective pom classes and testing each input field
	
	@When("^title of page is conference registration$")
	public void title_of_page_is_conference_registration() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title = Initializer.driver.getTitle();
		Assert.assertEquals("Conference Registartion", title);

	}

	@Then("^user enters first name$")
	public void user_enters_first_name() throws Throwable {
		register.clickNext();
		register.giveFirstName();
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user enters last name$")
	public void user_enters_last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		register.clickNext();
		register.giveLastName();

	}

	@Then("^user enters email$")
	public void user_enters_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		register.clickNext();
		register.giveEmail();

	}

	@Then("^user enters contact number$")
	public void user_enters_contact_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		register.clickNext();
		register.giveContact();

	}

	@Then("^user selects no of people$")
	public void user_selects_no_of_people() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		register.clickNext();
		  register.giveNoOfPeople();

	  
	}

	@Then("^user enters building name and room no$")
	public void user_enters_building_name_and_room_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		register.clickNext();
		register.giveBuildingName();

	}

	@Then("^user enters area name$")
	public void user_enters_area_name() throws Throwable {
		register.clickNext();
		register.giveAreaName();
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user selects city$")
	public void user_selects_city() throws Throwable {
		register.clickNext();
		register.giveCity();

		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user selects state$")
	public void user_selects_state() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		register.clickNext();
		register.giveState();

 
	}

	@Then("^user selects conference access$")
	public void user_selects_conference_access() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		register.clickNext();
		register.giveCconferenceAccess();
	}

	@Then("^click on next$")
	public void click_on_next() throws Throwable {
		register.clickNext();
			
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^title of page is payment details$")
	public void title_of_page_is_payment_details() throws Throwable {
		String title = Initializer.driver.getTitle();
		Assert.assertEquals("Payment Details", title);
	
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user enters card holder name$")
	public void user_enters_card_holder_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   paymentDetails.clickNext();
		   paymentDetails.giveCardHolderName();

	}

	@Then("^user enters debit card number$")
	public void user_enters_debit_card_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		paymentDetails.clickNext();
		   paymentDetails.giveDebitCardNo();

	}

	@Then("^user enters cvv number$")
	public void user_enters_cvv_number() throws Throwable {
		paymentDetails.clickNext();
		   paymentDetails.giveCvvNumber();

		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user enters card expiration month$")
	public void user_enters_card_expiration_month() throws Throwable {
		paymentDetails.clickNext();
		   paymentDetails.giveCardExpiryMonth();

		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user enters card expiration year$")
	public void user_enters_card_expiration_year() throws Throwable {
		paymentDetails.clickNext();
		   paymentDetails.giveCardExpiryYear();

		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^click on make payment$")
	public void click_on_make_payment() throws Throwable {
		paymentDetails.clickNext();

		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^closing the Window$")
	public void closing_the_Window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Initializer.endTest();
	  
	}


	
}
