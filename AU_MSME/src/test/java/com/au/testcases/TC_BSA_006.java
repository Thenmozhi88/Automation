package com.au.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.au.pageObjects.BSAPage;
import com.au.pageObjects.IVPage;

public class TC_BSA_006 extends BaseClass {

	@Test
	public void do_BSA() throws InterruptedException, IOException {
		
		TC_LoginTest_001 login1=new TC_LoginTest_001();
	//	login1.loginTest();
		
		BSAPage bp=new BSAPage(driver);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		bp.click_labelFinancialAnalysis();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		bp.click_BSAtab();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		int activeCustomerCount=getDropdownCount(BSA_MemberDropdown);
		logger.info("Active Member count"+activeCustomerCount);
		logger.info("Active customer member captured");
		for(int i=1;i<activeCustomerCount; i++) {
		new BSAPage(driver).select_Memberdetails(i);
		logger.info(i+"member selected");
		Thread.sleep(1000);
		new BSAPage(driver).upload_BankStatement();
		logger.info(i+"statement uploaded");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		new BSAPage(driver).click_DocumentSubmit();
		Thread.sleep(25000); 
		logger.info(i+"Document submitted");
		js.executeScript("window.scrollBy(0,1500)");
		
		
		
	/*	String actual=new BSAPage(driver).getSuccessMsg();
		String expected="Submitted Successfully";
		if(actual.equalsIgnoreCase(expected)) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
			captureScreen(driver, "BSATest");
			logger.info("IMD Test case fails");
		}
		*/
		logger.info("Bank account summary table process");
		int bankAccSummaryRowCount=getTableRowCount(BSA_accSummaryTablepath);
		if(bankAccSummaryRowCount<1) {
			System.out.println("Table Empty");
		}else {
			//BSAPage bsa=new BSAPage(driver);
			for(int j=1;j<bankAccSummaryRowCount;j++) {
			Thread.sleep(500);
			logger.info("Account count"+(bankAccSummaryRowCount-1));
			clickBSAaccountLink(BSA_accSummaryStartXpath,j,BSA_accSummaryLastXpath);
			logger.info(j+"Customer Account No clicked");
			new BSAPage(driver).select_AcType("Savings");
			Thread.sleep(1000);
			new BSAPage(driver).set_branchName("Pallikaranai");
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			new BSAPage(driver).click_monthlySubmit();
			logger.info("Data captured for" + j + "account");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}
	}
		}
	}
}
