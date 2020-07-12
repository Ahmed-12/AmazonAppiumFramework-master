package testcases.android;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.TestBase;
import io.qameta.allure.Description;
import screens.androidpageobjects.AmazonHomePageAndroid;
import screens.androidpageobjects.LandingPageAndroid;

public class SelectTVfromElectronic extends TestBase {

    public LandingPageAndroid LandingPage = new LandingPageAndroid();
    public AmazonHomePageAndroid AmazonHomePage = new AmazonHomePageAndroid();
    
   

    @Test(priority = 2, enabled = true)
    @Description("Add 1st 65 cm TV in cart")
    public void TVSection() throws Exception {

        System.out.println("Select Television: " + driver);
//		AmazonHomePage.tapAction_bar_burger_icon();
//		System.out.println("tapAction_bar_burger_icon");


        AmazonHomePage.tap_Shop_by_Category();


        AmazonHomePage.tapTV_Appliances_Electronics();
        System.out.println("Select tapTV_Appliances_Electronics: ");

        AmazonHomePage.addFirstTVsListing();
        System.out.println("Select Tap Television: ");

        AmazonHomePage.addRandomTVToCart();
 

        AmazonHomePage.Scrollscreen();
   // in-order to scroll Page

    }


}
