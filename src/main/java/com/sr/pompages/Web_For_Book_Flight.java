package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Web_For_Book_Flight {
	/**
	 * Declaration
	 */
	@FindBy(xpath = "//button[text()='View Fares']")
	private WebElement viewfare;

	@FindBy(xpath = "(//button[text()='Book'])[2]")
	private WebElement book;

	/**
	 * Initialization
	 * 
	 * @param driver
	 */
	public Web_For_Book_Flight(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Utilization
	 */
	public void clickOnViewFare() {
		viewfare.click();
	}

	public void clickOnBook() {
		book.click();
	}

	/**
	 * @return the viewfare
	 */
	public WebElement getViewfare() {
		return viewfare;
	}

	/**
	 * @return the book
	 */
	public WebElement getBook() {
		return book;
	}

}