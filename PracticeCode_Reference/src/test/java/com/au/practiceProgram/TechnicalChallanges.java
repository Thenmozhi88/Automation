package com.au.practiceProgram;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TechnicalChallanges {
	
	private static void verifyLinks(String linkUrl) {
		// TODO Auto-generated method stub
		
		 try
         {
             URL url = new URL(linkUrl);

             //Now we will be creating url connection and getting the response code
             HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
             httpURLConnect.setConnectTimeout(5000);
             httpURLConnect.connect();
             if(httpURLConnect.getResponseCode()>=200)
             {
              System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
             }    
        
             //Fetching and Printing the response code obtained
             else{
                 System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
             }
         }catch (Exception e) {}
    } 

	// To get all links in a WebPage

	/*
	 * @Test public void get_AllLinks() {
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\ThenmozhiP\\LiveAU_Project\\PracticePrograms\\Drivers\\chromedriver.exe"
	 * ); driver=new ChromeDriver();
	 * driver.get("https://www.seleniumeasy.com/test/");
	 * 
	 * List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	 * for(WebElement links:allLinks) { System.out.println(links.getText()); } }
	 */

	// SoftAssert and HardAssert

	/*
	 * @Test public void softAssert(){ SoftAssert softAssertion= new SoftAssert();
	 * System.out.println("softAssert Method Was Started");
	 * softAssertion.assertTrue(false);
	 * System.out.println("softAssert Method Was Executed"); }
	 * 
	 * @Test public void hardAssert() {
	 * System.out.println("hardAssert Method Was Started");
	 * Assert.assertTrue(false);
	 * System.out.println("hardAssert Method Was Executed"); }
	 */

	// Switch to one window to other window

	/*
	 * @Test public void window_Switch() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\ThenmozhiP\\LiveAU_Project\\PracticePrograms\\Drivers\\chromedriver.exe"
	 * ); driver=new ChromeDriver();
	 * driver.get("https://www.seleniumeasy.com/test/"); ArrayList<String> tabs=new
	 * ArrayList<String>(driver.getWindowHandles());
	 * driver.switchTo().window(tabs.get(1));
	 * 
	 * }
	 */

	/*public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ThenmozhiP\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/broken");
 
        //Storing the links in a list and traversing through the links
        List<WebElement> links = driver.findElements(By.tagName("a"));
 
        // This line will print the number of links and the count of links.
        System.out.println("No of links are "+ links.size());  
      
        //checking the links fetched.
        for(int i=0;i<links.size();i++)
        {
            WebElement E1= links.get(i);
            String url= E1.getAttribute("href");
            verifyLinks(url);
        }
    	
	} */
	
	/*
	WebDriver driver;
	@Test
	public void handling_Popups() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ThenmozhiP\\Desktop\\chromedriver.exe" );
		driver = new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/basic_auth"); //Popup

	// Approach1
	// Syntax: http://username:password@test.com
	Thread.sleep(3000);
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	String text = driver.findElement(By.cssSelector("p")).getText();
	System.out.println(text);
} */

}
