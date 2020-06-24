package FirstTestNG;

import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {

	WebDriver driver = null;

	@Test
	public void f() throws InterruptedException {
		try {
			driver.manage().window().maximize();
			
			driver.get("https://www.imdb.com/");
	
			driver.findElement(By.xpath("(//div[contains(text(), 'Watchlist')])[1]")).click();
	
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@id=\"signin-options\"]/div/div[1]/a[1]")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("anandaraj76@gmail.com");
			driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("619619619");
			driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
			
			Thread.sleep(3000);
			
			List<WebElement> watchlists = driver.findElements(By.xpath("//div[@class='lister-item featureFilm']"));
	
			Iterator<WebElement> iter = watchlists.iterator();
	
			while(iter.hasNext()) {
			    WebElement we = iter.next();
			    
			    System.out.println(we.getText());
	
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@BeforeClass
	public void beforeClass() {
		try {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//src//test//resources//chromedriver.exe");
			driver = new ChromeDriver();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
