package com.sr.TestScript;

import org.testng.annotations.Test;

import com.sr.genericlib.Baseclass;
import com.sr.pompages.Web_for_Bus;

public class Buses_Booking extends Baseclass {

	@Test(invocationCount = 2)
	public void busbooking() throws InterruptedException {
		Web_for_Bus wfb = new Web_for_Bus(driver);
		Thread.sleep(3000);
		wfb.clickOnBuses();
		wfb.clickOnDepart();
		u.elementToclicked(driver, wfb.getDepart());
		wfb.clickOnDeptSatation();
		Thread.sleep(3000);
		wfb.clickOnArrvSatation();
		wfb.clickOnDeptDate();
		wfb.clickOnDate();
		wfb.ClickOnSearchBuses();
	}
}
