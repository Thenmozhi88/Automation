package com.au.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoanDetailsPage {
	
	WebDriver ldriver;
	
	public LoanDetailsPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	//Loan details
	
	@FindBy(xpath = "//a[text()='LOAN DETAILS']")
	@CacheLookup
	WebElement lbl_LoanDetails;
	@FindBy(xpath = "//div[text()='LOAN DETAILS']")
	@CacheLookup
	WebElement tab_LoanDetails;
	@FindBy(id="loan_details.add_loan_btn")
	@CacheLookup
	WebElement btn_addLoan;
	@FindBy(id="add_loan_details.product")
	@CacheLookup
	WebElement drpdwn_Product;
	@FindBy(id="add_loan_details.scheme")
	@CacheLookup
	WebElement drpdwn_Scheme;
	@FindBy(id="add_loan_details.applied_loan_amount")
	@CacheLookup
	WebElement txt_LoanAmt;
	@FindBy(id="add_loan_details.agreed_loan_amount")
	@CacheLookup
	WebElement txt_AgreedLoanAmt;
	@FindBy(id="add_loan_details.tenure")
	@CacheLookup
	WebElement txt_Tenure;
	@FindBy(id="add_loan_details.applied_roi")
	@CacheLookup
	WebElement txt_ROI;
	@FindBy(id="add_loan_details.rate_type")
	@CacheLookup
	WebElement drpdwn_rateType;
	@FindBy
	@CacheLookup
	WebElement btn_Help;
	@FindBy(id="add_loan_details.schedule_type")
	@CacheLookup
	WebElement drpdwn_scheduleType;
	@FindBy(id="add_loan_details.cycle_date")
	@CacheLookup
	WebElement drpdwn_cycleDate;
	@FindBy(id="add_loan_details.repayment_start_date")
	@CacheLookup
	WebElement drpdwn_repaymentStartDate;
	@FindBy(id="add_loan_details.repayment_mode")
	@CacheLookup
	WebElement drpdwn_repaymentMode;
	@FindBy(id="add_loan_details.disbursement_type")
	@CacheLookup
	WebElement drpdwn_disbursementCategory;
	@FindBy(id="add_loan_details.government_scheme_tag")
	@CacheLookup
	WebElement drpdwn_govSchemeTag;
	@FindBy(id="add_loan_details.emi_btn")
	@CacheLookup
	WebElement btn_CalcEMI;
	@FindBy(id="add_loan_details.submit_btn")
	@CacheLookup
	WebElement btn_LoanSaveProceed;
	@FindBy(id="add_loan_details.disbursement_btn")
	@CacheLookup
	WebElement btn_scheduleEMI;
	@FindBy(id="add_loan_details.update_btn")
	@CacheLookup
	WebElement btn_LoanUpdateProceed;
	
	//Charges
	@FindBy(id="charges_details.charge.index0")
	@CacheLookup
	WebElement txt_ChargeAmt;
	@FindBy(id="charges_details.btn_home")
	@CacheLookup
	WebElement btn_ChargesSubmit;
	
	
	public void click_LoanDetailsLabel() {
		lbl_LoanDetails.click();
	}
	
	public void click_LoanDetailsTab() {
		tab_LoanDetails.click();
	}
	
	public void click_addLoan() {
		btn_addLoan.click();
	}
	
	public void select_Product(String value) {
		String product=null;
		Select s=new Select(drpdwn_Product);
		s.selectByVisibleText(value);
		product=s.getFirstSelectedOption().getText();
	}
	
	public String select_Scheme() {
		String scheme;
		Select s=new Select(drpdwn_Scheme);
		s.selectByVisibleText("Salaried LAP");
		scheme=s.getFirstSelectedOption().getText();
		return scheme;
	}
	
	public void set_AppliedLoanAmt(String value) {
		txt_LoanAmt.clear();
		txt_LoanAmt.sendKeys(value);
	}
	
	public String set_AgreedLoanAmt(String value) {
		String AgreedLoanAmt;
		txt_AgreedLoanAmt.clear();
		txt_AgreedLoanAmt.sendKeys(value);
		AgreedLoanAmt=txt_AgreedLoanAmt.getAttribute(value);
		return AgreedLoanAmt;
	}
	
	public void set_AppliedTenure(String value) {
		txt_Tenure.clear();
		txt_Tenure.sendKeys(value);
	}
	
	public void set_AppliedROI(String value) {
		txt_ROI.clear();
		txt_ROI.sendKeys(value);
		txt_ROI.sendKeys(Keys.TAB);
	}
	
	public void click_Helpbutton() {
		btn_Help.sendKeys(Keys.TAB);
	}
	public void select_TypeofRate(String value) {
		Select s=new Select(drpdwn_rateType);
		s.selectByVisibleText(value);
		drpdwn_rateType.sendKeys(Keys.TAB);
	}
	
	public void select_ScheduleType(String value) {
		Select s=new Select(drpdwn_scheduleType);
		s.selectByVisibleText(value);
		drpdwn_scheduleType.sendKeys(Keys.TAB);
	}
	
	public void select_PreferredCycleDate(String value) {
		Select s=new Select(drpdwn_cycleDate);
		s.selectByVisibleText(value);
		drpdwn_cycleDate.sendKeys(Keys.TAB);
	}
	
	public void select_RepaymentStartDate(String value) {
		Select s=new Select(drpdwn_repaymentStartDate);
		s.selectByVisibleText("05 Nov 2021");
		drpdwn_repaymentStartDate.sendKeys(Keys.TAB);
	}
	
	public void select_RepaymentMode(String value) {
		Select s=new Select(drpdwn_repaymentMode);
		s.selectByVisibleText(value);
		drpdwn_repaymentMode.sendKeys(Keys.TAB);
	}
	
	public void select_DisbursementCategory(String value) {
		Select s=new Select(drpdwn_disbursementCategory);
		s.selectByVisibleText(value);
		drpdwn_disbursementCategory.sendKeys(Keys.TAB);
	}
	
	public void select_GovernmentSchemeTag(String value) {
		Select s=new Select(drpdwn_govSchemeTag);
		s.selectByVisibleText(value);
		drpdwn_govSchemeTag.sendKeys(Keys.TAB);
	}
	
	public void click_CalculateEMI() {
		btn_CalcEMI.click();
	}
	
	public void click_LoanSaveProceed() {
		btn_LoanSaveProceed.click();
	}
	
	public void click_EMISchedule() {
		btn_scheduleEMI.click();
	}
	
	public void click_LoanUpdateProceed() {
		btn_LoanUpdateProceed.click();
	}
	
	//Charges Method
	
	public String set_ChargesAmt() {
		//int charge=Integer.parseInt(txt_ChargeAmt.getText());
		String cha=txt_ChargeAmt.getAttribute("value");
		//System.out.println("cha"+cha);
		int charge=Integer.parseInt(cha);
		charge=charge-500;
		txt_ChargeAmt.clear();
		txt_ChargeAmt.sendKeys(Integer.toString(charge));
		return cha;
	}
	
	public void click_ChargesSubmit() {
		btn_ChargesSubmit.click();
	}
}
