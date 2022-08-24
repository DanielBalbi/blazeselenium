package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyFrameWork {
	public WebDriver driver;
	
	public WebDriver open() {
		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver");
	//	ChromeOptions options= new ChromeOptions();
	//	options.addArguments("--headless");
		driver = new ChromeDriver();	// options
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		return driver;
	}	
	
	public void showinterminal(String mensaje) {		
		System.out.println(mensaje);
	}

	public void closeall() {		
		System.out.println("Explorador Cerrado");
		driver.close();
	}
	
	public void midriverclick(String componente) {		
		waitcomponent(componente,"id");
		driver.findElement(By.id(componente)).click(); 
	}
	
	public void midriverclickcss(String componente) {		
		waitcomponent(componente,"css");
		driver.findElement(By.cssSelector(componente)).click(); 
	}
	
	public void midriverclicklink(String componente) {		
		waitcomponent(componente,"linkText");
		driver.findElement(By.linkText(componente)).click(); 
	}	
	
	public void midriverwrite(String componente, String dato) {		
		waitcomponent(componente,"id");		
		driver.findElement(By.id(componente)).sendKeys(dato); 
	}
	
	public String midriverreadcss(String componente) {		
		waitcomponent(componente,"css");		
		return driver.findElement(By.cssSelector(componente)).getText();
	}
	public String midriverreadid(String componente) {		
		waitcomponent(componente,"id");		
		return driver.findElement(By.id(componente)).getText();
	}

	public String midriverreadalert() throws InterruptedException {
		Thread.sleep(1000);
		String mensaje = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return mensaje;
	}

	public void waitcomponent(String componente, String selector) {		
		By Element = null;
        if(selector == "id") {Element = By.id(componente);}
        if(selector == "css") {Element = By.cssSelector(componente);}
        if(selector == "linkText") {Element = By.linkText(componente);}
        // Instanciamos la variable de tipo WebDriverWait para gestionar la espera explícita
        WebDriverWait webdwait = new WebDriverWait(driver,Duration.ofSeconds(120, 1));
        // Usamos la espera explícita bajo una condiciones esperada, en este caso esperamos hasta que el elemento sea clicable
        webdwait.until(ExpectedConditions.elementToBeClickable(Element));
        // Una vez que ya se haya realizado la espera, instanciamos el elemento
       // WebElement element = driver.findElement(byElement);
        /* Clicamos sobre el elemento*/
       // element.click(); 
	}

}
