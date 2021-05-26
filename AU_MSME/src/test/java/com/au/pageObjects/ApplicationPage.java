package com.au.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.au.testcases.BaseClass;

public class ApplicationPage {

	private static WebDriver ldriver;
	private static JavascriptExecutor js;

	public ApplicationPage(WebDriver rdriver) {
		ldriver = rdriver;
		js = (JavascriptExecutor) ldriver;
		PageFactory.initElements(rdriver, this);
	}

	// Application details

	@FindBy(linkText = "APPLICATION")
	@CacheLookup
	WebElement lbl_Application;

	@FindBy(linkText = "APPLICATION DETAILS")
	@CacheLookup
	WebElement tab_applciationTab;

	// IMD details

	@FindBy(id = "imd_details.clearance_status")
	@CacheLookup
	WebElement drpdwn_Clearance;
	@FindBy(id = "imd_details.reason_forBouncing")
	@CacheLookup
	WebElement drpdwn_BounceDetails;
	@FindBy(id = "imd_details.create_imd")
	@CacheLookup
	WebElement txt_Imd;
	@FindBy(id = "imd_details.credit_remarks")
	@CacheLookup
	WebElement imdRemarks;
	@FindBy(id="imd_details.others")
	@CacheLookup
	WebElement txt_OtherReason;
	@FindBy(id = "imd_details.payment_mode")
	@CacheLookup
	WebElement txt_ImdPaymentMode;
	@FindBy(xpath = "//*[@id=\"imd_details.imd_submit_btn\"]")
	@CacheLookup
	WebElement btn_ImdSave;
	@FindBy(xpath="//div[text()='IMD Details Updated Successfully']")
	@CacheLookup
	WebElement IMDsuccess;

	// Reference Details
	@FindBy(xpath = "//i[@onclick='openRef()']")
	@CacheLookup
	WebElement icon_OpenRef;
	@FindBy(id="reference_details.reference_btn")
	@CacheLookup
	WebElement btn_addReference;
	@FindBy(id = "reference_details_item.name")
	@CacheLookup
	WebElement txt_RefName;
	@FindBy(id = "reference_details_item.address")
	@CacheLookup
	WebElement txt_RefAddr;
	@FindBy(id = "reference_details_item.mob_num")
	@CacheLookup
	WebElement txt_RefMobile;
	@FindBy(className = "btn btn-secondary btn-block waves-effect waves-light btn-cancel")
	@CacheLookup
	WebElement btn_RefCancel;
	@FindBy(xpath = "//*[@id=\"reference_details_item_add_reference_details_dialog\"]/div/div/div[3]/div[1]/div[3]/button")
	@CacheLookup
	WebElement btn_RefSubmit;
	@FindBy(id = "reference_details.submit_btn")
	@CacheLookup
	WebElement btn_RefSave;

	// TVR Details
	@FindBy(xpath = "//i[@onclick='openTvr()']")
	@CacheLookup
	WebElement icon_OpenTvr;
	@FindBy(id = "tvr_details.add_col_btn")
	@CacheLookup
	WebElement btn_addTVR;
	@FindBy(id = "tvr_details_item.tvr_date")
	@CacheLookup
	WebElement dtpick_TVRdate;
	@FindBy(xpath = "//td[text()='5']")
	@CacheLookup
	WebElement date_Pick;
	@FindBy(id = "tvr_details_item.emp_name")
	@CacheLookup
	WebElement txt_EmpName;
	@FindBy(id = "tvr_details_item.employee_id")
	@CacheLookup
	WebElement txt_EmpId;
	@FindBy(id = "tvr_details_item.tvr_type")
	@CacheLookup
	WebElement drpdwn_TVRdonewith;
	@FindBy(id = "tvr_details_item.remark")
	@CacheLookup
	WebElement txt_TvrRemarks;
	@FindBy(className = "btn btn-secondary btn-block waves-effect waves-light btn-cancel")
	@CacheLookup
	WebElement btn_TVRcancel;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-block waves-effect waves-light btn-submit memberlist']")
	@CacheLookup
	WebElement btn_TVRsubmit;

	// RCU details

	@FindBy(xpath = "//h6[@class='primary_title rcuProfile']//i[1]")
	@CacheLookup
	WebElement icon_OpenRCU;

	@FindBy(id = "rcu_details.add_rcu_btn")
	@CacheLookup
	WebElement btn_addRCU;
	@FindBy(id = "rcu_details_item.vendor_name")
	@CacheLookup
	WebElement txt_Vendorname;
	@FindBy(id = "rcu_details_item.vendor_code")
	@CacheLookup
	WebElement txt_Vendorcode;
	@FindBy(id = "rcu_details_item.initiation_date")
	@CacheLookup
	WebElement dtpick_RCUinitDate;
	@FindBy(xpath = "//td[text()='4']")
	@CacheLookup
	WebElement date_pick1;
	@FindBy(id = "rcu_details_item.submission_date")
	@CacheLookup
	WebElement dtpick_RCUsubmDate;
	@FindBy(xpath = "//td[text()='5']")
	@CacheLookup
	WebElement date_pick2;
	@FindBy(id = "rcu_details_item.status")
	@CacheLookup
	WebElement drpdwn_RCUstatus;

