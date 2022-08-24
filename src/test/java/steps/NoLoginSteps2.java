package steps;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NoLoginSteps2 {
	MyFrameWork mytools = new MyFrameWork();
	WebDriver mydriver;
	

	@Given("fail the user Login in demoblaze")
	public void theUserIsInIndexPagefail() {
		mydriver = mytools.open();
	}
	
	@When("fail the user enters (.*) login usuario")
	public void UserEnterLoginUserfail(String usuario) throws InterruptedException {
		mytools.midriverclick("login2"); 
		mytools.midriverclick("loginusername"); 
		mytools.midriverwrite("loginusername", usuario.trim());
	}
	
	@When("fail the user enters (.*) login clave")
	public void UserEnterLoginPassfail(String clave) throws InterruptedException {
		mytools.midriverwrite("loginpassword", clave.trim());
	}

	@And("fail the user clicks the login button")
	public void UserClickButtonfail() throws InterruptedException {
		mytools.midriverclickcss("#logInModal .btn-primary");
	}
	
	@Then("fail the user appears in page")
	public void LoginPageAppearsfail() throws InterruptedException {
		
			String titulo="",mensajealert = "";						 
			titulo = mytools.midriverreadalert();

				mytools.closeall();
				mensajealert = "User does not exist.";
				mytools.showinterminal(mensajealert);
				mytools.showinterminal(titulo);
				
			Assert.assertEquals(titulo, mensajealert);
		
	}		
}