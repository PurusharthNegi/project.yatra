package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Web_for_Bus {
	/**
	 * Declaration
	 */
	@FindBy(id = "booking_engine_buses")
	private WebElement buses;

	@FindBy(id = "BE_bus_from_station")
	private WebElement depart;

	@FindBy(xpath = "//li[@class='active ac_over']")
	private WebElement deptstation;

	@FindBy(id = "BE_bus_to_station")
	private WebElement goingto;

	@FindBy(xpath ="(//span[text()='C'])[2]")
	private WebElement arrvstation;

	@FindBy(id = "BE_bus_depart_date")
	private WebElement deptdate;

	@FindBy(id="06/03/2021")
	private WebElement date;
	
	@FindBy(id="BE_bus_search_btn")
	private WebElement searchbuses;
	/**
	 * Initialization
	 * 
	 * @param driver
	 */
	public Web_for_Bus(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Utilization
	 */
	public void clickOnBuses() {
		buses.click();
	}

	public void clickOnDepart() {
		depart.click();
	}

	public void clickOnDeptSatation() {
		deptstation.click();
	}

	public void clickOnArrvSatation() {
		arrvstation.click();
	}

	public void clickOnDeptDate() {
		deptdate.click();
	}
public void clickOnDate()
{
	date.click();
	}
public void ClickOnSearchBuses() 
{
	searchbuses.click();
}

/**
 * @return the buses
 */
public WebElement getBuses() {
	return buses;
}

/**
 * @return the depart
 */
public WebElement getDepart() {
	return depart;
}

/**
 * @return the deptstation
 */
public WebElement getDeptstation() {
	return deptstation;
}

/**
 * @return the goingto
 */
public WebElement getGoingto() {
	return goingto;
}

/**
 * @return the arrvstation
 */
public WebElement getArrvstation() {
	return arrvstation;
}

/**
 * @return the deptdate
 */
public WebElement getDeptdate() {
	return deptdate;
}

/**
 * @return the date
 */
public WebElement getDate() {
	return date;
}

/**
 * @return the searchbuses
 */
public WebElement getSearchbuses() {
	return searchbuses;
}
}
