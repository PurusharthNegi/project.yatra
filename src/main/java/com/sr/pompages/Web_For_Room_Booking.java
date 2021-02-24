package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * WebElements
 *
 */
public class Web_For_Room_Booking {

	@FindBy(xpath = "//span[contains(text(),'Choose Room')]")
	private WebElement chooseroom;

	
	/**
	 * Initialization
	 * @param driver
	 */
	public Web_For_Room_Booking(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

public void clickOnRoomBooking()
{
chooseroom.click();	
}

/**
 * @return the choose Room
 */
public WebElement getChooseroom() {
	return chooseroom;
}
}