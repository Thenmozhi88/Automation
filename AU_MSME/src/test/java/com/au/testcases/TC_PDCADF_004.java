package com.au.testcases;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.au.pageObjects.CustomerOnboarding_UpdateCustomerPage;
import com.au.pageObjects.LoginPage;
import com.au.pageObjects.PDcaf_FI_Page;

public class TC_PDCADF_004 extends BaseClass {

	@Test
	public void get_PDdetails() throws Exception {

		TC_LoginTest_001 lt = new TC_LoginTest_001();

		lt.loginTest();

		PDcaf_FI_Page pf = new PDcaf_FI_Page(driver);
		logger=Logger.getLogger("AUSmallFinance");
		
		

		try {
			Thread.sleep(3500);
			pf.click_labelFinancialAnalysis();
			Thread.sleep(1000);
			pf.click_tab_PDCAF();
			Thread.sleep(4000);
			pf.download_cafReport();
			Thread.sleep(3000);
			logger.info("CAF downloaded process initiated");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		 /* switchTo_Window(0); 
		  Thread.sleep(3000); 
		  ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
		  
		  String actual=driver.getCurrentUrl(); 
		  System.out.println(actual); 
		  boolean isSuccess = actual.endsWith(".pdf"); 
		  if(!isSuccess) { 
			  throw new Exception("file not opened"); 
			  
			  }
		  else {
		  System.out.println("CAF Report Opened successfully"); 
		  //Assert.assertFalse(true);
		  } 
		 
		  
		Thread.sleep(2000);
		switchTo_Window(0); */
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)");
		pf.get_CreditRemarks(35005);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1500)");
		pf.click_PDsubmit();
		Thread.sleep(1000);
		
		  try{ 
			 Thread.sleep(800); 
		  String alertMsg=pf.get_SuccessMsg();
		  System.out.println("actual: "+alertMsg); 
		  String expected="Submitted Successfully"; 
		  Assert.assertEquals(alertMsg, expected);
		  
		  }catch(Exception e) { 
			  logger.info("PD Not Completed");
			  e.printStackTrace(); 
			  
			  
		  }
		 	
	}
}
