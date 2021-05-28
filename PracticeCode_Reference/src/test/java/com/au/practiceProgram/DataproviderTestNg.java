package com.au.practiceProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTestNg {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="https://s1.demo.opensourcecms.com/wordpress/";
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)");
		Thread.sleep(1500);
		WebElement link_login=driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a"));
		link_login.click();
	}
	
	
	@Test (dataProvider="data")
	public void doLogin(String user, String pwd) throws InterruptedException {
		
		WebElement txt_usern=driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
		WebElement txt_passw=driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
		WebElement btn_login=driver.findElement(By.xpath("//*[@id=\"wp-submit\"]"));
		Thread.sleep(1000);
		txt_usern.sendKeys(user);
		Thread.sleep(1000);
		txt_passw.sendKeys(pwd);
		Thread.sleep(1000);
		btn_login.click();
	}

	
	@DataProvider(name="data")
	public String[][] input(){
		 String[][] getdata= {{"opensourcecms","opensourcecms"},{"adm1","admin"}};
	     return getdata;
	}
	
}
