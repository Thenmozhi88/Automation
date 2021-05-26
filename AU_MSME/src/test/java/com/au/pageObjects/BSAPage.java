package com.au.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BSAPage {
	
	WebDriver ldriver;
	
	public BSAPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//BSA
	
	@FindBy(xpath = "//a[text()='FINANCIAL ANALYSIS']")
	@CacheLookup
	WebElement lbl_FinancialAnalysis;
	@FindBy(xpath="//div[text()='BSA']")
	@CacheLookup
	WebElement tab_BSA;
	
	@FindBy(id="bsa_home.member_list")
	@CacheLookup
	WebElement drpdwn_MemDetails;
	@FindBy(xpath="(//input[@type='file'])[2]")
	@CacheLookup
	WebElement btn_DocUpload;
	@FindBy(xpath="//button[contains(@id,'bsa_details') and contains(@id,'.submit_bank_statement')]")
	@CacheLookup
	WebElement btn_DocSubmit;
	
	@FindBy(xpath="//div[text()='Submitted Successfully']")
	@CacheLookup
	WebElement altMsg_Success;
	
	@FindBy(xpath="//*[contains(@id,'bsa_details.') and contains(@id,'.NEW.bsa_account.ac_type')]")
	@CacheLookup
	WebElement drpdwn_AcType;
	@FindBy(xpath="//*[contains(@id,'bsa_details.') and contains(@id,'.NEW.bsa_account.branch_name')]")
	@CacheLookup
	WebElement txt_BranchName;
	
	@FindBy(xpath="//*[contains(@id,'bsa_details.') and contains(@id,'.NEW.add_month\')]")
	@CacheLookup
	WebElement btn_addMonth;
	@FindBy(xpath="//button[@class='btn btn-primary btnNav btn-block pull-right waves-effect waves-light btn-submit']")
	@CacheLookup
	WebElement btn_monthlySummarySubmit;
	@FindBy(xpath="//button[@class='btn btn-secondary btn-block btnNav pull-right waves-effect waves-light btn-cancel btnbsa']")
	@CacheLookup
	WebElement btn_monthlySummaryCancel;
	
	
	public void click_labelFinancialAnalysis() {
		
		lbl_FinancialAnalysis.click();
	}
	
	public void click_BSAtab() {
		
		tab_BSA.click();
	}
	
	public void select_Memberdetails(int i) {
		
		Select s=new Select(drpdwn_MemDetails);
		s.selectByIndex(i);
		
	}
	
	public void upload_BankStatement() {
		
		btn_DocUpload.sendKeys("C:\\Users\\ThenmozhiP\\Desktop\\Bank statement3.pdf");
	}
	
	public void click_DocumentSubmit() {
	
		btn_DocSubmit.click();
	}
	
	public void select_AcType(String type) {
		Select drpdwn=new Select(drpdwn_AcType);
		drpdwn.selectByVisibleText(type);
	}
	
	public void set_branchName(String bName) {
		txt_BranchName.clear();
		txt_BranchName.sendKeys(bName);
	}
	
	
	
	public String getSuccessMsg() {
		
		String msg=altMsg_Success.getText();
		return msg;
	}
	
	public void click_monthlySubmit() {
		
		btn_monthlySummarySubmit.click();
	}
	
public void click_monthlyCancel() {
		
	btn_monthlySummaryCancel.click();
	}
	
	
}
