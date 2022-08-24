package steps;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AddtoCart {
	MyFrameWork mytools = new MyFrameWork();
	WebDriver mydriver;
	String myresponse,mymessage;
	

	@Given("the user add to cart a product in demoblaze")
	public void addtocart() {
		mydriver = mytools.open();
		
	}
	
	@When("the user select a (.*) products")
	public void selectacategory(String category) {
		mytools.midriverclicklink(category); 
	}
	
	@When("the user clicks over product")
	public void selectproduct() {
		mytools.midriverclicklink("Sony vaio i5"); 
	}	
	
	@And("the  user clicks the button add to cart")
	public void addproducttocart() throws InterruptedException {
		mytools.midriverclicklink("Add to cart"); 
		mymessage = "Product added";
		myresponse = mytools.midriverreadalert();
		
		
		mytools.showinterminal(mymessage);
		mytools.showinterminal(myresponse);
		Assert.assertEquals(myresponse, mymessage);
	
		mytools.closeall();
	}	
	
	
}
