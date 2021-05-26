package com.au.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bsh.org.objectweb.asm.Type;

public class CustomerOnboarding_UpdateCustomerPage {

	public WebDriver ldriver;

	public CustomerOnboarding_UpdateCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Individual Basic details
	
	@FindBy(linkText = "APPLICATION")
	@CacheLookup
	WebElement link_tab_application;

	@FindBy(xpath = "//div[text()='CUSTOMER ON-BOARDING']")
	@CacheLookup
	WebElement tab_customerOnboarding;

//Basic details
	
	@FindBy(id = "customer.customer_basic_details.marital_status")
	@CacheLookup
	WebElement drpdwn_ApplMaritalStatus;
	@FindBy(xpath = "//select[contains(@id,'coapplicant_') and contains(@id,'customer_basic_details.marital_status')]")
	@CacheLookup
	WebElement drpdwn_CoApplMaritalStatus;
	@FindBy(xpath = "//select[contains(@id,'guarantor_') and contains(@id,'customer_basic_details.marital_status')]")
	@CacheLookup
	WebElement drpdwn_GuarantorMaritialStatus;

	@FindBy(id = "customer.customer_basic_details.father_name_details.first_name")
	@CacheLookup
	WebElement txt_ApplFatherName;
	@FindBy(xpath = "//input[contains(@id,'coapplicant_') and contains(@id,'customer_basic_details.father_name_details.first_name')]")
	@CacheLookup
	WebElement txt_CoApplFatherName;
	@FindBy(xpath = "//input[contains(@id,'guarantor_') and contains(@id,'customer_basic_details.father_name_details.first_name')]")
	@CacheLookup
	WebElement txt_GuarantorFatherName;

	@FindBy(id = "customer.customer_basic_details.mother_name_details.first_name")
	@CacheLookup
	WebElement txt_ApplMotherName;
	@FindBy(xpath = "//input[contains(@id,'coapplicant_') and contains(@id,'customer_basic_details.mother_name_details.first_name')]")
	@CacheLookup
	WebElement txt_CoApplMotherName;
	@FindBy(xpath = "//input[contains(@id,'guarantor_') and contains(@id,'customer_basic_details.mother_name_details.first_name')]")
	@CacheLookup
	WebElement txt_GuarantorMotherName;

	@FindBy(id = "customer.customer_basic_details.spouse_name_details.first_name")
	@CacheLookup
	WebElement txt_ApplSpouseName;
	@FindBy(xpath = "//input[contains(@id,'coapplicant_') and contains(@id,'customer_basic_details.spouse_name_details.first_name')]")
	@CacheLookup
	WebElement txt_CoApplSpouseName;
	@FindBy(xpath = "//input[contains(@id,'guarantor_') and contains(@id,'customer_basic_details.spouse_name_details.first_name')]")
	@CacheLookup
	WebElement txt_GuarantorSpouseName;

	@FindBy(id = "customer.customer_basic_details.educational_qualification")
	@CacheLookup
	WebElement drpdwn_ApplEducationQualification;
	@FindBy(xpath = "//select[contains(@id,'coapplicant_') and contains(@id,'customer_basic_details.educational_qualification')]")
	@CacheLookup
	WebElement drpdwn_CoApplEducationQualification;
	@FindBy(xpath = "//select[contains(@id,'guarantor_') and contains(@id,'customer_basic_details.educational_qualification')]")
	@CacheLookup
	WebElement drpdwn_GuarantorEducationQualification;

	@FindBy(id = "customer.customer_basic_details.no_of_dependants_adults")
	@CacheLookup
	WebElement drpdwn_ApplDependents;
	@FindBy(xpath = "//select[contains(@id,'coapplicant_') and contains(@id,'customer_basic_details.no_of_dependants_adults')]")
	@CacheLookup
	WebElement drpdwn_CoApplDependents;
	@FindBy(xpath = "//select[contains(@id,'guarantor_') and contains(@id,'customer_basic_details.no_of_dependants_adults')]")
	@CacheLookup
	WebElement drpdwn_GuarantorDependents;

	@FindBy(id = "customer.customer_basic_details.no_of_family_members")
	@CacheLookup
	WebElement drpdwn_ApplFamilyMem;
	@FindBy(xpath = "//select[contains(@id,'coapplicant_') and contains(@id,'customer_basic_details.no_of_family_members')]")
	@CacheLookup
	WebElement drpdwn_CoApplFamilyMem;
	@FindBy(xpath = "//select[contains(@id,'guarantor_') and contains(@id,'customer_basic_details.no_of_family_members')]")
	@CacheLookup
	WebElement drpdwn_GuarantorFamilyMem;

	@FindBy(id = "customer.customer_basic_details.caste")
	@CacheLookup
	WebElement drpdwn_ApplCaste;
	@FindBy(xpath = "//select[contains(@id,'coapplicant_') and contains(@id,'customer_basic_details.caste')]")
	@CacheLookup
	WebElement drpdwn_CoApplCaste;
	@FindBy(xpath = "//select[contains(@id,'guarantor_') and contains(@id,'customer_basic_details.caste')]")
	@CacheLookup
	WebElement drpdwn_GuarantorCaste;

	@FindBy(id = "customer.customer_basic_details.religion")
	@CacheLookup
	WebElement drpdwn_Applrelig;
	@FindBy(xpath = "//select[contains(@id,'coapplicant_') and contains(@id,'customer_basic_details.religion')]")
	@CacheLookup
	WebElement drpdwn_CoApplrelig;
	@FindBy(xpath = "//select[contains(@id,'guarantor') and contains(@id,'customer_basic_details.religion')]")
	@CacheLookup
	WebElement drpdwn_Guarantorrelig;

