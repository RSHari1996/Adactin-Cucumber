package com.ABCPOM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotel {
	
	public static WebDriver driver;

	@FindBy(name="username")
	private WebElement name;

	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(id="location")
	private WebElement loc;
	
	@FindBy(id="hotels")
	private WebElement hotel;

	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement C;
	
	@FindBy(id="first_name")
	private WebElement fname;

	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccnum;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	@FindBy(id="my_itinerary")
	private WebElement itin;

	@FindBy(id="logout")
	private WebElement logout;
	
	public AdactinHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	
		}

	public WebElement getLoc() {
		return loc;
	}
	public WebElement getLogin() {
		return login;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPass() {
		return pass;
	}
	
	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomno() {
		return roomno;
	}
	
	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}
	public WebElement getSearch() {
		return search;
	}
	
	public WebElement getRadio() {
		return radio;
	}

	public WebElement getC() {
		return C;
	}
	
	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcmonth() {
		return ccmonth;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	public WebElement getItin() {
		return itin;
	}

	public WebElement getLogout() {
		return logout;
	}

}
