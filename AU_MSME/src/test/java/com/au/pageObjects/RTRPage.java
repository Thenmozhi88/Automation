package com.au.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTRPage {
	
	WebDriver ldriver;
	
	public RTRPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//a[text()='FINANCIAL ANALYSIS']")
	@CacheLookup
	WebElement lbl_FinAnal;
	@FindBy(xpath="//div[text()='RTR']")
	@CacheLookup
	WebElement tab_RTR;
	@FindBy(id="rtr_home.member_list")
	@CacheLookup
	WebElement drpdwn_MemDetails;
	@FindBy(xpath="//button[contains(@id,'rtr_details.') and contains(@id,'.add_rcu_btn')]")
	@CacheLookup
	WebElement btn_ManualRTR;
	@FindBy(id="manual_rtr_details_item.name_of_financier")
	@CacheLookup
	WebElement txt_NameofFinancier;
	@FindBy(id="manual_rtr_details_item.loan_type")
	@CacheLookup
	WebElement drpdwn_typeofLoan; 
	@FindBy(id="manual_rtr_details_item.finance_amount")
	@CacheLookup
	WebElement txt_LoanAmt;
	@FindBy(id="manual_rtr_details_item.current_outstatnding")
	@CacheLookup
	WebElement txt_currOutPOS;
	@FindBy(id="manual_rtr_details_item.roi")
	@CacheLookup
	WebElement txt_ROI;
	@FindBy(id="manual_rtr_details_item.emi_paid")
	@CacheLookup
	WebElement txt_no_of_emiPaid;
	@FindBy(id="manual_rtr_details_item.tenure")
	@CacheLookup
	WebElement txt_Tenure;
	@FindBy(id="manual_rtr_details_item.emi_start_date")
	@CacheLookup
	WebElement datepick_EMIstartDate;
	@FindBy(xpath="//td[text()='8']")
	@CacheLookup
	WebElement datepick_pickStartDate;
	@FindBy(id="manual_rtr_details_item.emi_amount")
	@CacheLookup
	WebElement txt_emiAmount;
	@FindBy(id="manual_rtr_details_item.shallbe_closed")
	@CacheLookup
	WebElement drpdwn_shallBeClosed;
	@FindBy(id="manual_rtr_details_item.consider_emi_for_obligation")
	@CacheLookup
	WebElement drpdwn_EMiConsiderObligation;
	@FindBy(id="manual_rtr_details_item.ac_status")
	@CacheLookup
	WebElement drpdwn_Status;
	@FindBy(id="manual_rtr_details_item.reported_date")
	@CacheLookup
	WebElement datepick_ReportedDate;
	@FindBy(xpath="//td[text()='9']")
	@CacheLookup
	WebElement datepick_pickReportedDate;
	@FindBy(xpath="//button[contains(@class,'btn btn-secondary')]")
	@CacheLookup
	WebElement btn_Cancel;
	@FindBy(xpath="//button[contains(@class,'btn btn-primary')]")
	@CacheLookup
	WebElement btn_Submit;
	
	public void click_FinancialAnalysis() {
		
		if(lbl_FinAnal!=null) {
			lbl_FinAnal.click();	
		}else {
			System.out.println("Null");
		}
	}
	
	public void click_RTR() {
		
		tab_RTR.click();
	}
	
	public void select_MemberDetails() {
		
		Select mem=new Select(drpdwn_MemDetails);
		mem.selectByIndex(1);
	}
	
	public void click_ManualRTR() {
		
		btn_ManualRTR.click();
	}
	public void get_FinancierName(String name) {
		
		txt_NameofFinancier.sendKeys(name);
	}
	
	public void select_typeofLoan() {
		
		Select typeLoan=new Select(drpdwn_typeofLoan);
		typeLoan.selectByIndex(1);
		
	}
	
	public void get_LoanAmount(int value) {
		
		txt_LoanAmt.sendKeys(Integer.toString(value));
	}
	
	public void get_CurrentPOS(int value) {
		
		txt_currOutPOS.sendKeys(Integer.toString(value));
	}
	
	public void get_ROI(int value) {
		
		txt_ROI.sendKeys(Integer.toString(value));
	}
	
	public void get_EMIpaid(int value) {
		
		txt_no_of_emiPaid.sendKeys(Integer.toString(value));
	}
	
	public void get_Tenure(int value) {
		
	txt_Tenure.sendKeys(Integer.toString(value));
	}
	
	public void get_EMIstartDate() {
		
		datepick_EMIstartDate.click();
		datepick_pickStartDate.click();
	}
	
	public void get_EMIamount(int value) {
		
		txt_emiAmount.sendKeys(Integer.toString(value));
	}
	
	public void select_shallbeClosed() {
		
		Select shallbeclosed=new Select(drpdwn_shallBeClosed);
		shallbeclosed.selectByIndex(2);
	}

	public void select_EMiconsiderObligation() {
		
		Select EmiObligation=new Select(drpdwn_EMiConsiderObligation);
		EmiObligation.selectByIndex(2);
	}
	
	public void select_Status() {
		
		Select status=new Select(drpdwn_Status);
		status.selectByIndex(2);
	}
	
	public void get_ReportedDate() {
		
		datepick_ReportedDate.click();
		datepick_pickReportedDate.click();
		
	}
	
	public void click_Cancel() {
		
		btn_Cancel.click();
	}
	
	public void click_Submit() {
		
		btn_Submit.click();
	}
	

}