	@FindBy(id = "customer.customer_basic_details.key_person")
	@CacheLookup
	WebElement drpdwn_ApplKeyPerson;
	@FindBy(xpath = "//select[contains(@id,'coapplicant_') and contains(@id,'customer_basic_details.key_person')]")
	@CacheLookup
	WebElement drpdwn_CoApplKeyPerson;
	@FindBy(xpath = "//select[contains(@id,'guarantor_') and contains(@id,'customer_basic_details.key_person')]")
	@CacheLookup
	WebElement drpdwn_GuarantorKeyPerson;

	@FindBy(id = "customer.property_owner")
	@CacheLookup
	WebElement drpdwn_ApplPropOwner;
	@FindBy(xpath = "//select[contains(@id,'coapplicant_') and contains(@id,'property_owner')]")
	@CacheLookup
	WebElement drpdwn_CoApplPropOwner;
	@FindBy(xpath = "//select[contains(@id,'guarantor_') and contains(@id,'property_owner')]")
	@CacheLookup
	WebElement drpdwn_GuarantorPropOwner;

	@FindBy(xpath = "//select[contains(@id,'coapplicant_') and contains(@id,'customer_basic_details.relationship_with_applicant')]")
	@CacheLookup
	WebElement drpdwn_CoApplRelationship;
	@FindBy(xpath = "//select[contains(@id,'guarantor_') and contains(@id,'customer_basic_details.relationship_with_applicant')]")
	@CacheLookup
	WebElement drpdwn_GuarantorRelationship;

