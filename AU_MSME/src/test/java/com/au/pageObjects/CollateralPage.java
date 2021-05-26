package com.au.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CollateralPage {
	public WebDriver ldriver;

	public CollateralPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[text()='COLLATERAL']")
	//@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")
	@CacheLookup
	WebElement lbl_Collateral;
	// Update Collateral
	@FindBy(id = "update_collateral_details.submit_btn")
	@CacheLookup
	WebElement btn_updateSubmit;

	// Add Collateral
	@FindBy(id = "collateral_details.add_col_btn")
	@CacheLookup
	WebElement btn_addCollaterl;
	@FindBy(id = "collateral_details.existing_collateral")
	@CacheLookup
	WebElement drpdwn_IsExistingCollateral;
	@FindBy(id = "collateral_details.collateral_type")
	@CacheLookup
	WebElement drpdwn_CollateralType;
	@FindBy(id = "collateral_details.collateral_name")
	@CacheLookup
	WebElement drpdwn_CollateralName;
	@FindBy(id = "collateral_details.primary_or_secondary")
	@CacheLookup
	WebElement drpdwn_CollateralDetail;
	@FindBy(id = "collateral_details.relationship_with_loan")
	@CacheLookup
	// Property details
	WebElement drpdwn_RelationshipwithLoan;
	@FindBy(id = "collateral_details.property_category")
	@CacheLookup
	WebElement drpdwn_PropCategory;
	@FindBy(id = "collateral_details.property_type")
	@CacheLookup
	WebElement drpdwn_PropType;
	@FindBy(id = "collateral_details.occupancy_status")
	@CacheLookup
	WebElement drpdwn_OccupStatus;
	@FindBy(id = "collateral_details.property_title")
	@CacheLookup
	WebElement drpdwn_PropTitle;
	@FindBy(id = "collateral_details.total")
	@CacheLookup
	WebElement txt_EstimatePropvalue;

	// Property Address
	@FindBy(id = "collateral_details.property_address.line1")
	@CacheLookup
	WebElement txt_HouseNo;
	@FindBy(id = "collateral_details.property_address.line2")
	@CacheLookup
	WebElement txt_KhasraNo;
	@FindBy(id = "collateral_details.property_address.line3")
	@CacheLookup
	WebElement txt_Locality;
	@FindBy(id = "collateral_details.property_address.state")
	@CacheLookup
	WebElement drpdwn_PropState;
	@FindBy(id = "collateral_details.property_address.city")
	@CacheLookup
	WebElement txt_PropCity;
	@FindBy(xpath = "//div[@class='tt-dataset tt-dataset-cityNames']//div[1]")
	@CacheLookup
	WebElement autosuggestion_City;
	@FindBy(xpath = "(//div[@class='tt-suggestion tt-selectable']/following-sibling::div)[2]")
	@CacheLookup
	WebElement autosuggestion_Pincode;
	@FindBy(id = "collateral_details.property_address.pincode")
	@CacheLookup
	WebElement txt_PropPincode;
	@FindBy(id = "collateral_details.property_address.landmark")
	@CacheLookup
	WebElement txt_PropLandmark;
	@FindBy(id = "collateral_details.property_address.district")
	@CacheLookup
	WebElement txt_PropDistrict;
	@FindBy(id = "collateral_details.property_address.taluka")
	@CacheLookup
	WebElement txt_PropTaluka;
	@FindBy(id = "collateral_details.property_address.village")
	@CacheLookup
	WebElement txt_PropVillage;
	@FindBy(id = "collateral_details.submit_btn")
	@CacheLookup
	WebElement btn_addCollateralSubmit;
	@FindBy(id = "update_collateral_details.single_valuation_considered")
	@CacheLookup
	WebElement drpdwn_ValConsider;
	
	//Valuation
	@FindBy(xpath="//*[@id=\"view_valuation_report.view_valuation_report_list_summary_table\"]/tbody/tr/td[2]/a")
	@CacheLookup
	WebElement valReport;
	
	

	public void click_CollateralLabel() {
		lbl_Collateral.click();
	}

	// Add Collateral Methods

	public void click_AddCollateral() {
		btn_addCollaterl.click();
	}

	public void select_IsExistingCollateral(String option) {
		Select s = new Select(drpdwn_IsExistingCollateral);
		s.selectByVisibleText(option);
	}

	public void select_CollateralType(String option) {
		Select s = new Select(drpdwn_CollateralType);
		s.selectByVisibleText(option);
	}

	public void select_CollateralName(String option) {
		Select s = new Select(drpdwn_CollateralName);
		s.selectByVisibleText(option);
	}

	public void select_collateralDetail(String option) {
		Select s = new Select(drpdwn_CollateralDetail);
		s.selectByVisibleText(option);
	}

	// Property Details Method
	public void select_RelatioshipwithLoan() {
		Select s = new Select(drpdwn_RelationshipwithLoan);
		s.selectByIndex(1);
	}

	public void select_PropertyCategory(String option) {
		Select s = new Select(drpdwn_PropCategory);
		s.selectByVisibleText(option);
	}

	public void select_PropertyType(String option) {
		Select s = new Select(drpdwn_PropType);
		s.selectByVisibleText(option);
	}

	public void select_OccupancyStatus(String option) {
		Select s = new Select(drpdwn_OccupStatus);
		s.selectByVisibleText(option);
	}

	public void select_PropertyTitle(String option) {
		Select s = new Select(drpdwn_PropTitle);
		s.selectByVisibleText(option);
	}

	public void set_EstimatedPropValue(int value) {
		txt_EstimatePropvalue.clear();
		txt_EstimatePropvalue.sendKeys(Integer.toString(value));
	}

	// Property Address Methods
	public void set_HouseNo(String value) {
		txt_HouseNo.clear();
		txt_HouseNo.sendKeys(value);
	}

	public void set_KhasraNo(String value) {
		txt_KhasraNo.clear();
		txt_KhasraNo.sendKeys(value);
	}

	public void set_Locality(String value) {
		txt_Locality.clear();
		txt_Locality.sendKeys(value);
	}

	public void select_State(String option) {
		Select s = new Select(drpdwn_PropState);
		s.selectByVisibleText(option);
	}

	public void set_City(String value) throws InterruptedException {
		txt_PropCity.clear();
		txt_PropCity.sendKeys(value);

	}

	public void set_Pincode(String value) throws InterruptedException {
		txt_PropPincode.clear();
		txt_PropPincode.click();
		Thread.sleep(2000);
		txt_PropPincode.sendKeys(value);
	}

	public void set_Landmark(String value) {
		txt_PropLandmark.clear();
		txt_PropLandmark.sendKeys(value);
	}

	public void set_District(String value) {
		txt_PropDistrict.clear();
		txt_PropDistrict.sendKeys(value);
	}

	public void set_Taluka(String value) {
		txt_PropTaluka.clear();
		txt_PropTaluka.sendKeys(value);
	}

	public void set_Village(String value) {
		txt_PropVillage.clear();
		txt_PropVillage.sendKeys(value);
	}

	public void click_addCollateralsubmit() {
		btn_addCollateralSubmit.click();
	}

	public void click_CollUpdateSubmit() {
		btn_updateSubmit.click();
	}

	// Update Collateral Methods
	public void select_valuationConsidered(String val_Considered) {
		drpdwn_ValConsider.sendKeys(val_Considered);
	}

	public void click_CollateralSubmit() {
		btn_updateSubmit.click();
	}

	public void pick_autoSuggesstion_City() {

		autosuggestion_City.click();
	}

	public void pick_autoSuggesstion_Pincode() {

		autosuggestion_Pincode.click();
	}
	
	

}
