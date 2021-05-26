package com.au.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
public WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//WebElements
	
	@FindBy(xpath="(//div[@class='tile_text']//i)[3]")
	@CacheLookup
	WebElement onboardingCustomer_tab;
	
	@FindBy(xpath="(//button[contains(@class,'btn btn-primary')])[3]")
	@CacheLookup
	WebElement btn_AddMemberInd;
	
	//Existing customer search
	
	@FindBy(id="create_customer.identity_proof")
	@CacheLookup
	WebElement drpdwn_IdentityProof;

	@FindBy(id="create_customer.identity_proof_number")
	@CacheLookup
	WebElement txt_IdentityProof;
	
	@FindBy(id="create_customer.add_id_btn")
	@CacheLookup
	WebElement btn_AddMoreIdentity;
	
	@FindBy(id="create_customer.address_proof")
	@CacheLookup
	WebElement drpdwn_AddressProof;
	
	@FindBy(id="create_customer.address_proof_number")
	@CacheLookup
	WebElement txt_AddressProof;
	
	@FindBy(id="create_customer.add_address_btn")
	@CacheLookup
	WebElement btn_AddMoreAddress;
	
	@FindBy(id="create_customer.cif_number")
	@CacheLookup
	WebElement txt_CifNumber;
	
	@FindBy(id="create_customer.mobile_number")
	@CacheLookup
	WebElement txt_MobNumber;
	
	@FindBy(id="create_customer.email_id")
	@CacheLookup
	WebElement txt_Email;
	
	@FindBy(xpath="//*[contains(text(),'back to Member Management')]")
	@CacheLookup
	WebElement btn_GoBack;
	
	@FindBy(xpath="//*[@id='getbureauindividual_btn']")
	@CacheLookup
	WebElement btn_SearchExistCustomer;
	
	@FindBy(xpath="//*[@id=\"create_customer_individual_btn\"]")
	@CacheLookup
	WebElement btn_CreateCustomer;
	
	//CustomerBasicDetails
	
	@FindBy(xpath="//*[@id=\"create_customer_details.customer_basic_details.title\"]")
	@CacheLookup
	WebElement drpdwn_Title;
	
	@FindBy(id="create_customer_details.customer_basic_details.name_details.first_name")
	@CacheLookup
	WebElement txt_FirstName;
	
	@FindBy(id="create_customer_details.customer_basic_details.name_details.middle_name")
	@CacheLookup
	WebElement txt_MiddleName;
	
	@FindBy(id="create_customer_details.customer_basic_details.name_details.last_name")
	@CacheLookup
	WebElement txt_LastName;
	
	@FindBy(id="create_customer_details.customer_basic_details.date_of_birth")
	@CacheLookup
	WebElement dtpick_DOB;
	
	
	
	
	
	
	
	
	
	
}
