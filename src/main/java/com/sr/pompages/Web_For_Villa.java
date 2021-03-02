package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Web_For_Villa {

	/**
	 * Declaration
	 * 
	 * @author HP
	 *
	 */
	@FindBy(id = "booking_engine_homestays")
	private WebElement villa;

	@FindBy(id = "BE_hotel_destination_city")
	private WebElement destination;

	@FindBy(xpath = "//li[@class='active ac_over']")
	private WebElement city;

	@FindBy(id = "BE_hotel_checkin_date")
	private WebElement checkin;

	@FindBy(id = "05/03/2021")
	private WebElement checkindate;

	@FindBy(id = "BE_hotel_checkout_date")
	private WebElement checkout;

	@FindBy(id = "06/03/2021")
	private WebElement checkoutdate;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	/**
	 * Initialization
	 * 
	 * @param driver
	 */
	public Web_For_Villa(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Utilization
	 */
	public void clickOnVilla() {
		villa.click();
	}

	public void clearDestination() {
		destination.clear();
	}

	public void dataForDestination(String data) {
		destination.sendKeys(data);
	}

	public void selectCity() {
		city.click();
	}


	public void clickOnCheckIn() {
		checkin.click();
	}

	public void clickOnCheckInDate() {
		checkindate.click();
	}

	public void clickOnCheckOut() {
		checkout.click();
	}

	public void clickOnCheckOutDate() {
		checkoutdate.click();
	}

	public void clickOnSubmit() {
		submit.click();
	}
	public void clickOnDestination()
	{
		destination.click();
	}

	/**
	 * @return the villa
	 */
	public WebElement getVilla() {
		return villa;
	}

	/**
	 * @return the destination
	 */
	public WebElement getDestination() {
		return destination;
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
	 * @return the submit
	 */
	public WebElement getSubmit() {
		return submit;
	}

	/**
	 * @return the city
	 */
	public WebElement getCity() {
		return city;
	}

}