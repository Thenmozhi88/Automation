package com.au.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//WebElements
	
	@FindBy(id="username")
	@CacheLookup
	WebElement txtUser;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@id=\"client_id\"]")
	@CacheLookup
	WebElement drpdwnProduct;
	
	@FindBy(id="loginbutton")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[14]/a")
	@CacheLookup
	WebElement iconUser;
	
	@FindBy(css="div#navbarSupportedContent>ul>li:nth-of-type(14)>ul>li:nth-of-type(7)>a")
	@CacheLookup
	WebElement lnkLogout;
	
	@FindBy(id="details-button")
	@CacheLookup
	WebElement btnAdvanced;
	
	@FindBy(id="proceed-link")
	@CacheLookup
	WebElement lnkProceed;
	
	
	
	
	
	
	//My Task and My application
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div/div/div[2]/div/div[2]/button[5]")
	@CacheLookup
	WebElement clk_Role;
	
	@FindBy(xpath="//*[@id=\"loanApplicationsTable_paginate\"]/span/a[2]")
	@CacheLookup
	WebElement clk_pagination;
	
	@FindBy(xpath="//*[@id=\"loanApplicationsTable_filter\"]/label/input")
	@CacheLookup
	WebElement txt_Search;
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div/div/div[2]/div/div[2]/a")
	@CacheLookup
	WebElement clk_Task;
	
	
	
	//Action methods
	
	public void clickTask() {
		clk_Task.click();
	}
	
	public void clickRole() {
		clk_Role.click();
	}
	
	public void clickPagination() {
		
		clk_pagination.click();
	}
	
	public void clickSearch(int applID) throws InterruptedException {
		txt_Search.sendKeys(Integer.toString(applID));
				
	}
	public void setUsername(String uname)
	{
		txtUser.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void selectProduct(String prod) {
		drpdwnProduct.sendKeys(prod);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickUserIcon() {
		iconUser.click();
	}
	
	public void clickLogout() throws InterruptedException
	{
		lnkLogout.click();
	}
	
	public void clickApplication(int applNo) throws InterruptedException {
		for(int i=1; i<=10;i++) {
			
			WebElement Application_id = ldriver.findElement(By.xpath("//*[@id=\"loanApplicationsTable\"]/tbody/tr["+i+"]/td[1]/a"));
			String app_id = Application_id.getText();
			
			if (app_id.equals(Integer.toString(applNo))){
				System.out.println(app_id);
			System.out.println(applNo);
			//Thread.sleep(10000);
			Application_id.click();
			break;
			}
			
			  
	} 
	}
	public void clickAdvanced() 
	{
			btnAdvanced.click();
		}
	
	public void clickProceed() {
		lnkProceed.click();
	}
		
}

