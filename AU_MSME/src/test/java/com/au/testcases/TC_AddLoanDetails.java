package com.au.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.au.pageObjects.LoanDetailsPage;

public class TC_AddLoanDetails extends BaseClass {
	
	@Test
	public void do_AddLoanDetails() throws InterruptedException, IOException {
	
	TC_LoginTest_001 login = new TC_LoginTest_001();
	
	login.loginTest();
	Thread.sleep(1000);
	LoanDetailsPage lp=new LoanDetailsPage(driver);
	lp.click_LoanDetailsLabel();
	logger.info("Entered into Loan details");
	Thread.sleep(200);
	lp.click_LoanDetailsTab();
	logger.info("Loan details tab cliked");
	Thread.sleep(2000);
	//Add Loan
	lp.click_addLoan();
	Thread.sleep(1500);
	lp.select_Product("SBL Business Funding");
	Thread.sleep(500);
	String selectedScheme=lp.select_Scheme();
	Thread.sleep(500);
	if(selectedScheme.equalsIgnoreCase("Express Business Loan")||(selectedScheme.equalsIgnoreCase("Qualified Business Loan"))){
	lp.set_AppliedLoanAmt("1500000");
	}else {
		lp.set_AppliedLoanAmt("1900000");
	}
	logger.info("Applied Loan Amt captured");
	Thread.sleep(500);
	if(selectedScheme.equalsIgnoreCase("Express Business Loan")||(selectedScheme.equalsIgnoreCase("Qualified Business Loan"))) {
	lp.set_AgreedLoanAmt("1400000");
	}else {
		lp.set_AgreedLoanAmt("1400000");
	}
	logger.info("Agreed Loan Amt captured");
	Thread.sleep(500);
	lp.set_AppliedTenure("48");
	Thread.sleep(500);
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
	scroll(0,600); 
	lp.click_LoanSaveProceed();
	logger.info("New Loan created");

}
}
