package com.au.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BSR_PSLpage {
	
	WebDriver ldriver;
	public BSR_PSLpage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText = "BSR-PSL")
	@CacheLookup
	WebElement lbl_BsrPsl;
	
	@FindBy(id="bsr_psl.group_name")
	@CacheLookup
	WebElement drpdwn_Group;
	@FindBy(id="bsr_psl.sub_group_name")
	@CacheLookup
	WebElement drpdwn_subGroupName;
	@FindBy(id="bsr_psl.occupation_name")
	@CacheLookup
	WebElement drpdwn_Occupation;
	@FindBy(id="bsr_psl.organisation_type")
	@CacheLookup
	WebElement drpdwn_OrganizationType;
	@FindBy(id="bsr_psl.organisation_name")
	@CacheLookup
	WebElement drpdwn_Organisation;
	@FindBy(id="bsr_psl.industry_name")
	@CacheLookup
	WebElement drpdwn_BorrowerIndustry;
	@FindBy(id="bsr_psl.borrower_category_name")
	@CacheLookup
	WebElement drpdwn_BorrowerCategory;
	@FindBy(id="bsr_psl.industry_borrower_category")
	@CacheLookup
	WebElement txt_Others;
	@FindBy(id="bsr_psl.psl_classification_type")
	@CacheLookup
	WebElement drpdwn_PSLclassificationType;
	@FindBy(id="bsr_psl.category")
	@CacheLookup
	WebElement drpdwn_Category;
	@FindBy(id="bsr_psl.psl_industry")
	@CacheLookup
	WebElement drpdwn_PSLIndustry;
	@FindBy(id="bsr_psl.document_collected")
	@CacheLookup
	WebElement drpdwn_DocCollected;
	@FindBy(id="bsr_psl.psl_code")
	@CacheLookup
	WebElement drpdwn_PSLcode;
	@FindBy(id="bsr_psl.udhyam_certificate")
	@CacheLookup
	WebElement txt_CertificateNo;
	@FindBy(id="bsr_psl.btn_home")
	@CacheLookup
	WebElement btn_PslSubmit;
	
	public void select_Group(String value) {
		Select s=new Select(drpdwn_Group);
		s.selectByVisibleText(value);
	}

	public void select_SubGroup(String value) {
		Select s=new Select(drpdwn_subGroupName);
		s.selectByVisibleText(value);
	}
	
	public void select_Occupation(String value) {
		Select s=new Select(drpdwn_Occupation);
		s.selectByVisibleText(value);
	}
	
	public void select_OrganisationType(String value) {
		Select s=new Select(drpdwn_OrganizationType);
		s.selectByVisibleText(value);
	}
	
	public void select_Organisation(String value) {
		Select s=new Select(drpdwn_Organisation);
		s.selectByVisibleText(value);
	}
	
	public void select_Industry(String value) {
		Select s=new Select(drpdwn_BorrowerIndustry);
		s.selectByVisibleText(value);
	}
	
	public void select_BorrowerCategory(String value) {
		Select s=new Select(drpdwn_BorrowerCategory);
		s.selectByVisibleText(value);
	}
	
	public void set_Others(String value) {
		txt_Others.sendKeys(value);
	}
	
	public void select_PSLclassificationType(String value) {
		Select s=new Select(drpdwn_PSLclassificationType);
		s.selectByVisibleText(value);
	}
	
	public void select_PSLCategory(String value) {
		Select s=new Select(drpdwn_Category);
		s.selectByVisibleText(value);
	}
	
	public void select_PSLIndustry(String value) {
		Select s=new Select(drpdwn_PSLIndustry);
		s.selectByVisibleText(value);
	}
	
	public void select_PSLDocumentCollected(String value) {
		Select s=new Select(drpdwn_DocCollected);
		s.selectByVisibleText(value);
	}
	
	public void select_PSLcode(String value) {
		Select s=new Select(drpdwn_PSLcode);
		s.selectByVisibleText(value);
	}
	
	public void click_BSRPSL_label() {
	
		lbl_BsrPsl.click();
	}
	
	public void set_UdayamCertificateNo(String value) {
		txt_CertificateNo.sendKeys(value);
	}
	
	public void click_PSLsubmit() {
		btn_PslSubmit.click();
	}

	

}
