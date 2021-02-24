package com.sr.genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass implements AutoConstant {
/**
 * Used to Open the application
 */
	public WebDriver driver;
	public PropertryFile p;
	public Photo p1;
public Utilities u=new Utilities();
	@BeforeMethod
	public void openapp() throws FileNotFoundException, IOException {
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		p = new PropertryFile();
		driver.get(p.getPropertyData("url"));
	}
/**
 * Used to closed the data
 * @param r
 * @throws IOException
 * @throws InterruptedException 
 */
	@AfterMethod
	public void closeapp(ITestResult r) throws IOException, InterruptedException {
		int status = r.getStatus();
		String name = r.getName();
		p1 = new Photo();
		p1.getPhoto(driver, name);

		if (status == 2) {
			Photo p = new Photo();
			p.getPhoto(driver, name);
			}
	driver.quit();
	}
	
}
