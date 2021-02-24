package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sr.genericlib.Baseclass;

public class Web extends Baseclass {
	/**
	 * Elements
	 */
	@FindBy(id = "BE_flight_origin_city")
	private WebElement source;

	@FindBy(xpath = "//p[@class='ac_cityname']")
	private WebElement from;

	@FindBy(name = "flight_destination")
	private WebElement dest;

	@FindBy(xpath = "(//p[@class='ac_cityname'])[3]")
	public WebElement to;

	@FindBy(id = "BE_flight_origin_date")
	public WebElement date;

	@FindBy(id = "27/03/2021")
	public WebElement selecteddate;

	@FindBy(id = "BE_flight_flsearch_btn")
	public WebElement submit;

	/**
	 * Elements for Hotel
	 */
	@FindBy(id = "booking_engine_hotels")
	public WebElement hotel;

	@FindBy(id = "BE_hotel_destination_city")
	public WebElement city;

	@FindBy(xpath = "//li[text()='J']")
	public WebElement goa;

	@FindBy(id = "BE_hotel_checkin_date")
	public WebElement checkin;

	@FindBy(id = "19/02/2021")
	public WebElement checkindate;

	@FindBy(id = "BE_hotel_checkout_date")
	public WebElement checkout;

	@FindBy(id = "22/02/2021")
	public WebElement checkoutdate;

	@FindBy(xpath = "//label[@class='travellerLabel']")
	public WebElement traveller;

	@FindBy(xpath = "//span[@class='ddSpinnerPlus']")
	public WebElement addadult;

	@FindBy(xpath = "(//span[@class='ddSpinnerPlus'])[2]")
	private WebElement addchlid;

	@FindBy(xpath = "//select[@class='ageselect']")
	private WebElement ageofchildren;

	@FindBy(xpath = "(//select[@class='ageselect'])[2]")
	private WebElement ageofchildren2;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement hotelsubmit;
	
/**
 * Room Booking
 */
	
@FindBy(xpath="//span[contains(text(),'Choose Room')]")
private WebElement chooseroom;

	
	/**
	 * Initialization
	 * 
	 * @param driver
	 */
	public Web(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	/**
	 * Used to click
	 */

	public void clickOnSource() {
		source.click();
	}

	public void clickOnFrom() {
		from.click();
	}

	public void clickOnTo() {
		to.click();
	}

	public void clickOndate() {
		date.click();
	}

	public void clickOnSelectedDate() {
		selecteddate.click();
	}

	public void cliclOnSubmit() {
		submit.click();
	}

	public void clickOnHotel() {
		hotel.click();
	}

	public void clickongoa() {
		goa.click();
	}

	public void clickOnCheckIn() {
		checkin.click();
	}

	public void clickOnCeckInDate() {
		checkindate.click();
	}

	public void clickOnCheckOutDate() {
		checkoutdate.click();

	}

	public void clickOnCheckOut() {
		checkout.click();
	}

	public void clickOnTraveller() {
		traveller.click();
	}

	public void clickOnaddadult() {
		addadult.click();
	}

	public void clickOnHotelSubmit()
	{
		hotelsubmit.click();
	}
	
public void clickOnSelected() 
{
	chooseroom.click();
}
	/**
	 * Clear text
	 * 
	 */
	public void clearsource() {
		source.clear();
	}

	public void clearDestination() {
		dest.clear();
	}

	public void cleardate() {
		date.clear();
	}

	public void clearcity() {
		city.clear();
	}

	/**
	 * Used to send data
	 * 
	 * @param data
	 */
	public void getTextForSource(String data) {
		source.sendKeys(data);
	}

	public void getTextForDestination(String data) {
		dest.sendKeys(data);
	}

	public void getTextForCity(String data) {
		city.sendKeys(data);
	}

	/**
	 * 
	 * @return the source
	 */
	public WebElement getSource() {
		return source;
	}

	/**
	 * @return the from
	 */
	public WebElement getFrom() {
		return from;
	}

	/**
	 * @return the to
	 */
	public WebElement getTo() {
		return dest;
	}

	/**
	 * @return the dest
	 */
	public WebElement getDest() {
		return dest;
	}

	/**
	 * @return the date
	 */
	public WebElement getDate() {
		return date;
	}

	/**
	 * @return the selecteddate
	 */
	public WebElement getSelecteddate() {
		return selecteddate;
	}

	/**
	 * @return the submit
	 */
	public WebElement getSubmit() {
		return submit;
	}

	/**
	 * @return the hotel
	 */
	public WebElement getHotel() {
		return hotel;
	}

	/**
	 * @return the city
	 */
	public WebElement getCity() {
		return city;
	}

	/**
	 * @return the goa
	 */
	public WebElement getGoa() {
		return goa;
	}

	/**
	 * @return the checkin
	 */
	public WebElement getCheckin() {
		return checkin;
	}

	/**
	 * @return the checkindate
	 */
	public WebElement getCheckindate() {
		return checkindate;
	}

	/**
	 * @return the checkout
	 */
	public WebElement getCheckout() {
		return checkout;
	}

	/**
	 * @return the checkoutdate
	 */
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	/**
	 * @return the traveller
	 */
	public WebElement getTraveller() {
		return traveller;
	}

	/**
	 * @return the addadult
	 */
	public WebElement getAddadult() {
		return addadult;
	}

	/**
	 * @return the addchlid
	 */
	public WebElement getAddchlid() {
		return addchlid;
	}

	/**
	 * @return the ageofchildren
	 */
	public WebElement getAgeofchildren() {
		return ageofchildren;
	}

	/**
	 * @return the ageofchildren2
	 */
	public WebElement getAgeofchildren2() {
		return ageofchildren2;
	}

	/**
	 * @return the hotelsubmit
	 */
	public WebElement getHotelsubmit() {
		return hotelsubmit;
	}

}
