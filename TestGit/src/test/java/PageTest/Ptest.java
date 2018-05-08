package PageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.loginPage;

public class Ptest {
	
	
	WebDriver driver;
	@Test
	
	public void runner() throws Throwable
	{
		loginPage lgn=PageFactory.initElements(driver, loginPage.class);
		lgn.LoginToEgp();
	}
	

}
