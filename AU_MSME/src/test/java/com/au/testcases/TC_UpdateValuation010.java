package com.au.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.au.pageObjects.CollateralPage;
import com.au.pageObjects.Collateral_Legal_ValuationPage;

public class TC_UpdateValuation010 extends BaseClass{

	@Test
	public void doUpdate_Valuation() throws InterruptedException, IOException {
	// Login
			TC_LoginTest_001 login = new TC_LoginTest_001();
			login.loginTest();
			
			Thread.sleep(1000);

			// Collateral Update

			CollateralPage cp = new CollateralPage(driver);
			Collateral_Legal_ValuationPage val=new Collateral_Legal_ValuationPage(driver);
			
			cp.click_CollateralLabel();

			logger.info("Collateral Clicked");
			Thread.sleep(5000);
			scroll(0, 900);
			int valuation_RowCount=getTableRowCount(valuationTablePath);
			logger.info("Valuation count"+" "+(valuation_RowCount-1));
			for(int i=1; i<valuation_RowCount;i++) {
				try {
					logger.info("Entered in for loop");
				boolean report=val.get_valuationViewReport();
				System.out.println("report status:"+report);
				if(report==true) {
					logger.info("Report avail");
					Thread.sleep(600);
					clickTableData(valStartPath,i,valEndPath);
					logger.info("View report availabale ready to download");
					Thread.sleep(8000);
					clickTableData(valReportStartPath,1,valReportEndPath);
					Thread.sleep(2000);
					switchTo_Window(0);
					Thread.sleep(2000);
					val.click_ReportClose();
					
					
				}else {
					
					logger.info("Report not avail");
					
				}
						
			}catch(Exception e) {
				System.out.println(e);
			}
				
			}
	
	}}
 
