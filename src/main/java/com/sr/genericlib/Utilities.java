package com.sr.genericlib;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	/**
	 * To Handle DropDown
	 * 
	 * @param ele
	 * @param text
	 */

	public void dropDown(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);

	}
	

	/**
	 * Handle mouse hovering 
	 * @param driver
	 * @param ele
	 */
	public void mouseAction(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
/**
 * Handle double click
 * @param driver
 * @param ele
 */
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();

	}

	/**Handle Scroll Bar
	 * 
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scrollBar(WebDriver driver, int x, int y) {

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(" + x + "," + y + ")");
	}

	/**
	 * handle alert pop up
	 * @param driver
	 */
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert();
	}

	/**
	 * Explicit wait
	 * @param driver
	 * @param element
	 */
	public void elementToclicked(WebDriver driver, WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.elementToBeClickable(element));
	}
/**
 * Switch Window
 */
public void switchWindow(WebDriver driver)
{
Set<String> rv = driver.getWindowHandles();	
for(String b:rv) {
driver.switchTo().window(b);
}


}
}

