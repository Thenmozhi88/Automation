package com.au.practiceProgram;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AULogin {
	
	WebDriver driver;
	@Test
	public void doLogin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ThenmozhiP\\Desktop\\chromedriver.exe" );
		driver = new ChromeDriver();
		//logger=Logger.getLogger("AUSmallFinance");
		PropertyConfigurator.configure("Log4j.properties");

		driver.get("http://10.57.9.69/au-customer-portal-sbl/");
	/*	String actualTitle=driver.getTitle();
		String expectedTitle="Privacy error";
		Assert.assertEquals(actualTitle, expectedTitle); */
	
		driver.manage().window().maximize();
	}
}
