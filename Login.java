package Steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{
	
	//public ChromeDriver driver;
	
	
	/*@Given("Open the new browser")
	public void openBrowser(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@And("Load the application URl")
	public void loadApplication(){
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	}*/
	@Given("Enter the username as {string}")
	public void enterUsername(String uName){
		driver.findElement(By.id("username")).sendKeys(uName);
	
	}
	@And("Enter the password as {string}")
	public void enterPassword(String pWd){
		driver.findElement(By.id("password")).sendKeys(pWd);
		
	}	
	
	@When("Click on login button")
	public void clickLoginButton(){
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
		
	
	@Then("Homepage wil be displayed")
	public void verifyHomePage(){
		boolean displayed= driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		
	}
	@But("Error message should be displayed")
	public void errorMessage(){
		boolean displayed = driver.findElement(By.id("errorDiv")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	
	}
	
