package Steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass extends AbstractTestNGCucumberTests{
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() {        // code to open chrome browser and load application
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();      // driver - get value as session id
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

	}
	@AfterMethod
	public void postCondition() {       // close the browser
		driver.close();
		

	}
	                                       

}
