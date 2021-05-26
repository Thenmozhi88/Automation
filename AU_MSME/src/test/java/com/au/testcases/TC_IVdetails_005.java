package com.au.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.au.pageObjects.CustomerOnboarding_UpdateCustomerPage;
import com.au.pageObjects.IVPage;
import com.au.pageObjects.IVTemplatePage;
import com.au.utilities.XLUtils;

public class TC_IVdetails_005 extends BaseClass{

	
	@Test (dataProvider="IVdata")
	public void do_IVdetails(String ind, String subind, String occ ) throws InterruptedException, IOException {
		TC_LoginTest_001 login1=new TC_LoginTest_001();
		//login1.loginTest();
		
		IVPage iv=new IVPage(driver);
		
		IVTemplatePage itp=new IVTemplatePage(driver);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		iv.click_FinancialLabel();
		Thread.sleep(500);
		iv.click_PDCAF_tab();
		
		Thread.sleep(1000);
		iv.select_Member();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,5000)"); 
		
		Boolean EditButtonStatus=iv.verify_EditDisplayed();
		System.out.println("condition:"+EditButtonStatus);
		if(EditButtonStatus) {
			logger.info("Edit button visible and condition true");
			iv.click_EditButton();
			Thread.sleep(2000);
			iv.click_EditYesNo();
			js.executeScript("scroll(0, -250);");
			logger.info("Editing process initiated");
		}
		
	
		iv.select_TypeofEmployment();
	
		Thread.sleep(3000);
		iv.select_Industry(ind);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		iv.select_SubIndustry(subind);
		Thread.sleep(2000);
		iv.select_Occupation(occ);
		Thread.sleep(2000);
		iv.select_ConsiderIncomeEligibility();
		Thread.sleep(2000);
		iv.select_MethodofAssessment("Documented");
		Thread.sleep(2000);
		iv.select_Program("Gross Margin");
		Thread.sleep(1000);
		iv.select_AuditedFinancial();
		Thread.sleep(1000);
		iv.select_isTurnOver();
		Thread.sleep(1000);
		iv.select_CreditRisk();
		Thread.sleep(6500);
		scroll(0,300);
		iv.click_IVsubmit();
		Thread.sleep(3000);
		
		
		//IV Profile
		
		/*js.executeScript("window.scrollBy(0,500)");
		itp.get_AnnualFee(350000);
		Thread.sleep(500);
		itp.get_staffSalary(2000);
		Thread.sleep(1000);
		itp.get_OtherExpenses(1000);
		Thread.sleep(500);
		itp.get_VisitFee(2500);
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,500)");
		itp.click_IvTemplateSubmit(); */
		
		//GMP
		
		itp.set_TotalTurnOverAnnually(4800000);
		Thread.sleep(500);
		itp.set_industryMargin(80);
		Thread.sleep(500);
		
		//js.executeScript("window.scrollBy(0,1000)");
		itp.click_otherIncome();
		Thread.sleep(500);
		itp.set_typeOfIncome("Miscellenous");
		Thread.sleep(500);
		itp.set_amountAnnual(36000);
		Thread.sleep(1000);
		itp.click_otherIncomeSubmit();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,1000)");
		itp.click_IvTemplateSubmit();
		Thread.sleep(1000);
		itp.verify_IVtemplateSubmit();
		
		boolean status=itp.verify_IVtemplateSubmit();
		if(status==true) {
			logger.info("IV Template testcase pass");
		}
		else {
			captureScreen(driver, "IV GMP TemplateTest");
			Assert.assertTrue(false);
			logger.info("IV Template GMP Failed"); //logger msg
		}
		}
		
		
		
		@DataProvider(name="IVdata")
		public String[][] input() throws IOException{
			String path=System.getProperty("user.dir")+"\\src\\test\\java\\com\\au\\testData\\IV Data.xlsx";
			
		int rowCount=XLUtils.getRowCount(path, "Sheet1");
		System.out.println("rowcount" + rowCount);
		int colCount=XLUtils.getCellCount(path, "Sheet1", 1);
		System.out.println("colcount" + colCount);
		String ivdata[][]=new String[rowCount][colCount];
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				ivdata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return ivdata;
		
		}
	
	
}
