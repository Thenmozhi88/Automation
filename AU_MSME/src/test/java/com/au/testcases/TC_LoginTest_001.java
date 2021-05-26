package com.au.testcases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.au.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{


	@Test
	public void loginTest() throws InterruptedException, IOException {
		
		
		LoginPage lp = new LoginPage(driver);
		
		lp.clickAdvanced();
		logger.info("Advanced clicked");
		Thread.sleep(1000);
		lp.clickProceed();
		logger.info("Proceed clicked"); 
		Thread.sleep(1000);
		lp.setUsername(username);
		logger.info("User provided"); //logger msg
		lp.setPassword(password);
		logger.info("Password provided"); //logger msg
		lp.selectProduct(product);
		logger.info("Product selected"); //logger msg
		lp.clickLogin();
		logger.info("login clicked and processed");
		Thread.sleep(1000);
		/*lp.clickAdvanced();
			logger.info("Advanced clicked");
			Thread.sleep(1000);
			lp.clickProceed();
			logger.info("Proceed clicked"); */


		/*System.out.println("Title: "+driver.getTitle());
		if(driver.getTitle().equalsIgnoreCase("Loan Applications")) {
			Assert.assertTrue(true);
			logger.info("Login Passed"); 
			
					}
		else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login Failed"); //logger msg
		} 
		*/
		
		lp.clickRole();   
		logger.info("clicked on role");
		Thread.sleep(5000);
		lp.clickTask();
		logger.info("clicked on task");
		Thread.sleep(5000);
		new LoginPage(driver).clickSearch(applid);
		logger.info("Search application initiated");
		
		Thread.sleep(50000);
		new LoginPage(driver).clickApplication(applid);
		logger.info("Application id"+" "+applid+" "+"clicked");
		Thread.sleep(5000);
	} 
	
	
	

	
	
}
