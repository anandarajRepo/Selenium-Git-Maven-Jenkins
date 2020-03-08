package FirstTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
	
	WebDriver driver = null;
	
	  @Test
	  public void f() {
		  
		  driver.manage().window().maximize();
		  driver.get("http://google.com");
		  
	  }
	
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	
	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

}
