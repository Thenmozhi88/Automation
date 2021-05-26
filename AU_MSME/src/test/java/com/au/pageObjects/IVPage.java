package com.au.pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import freemarker.log.Logger;

public class IVPage {

	WebDriver ldriver;

	public IVPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	//Financial Analysis
	
	@FindBy(xpath = "//a[text()='FINANCIAL ANALYSIS']")
	@CacheLookup
	WebElement lbl_FinancialAnalysis;
	@FindBy(xpath = "//div[text()='IV']")
	@CacheLookup
	WebElement tab_IV;
	
	//IV Profile
	
	@FindBy(id = "pd_iv.member_list")
	@CacheLookup
	WebElement drpdwn_MemDetails;
	@FindBy(xpath = "//i[@onclick='chooseOpen()']")
	@CacheLookup
	WebElement lnk_OpenIVProfile;

	@FindBy(xpath = "//select[contains(@id,'pd_applicant_details_') and contains(@id,'.employment_type_individual')]")
	@CacheLookup
	WebElement drpdwn_ind_typeofEmpl;
	@FindBy(xpath = "//select[contains(@id,'pd_applicant_details_') and contains(@id,'.employment_type_non_individual')]")
	@CacheLookup
	WebElement drpdwn_nonind_typeofEmpl;
	@FindBy(xpath = "//select[contains(@id,'pd_applicant_details_') and contains(@id,'.industry')]")
	@CacheLookup
	WebElement drpdwn_IVindustry;
	@FindBy(xpath = "//select[contains(@id,'pd_applicant_details_') and contains(@id,'.industry_sub_type')]")
	@CacheLookup
	WebElement drpdwn_IVindsubtype;
	@FindBy(xpath = "//select[contains(@id,'pd_applicant_details_') and contains(@id,'.occupation')]")
	@CacheLookup
	WebElement drpdwn_occupation;
	@FindBy(xpath = "//select[contains(@id,'pd_applicant_details_') and contains(@id,'.income_considered')]")
	@CacheLookup
	WebElement drpdwn_ConsiderIncomeEligibility;
	@FindBy(xpath = "//select[contains(@id,'pd_applicant_details_') and contains(@id,'.method_of_assessment')]")
	@CacheLookup
	WebElement drpdwn_methodofAss;
	@FindBy(xpath="//*[contains(@id,'pd_applicant_details_') and contains(@id,'.documented_program')]")
	@CacheLookup
	WebElement drpdwn_program;
	@FindBy(xpath = "//select[contains(@id,'pd_applicant_details_') and contains(@id,'.financial_records_audited')]")
	@CacheLookup
	WebElement drpdwn_auditedFinancial;
	@FindBy(xpath = "//select[contains(@id,'pd_applicant_details_') and contains(@id,'.credit_risk')]")
	@CacheLookup
	WebElement drpdwn_creditRisk;
	@FindBy(xpath="//select[contains(@id,'pd_applicant_details_') and contains(@id,'.high_turnover')]")
	@CacheLookup
	WebElement drpdwn_isTurnOver;
	@FindBy(xpath = "//button[contains(@id,'pd_applicant_details_') and contains(@id,'.save_btn')]")
	@CacheLookup
	WebElement btn_IVsubmit;

	@FindBy(xpath = "//button[text()='Edit']")
	@CacheLookup
	WebElement btn_IVedit;
	@FindBy(xpath="//button[text()='YES']")
	@CacheLookup
	WebElement alert_YesNo;

	@FindBy(xpath = "//div[text()='Submitted Successfully']")
	@CacheLookup
	WebElement alt_IVsuccessmsg;
	
	
	public void click_FinancialLabel() {

		lbl_FinancialAnalysis.click();

	}

	public void click_PDCAF_tab() {

		tab_IV.click();

	}

	public void select_Member() {

		Select opt = new Select(drpdwn_MemDetails);

		opt.selectByIndex(1);

	}

	public void select_TypeofEmployment() {
		Select s=new Select(drpdwn_ind_typeofEmpl);
		List <WebElement> elementCount = s.getOptions();
	        int itemSize = elementCount.size();
	        if(itemSize>1) {
	        	s.selectByIndex(1);
	        }else {
	        	s.selectByIndex(1);
	        }
	        
	}
		
		
		
		
	

	public void select_Industry(String industry) {

		Select ind = new Select(drpdwn_IVindustry);
		ind.selectByVisibleText(industry);

	}

	public void select_SubIndustry(String subIndustry) {
		Select subInd = new Select(drpdwn_IVindsubtype);
		subInd.selectByVisibleText(subIndustry);

	}

	public void select_Occupation(String occupation) {

		Select occ = new Select(drpdwn_occupation);
		occ.selectByVisibleText(occupation);
	}

	public void select_ConsiderIncomeEligibility() {

		Select consIncElig = new Select(drpdwn_ConsiderIncomeEligibility);
		consIncElig.selectByIndex(1);
	}

	public void select_MethodofAssessment(String value) {

		Select methodAss = new Select(drpdwn_methodofAss);
		methodAss.selectByVisibleText(value);
	}
	
	public void select_Program(String value) {
		Select prog=new Select(drpdwn_program);
		prog.selectByVisibleText(value);
		
	}

	public void select_AuditedFinancial() {

		Select audFin = new Select(drpdwn_auditedFinancial);
		audFin.selectByIndex(1);
	}

	public void select_CreditRisk() {

		Select creRisk = new Select(drpdwn_creditRisk);
		creRisk.selectByIndex(1);
	}
	
	public void select_isTurnOver() {
		Select isTurnover=new Select(drpdwn_isTurnOver);
		isTurnover.selectByIndex(1);
	}
	public void click_IVsubmit() {

		btn_IVsubmit.click();
	}

	public Boolean verify_EditDisplayed() {

		Boolean EditButton = null;
		try {
			EditButton = btn_IVedit.isEnabled();

		} catch (Exception e) {

			EditButton = false;
		}
		return EditButton;

	}
	
	public WebElement get_EditButton() {
		
		return btn_IVedit;
	}
	
	public void click_EditButton() {
	
		btn_IVedit.click();
		
	}
	
	public void click_EditYesNo() {
		ldriver.switchTo().activeElement();
		System.out.println("Active element");
		alert_YesNo.click();
	}
	
	
	/*boolean isApplicantAvailble = false;
	String mem_details = drpdwn_MemDetails.getText();
	System.out.println(mem_details);
	String[] mem = mem_details.split("-");
	if(mem != null && mem.length > 0) {
		for(String m : mem) {
			if(m.equalsIgnoreCase("applicant")) {
				isApplicantAvailble = true;	
				break;
			}
		}
		
	}
	
	if(isApplicantAvailble) {
		Select typeEmpl = new Select(drpdwn_ind_typeofEmpl);
		typeEmpl.selectByIndex(2);
	}else {
			Select typeEmpl = new Select(drpdwn_nonind_typeofEmpl);
		typeEmpl.selectByIndex(1);
	} */
}
