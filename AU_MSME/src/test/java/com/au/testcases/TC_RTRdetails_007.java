package com.au.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.au.pageObjects.RTRPage;

public class TC_RTRdetails_007 extends BaseClass {
	

	
	
	@Test
	public void do_RTR() throws InterruptedException, IOException {
		
		TC_LoginTest_001 login=new TC_LoginTest_001();
		//login.loginTest();
		

		RTRPage rp=new RTRPage(driver);
		rp.click_FinancialAnalysis();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		rp.click_RTR();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		new RTRPage(driver).select_MemberDetails();
		int memberCount=getDropdownCount(RTR_MemberDropdown);
		logger.info("Total member count" + " " +memberCount);
		Thread.sleep(1000);
		for(int i=1; i<memberCount;i++) {
		JavascriptExecutor js;
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2500)");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		new RTRPage(driver).click_ManualRTR();
		logger.info("Manual RTR process initiated");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		new RTRPage(driver).get_FinancierName("Niranjana");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		new RTRPage(driver).select_typeofLoan();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		new RTRPage(driver).get_LoanAmount(200000);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		new RTRPage(driver).get_CurrentPOS(100000);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		new RTRPage(driver).get_EMIpaid(12);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		new RTRPage(driver).get_Tenure(36);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		new RTRPage(driver).get_EMIstartDate();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		new RTRPage(driver).get_EMIamount(13000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		new RTRPage(driver).select_shallbeClosed();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//rp.select_EMiconsiderObligation();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		new RTRPage(driver).select_Status();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		new RTRPage(driver).get_ReportedDate();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		new RTRPage(driver).click_Submit();
		logger.info("Manual RTR submitted");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-2500)");
		}
	}

}
