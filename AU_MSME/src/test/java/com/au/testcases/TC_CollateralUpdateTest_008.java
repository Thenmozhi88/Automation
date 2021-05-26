package com.au.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import com.au.testcases.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.au.pageObjects.CollateralPage;
import com.au.pageObjects.LoginPage;

public class TC_CollateralUpdateTest_008 extends BaseClass{
	

	@Test
	public void collateralUpdate() throws InterruptedException, IOException {
		
		//Login 
		TC_LoginTest_001 login=new TC_LoginTest_001();
		//login.loginTest();
		Thread.sleep(1000);
		
		
		// Collateral Update
		
		CollateralPage cp= new CollateralPage(driver);
		
		cp.click_CollateralLabel();
		
		logger.info("Collateral Clicked");
		Thread.sleep(5000);
		int total_CollateralCount=getTableRowCount(colltablePath);
		logger.info("table count received");
		System.out.println("No of collateral" + " " + (total_CollateralCount-1));
		//Update Collateral
		logger.info("Update collateral");
		for(int i=1; i<total_CollateralCount; i++) {
			Thread.sleep(6000); 
			System.out.println(collStartpath+i+collMidpath+1+collEndpath);
			String Coll_Id=clickTableData(collStartpath,i,collMidpath,1,collEndpath);
		
			logger.info("Collateral Id: "+Coll_Id +" clicking in progress");
			 
			logger.info("Collateral ID clicked");
			Thread.sleep(2500);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2500)"); 
			Thread.sleep(600);
			System.out.println("Test");
			new CollateralPage(driver).click_CollUpdateSubmit();
			Thread.sleep(4000);
			
		}
		
		//Add Collateral
		logger.info("Add Collateral");
		cp.click_AddCollateral();
		logger.info("Add collateral clicked");
		Thread.sleep(1000);
		cp.select_IsExistingCollateral("No");
		Thread.sleep(500);
		cp.select_CollateralType("Property");
		Thread.sleep(500);
		cp.select_CollateralName("Property");
		Thread.sleep(500);
		cp.select_collateralDetail("Primary");
		Thread.sleep(500);
		cp.select_RelatioshipwithLoan();
		Thread.sleep(500);
		cp.select_PropertyCategory("Commercial");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 400)");
		cp.select_PropertyType("Flat");
		Thread.sleep(500);
		cp.select_OccupancyStatus("Rented");
		Thread.sleep(500);
		cp.select_PropertyTitle("NA Property");
		Thread.sleep(500);
		cp.set_EstimatedPropValue(450000);
		Thread.sleep(600);
		cp.set_HouseNo("3/2A");
		Thread.sleep(500);
		cp.set_KhasraNo("65454");
		Thread.sleep(500);
		cp.set_Locality("Tambaram");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 400)");
		cp.select_State("MAHARASHTRA");
		Thread.sleep(2000);
		cp.set_City("RATNAGIRI");
		Thread.sleep(1000);
		cp.pick_autoSuggesstion_City();
		logger.info("City selected");
		Thread.sleep(3000);
		
		cp.set_Pincode("4");
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='tt-suggestion tt-selectable'])[3]")));
		logger.info("Pincode captured");
		cp.pick_autoSuggesstion_Pincode();
		logger.info("clicked autoSuggesstion");
		Thread.sleep(500);
		cp.set_Landmark("Near scchool");
		Thread.sleep(500);
		cp.set_District("Ratnagiri");
		Thread.sleep(500);
		cp.set_Taluka("Rajapur");
		Thread.sleep(500);
		cp.set_Village("Kancheepuram");
		Thread.sleep(500);
		cp.click_addCollateralsubmit();
		logger.info("collateral submitted");
	
	}
	
	
	
	

}
