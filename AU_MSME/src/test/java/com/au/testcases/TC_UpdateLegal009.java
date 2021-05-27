package com.au.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.au.pageObjects.CollateralPage;
import com.au.pageObjects.Collateral_Legal_ValuationPage;

public class TC_UpdateLegal009 extends BaseClass {

	@Test
	public void do_updateLegal() throws InterruptedException, IOException {

		// Login
		TC_LoginTest_001 login = new TC_LoginTest_001();
		//login.loginTest();
		Thread.sleep(1000);

		// Collateral Update

		CollateralPage cp = new CollateralPage(driver);
		cp.click_CollateralLabel();

		logger.info("Collateral Clicked");
		Thread.sleep(5000);
		scroll(0, 700);
		int legal_RowCount = getTableRowCount(legalTablePath);

		logger.info("Legal count" + " " + (legal_RowCount));
		for (int i = 1; i < legal_RowCount; i++) {
			
			if(i > 1) {
				Thread.sleep(3000);
				scroll(0, 700);
			}

			Collateral_Legal_ValuationPage legal = new Collateral_Legal_ValuationPage(driver);;

			System.out.println(legalStartPath + i + legalEndPath1);

			String Action = getTableData(legalStartPath, i, legalEndPath1);
			System.out.println(Action);

		/*	switch (Action) {
			//
			case "Allocate":
				logger.info("Entered into Allocate");
				String assign = clickTableData(legalStartPath, i, legalEndPath1);
				logger.info(Action + " " + "Legal Allocate inprogress");
				logger.info("Legal Initiated");
				Thread.sleep(3000);
				driver.switchTo().activeElement();
				Thread.sleep(2000);
				legal.select_AllocatevendorType("External");
				Thread.sleep(1000);
				legal.select_AllocateHub(1);
				Thread.sleep(1000);
				legal.select_AllocatevendorName(1);
				Thread.sleep(1000);
				legal.click_AllocationSubmit();
				logger.info("Legal Allocated");
			case "Re-assign":
				logger.info("Entered into Reassign");
				String Reassign = clickTableData(legalStartPath, i, legalEndPath1);
				logger.info(Action + " " + "Reassign inprogress");
				logger.info("Reassign Initiated");
				Thread.sleep(3000);
				driver.switchTo().activeElement();
				Thread.sleep(2000);
				legal.select_ReassignVendorType("External");
				Thread.sleep(500);
				legal.select_ReassignHub(1);
				Thread.sleep(500);
				legal.select_ReassignVendorName(1);
				Thread.sleep(1000);
				legal.click_AllocationSubmit();
				logger.info("Legal Allocated");
				break;
			case "Revoke":
				String revoke = clickTableData(legalStartPath, i, legalEndPath1);
				logger.info(Action + " " + "initiated");
				logger.info("Revoke completed");
				Thread.sleep(12000);
				scroll(0, 700);
				clickTableData(legalStartPath, i, legalEndPath1);
				Thread.sleep(1000);
				logger.info(Action + " " + "Reassign inprogress");
				logger.info("Reassign Initiated");
				Thread.sleep(3000);
				driver.switchTo().activeElement();
				Thread.sleep(2000);
				legal.select_ReassignVendorType("External");
				Thread.sleep(500);
				legal.select_ReassignHub(1);
				Thread.sleep(500);
				legal.select_ReassignVendorName(1);
				Thread.sleep(1000);
				legal.click_AllocationSubmit();
				logger.info("Legal Reassigned");
				break;

			}

			/*
			 * String Action1=getTableData(legalStartPath,i,legalEndPath2);
			 * System.out.println(Action); switch(Action1){ case "Waived": String
			 * Waive=clickTableData(legalStartPath,i,legalEndPath2);
			 * logger.info(Action+" "+"Waive initiated" ); Thread.sleep(2000);
			 * driver.switchTo().activeElement(); Thread.sleep(2000);
			 * legal.set_WaiveRemarks("remarks case Waived"); Thread.sleep(300);
			 * legal.click_AllocationSubmit(); logger.info("Legal waived"); case "Manual":
			 * String Manual=clickTableData(legalStartPath,i,legalEndPath2);
			 * logger.info(Action+" "+"Manual initiated" ); Thread.sleep(2000);
			 * 
			 * }
			 */
			logger.info("Legal" + " " + i + " " + "Done");
		}
	}

}
