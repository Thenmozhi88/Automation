package com.au.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.au.pageObjects.LoanDetailsPage;

public class TC_UpdateLoanDetails011 extends BaseClass {

	@Test
	public void doUpdate_LoanDetails() throws InterruptedException, IOException {
		// Login

		TC_LoginTest_001 login = new TC_LoginTest_001();

		login.loginTest();
		Thread.sleep(1000);
		LoanDetailsPage lp = new LoanDetailsPage(driver);
		lp.click_LoanDetailsLabel();
		logger.info("Entered into Loan details");
		Thread.sleep(200);
		lp.click_LoanDetailsTab();
		logger.info("Loan details tab cliked");
		Thread.sleep(2000);
		// Update Loan
		int rowCount = getTableRowCount(loandetailTablePath);
		logger.info(rowCount);
		for (int i = 1; i < rowCount; i++) {
			Thread.sleep(1500);
			String loanID = clickTableData(loanStartxPath, i, loanEndxPath);
			logger.info("Loan No:" + " " + loanID + " " + "Clicked Successfully");
			Thread.sleep(1500);
			lp.select_Product("SBL Business Funding");
			Thread.sleep(500);
			String selectedScheme = lp.select_Scheme();
			Thread.sleep(500);
			if (selectedScheme.equalsIgnoreCase("Express Business Loan")
					|| (selectedScheme.equalsIgnoreCase("Qualified Business Loan"))) {
				lp.set_AppliedLoanAmt("1500000");
			} else {
				lp.set_AppliedLoanAmt("1900000");
			}
			logger.info("Applied Loan Amt captured");
			Thread.sleep(500);
			if (selectedScheme.equalsIgnoreCase("Express Business Loan")
					|| (selectedScheme.equalsIgnoreCase("Qualified Business Loan"))) {
				lp.set_AgreedLoanAmt("1400000");
			} else {
				lp.set_AgreedLoanAmt("1400000");
			}
			logger.info("Agreed Loan Amt captured");
			Thread.sleep(6000);
			lp.set_AppliedTenure("48");
			Thread.sleep(6000);
			lp.set_AppliedROI("21");
			Thread.sleep(5000);
			lp.select_TypeofRate("Fixed");
			Thread.sleep(5000);
			lp.select_ScheduleType("Monthly");
			Thread.sleep(500);
			lp.select_PreferredCycleDate("5th");
			Thread.sleep(500);
			lp.select_RepaymentStartDate("05 Nov 2021");
			Thread.sleep(500);
			lp.select_RepaymentMode("CHEQUE");
			Thread.sleep(500);
			lp.select_DisbursementCategory("Full");
			Thread.sleep(500);
			lp.select_GovernmentSchemeTag("PMEG Case");
			Thread.sleep(500);
			lp.click_CalculateEMI();
			logger.info("EMI Calculated successfully");
			Thread.sleep(8000);
			scroll(0, 1600);
			lp.click_LoanUpdateProceed();
			logger.info("Loan details updated successfully");
			Thread.sleep(8000);

			// Charges
			scroll(0, 800);
			String ChargesValue = lp.set_ChargesAmt();
			logger.info("Calculated charges" + " " + ChargesValue);
			scroll(0, 1000);
			lp.click_ChargesSubmit();
			logger.info("Charges submitted successfully");
			Thread.sleep(6000);

		}
	}

}
