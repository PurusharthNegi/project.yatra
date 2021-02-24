package com.sr.TestScript;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.sr.genericlib.Baseclass;
import com.sr.pompages.Web;
import com.sr.pompages.Web_For_Choose_Room;
import com.sr.pompages.Web_For_Room_Booking;

public class Hotel_Bokking extends Baseclass {
@Test()
public void booking() throws FileNotFoundException, IOException, InterruptedException
{
Web w=new Web(driver);
w.clickOnHotel();
w.clearcity();
Thread.sleep(1000);
w.getTextForCity(p.getPropertyData("city"));
Thread.sleep(1000);
w.clickongoa();
w.clickOnCheckIn();
w.clickOnCeckInDate();
w.clickOnCheckOut();
w.clickOnCheckOutDate();
w.getTraveller();
w.clickOnTraveller();
Thread.sleep(3000);
u.doubleClick(driver,(w.getAddadult()));
u.doubleClick(driver,w.getAddchlid());
u.dropDown(w.getAgeofchildren(),p.getPropertyData("age"));
u.dropDown(w.getAgeofchildren2(),p.getPropertyData("age2"));
w.getHotel();
w.clickOnHotelSubmit();

u.switchWindow(driver);
Thread.sleep(3000);

Web_For_Room_Booking w1=new Web_For_Room_Booking(driver);
w1.clickOnRoomBooking();

u.switchWindow(driver);
Thread.sleep(3000);

Web_For_Choose_Room w3=new Web_For_Choose_Room(driver);
w3.clickOnChooseRoom();
Thread.sleep(3000);
w3.getCheckin();
w3.clickOnCheckIn();
w3.clickOnCheckInDate();
w3.clickOnCheckOut();
w3.getCheckout();
w3.clickOnCheckOutDate();
w3.submit();
w3.book();
}
}
