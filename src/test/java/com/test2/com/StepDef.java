package com.test2.com;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.*;

import com.ABCPOM.com.AdactinHotel;
import com.ProjectABC.Base_Class;
import com.helper.com.file_ReadManager;

public class StepDef extends Base_Class{
public static WebDriver driver = Runner.driver;
	
	AdactinHotel H = new AdactinHotel(driver);
	
	@Given("^precondition$")
	public void precondition() throws Throwable {
		String U=file_ReadManager.getInstanceFR().getInstanceCR().geturl();
	openLink(U);
	}

	@When("^username$")
	public void username() throws Throwable {
		String UN=file_ReadManager.getInstanceFR().getInstanceCR().username();
	    entervalue(H.getName(), UN);
	}

	@When("^password$")
	public void password() throws Throwable {
		String P=file_ReadManager.getInstanceFR().getInstanceCR().password();
		entervalue(H.getPass(), P);
	}

	@Then("^click$")
	public void click() throws Throwable {
		go(H.getLogin());
	}

	
	@Given("^User should logged in the application$")
	public void user_should_logged_in_the_application() throws Throwable {
	    title();
	}

	@When("^User select the Location$")
	public void user_select_the_Location() throws Throwable {
	    dropdown(H.getLoc(), "text", "London");
	}

	@When("^User select the Hotel$")
	public void user_select_the_Hotel() throws Throwable {
		dropdown(H.getHotel(), "text", "Hotel Sunshine");
	}

	@When("^User select the Room type$")
	public void user_select_the_Room_type() throws Throwable {
		dropdown(H.getRoom(), "text", "Super Deluxe");
	}

	@When("^User select the Number of Rooms$")
	public void user_select_the_Number_of_Rooms() throws Throwable {
		dropdown(H.getRoomno(), "value", "1");
	}

	@When("^User enter the Checkin date$")
	public void user_enter_the_Checkin_date() throws Throwable {
		clear(H.getCheckin());
		entervalue(H.getCheckin(), "01/02/2022");
	}

	@When("^User enter the Checkout date$")
	public void user_enter_the_Checkout_date() throws Throwable {
		clear(H.getCheckout());
		entervalue(H.getCheckout(), "04/02/2022");
	}

	@When("^User select the Adults per Room$")
	public void user_select_the_Adults_per_Room() throws Throwable {
		dropdown(H.getAdult(), "value", "2");
	}

	@Then("^User click the Search button$")
	public void user_click_the_Search_button() throws Throwable {
		go(H.getSearch());
	}

	@Given("^User should have searched the hotel$")
	public void user_should_have_searched_the_hotel() throws Throwable {
	   title();
	}

	@When("^User select the hotel$")
	public void user_select_the_hotel() throws Throwable {
		go(H.getRadio());
	}

	@Then("^User click the Continue button$")
	public void user_click_the_Continue_button() throws Throwable {
		go(H.getC());
	}

	@Given("^User should have selected the Hotel$")
	public void user_should_have_selected_the_Hotel() throws Throwable {
	    title();
	}

	@When("^User enter the First Name$")
	public void user_enter_the_First_Name() throws Throwable {
	    String fn=file_ReadManager.getInstanceFR().getInstanceCR().fname();
	    entervalue(H.getFname(), fn);
	}

	@When("^User enter the Last Name$")
	public void user_enter_the_Last_Name() throws Throwable {
		String ln=file_ReadManager.getInstanceFR().getInstanceCR().lname();
	    entervalue(H.getLname(), ln);
	}

	@When("^User enter the Billing Address$")
	public void user_enter_the_Billing_Address() throws Throwable {
	   String add = file_ReadManager.getInstanceFR().getInstanceCR().add();
	   entervalue(H.getAddress(), add);
	}

	@When("^User enter the Credit card number$")
	public void user_enter_the_Credit_card_number() throws Throwable {
	    String ccnum=file_ReadManager.getInstanceFR().getInstanceCR().ccnum();
	    entervalue(H.getCcnum(), ccnum);
	}

	@When("^User select the Credit card type$")
	public void user_select_the_Credit_card_type() throws Throwable {
		dropdown(H.getCctype(), "value", "VISA");
	}

	@When("^User select the Expiry Month$")
	public void user_select_the_Expiry_Month() throws Throwable {
		dropdown(H.getCcmonth(), "value", "7");
	}

	@When("^User select the Expiry year$")
	public void user_select_the_Expiry_year() throws Throwable {
		dropdown(H.getCcyear(), "value", "2022");
	}

	@When("^User enter the CVV number$")
	public void user_enter_the_CVV_number() throws Throwable {
		String cvv=file_ReadManager.getInstanceFR().getInstanceCR().cvv();
	    entervalue(H.getCvv(), cvv);
	}

	@Then("^User click the Book Now button$")
	public void user_click_the_Book_Now_button() throws Throwable {
		go(H.getBook());
	}
	
	
}