	@FindBy(className = "//*[@class=\"btn btn-secondary btn-block waves-effect waves-light btn-cancel\"]")
	@CacheLookup
	WebElement btn_RCUcancel;
	@FindBy(xpath = "(//button[text()='Submit'])[2]")
	@CacheLookup
	WebElement btn_RCUsubmit;
	@FindBy(xpath = "//i[@class='glyphicon glyphicon-plus']/following-sibling::input[1]")
	@CacheLookup
	WebElement btn_uploadDocument;
	@FindBy(id = "rcu_details.submit_btn")
	@CacheLookup
	WebElement btn_RcuSave;

	// Application methods

	public void click_ApplicationLabel() throws InterruptedException {

		lbl_Application.click();
	}

	public Boolean verify_ApplicationisDisplayed() {
		Boolean status=false;
		try{
			status=tab_applciationTab.isDisplayed();
			//tab_applciationTab.click();
			
		}catch(Exception e) {
			
		}
		return status;
		
	}
	
	public void click_ApplicationTab() {
		
		tab_applciationTab.click();
	}

	// IMD methods

	public String get_IMD() {
		Select s=new Select(txt_Imd);
		String imd=s.getFirstSelectedOption().getText();
		return imd;

	}

	public String get_PaymentMode() {

		String mode = txt_ImdPaymentMode.getAttribute("value");
		return mode;
	}

	public String set_ClearanceStatus(String val) {
		Select s = new Select(drpdwn_Clearance);
		s.selectByVisibleText(val);
		String status = s.getFirstSelectedOption().getText();
		return status;
	}

	public void set_BouncedReason(String rsn) {
		Select reason = new Select(drpdwn_BounceDetails);
		reason.selectByVisibleText(rsn);

	}
	
	public void set_OtherReasonBounce(String other) {
		txt_OtherReason.clear();
		txt_OtherReason.sendKeys(other);
	}

	public void set_IMDremarks(String remarks) {
		imdRemarks.clear();
		imdRemarks.sendKeys(remarks);
	}

	public void click_ImdSave() {
		btn_ImdSave.click();
	}
	// Reference methods

	public void clickReference() {

		btn_addReference.click();
	}

	public void set_ReferenceName(String name) {

		txt_RefName.sendKeys(name);
	}

	public void set_ReferenceAddress(String addr) {

		txt_RefAddr.sendKeys(addr);
	}

	public void set_ReferenceMobile(String mob) {

		txt_RefMobile.sendKeys(mob);
	}

	public void click_referenceSubmit() {

		btn_RefSubmit.click();
	}

	public void clickReferenceSave() {

		btn_RefSave.click();
	}

	// TVR methods

	public void clickOpenTVR() {

		icon_OpenTvr.click();
	}

	public void clickAddTVR() {

		btn_addTVR.click();
	}

	public void pick_TVRdate() throws InterruptedException {

		dtpick_TVRdate.click();
		Thread.sleep(2000);
		date_Pick.click();
	}

	public void setEmpName(String ename) {

		txt_EmpName.sendKeys(ename);
	}

	public void setEmpID(int eid) {

		txt_EmpId.sendKeys(Integer.toString(eid));
	}

	public void setTVRdonewith() {

		Select tvrdonewith = new Select(drpdwn_TVRdonewith);
		tvrdonewith.selectByIndex(1);
	}

	public void setTVRremarks(String remarks) {

		txt_TvrRemarks.sendKeys(remarks);
	}

	public void click_TVRsubmit() {

		btn_TVRsubmit.click();
	}

	// RCU methods

	public void addRCU() {

		btn_addRCU.click();
	}

	public void setVendorName(String vName) {

		txt_Vendorname.sendKeys(vName);
	}

	public void setVendorCode(int vCode) {

		txt_Vendorcode.sendKeys(Integer.toString(vCode));
	}

	public void pickRCUinitDate() {

		dtpick_RCUinitDate.click();
		date_pick1.click();
	}

	public void pickRCUsubmitDate() {

		dtpick_RCUsubmDate.click();
		date_pick2.click();
	}

	public void selectRCUstatus(String status) {

		Select s = new Select(drpdwn_RCUstatus);
		s.selectByVisibleText(status);
	}

	public void clickRCUsubmit() {

		btn_RCUsubmit.click();
	}

	public void clickRCUuploadDoc() {

		btn_uploadDocument.sendKeys("D:\\Backup\\Desk_Folders\\Proof docs\\crop.jpg");
	}

	public void clickRCUsave() {

		btn_RcuSave.click();
	}
	
	public String get_IMDsuccessMsg() {
		String message=IMDsuccess.getText();
		return message;
	}

}