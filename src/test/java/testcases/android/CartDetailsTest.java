package testcases.android;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import base.ScreenBase;
import base.TestBase;
import screens.androidpageobjects.AmazonHomePageAndroid;



public class CartDetailsTest extends AmazonHomePageAndroid{

	
	
	
	public void TVName () {
	    
		String expectedName ="Sanyo 165 cm (65 inches)4K Ultra HD Smart Certified ANdroid TV IPS LEDTV XT-65A082U (BLACK)(2019 Model)";
	String actualName=driver.findElement(TV_Name).getText();
		
		if (actualName.equals(expectedName)) {
			
			Assert.assertEquals(actualName, expectedName, "Error message is not matching...");
			Reporter.log("Error messge is matching......",true);
			Reporter.log("==================================================",true);
			Assert.fail();
		}
	}

	public void TVDescription() {
	    
		String expectedDesc ="Sanyo 165 cm (65 inches)4K Ultra HD Smart Certified ANdroid TV IPS LEDTV XT-65A082U (BLACK)(2019 Model)";
		String actualDescription=driver.findElement(TV_Desc).getText();
			
			if (actualDescription.equals(expectedDesc)) {
				
				Assert.assertEquals(actualDescription, expectedDesc, "Error message is not matching...");
				Reporter.log("Error messge is matching......",true);
				Reporter.log("==================================================",true);
				Assert.fail();
			}
		}

public void TVPrice() {
	 String expectedPrice =  "54,999";
		
		String actualprice=driver.findElement(expectedRate).getText();
			
			if (actualprice.equals(expectedPrice)) {
				
				Assert.assertEquals(actualprice, expectedPrice, "Error message is not matching...");
				Reporter.log("Error messge is matching......",true);
				Reporter.log("==================================================",true);
				Assert.fail();
			}
		}
	
}
