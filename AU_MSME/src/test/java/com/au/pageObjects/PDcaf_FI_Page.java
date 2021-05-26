package com.au.pageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PDcaf_FI_Page {

	WebDriver ldriver;

	public PDcaf_FI_Page(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

//PD details

	@FindBy(xpath = "//a[text()='FINANCIAL ANALYSIS']")
	@CacheLookup
	WebElement label_FinAnalysis;
	@FindBy(xpath = "//div[text()='PD-CAF']")
	@CacheLookup
	WebElement tab_PDcaf;
	@FindBy(id = "caf_details.caf_report")
	@CacheLookup
	WebElement btn_cafReport;
	@FindBy(id = "caf_details.cm_assessment.fa_eligable_loan_amount")
	@CacheLookup
	WebElement txt_CLE_creditRemarks;
	@FindBy(id = "caf_details.btn_home")
	@CacheLookup
	WebElement btn_PDsubmit;
	@FindBy(xpath = "//div[@class='white materialize-green-text']")
	@CacheLookup
	WebElement alt_PDsuccessmsg;

	public void click_labelFinancialAnalysis() {
		if(label_FinAnalysis!=null) {
			label_FinAnalysis.click();	
		}else {
			System.out.println("Null");
		}

		
	}
	
	public void click_tab_PDCAF() {
		
		tab_PDcaf.click();
	}

	public void download_cafReport() throws InterruptedException {

		btn_cafReport.click();

	}

	public void get_CreditRemarks(int creditValue) throws InterruptedException {

		txt_CLE_creditRemarks.clear();
		txt_CLE_creditRemarks.sendKeys(Integer.toString(creditValue));
		
	}

	public void click_PDsubmit() {

		btn_PDsubmit.click();
		
	}

	
	public String get_SuccessMsg() {
		
		String msg=alt_PDsuccessmsg.getText();
		return msg;
	}

}
