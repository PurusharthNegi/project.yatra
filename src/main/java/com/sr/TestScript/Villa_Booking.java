package com.sr.TestScript;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.sr.genericlib.Baseclass;
import com.sr.pompages.Web_For_Villa;

public class Villa_Booking extends Baseclass {
	
	@Test
	public void villabooking() throws FileNotFoundException, IOException, InterruptedException {
		Web_For_Villa w = new Web_For_Villa(driver);
		w.clickOnVilla();
		w.getDestination();
		w.clearDestination();
		w.clickOnDestination();
		w.getCity();
		w.dataForDestination(p.getPropertyData("city"));
		u.mouseAction(driver,w.getCity());
		w.selectCity();
		w.clickOnCheckIn();
		w.clickOnCheckInDate();
		w.clickOnCheckOut();
		w.clickOnCheckOutDate();
		w.clickOnSubmit();
	}
}
