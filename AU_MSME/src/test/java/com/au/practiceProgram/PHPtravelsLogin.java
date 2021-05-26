package com.au.practiceProgram;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PHPtravelsLogin {
	
	WebDriver driver;
	@Test 
	public void doLogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ThenmozhiP\\LiveAU_Project\\PracticePrograms\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://book.theautomatedtester.co.uk/chapter1");
		Thread.sleep(1000);
		
		
		
	
	}
	
	
	

}
