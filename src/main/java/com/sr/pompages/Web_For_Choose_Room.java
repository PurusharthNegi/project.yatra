package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Web_For_Choose_Room {
	/**
	 * Element
	 */
	@FindBy(xpath = "//span[contains(text(),'Choose Room')]")
	private WebElement chooseroom;

	@FindBy(id = "checkInDateCheck")
	private WebElement checkin;

	@FindBy(xpath = "//a[text()='22']")
	private WebElement checkindate;

	@FindBy(id = "checkOutDateCheck")
	private WebElement checkout;

	@FindBy(xpath = "//a[text()='28']")
	private WebElement checkoutdate;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//button[contains(text(),'Book Now')]")
	private WebElement book;

	/**
	 * Initialization
	 * 
	 * @param driver
	 */
	public Web_For_Choose_Room(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Utilization
	 */
	public void clickOnChooseRoom() {
		chooseroom.click();
	}

	public void clickOnCheckInDate() {
		checkindate.click();
	}

	public void clickOnCheckIn() {
		checkin.click();
	}

	public void clickOnCheckOut() {
		checkout.click();
	}

	public void clickOnCheckOutDate() {
		checkoutdate.click();
	}

	public void submit() {
		submit.click();
	}

	public void book() {
		book.click();
	}

	/**
	 * @return the chooseroom
	 */
	public WebElement getChooseroom() {
		return chooseroom;
	}

	/**
	 * @return the checkin
	 */
	public WebElement getCheckin() {
		return checkin;
	}

	/**
	 * @return the checkout
	 */
	public WebElement getCheckout() {
		return checkout;
	}

	/**
	 * @return the submit
	 */
	public WebElement getSubmit() {
		return submit;
	}

	/**
	 * @return the checkindate
	 */
	public WebElement getCheckindate() {
		return checkindate;
	}

	/**
	 * @return the checkoutdate
	 */
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	/**
	 * @return the book
	 */
	public WebElement getBook() {
		return book;
	}

}
