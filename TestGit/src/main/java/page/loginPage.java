package page;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class loginPage {
	WebDriver driver;
	public void LoginToEgp() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
		
		driver.get("http://www.training.eprocure.gov.bd");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Find user name
		 driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("txtEmailId"));
		//Fill user name
		userName.sendKeys("egppeuser@gmail.com");
		//Find password
		WebElement password = driver.findElement(By.id("txtPassword"));
		//Fill password
		password.sendKeys("egp12345");
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.id("btnLogin"));
		submit.click();
		WebElement element= driver.findElement(By.id("headTabApp"));
		 
		Actions action = new Actions(driver);
		 
		        action.moveToElement(element).build().perform();
		 
		        driver.findElement(By.linkText("Create APP")).click();
		        
		        
	}

}
