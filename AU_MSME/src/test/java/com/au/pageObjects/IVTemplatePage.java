package com.au.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class IVTemplatePage {
	
	WebDriver ldriver;
	
	public IVTemplatePage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[contains(@id,'iv_kgd_') and contains(@id,'.details.sep_total_annual_fees_receipt')]")
	@CacheLookup
	WebElement txt_totalAnnualFee;
	@FindBy(xpath="//input[contains(@id,'iv_kgd_') and contains(@id,'.details.sep_staff_salary')]")
	@CacheLookup
	WebElement txt_staffSalary;
	@FindBy(xpath="//input[contains(@id,'iv_kgd_') and contains(@id,'.details.sep_other_expenses')]")
	@CacheLookup
	WebElement txt_otherExpenses;
	@FindBy(xpath="//input[contains(@id,'iv_kgd') and contains(@id,'.details.sep_visiting_fee')]")
	@CacheLookup
	WebElement txt_regVisitFee;
	
	//Gross Margin Objects
	@FindBy(xpath="//*[contains(@id,'iv_kgd_') and contains(@id,'.details.gmp_total_turnoveras_per_doc_annual')]")
	@CacheLookup
	WebElement txt_TotalTurnOver_Annually;
	@FindBy(xpath="//*[contains(@id,'iv_kgd_') and contains(@id,'.details.gmp_industry_margin')]")
	@CacheLookup
	WebElement txt_IndusMargin;
	@FindBy(xpath="//*[contains(@id,'iv_kgd_') and contains(@id,'.add_member')]")
	@CacheLookup
	WebElement btn_addOtherIncome;
	@FindBy(id="add_other_income_annual.type_of_income")
	@CacheLookup
	WebElement txt_typeOfIncome;
	@FindBy(id="add_other_income_annual.amount_annual")
	@CacheLookup
	WebElement txt_amountAnnual;
	@FindBy(xpath="//button[contains(@class,'btn btn-primary btn-block waves-effect waves-light btn-submit memberlist')]")
	@CacheLookup
	WebElement btn_OtherIncomeSubmit; 
	@FindBy(xpath="//button[contains(@id,'iv_kgd_') and contains(@id,'.btn_home')]")
	@CacheLookup
	WebElement btn_IVtemplateSubmit;
	@FindBy(xpath="//div[text()='Submitted Successfully']")
	@CacheLookup
	WebElement verify_Msg;
	
	 public void get_AnnualFee(int value) {
		
		txt_totalAnnualFee.clear();
		txt_totalAnnualFee.sendKeys(Integer.toString(value));
	}
	
	public void get_staffSalary(int value) {
		
		txt_staffSalary.clear();
		txt_staffSalary.sendKeys(Integer.toString(value));
	}
	
	public void get_OtherExpenses(int value) {
		
		txt_otherExpenses.clear();
		txt_otherExpenses.sendKeys(Integer.toString(value));
	}
	
	public void get_VisitFee(int value) {
		
		txt_regVisitFee.clear();
		txt_regVisitFee.sendKeys(Integer.toString(value));
	} 
	
	//Profile Gross Margin
	
	public void set_TotalTurnOverAnnually(int value){
		
		txt_TotalTurnOver_Annually.clear();
		txt_TotalTurnOver_Annually.sendKeys(Integer.toString(value));
	}
	
	public void set_industryMargin(int value) {
		
		txt_IndusMargin.clear();
		txt_IndusMargin.sendKeys(Integer.toString(value));
		txt_IndusMargin.sendKeys(Keys.TAB);
	}
	
	public void click_otherIncome() {
		
		btn_addOtherIncome.click();
	}
	
	public void set_typeOfIncome(String value) {
		
		txt_typeOfIncome.clear();
		txt_typeOfIncome.sendKeys(value);
	}
	
	
	public void set_amountAnnual(int value){
		
		txt_amountAnnual.clear();
		txt_amountAnnual.sendKeys(Integer.toString(value));
	}
	
	public void click_otherIncomeSubmit() {
		
		btn_OtherIncomeSubmit.click();
	}
	
	
	public void click_IvTemplateSubmit() {
		
		btn_IVtemplateSubmit.click();
		}
	
	public Boolean verify_IVtemplateSubmit() {
		
		Boolean msg;
		
		String actual=verify_Msg.getText();
		String expected="Submitted Successfully";
		if(actual.equals(expected)) {
			msg=true;
		}else
		{
			msg=false;
		}
		
		return msg;
	}
}
