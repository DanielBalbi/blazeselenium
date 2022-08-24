package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	MyFrameWork mytools = new MyFrameWork();
	WebDriver mydriver;
	

	@Given("the user Login in demoblaze")
	public void theUserIsInIndexPage() {
		mydriver = mytools.open();
	}
	
	@When("the user enters (.*) login usuario")
	public void UserEnterLoginUser(String usuario) throws InterruptedException {
		mytools.midriverclick("login2"); 
		mytools.midriverclick("loginusername"); 
		mytools.midriverwrite("loginusername", usuario.trim());
	}
	
	@When("the user enters (.*) login clave")
	public void UserEnterLoginPass(String clave) throws InterruptedException {
		mytools.midriverwrite("loginpassword", clave.trim());
	}

	@And("the  user clicks the login button")
	public void UserClickButton() throws InterruptedException {
		mytools.midriverclickcss("#logInModal .btn-primary");
	}
	
	@Then("the (.*) user appears in page")
	public void LoginPageAppears(String nombre) throws InterruptedException {
			String titulo = "";		
						 
			titulo = mytools.midriverreadid("nameofuser");
			
			//	mytools.closeall();
				nombre = "Welcome " + nombre;
				mytools.showinterminal(nombre);
				mytools.showinterminal(titulo);
			Assert.assertEquals(titulo, nombre);
	}		
	
	@Then("the user logout in page")
	public void LogoutPage() throws InterruptedException {
				mytools.midriverclick("logout2");
				mytools.closeall();
			
	}	
}