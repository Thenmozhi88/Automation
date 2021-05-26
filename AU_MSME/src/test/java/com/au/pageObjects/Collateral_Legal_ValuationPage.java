package com.au.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.au.testcases.BaseClass;

public class Collateral_Legal_ValuationPage  {

	WebDriver ldriver;

	public Collateral_Legal_ValuationPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "legal_home_table.vendor_type")
	@CacheLookup
	WebElement drpdwn_AllocateVendorType;
	@FindBy(id = "legal_home_table.vendor_hub")
	@CacheLookup
	WebElement drpdwn_AllocateHub;
	@FindBy(id = "legal_home_table.vendor_name")
	@CacheLookup
	WebElement drpdwn_AllocateVendorName;
	@FindBy(id = "legal_reassign_table.vendor_type")
	@CacheLookup
	WebElement drpdwn_ReassignVendorType;
	@FindBy(id = "legal_reassign_table.vendor_hub")
	@CacheLookup
	WebElement drpdwn_ReassignHub;
	@FindBy(id = "legal_reassign_table.vendor_name")
	@CacheLookup
	WebElement drpdwn_ReassignVendorName;
	@FindBy(id = "legal_waive_table.remarks")
	@CacheLookup
	WebElement txt_WaiveRemarks;
	@FindBy(xpath = "(//button[text()='Submit'])[2]")
	@CacheLookup
	WebElement btn_Submit;
	@FindBy(xpath = "//button[contains(@class,'btn btn-secondary')]")
	@CacheLookup
	WebElement btn_Cancel;
	//@FindBy(xpath = "//div[@id='view_valuation_report_view_valuation_report_list']/div[1]/div[1]/div[1]/button[1]")
	//@CacheLookup
	//WebElement btn_ReportsClose;

	public void select_AllocatevendorType(String value) {

		Select type = new Select(drpdwn_AllocateVendorType);
		type.selectByVisibleText(value);

	}

	public void select_AllocateHub(int value) {

		Select type = new Select(drpdwn_AllocateHub);
		type.selectByIndex(value);
	}

	public void select_AllocatevendorName(int value) {

		Select type = new Select(drpdwn_AllocateVendorName);
		type.selectByIndex(value);
	}

	public void select_ReassignVendorType(String value) {

		Select type = new Select(drpdwn_ReassignVendorType);
		type.selectByVisibleText(value);

	}

	public void select_ReassignHub(int value) {

		Select type = new Select(drpdwn_ReassignHub);
		type.selectByIndex(value);
	}

	public void select_ReassignVendorName(int value) {

		Select type = new Select(drpdwn_ReassignVendorName);
		type.selectByIndex(value);
	}

	public void set_WaiveRemarks(String Value) {

		txt_WaiveRemarks.clear();
		txt_WaiveRemarks.sendKeys(Value);
	}

	public void click_AllocationSubmit() {

		btn_Submit.click();
	}

	public void click_AllocationCancel() {

		btn_Cancel.click();
	}

	public void click_ReportClose() {
		
		
		retryingFindClick(By.xpath("//div[@id='view_valuation_report_view_valuation_report_list']/div[1]/div[1]/div[1]/button[1]"));
	}
	
	public boolean retryingFindClick(By by) {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	            ldriver.findElement(by).click();
	            result = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts++;
	    }
	    return result;
	}

	public boolean get_valuationViewReport() {
		boolean status = false;
		BaseClass b=new BaseClass();
		try {
			int count;
//			String xpath="//*[@id=\"valuation_home.valuation_home_table\"]/tbody/tr/td[8]";
			for(int i=1; i<b.getTableRowCount(b.valuationTablePath);i++)
			status=ldriver.findElement(By.xpath(b.valStartPath+i+b.valEndPath)).isDisplayed();
		}catch(Exception e) {
			System.out.println(e);
		}
		return status;

	}
}