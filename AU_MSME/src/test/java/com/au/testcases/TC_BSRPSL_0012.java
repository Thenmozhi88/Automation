package com.au.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.au.pageObjects.BSR_PSLpage;

public class TC_BSRPSL_0012 extends BaseClass{

	@Test
	public void BSR_PSL() throws InterruptedException, IOException {
		TC_LoginTest_001 login = new TC_LoginTest_001();
		//login.loginTest();
		
		Thread.sleep(1000);
		BSR_PSLpage bp=new BSR_PSLpage(driver);
		
		bp.click_BSRPSL_label();
		Thread.sleep(600);
		bp.select_Group("MANUFACTURING");
		Thread.sleep(600);
		bp.select_SubGroup("Chemicals");
		Thread.sleep(600);
		bp.select_Occupation("basic chemicals");
		Thread.sleep(600);
		bp.select_OrganisationType("Public Sector");
		Thread.sleep(600);
		bp.select_Organisation("State Government");
		Thread.sleep(600);
		bp.select_Industry("Others");
		Thread.sleep(600);
		bp.select_BorrowerCategory("Others");
		Thread.sleep(600);
		bp.set_Others("others");
		bp.select_PSLclassificationType("PSL - MSME");
		Thread.sleep(600);
		bp.select_PSLCategory("MSME01 - Manufacturing");
		Thread.sleep(1500);
		bp.select_PSLIndustry("MSME0102 - Small");
		Thread.sleep(900);
		bp.select_PSLDocumentCollected("Udyam Certificate Copy");
		Thread.sleep(900);
		bp.set_UdayamCertificateNo("65465465124512455");
		Thread.sleep(900);
		bp.select_PSLcode("01462-Production of Eggs");
		scroll(0,400);
		Thread.sleep(2000);
		bp.click_PSLsubmit();
		logger.info("BSRPSL updated successfully");
	}
}