	@FindBy(xpath = "//div[@id='primary-container']/div[3]/div[1]/div[1]/ul[1]/li[1]/button[1]")
	@CacheLookup
	WebElement btn_ApplBasic_Save;
	@FindBy(xpath="//*[@id=\"residence-container\"]/div[3]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_ApplAddr_Save;
	@FindBy(xpath="//*[@id=\"identification-container\"]/div[2]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_ApplContact_Save;
	@FindBy(xpath="//*[@id=\"employment-container\"]/div[2]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_ApplEmployment_Save;
	
	@FindBy(xpath = "//*[@id=\"coapplicant-primary-container\"]/div[3]/div/div/ul/li/button")
	@CacheLookup
	WebElement btn_CoApplBasic_Save;	
	@FindBy(xpath="//*[@id=\"coapplicant-residence-container\"]/div[3]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_CoApplAddr_Save;
	@FindBy(xpath="//*[@id=\"coapplicant-identification-container\"]/div[2]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_CoApplContact_Save;
	@FindBy(xpath="//*[@id=\"coapplicant-employment-container\"]/div[3]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_CoApplEmployment_Save;
	
	@FindBy(xpath = "//*[@id=\"guarantor-primary-container\"]/div[3]/div/div/ul/li/button")
	@CacheLookup
	WebElement btn_GuarantorBasic_Save;	
	@FindBy(xpath="//*[@id=\"guarantor-residence-container\"]/div[3]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_GuarantorAddr_Save;
	@FindBy(xpath="//*[@id=\"guarantor-identification-container\"]/div[2]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_GuarantorContact_Save;
	@FindBy(xpath="//*[@id=\"guarantor-employment-container\"]/div[3]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_GuarantorEmployment_Save;
	
	
	//Address Details
	
	@FindBy(xpath="//*[@id=\"customer_current.designation\"]")
	@CacheLookup
	WebElement drpdwn_CurrResStatus;
	@FindBy(xpath="//select[contains(@id,'coapplicant_') and contains(@id,'current.designation')]")
	@CacheLookup
	WebElement drpdwn_CurrCoApplResStatus;
	@FindBy(xpath="//select[contains(@id,'guarantor_') and contains(@id,'current.designation')]")
	@CacheLookup
	WebElement drpdwn_CurrGuarantorResStatus;

	@FindBy(xpath="//*[@id=\"customer_current.residence_type\"]")
	@CacheLookup
	WebElement drpdwn_CurrResType;
	@FindBy(xpath="//select[contains(@id,'coapplicant_') and contains(@id,'current.residence_type')]")
	@CacheLookup
	WebElement drpdwn_CurrCoApplResType;
	@FindBy(xpath="//select[contains(@id,'guarantor_') and contains(@id,'current.residence_type')]")
	@CacheLookup
	WebElement drpdwn_CurrGuarantorResType;
	
	@FindBy(xpath="//*[@id=\"customer_current.years_in_current_residence\"]")
	@CacheLookup
	WebElement drpdwn_CurrStabRes;
	@FindBy(xpath="//select[contains(@id,'coapplicant_') and contains(@id,'current.years_in_current_residence\')]")
	@CacheLookup
	WebElement drpdwn_CurrCoApplStabRes;
	@FindBy(xpath="//select[contains(@id,'guarantor_') and contains(@id,'current.years_in_current_residence\')]")
	@CacheLookup
	WebElement drpdwn_CurrGuarantorStabRes;
	
	@FindBy(xpath="//*[@id=\"customer_permanent.designation\"]")
	@CacheLookup
	WebElement drpdwn_PermResStatus;
	@FindBy(xpath="//select[contains(@id,'coapplicant_') and contains(@id,'permanent.designation')]")
	@CacheLookup
	WebElement drpdwn_PermCoApplResStatus;
	@FindBy(xpath="//select[contains(@id,'guarantor_') and contains(@id,'permanent.designation')]")
	@CacheLookup
	WebElement drpdwn_PermGuarantorResStatus;
	
	@FindBy(xpath="//*[@id=\"customer_permanent.residence_type\"]")
	@CacheLookup
	WebElement drpdwn_PermResType;
	@FindBy(xpath="//select[contains(@id,'coapplicant_') and contains(@id,'permanent.residence_type')]")
	@CacheLookup
	WebElement drpdwn_PermCoApplResType;
	@FindBy(xpath="//select[contains(@id,'guarantor') and contains(@id,'permanent.residence_type')]")
	@CacheLookup
	WebElement drpdwn_PermGuarantorResType;

	
	@FindBy(xpath="//*[@id=\"customer_permanent.years_in_current_residence\"]")
	@CacheLookup
	WebElement drpdwn_PermStabRes;
	@FindBy(xpath="//select[contains(@id,'coapplicant_') and contains(@id,'permanent.years_in_current_residence\']")
	@CacheLookup
	WebElement drpdwn_PermCoApplStabRes;
	@FindBy(xpath="//select[contains(@id,'guarantor') and contains(@id,'permanent.years_in_current_residence\']")
	@CacheLookup
	WebElement drpdwn_PermGuarantorStabRes;
	
	//Contact details
	
	@FindBy(xpath="//*[@id=\"customer_basic_details.email_id\"]")
	@CacheLookup
	WebElement txt_Applemail;
	@FindBy(xpath="//input[contains(@id,'coapplicant_') and contains(@id,'basic_details.email_id\')]")
	@CacheLookup
	WebElement txt_CoApplemail;
	@FindBy(xpath="//input[contains(@id,'guarantor') and contains(@id,'basic_details.email_id\')]")
	@CacheLookup
	WebElement txt_Guarantoremail;
	
	//Employment details
	
	@FindBy(xpath="//*[@id=\"customer.employment_details.method_of_assessment\"]")
	@CacheLookup
	WebElement drpdwn_ApplEmployMethAss;
	@FindBy(xpath="//select[contains(@id,'coapplicant_') and contains(@id,'employment_details.method_of_assessment')]")
	@CacheLookup
	WebElement drpdwn_CoApplEmployMethAss;
	@FindBy(xpath="//select[contains(@id,'guarantor_') and contains(@id,'employment_details.method_of_assessment')]")
	@CacheLookup
	WebElement drpdwn_GuarantorEmployMethAss;
	
	@FindBy(xpath="//*[@id=\"customer.employment_details.name_of_firm\"]")
	@CacheLookup
	WebElement txt_ApplBusinessName;
	@FindBy(xpath="//input[contains(@id,'coapplicant') and contains(@id,'employment_details.name_of_firm\')]")
	@CacheLookup
	WebElement txt_CoApplBusinessName;
	@FindBy(xpath="//input[contains(@id,'guarantor') and contains(@id,'employment_details.name_of_firm\')]")
	@CacheLookup
	WebElement txt_GuarantorBusinessName;
	
	@FindBy(xpath="//*[@id=\"customer.employment_details.total_experience_years\"]")
	@CacheLookup
	WebElement txt_ApplBusiness_Year;
	@FindBy(xpath="//input[contains(@id,'coapplicant_') and contains(@id,'employment_details.total_experience_years\')]")
	@CacheLookup
	WebElement txt_CoApplBusiness_Year;
	@FindBy(xpath="//input[contains(@id,'guarantor_') and contains(@id,'employment_details.total_experience_years\')]")
	@CacheLookup
	WebElement txt_GuarantorBusiness_Year;
	
	//ComplainceDetails
	@FindBy(id="compliance_details.cre_exposure")
	@CacheLookup
	WebElement drpdwn_CREexposure;
	@FindBy(id="compliance_details.aggregate_exposure")
	@CacheLookup
	WebElement drpdwn_AggrigateExposure;
	@FindBy(id="compliance_details.is_dcco_applicable")
	@CacheLookup
	WebElement drpdwn_DCCOApplicability;
	@FindBy(id="compliance_details.banking_relationships")
	@CacheLookup
	WebElement drpdwn_BankingRelationships;
	@FindBy(id="compliance_details.is_seasonal_business")
	@CacheLookup
	WebElement drpdwn_Seasonality;
	@FindBy(id="compliance_details.new_to_credit")
	@CacheLookup
	WebElement drpdwn_NewtoCredit;
	@FindBy(id="compliance_details.capital_market_exposure")
	@CacheLookup
	WebElement drpdwn_CaptialMarketExposure;
	@FindBy(id="compliance_details.lei_no")
	@CacheLookup
	WebElement drpdwn_LEInumber;
	@FindBy(xpath="//*[@onClick=\"goToTab('applicant-compliance-details-container-self','applicant-compliance-details-container');\"]")
	@CacheLookup
	WebElement btn_ApplOtherinfsave;
	@FindBy(xpath="//*[@onClick=\"goToTab('coapplicant-compliance-details-container-self','coapplicant-compliance-details-container');\"]")
	@CacheLookup
	WebElement btn_CoApplOtherinfsave;
	@FindBy(id="compliance_details.credit_rating")
	@CacheLookup
	WebElement drpdwn_CreditRating;
	
	//Non-individual
	@FindBy(xpath="//*[@id=\"company.method_of_assessment\"]")
	@CacheLookup
	WebElement drpdwn_ApplMethodAssess;
	@FindBy(xpath="//select[contains(@id,'coapplicant_company_') and contains(@id,'method_of_assessment')]")
	@CacheLookup
	WebElement drpdwn_CoApplMethodAssess;
	@FindBy(xpath="//select[contains(@id,'guarantor_company_') and contains(@id,'method_of_assessment')]")
	@CacheLookup
	WebElement drpdwn_GuarantorMethodAssess;
	
	@FindBy(id="company.company_type")
	@CacheLookup
	WebElement drpdwn_ApplConstitutionType;
	@FindBy(xpath="//*[contains(@id,'coapplicant_company_') and contains(@id,'.company_type')]")
	@CacheLookup
	WebElement drpdwn_CoApplConstitutionType;
	@FindBy(xpath="//*[contains(@id,'guarantor_company_') and contains(@id,'.company_type')]")
	@CacheLookup
	WebElement drpdwn_GuarantorConstitutionType;

	
	@FindBy(xpath="//*[@id=\"company_current.years_in_current_residence\"]")
	@CacheLookup
	WebElement drpdwn_nonind_ApplstabCurrRes;
	@FindBy(xpath="//select[contains(@id,'coapplicant_company_') and contains(@id,'current.years_in_current_residence\')]")
	@CacheLookup
	WebElement drpdwn_nonind_CoApplstabCurrRes;
	@FindBy(xpath="//select[contains(@id,'guarantor_company_') and contains(@id,'current.years_in_current_residence\')]")
	@CacheLookup
	WebElement drpdwn_nonind_GuarantorstabCurrRes;
	
	@FindBy(xpath="//*[@id=\"company_work.property_in_name_of\"]")
	@CacheLookup
	WebElement txt_nonind_ApplNameOffice;
	@FindBy(xpath="//input[contains(@id,'coapplicant_company_') and contains(@id,'work.property_in_name_of')]")
	@CacheLookup
	WebElement txt_nonind_CoApplNameOffice;
	@FindBy(xpath="//input[contains(@id,'guarantor_company_') and contains(@id,'work.property_in_name_of')]")
	@CacheLookup
	WebElement txt_nonind_GuarantorNameOffice;
	
	@FindBy(xpath="//*[@id=\"company_work.years_in_current_residence\"]")
	@CacheLookup
	WebElement drpdwn_nonind_ApplOfficestabCurrRes;
	@FindBy(xpath="//select[contains(@id,'coapplicant_company_') and contains(@id,'work.years_in_current_residence')]")
	@CacheLookup
	WebElement drpdwn_nonind_CoApplOfficestabCurrRes;
	@FindBy(xpath="//select[contains(@id,'guarantor_company_') and contains(@id,'work.years_in_current_residence')]")
	@CacheLookup
	WebElement drpdwn_nonind_GuarantorOfficestabCurrRes;
	
	@FindBy(xpath="//*[@onclick=\"addMemberDetails('director_dialog','director','directors','director_director_dialog')\"]")
	@CacheLookup
	WebElement btn_nonind_addMemberDetails;
	@FindBy(xpath="//*[@onclick=\"addMemberDetails('shareholder_dialog','shareholder','shareholders','shareholder_shareholder_dialog')\"]")
	@CacheLookup
	WebElement btn_nonind_addShareHolderDetails;
	
	@FindBy(xpath="//*[@id=\"primary-container\"]/div[3]/div/div/ul/li/button")
	@CacheLookup
	WebElement btn_ApplEntitySave;
	@FindBy(xpath="//*[@id=\"coapplicant-primary-container\"]/div[3]/div/div/ul/li/button")
	@CacheLookup
	WebElement btn_CoApplEntitySave;
	@FindBy(xpath="//*[@id=\"guarantor-primary-container\"]/div[3]/div/div/ul/li/button")
	@CacheLookup
	WebElement btn_GuarantorEntitySave;
	
	@FindBy(id="company_current.line1")
	@CacheLookup	
	WebElement txt_companyAddrLine1;
	
	@FindBy(xpath="//*[@id=\"residence-container\"]/div[3]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_ApplAddrSave;
	@FindBy(xpath="//*[@id=\"coapplicant-residence-container\"]/div[3]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_CoApplAddrSave;
	@FindBy(xpath="//*[@id=\"guarantor-residence-container\"]/div[3]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_GuarantorAddrSave;
		
	@FindBy(xpath="//*[@id=\"applicant-members-details-container\"]/div[2]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_applicantMemSave;
	@FindBy(xpath="//*[@id=\"members-details-container\"]/div[2]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_CoApplMemSave;
	@FindBy(xpath="//*[@id=\"guarantor-members-details-container\"]/div[2]/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement btn_GuarantorMemSave;
	@FindBy(xpath="//div[text()='Customer Details Saved Successfully']")
	@CacheLookup
	WebElement altmsg_MemberSave;
	
	//Member Details
	//Partnership
	
	@FindBy(id="member_details.add_loan_btn")
	@CacheLookup
	WebElement btn_MemberDetailsAdd;
	@FindBy(id="partnership.name")
	@CacheLookup
	WebElement txt_partnerName;
	@FindBy(id="partnership.profit_sharing")
	@CacheLookup
	WebElement txt_ProfitSharingRation;
	@FindBy(id="partnership.contribution")
	@CacheLookup
	WebElement txt_partnershipContribution;
	@FindBy(xpath="//button[contains(@class,\"btn btn-primary btn-block waves-effect waves-light btn-submit memberlist\")]")
	@CacheLookup
	WebElement btn_MemberSubmit;
	@FindBy(xpath="//button[contains(@class,\"btn btn-secondary btn-block waves-effect waves-light btn-cancel\")]")
	@CacheLookup
	WebElement btn_MemberCancel;
	
	//Public Limited and Private Limited
	@FindBy(id="director.name")
	@CacheLookup
	WebElement txt_DirectorName;
	@FindBy(id="director.din_number")
	@CacheLookup
	WebElement txt_DINnumber;
	@FindBy(id="director.dsc_required")
	@CacheLookup
	WebElement txt_DSCregistered;
	@FindBy(id="director.dsc_expiry")
	@CacheLookup
	WebElement dtpick_DSCexpiry;
	@FindBy(xpath="(//td[text()='14'])[2]")
	@CacheLookup
	WebElement pick_date;
	
	
	//Society, Club and Trust
	
	@FindBy(id="trustee.name")
	@CacheLookup
	WebElement txt_trusteeName;
	@FindBy(id="trustee.designation")
	@CacheLookup
	WebElement txt_trusteeDesig;
	
	//HUF
	
	@FindBy(id="karta.name")
	@CacheLookup
	WebElement txt_KartaName;
	@FindBy(id="karta.age")
	@CacheLookup
	WebElement txt_age;
	@FindBy(id="karta.relationship_with_karta")
	@CacheLookup
	WebElement txt_relationWithKarta;
	
	
	
	
	public void click_ApplicationTab() {
		link_tab_application.click();
	}

	public void click_CustomerOnboarding() {
		tab_customerOnboarding.click();
	}
	
	//customer Basic details

	public String selectMaritialStatus(String type, String marital) {
		String Marital = null;
		if (type.equalsIgnoreCase("Applicant")) {
			Select value = new Select(drpdwn_ApplMaritalStatus);
			value.selectByVisibleText(marital);
			Marital = value.getFirstSelectedOption().getText();
		} else if (type.equalsIgnoreCase("Co Applicant")) {
			Select value = new Select(drpdwn_CoApplMaritalStatus);
			value.selectByVisibleText(marital);
			Marital = value.getFirstSelectedOption().getText();
		} else {
			Select value = new Select(drpdwn_GuarantorMaritialStatus);
			value.selectByVisibleText(marital);
			Marital = value.getFirstSelectedOption().getText();
		}

		return Marital;
	}

	public void get_FatherName(String type, String Fname) {
		if (type.equalsIgnoreCase("Applicant")) {
			txt_ApplFatherName.clear();
			txt_ApplFatherName.sendKeys(Fname);
		} else if (type.equalsIgnoreCase("Co Applicant")) {
			txt_CoApplFatherName.clear();
			txt_CoApplFatherName.sendKeys(Fname);
		} else {
			txt_GuarantorFatherName.clear();
			txt_GuarantorFatherName.sendKeys(Fname);
		}

	}

	public void get_MotherName(String type, String Mname) {

		if (type.equalsIgnoreCase("Applicant")) {
			txt_ApplMotherName.clear();
			txt_ApplMotherName.sendKeys(Mname);
		} else if (type.equalsIgnoreCase("Co Applicant")) {
			txt_CoApplMotherName.clear();
			txt_CoApplMotherName.sendKeys(Mname);
		} else {
			txt_GuarantorMotherName.clear();
			txt_GuarantorMotherName.sendKeys(Mname);
		}
	}

	public void get_SpouseName(String type, String Sname) {

		if (type.equalsIgnoreCase("Applicant")) {
			txt_ApplSpouseName.clear();
			txt_ApplSpouseName.sendKeys(Sname);
		} else if (type.equalsIgnoreCase("Co Applicant")) {
			txt_CoApplSpouseName.clear();
			txt_CoApplSpouseName.sendKeys(Sname);
		} else {
			txt_GuarantorSpouseName.clear();
			txt_GuarantorSpouseName.sendKeys(Sname);
		}
	}

	public void select_EducationQualification(String type, String Eduqual) {
		if (type.equalsIgnoreCase("Applicant")) {
			Select value = new Select(drpdwn_ApplEducationQualification);
			value.selectByVisibleText(Eduqual);
		} else if (type.equalsIgnoreCase("Co Applicant")) {
			Select value = new Select(drpdwn_CoApplEducationQualification);
			value.selectByVisibleText(Eduqual);
		} else {
			Select value = new Select(drpdwn_GuarantorEducationQualification);
			value.selectByVisibleText(Eduqual);
		}
	}

	public void select_No_of_Dependents(String type, String dependents){
		if(type.equalsIgnoreCase("Applicant")){
			Select value=new Select(drpdwn_ApplDependents);
			value.selectByVisibleText(dependents);
		} else if (type.equalsIgnoreCase("Co Applicant")) {
			Select value=new Select(drpdwn_CoApplDependents);
			value.selectByVisibleText(dependents);
		}else{
			Select value=new Select(drpdwn_GuarantorDependents);
			value.selectByVisibleText(dependents);
		}
	}

	public void select_No_of_FamilyMembers(String type, String famMem) {
		if (type.equalsIgnoreCase("Applicant")) {
			Select value = new Select(drpdwn_ApplFamilyMem);
			value.selectByVisibleText(famMem);
		} else if (type.equalsIgnoreCase("Co Applicant")) {
			Select value = new Select(drpdwn_CoApplFamilyMem);
			value.selectByVisibleText(famMem);
		} else {
			Select value = new Select(drpdwn_GuarantorFamilyMem);
			value.selectByVisibleText(famMem);
		}
	}

	public void select_Caste(String type, String caste) {
			if (type.equalsIgnoreCase("Applicant")) {
				Select value = new Select(drpdwn_ApplCaste);
				value.selectByVisibleText(caste);
			} else if (type.equalsIgnoreCase("Co Applicant")) {
				Select value = new Select(drpdwn_CoApplCaste);
				value.selectByVisibleText(caste);
			} else {
				Select value = new Select(drpdwn_GuarantorCaste);
				value.selectByVisibleText(caste);
			}
	}
	public void select_Religion(String type, String relig) {
		if (type.equalsIgnoreCase("Applicant")) {
			Select value = new Select(drpdwn_Applrelig);
			value.selectByVisibleText(relig);
		} else if (type.equalsIgnoreCase("Co Applicant")) {
			Select value = new Select(drpdwn_CoApplrelig);
			value.selectByVisibleText(relig);
		} else {
			Select value = new Select(drpdwn_Guarantorrelig);
			value.selectByVisibleText(relig);
		}
		
	}

	public void select_KeyPerson(String type, String keyper) {
		if (type.equalsIgnoreCase("Applicant")) {
			Select value = new Select(drpdwn_ApplKeyPerson);
			value.selectByVisibleText(keyper);
		} else if (type.equalsIgnoreCase("Co Applicant")) {
			Select value = new Select(drpdwn_CoApplKeyPerson);
			value.selectByVisibleText(keyper);
		} else {
			Select value = new Select(drpdwn_GuarantorKeyPerson);
			value.selectByVisibleText(keyper);
		}
		
	}

	public void select_PropertyOwner(String type, String propown) {
		if (type.equalsIgnoreCase("Applicant")) {
			Select value = new Select(drpdwn_ApplPropOwner);
			value.selectByVisibleText(propown);
		} else if (type.equalsIgnoreCase("Co Applicant")) {
			Select value = new Select(drpdwn_CoApplPropOwner);
			value.selectByVisibleText(propown);
		} else {
			Select value = new Select(drpdwn_GuarantorPropOwner);
			value.selectByVisibleText(propown);
		}
	}
	public void select_Relationship(String type, String relation) {
		 if (type.equalsIgnoreCase("Co Applicant")) {
			Select value = new Select(drpdwn_CoApplRelationship);
			value.selectByVisibleText(relation);
		} else {
			Select value = new Select(drpdwn_GuarantorRelationship);
			value.selectByVisibleText(relation);
		}

	}
	
	//Address Details
	
	public void select_PermResidenceStatus(String type, String resStatus) {
		if(type.equalsIgnoreCase("Applicant")) {
		Select value=new Select(drpdwn_PermResStatus);
		value.selectByVisibleText(resStatus);
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			Select value=new Select(drpdwn_PermCoApplResStatus);
			value.selectByVisibleText(resStatus);
		}else {
			Select value=new Select(drpdwn_PermGuarantorResStatus);
			value.selectByVisibleText(resStatus);

		}
	}
	
	public void select_PermResidenceType(String type, String resType) {
		if(type.equalsIgnoreCase("Applicant")) {
		Select value=new Select(drpdwn_PermResType);
		value.selectByVisibleText(resType);
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			Select value=new Select(drpdwn_PermCoApplResType);
			value.selectByVisibleText(resType);
		}else {
			Select value=new Select(drpdwn_PermGuarantorResType);
			value.selectByVisibleText(resType);

		}
	}
	
	public void select_PermStabilityAddress(String type, String stabCurr) {
		if(type.equalsIgnoreCase("Applicant")) {
		Select value=new Select(drpdwn_PermStabRes);
		value.selectByVisibleText(stabCurr);
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			Select value=new Select(drpdwn_PermStabRes);
			value.selectByVisibleText(stabCurr);
		}else {
			Select value=new Select(drpdwn_PermStabRes);
			value.selectByVisibleText(stabCurr);

		}
	}
	
	
	public void select_CurrResidenceStatus(String type, String resStatus) {
		if(type.equalsIgnoreCase("Applicant")) {
		Select value=new Select(drpdwn_CurrResStatus);
		value.selectByVisibleText(resStatus);
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			Select value=new Select(drpdwn_CurrCoApplResStatus);
			value.selectByVisibleText(resStatus);
		}else {
			Select value=new Select(drpdwn_CurrGuarantorResStatus);
			value.selectByVisibleText(resStatus);

		}
	}
	
	public void select_CurrResidenceType(String type, String resType) {
		if(type.equalsIgnoreCase("Applicant")) {
		Select value=new Select(drpdwn_CurrResType);
		value.selectByVisibleText(resType);
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			Select value=new Select(drpdwn_CurrCoApplResType);
			value.selectByVisibleText(resType);
		}else {
			Select value=new Select(drpdwn_CurrGuarantorResType);
			value.selectByVisibleText(resType);

		}
	}
	
	public void select_CurrStabilityAddress(String type, String stabCurr) {
		if(type.equalsIgnoreCase("Applicant")) {
		Select value=new Select(drpdwn_CurrStabRes);
		value.selectByVisibleText(stabCurr);
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			Select value=new Select(drpdwn_CurrCoApplStabRes);
			value.selectByVisibleText(stabCurr);
		}else {
			Select value=new Select(drpdwn_CurrGuarantorStabRes);
			value.selectByVisibleText(stabCurr);

		}
	}
	
	
	
	public void click_BasicDetailsSave(String type) {
		if(type.equalsIgnoreCase("Applicant")) {
			btn_ApplBasic_Save.click();
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			btn_CoApplBasic_Save.click();
		}else {
			btn_GuarantorBasic_Save.click();
		}
			
	}
	
	
	
	public void click_AddressSave(String type) {
		if(type.equalsIgnoreCase("Applicant")) {
			btn_ApplAddr_Save.click();
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			btn_CoApplAddr_Save.click();
		}else {
			btn_GuarantorAddr_Save.click();
		}
			
	}
	
	public void click_ContactSave(String type) {
		if(type.equalsIgnoreCase("Applicant")) {
			btn_ApplContact_Save.click();
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			btn_CoApplContact_Save.click();
		}else {
			btn_GuarantorContact_Save.click();
		}
			
	}
	
	public void click_EmploymentSave(String type) {
		if(type.equalsIgnoreCase("Applicant")) {
			btn_ApplEmployment_Save.click();
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			btn_CoApplEmployment_Save.click();
		}else {
			btn_GuarantorEmployment_Save.click();
		}
			
	}
	
	public void get_Email(String type, String emailData) {
		if(type.equalsIgnoreCase("Applicant")) {
			txt_Applemail.clear();
			txt_Applemail.sendKeys(emailData);
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			txt_CoApplemail.clear();
			txt_CoApplemail.sendKeys(emailData);
		}else {
			txt_Guarantoremail.clear();
			txt_Guarantoremail.sendKeys(emailData);
		}
	}
	
	public void get_BusinessName(String type, String BName) {
		if(type.equalsIgnoreCase("Applicant")) {
			txt_ApplBusinessName.clear();
			txt_ApplBusinessName.sendKeys(BName);
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			txt_CoApplBusinessName.clear();
			txt_CoApplBusinessName.sendKeys(BName);
		}else {
			txt_GuarantorBusinessName.clear();
			txt_GuarantorBusinessName.sendKeys(BName);
		}
	}
	
	public void get_BusinessYears(String type, String BYears) {
		if(type.equalsIgnoreCase("Applicant")) {
			txt_ApplBusiness_Year.clear();
			txt_ApplBusiness_Year.sendKeys(BYears);
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			txt_CoApplBusiness_Year.clear();
			txt_CoApplBusiness_Year.sendKeys(BYears);
		}else {
			txt_GuarantorBusiness_Year.clear();
			txt_GuarantorBusiness_Year.sendKeys(BYears);
		}
	}
	
	public String select_ConstitutionType(String type, String Constitution) {
	String const_value;
		if(type.equalsIgnoreCase("Applicant")) {
		Select value=new Select(drpdwn_ApplConstitutionType);
		value.selectByVisibleText(Constitution);
		const_value=value.getFirstSelectedOption().getText();
		
	}else if(type.equalsIgnoreCase("Co Applicant")) {
		Select value=new Select(drpdwn_CoApplConstitutionType);
		value.selectByVisibleText(Constitution);
		const_value=value.getFirstSelectedOption().getText();
	}else {
		Select value=new Select(drpdwn_GuarantorConstitutionType);
		value.selectByVisibleText(Constitution);
		const_value=value.getFirstSelectedOption().getText();
	}
	
	return const_value;
	}
	
	//Non-individual Basic details
	
	public void select_MethodAssessment(String type, String MAssesment) {
		if(type.equalsIgnoreCase("Applicant")) {
			Select value=new Select(drpdwn_ApplMethodAssess);
			value.selectByVisibleText(MAssesment);
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			Select value=new Select(drpdwn_CoApplMethodAssess);
			value.selectByVisibleText(MAssesment);
		}else {
			Select value=new Select(drpdwn_GuarantorMethodAssess);
			value.selectByVisibleText(MAssesment);
		}
	}
	
	public void click_EntitySave(String type) {
		if(type.equalsIgnoreCase("Applicant")) {
			btn_ApplEntitySave.click();
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			btn_CoApplEntitySave.click();
		}else {
			btn_GuarantorEntitySave.click();
		}
	}
	
	public Boolean get_EntitysaveStatus() {
		
		Boolean status=false;
		try {
			status= txt_companyAddrLine1.isDisplayed();
		}catch(Exception e) {
			
		}
		return status;
	}
	
	
	
	public void click_AddrSave(String type) {
		if(type.equalsIgnoreCase("Applicant")) {
			btn_ApplAddrSave.click();
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			btn_CoApplAddrSave.click();
		}else {
			btn_GuarantorAddrSave.click();
		}
	}
	
	//Member details
	
	public void click_AddMember() {
		
		btn_MemberDetailsAdd.click();
	}
	
	public void get_Name(String Pname) {
		
		txt_partnerName.clear();
		txt_partnerName.sendKeys(Pname);
	}
	
	public void get_ProfitShareRation(String value) {
		
		txt_ProfitSharingRation.clear();
		txt_ProfitSharingRation.sendKeys(value);
	}
	
	public void get_CaptialContribution(String value) {
		
		txt_partnershipContribution.clear();
		txt_partnershipContribution.sendKeys(value);
	}
	
	public void click_MemberSubmit() {
		
		btn_MemberSubmit.click();
	}
	
	public void click_MemberCancel() {
	
		btn_MemberCancel.click();
	}
	
	//public and private limited
	
	public void get_DirectorName(String value) {
		
		txt_DirectorName.clear();
		txt_DirectorName.sendKeys(value);;
	}
	
	public void get_DINnumber(String value) {
		
		txt_DINnumber.clear();
		txt_DINnumber.sendKeys(value);;
	}
	
	public void get_DSCregistered(String value) {
		
		txt_DSCregistered.clear();
		txt_DSCregistered.sendKeys(value);
	}
	
	public void pick_DSCexpiry() throws InterruptedException {
		
		dtpick_DSCexpiry.click();
		Thread.sleep(300);
		pick_date.click();
		
	}
	
	//Society and trust, club
	
	public void get_TrusteeName(String value) {
		
		txt_trusteeName.clear();
		txt_trusteeName.sendKeys(value);
	}
	
	public void get_designation(String value) {
		
		txt_trusteeDesig.clear();
		txt_trusteeDesig.sendKeys(value);
	}
	
	//HUF
	
	public void get_kartaName(String value) {
		
		txt_KartaName.clear();
		txt_KartaName.sendKeys(value);
	}
	
	public void get_Age(int value) {
	
		txt_age.clear();
		txt_age.sendKeys(Integer.toString(value));
	}
	
	public void get_RelationshipwithKarta(String value) {
		
		txt_relationWithKarta.clear();
		txt_relationWithKarta.sendKeys(value);
	}
	
	
	
	public void click_MemberSave(String type) {
		if(type.equalsIgnoreCase("Applicant")) {
			btn_applicantMemSave.click();
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			btn_CoApplMemSave.click();	
		}else {
			btn_GuarantorMemSave.click();
		}
	}
	
	public String verify_MemberSaveSuccessMsg() {
		String msg=altmsg_MemberSave.getText();
		return msg;
	}
	
	public void select_nonind_stabCurrRes(String type, String stabres) {
		if(type.equalsIgnoreCase("Applicant")) {
			Select value=new Select(drpdwn_nonind_ApplstabCurrRes);
			value.selectByVisibleText(stabres);
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			Select value=new Select(drpdwn_nonind_CoApplstabCurrRes);
			value.selectByVisibleText(stabres);
		}else {
			Select value=new Select(drpdwn_nonind_GuarantorstabCurrRes);
			value.selectByVisibleText(stabres);
		}
	}
	
	public void get_nonind_OfficeName(String type, String NOffice) {
		if(type.equalsIgnoreCase("Applicant")) {
			txt_nonind_ApplNameOffice.clear();
			txt_nonind_ApplNameOffice.sendKeys(NOffice);
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			txt_nonind_CoApplNameOffice.clear();
			txt_nonind_CoApplNameOffice.sendKeys(NOffice);
		}else {
			txt_nonind_GuarantorNameOffice.clear();
			txt_nonind_GuarantorNameOffice.sendKeys(NOffice);
		}
			
	}
	
	public void select_nonind_OfficeStability(String type, String resstab) {
		if(type.equalsIgnoreCase("Applicant")) {
			Select value=new Select(drpdwn_nonind_ApplOfficestabCurrRes);
			value.selectByVisibleText(resstab);
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			Select value=new Select(drpdwn_nonind_CoApplOfficestabCurrRes);
			value.selectByVisibleText(resstab);
		}else {
			Select value=new Select(drpdwn_nonind_GuarantorOfficestabCurrRes);
			value.selectByVisibleText(resstab);
		}
	}
	
	public void select_EmploymentMethAssessment(String type, String MAssess) {
		if(type.equalsIgnoreCase("Applicant")) {
			Select value=new Select(drpdwn_ApplEmployMethAss);
			value.selectByVisibleText(MAssess);
		}else if(type.equalsIgnoreCase("Co Applicant")) {
			Select value=new Select(drpdwn_CoApplEmployMethAss);
			value.selectByVisibleText(MAssess);
		}else {
			Select value=new Select(drpdwn_GuarantorEmployMethAss);
			value.selectByVisibleText(MAssess);
		}
	}

	public void select_CREexposure(String value) {
		Select s=new Select(drpdwn_CREexposure);
		s.selectByVisibleText(value);
		
	}
	
	public void select_AggregateExposure(String value) {
		
		Select s=new Select(drpdwn_AggrigateExposure);
		s.selectByVisibleText(value);
	}
	
	public void select_DCCO(String value) {
		Select s=new Select(drpdwn_DCCOApplicability);
		s.selectByVisibleText(value);
	}
	
	public void select_BankingRelationship(String value) {
		Select s=new Select(drpdwn_BankingRelationships);
		s.selectByVisibleText(value);
	}
	
	public void select_SeasonalityBusiness(String value) {
		Select s=new Select(drpdwn_Seasonality);
		s.selectByVisibleText(value);
		
	}
	
	public void select_NewtoCredit(String value) {
		Select s=new Select(drpdwn_NewtoCredit);
		s.selectByVisibleText(value);
	}
	
	public void select_CapitalMarketExposure(String value) {
		Select s=new Select(drpdwn_CaptialMarketExposure);
		s.selectByVisibleText(value);
	}
	
	public void set_LEIno(String value) {
		drpdwn_LEInumber.clear();
		drpdwn_LEInumber.sendKeys(value);
	}
	
	public void click_OtherinfoSave(String type){
		if(type.equalsIgnoreCase("Applicant")) {
			btn_ApplOtherinfsave.click();
		}else {
			btn_CoApplOtherinfsave.click();
		}
	}
	

	
	public void select_CreditRating(String value) {
		Select s=new Select(drpdwn_CreditRating);
		s.selectByVisibleText(value);
	}
	
	
	

}
