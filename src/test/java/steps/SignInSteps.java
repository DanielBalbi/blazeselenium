package steps;




import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

@Test
public class SignInSteps {
	MyFrameWork mytools = new MyFrameWork();
	WebDriver mydriver;
	

	@Given("the user SigIn in demoblaze")
	public void theUserIsInIndexPage() {
		mydriver = mytools.open();
	}
	

	@When("the user enters (.*) user")
	public void UserEnterUserInSearchBar(String usuario) {
		mytools.midriverclick("signin2"); 
		mytools.midriverclick("sign-username"); 
		mytools.midriverwrite("sign-username", usuario.trim());	
	}
	
	@When("the user enters (.*) pass")
	public void UserEnterClavesInSearchBar(String clave) {
		mytools.midriverwrite("sign-password", clave.trim());		
	}

	@And("the  user clicks the SigIn button")
	public void UserClickButton() throws InterruptedException {
		mytools.midriverclickcss("#signInModal .btn-primary");
		
	}
	

}

