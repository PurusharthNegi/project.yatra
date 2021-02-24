package com.sr.TestScript;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.sr.genericlib.Baseclass;
import com.sr.pompages.Web;
import com.sr.pompages.Web_For_Book_Flight;

public class Trip_Test_1 extends Baseclass {

	@Test()
	public void booking() throws InterruptedException, FileNotFoundException, IOException {
		Web w = new Web(driver);
		w.getSource();
		w.clearsource();
		w.getTextForSource(p.getPropertyData("source"));
		w.getFrom();
		w.clickOnFrom();
		
		w.clearDestination();
		w.getDest();
		w.getTextForDestination(p.getPropertyData("destination"));
		w.getTo();
		Thread.sleep(2000);
		w.clickOnTo();
	
		w.getDate();
		w.clickOndate();
		w.getSelecteddate();
		w.clickOnSelectedDate();
		
		w.getSubmit();
		w.cliclOnSubmit();
	
		u.switchWindow(driver);
	
		Web_For_Book_Flight w1=new Web_For_Book_Flight(driver);
				w1.clickOnViewFare();
				w1.clickOnBook();
	}
}
