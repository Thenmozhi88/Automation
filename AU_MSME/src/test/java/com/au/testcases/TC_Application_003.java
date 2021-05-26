package com.au.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.au.pageObjects.ApplicationPage;


public class TC_Application_003 extends BaseClass {
	private static ApplicationPage ap;
	private static JavascriptExecutor js;

	TC_LoginTest_001 tc = new TC_LoginTest_001();

	private void init() {
		ap = new ApplicationPage(driver);
		js = (JavascriptExecutor) driver;
	}

	@Test (priority=1)
	public void verify_Application() throws IOException, InterruptedException {
		
		
		init();
		System.out.println("executed 1st method");
		try {
			
			tc.loginTest();
			System.out.println("verify_Application");
			Thread.sleep(4000);
			ap.click_ApplicationLabel();
			Thread.sleep(3000);
			//boolean elementStatus=ap.click_Applicationtab();
			SoftAssert sa=new SoftAssert();
			if(ap.verify_ApplicationisDisplayed()==true) {
			sa.assertTrue(true);
			System.out.println("Application Label Click Functionality Passed");
			}else
			{
				captureScreen(driver, "ApplicationPage");
				sa.assertTrue(false);
				logger.info("Application Label Click functionality Failed"); //logger msg
			}
			
			
			ap.click_ApplicationTab();
			
		} catch (Exception e) {
			captureScreen(driver, "ApplicatinTest");
			e.printStackTrace();
		}
	}

	@Test (priority=2)
	public void verify_IMDsection() throws IOException, InterruptedException {
		init();

		System.out.println("executed IMD method");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(1000);
		String paymentMode=ap.get_PaymentMode();
		if(paymentMode.equalsIgnoreCase("Cheque")) {
		new ApplicationPage(driver).set_ClearanceStatus(clearance);
		Thread.sleep(500);
		new ApplicationPage(driver).set_BouncedReason(bouncersn);
		Thread.sleep(500);
		new ApplicationPage(driver).set_OtherReasonBounce(otherReason);
		Thread.sleep(500);
		new ApplicationPage(driver).set_IMDremarks(imdRemarks);
		Thread.sleep(1000);
		new ApplicationPage(driver).click_ImdSave();
		Thread.sleep(1300);
		logger.info("IMD updated successfully");
		}else {
			new ApplicationPage(driver).click_ImdSave();
			Thread.sleep(1300);
			logger.info("IMD updated successfully");
		}
		String actual=ap.get_IMDsuccessMsg();
		
		String expected="IMD Details Updated Successfully";
		if(actual.equalsIgnoreCase(expected)) {
			Assert.assertTrue(true);
		}else
		{
			Assert.assertFalse(false);
			captureScreen(driver, "ApplicatinTest");
			logger.info("IMD Test case fails");
			
		}
		
	}

	@Test (priority=3)
	public void verify_ReferenceSection() throws IOException, InterruptedException {
		
		init();
		JavascriptExecutor jsExe=(JavascriptExecutor)driver;

		System.out.println("verify_ReferenceSection");
		
		
		jsExe.executeScript("window.scrollBy(0,2500)");
		
		try {

			for (int i = 0; i < 3; i++) {
				Thread.sleep(6000);
				ApplicationPage applicationPage = new ApplicationPage(driver);
				new ApplicationPage(driver).clickReference();
				Thread.sleep(1000);
				applicationPage.set_ReferenceName(refName);
				applicationPage.set_ReferenceAddress(refAddr);
				applicationPage.set_ReferenceMobile(refMob + i);
				applicationPage.click_referenceSubmit();
				
			}

		} catch (Exception e) {
			captureScreen(driver, "ReferenceTest");
			e.printStackTrace();
		}
		Thread.sleep(3000);
		new ApplicationPage(driver).clickReferenceSave();
		logger.info("Reference updated successfully");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@Test (priority=4, enabled=false)
	public void verify_TVRsection() throws IOException, InterruptedException {
		init();
		ApplicationPage ap = new ApplicationPage(driver);
		//JavascriptExecutor scroll=;
		try {
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(4000);
			ap.clickOpenTVR();

			Thread.sleep(1000);
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
			ap.clickAddTVR();
			Thread.sleep(500);
			ap.pick_TVRdate();
			Thread.sleep(500);
			ap.setEmpName(empName);
			Thread.sleep(500);
			ap.setEmpID(empId);
			Thread.sleep(500);
			ap.setTVRdonewith();
			Thread.sleep(500);
			ap.setTVRremarks("Remarks ok");
			Thread.sleep(1000);
			ap.click_TVRsubmit();
			logger.info("TVR submitted successfully"); 

			

		} catch (Exception e) {
			captureScreen(driver, "TVRTest");
			e.printStackTrace();
		}
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1200)");
	}

	@Test (priority=5, enabled=false)
	public void verify_RCUsection() throws IOException {
		init();
		
		System.out.println("Entered into RCU section");

		try {
			Thread.sleep(1600);
			new ApplicationPage(driver).addRCU();
			Thread.sleep(600);
			new ApplicationPage(driver).setVendorName("Harini");
			Thread.sleep(600);
			new ApplicationPage(driver).setVendorCode(1245);
			Thread.sleep(600);
			new ApplicationPage(driver).pickRCUinitDate();
			Thread.sleep(600);
			new ApplicationPage(driver).pickRCUsubmitDate();
			Thread.sleep(600);
			new ApplicationPage(driver).selectRCUstatus("Refer");
			Thread.sleep(600);
			new ApplicationPage(driver).clickRCUsubmit();

			Thread.sleep(600);
			new ApplicationPage(driver).clickRCUuploadDoc();
			Thread.sleep(600);
			new ApplicationPage(driver).clickRCUsave();
			logger.info("RCU updated successfully");

		} catch (Exception e) {
			captureScreen(driver, "RCUTest");
			e.printStackTrace();
		}

	} 
		
	
	
	
}
