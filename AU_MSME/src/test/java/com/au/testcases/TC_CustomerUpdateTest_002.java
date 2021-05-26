package com.au.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.au.pageObjects.CustomerOnboarding_UpdateCustomerPage;
import com.au.pageObjects.LoginPage;

public class TC_CustomerUpdateTest_002 extends BaseClass{

	@Test (groups="sanity")
	public void customer_BasicDetails() throws InterruptedException, IOException {
		TC_LoginTest_001 lt=new TC_LoginTest_001();
		lt.loginTest();
		CustomerOnboarding_UpdateCustomerPage cu=new CustomerOnboarding_UpdateCustomerPage(driver);
		Thread.sleep(5000);
		cu.click_ApplicationTab();
		logger.info("Application  Label clicked");
		Thread.sleep(3000);
		cu.click_CustomerOnboarding();
		logger.info("Entered in customer onboarding");
		Thread.sleep(5000); 
		scroll(0,1000);
		int activeCustomerCount=getTableRowCount(cusTablePath);
		System.out.println("Customer_Count:"+ activeCustomerCount);
		for(int i=1; i<activeCustomerCount;i++) {
		String constitution=getTableData(constStartxpath,constMiddlexpath,constEndxpath,i,2);
		System.out.println(constitution);
		String customerType=getTableData(cusStartXpath,cusMidXpath,cusEndXpath,i,5);
		System.out.println(customerType);
		Thread.sleep(4000);
		clickCustomerLink(constStartxpath,constMiddlexpath,cusLinkEndXpath,i,1);
		logger.info(i+" "+"Customer clicked for update");
		if(constitution.equalsIgnoreCase("Individual")) {
		Thread.sleep(6000);
		logger.info("Update for individual customer");
		scroll(0,500);
		String MaritalFieldValue=cu.selectMaritialStatus(customerType, "Married");
		Thread.sleep(5000);
		cu.get_FatherName(customerType, "FatherName");
		Thread.sleep(2000);
		cu.get_MotherName(customerType, "MotherName");
		if(MaritalFieldValue.equalsIgnoreCase("Married")) {
			cu.get_SpouseName(customerType, "SpouseName");
		}
		Thread.sleep(5000);
		cu.select_EducationQualification(customerType, "UNEDUCATED");
		Thread.sleep(2000);
		cu.select_No_of_Dependents(customerType, "3");
		
		Thread.sleep(2000);
		cu.select_No_of_FamilyMembers(customerType, "0-4");
		
		Thread.sleep(2000);
		cu.select_Caste(customerType, "GENERAL");
		
		Thread.sleep(2000);
		cu.select_Religion(customerType, "HINDU");
		
		Thread.sleep(3000);
		cu.select_KeyPerson(customerType, "No");
		
		cu.select_PropertyOwner(customerType, "No");
		
		if(customerType.equalsIgnoreCase("Co applicant")||customerType.equalsIgnoreCase("Guarantor")) {
			cu.select_Relationship(customerType, "AUNT");
			logger.info("customer relationship selected");
		}
		scroll(0,900);
		Thread.sleep(6000);
		cu.click_BasicDetailsSave(customerType);
		logger.info("Basic details saved");
		Thread.sleep(3000);
		cu.select_CurrResidenceStatus(customerType, "Owned");
		
		Thread.sleep(1000);
		cu.select_CurrResidenceType(customerType, "Flat");
		
		Thread.sleep(1000);
		cu.select_CurrStabilityAddress(customerType, "1-2");
		
		Thread.sleep(1000);
		scroll(0,500);
		cu.select_PermResidenceStatus(customerType, "Rented");
		
		Thread.sleep(1000);
		cu.select_CurrResidenceType(customerType, "Flat");
		
		Thread.sleep(1000);
		cu.select_CurrStabilityAddress(customerType, "0-1");
		
		scroll(0,2000);
		Thread.sleep(1000);
		scroll(0,1000);
		cu.click_AddressSave(customerType);
		logger.info("address save clicked");
		Thread.sleep(3000);
		cu.get_Email(customerType, "test@gmail.com");
		
		Thread.sleep(1000);
		scroll(0,1000);
		cu.click_ContactSave(customerType);
		logger.info("clicked contact saved");
		Thread.sleep(7000);
		cu.select_EmploymentMethAssessment(customerType, "ASSESSED");
		
		Thread.sleep(3000);
		cu.get_BusinessName(customerType, "Hotfoot Technology");
		
		Thread.sleep(1000);
		cu.get_BusinessYears(customerType, "2");
		
		scroll(0,900);
		Thread.sleep(1000);
		cu.click_EmploymentSave(customerType);
		logger.info("Employment type save clicked");
		Thread.sleep(3000);
		cu.select_CREexposure("CRE-RH");
		Thread.sleep(500);
		cu.select_AggregateExposure("Less than 150 Cr");
		Thread.sleep(500);
		cu.select_DCCO("No");
		Thread.sleep(500);
		cu.select_BankingRelationship("Multiple");
		Thread.sleep(500);
		cu.select_SeasonalityBusiness("No");
		Thread.sleep(500);
		cu.select_NewtoCredit("No");
		Thread.sleep(500);
		cu.select_CapitalMarketExposure("No");
		Thread.sleep(500);
		cu.set_LEIno("6454897");
		scroll(0,200);
		Thread.sleep(1500);
		cu.click_OtherinfoSave(customerType);
		logger.info("OtherInformation saved successfully");
		
		}else {
			Thread.sleep(3000);
			String type_Constitution=cu.select_ConstitutionType(customerType, "Partnership Firms");
			Thread.sleep(1000);
			cu.select_MethodAssessment(customerType, "ASSESSED");
			Thread.sleep(3000);
			scroll(0,900);
			cu.click_EntitySave(customerType);
			logger.info("clicked entity save");
			Thread.sleep(10000);
			scroll(0,200);
			cu.select_nonind_stabCurrRes(customerType, "0-1");
			logger.info("current residence captured");
			scroll(0,600);
			Thread.sleep(500);
			cu.get_nonind_OfficeName(customerType, "Cognizant");
			logger.info("Officename captured");
			Thread.sleep(500);
			cu.select_nonind_OfficeStability(customerType, "0-1");
			Thread.sleep(1000);
			cu.click_AddrSave(customerType);
			logger.info("Address save clicked");
			Thread.sleep(4000);
			if(type_Constitution.equals("Private Limited")||type_Constitution.equals("Club")||type_Constitution.equals("Partnership Firms")
			||type_Constitution.equals("Public Limited")||type_Constitution.equals("Trust")||
			type_Constitution.equals("Society")||type_Constitution.equals("HUF")) {
				logger.info("Constitution identified");
				if(type_Constitution.equals("Partnership Firms")) {
					logger.info("Matched with Partnership Firms");
					cu.click_AddMember();
					Thread.sleep(2000);
					cu.get_Name("Aravinth");
					Thread.sleep(400);
					cu.get_ProfitShareRation("65");
					Thread.sleep(400);
					cu.get_CaptialContribution("65000");
					Thread.sleep(400);
					cu.click_MemberSubmit();
					Thread.sleep(3000);
					logger.info("submitted member details");
					scroll(0,600);
					cu.click_MemberSave(customerType);
					logger.info("Member saved successfully");
					Thread.sleep(1400);
				}else if(type_Constitution.equals("Public Limited")||type_Constitution.equals("Private Limited")) {
					logger.info("Matched with public or private limited");
					cu.get_DirectorName("Jamuna");
					Thread.sleep(300);
					cu.get_DINnumber("654564");
					Thread.sleep(300);
					cu.get_DSCregistered("544655");
					Thread.sleep(300);
					cu.pick_DSCexpiry();
					Thread.sleep(500);
					cu.click_MemberSubmit();
					Thread.sleep(500);
					cu.click_MemberCancel();
					Thread.sleep(500);
					cu.click_MemberSave(customerType);
					Thread.sleep(1500);
				}else if(type_Constitution.equals("Society")||type_Constitution.equals("Trust")||type_Constitution.equals("Club")){
					logger.info("Matched with Society/trust/club");
					cu.get_TrusteeName("Dhanasekar");
					Thread.sleep(500);
					cu.get_designation("Manager");
					Thread.sleep(500);
					cu.click_MemberSubmit();
					Thread.sleep(500);
					cu.click_MemberCancel();
					Thread.sleep(500);
					cu.click_MemberSave(customerType);
					Thread.sleep(1500);
				}else {
					logger.info("Matched with HUF");
					cu.get_kartaName("Sanjay");
					Thread.sleep(200);
					cu.get_Age(26);
					Thread.sleep(200);
					cu.get_RelationshipwithKarta("Father");
					Thread.sleep(200);
					cu.click_MemberSubmit();
					Thread.sleep(200);
					cu.click_MemberCancel();
					Thread.sleep(200);
					cu.click_MemberSave(customerType);
					logger.info("Member details saved");
					Thread.sleep(1500);
					
				}
			
			}
			
			/*
			 * cu.get_Email(customerType, "test@gmail.com"); Thread.sleep(1000);
			 * scroll(0,1000); cu.click_ContactSave(customerType);
			 * logger.info("clicked contact saved"); Thread.sleep(7000);
			 * cu.select_EmploymentMethAssessment(customerType, "ASSESSED");
			 * 
			 * Thread.sleep(3000); cu.get_BusinessName(customerType, "Hotfoot Technology");
			 * 
			 * Thread.sleep(1000); cu.get_BusinessYears(customerType, "2");
			 * 
			 * scroll(0,900); Thread.sleep(1000); cu.click_EmploymentSave(customerType);
			 * logger.info("Employment type save clicked");
			 */
			Thread.sleep(5500);
			new CustomerOnboarding_UpdateCustomerPage(driver).select_CREexposure("CRE-RH");
			Thread.sleep(500);
			new CustomerOnboarding_UpdateCustomerPage(driver).select_AggregateExposure("Less than 150 Cr");
			Thread.sleep(500);
			new CustomerOnboarding_UpdateCustomerPage(driver).select_DCCO("No");
			Thread.sleep(500);
			new CustomerOnboarding_UpdateCustomerPage(driver).select_BankingRelationship("Multiple");
			Thread.sleep(500);
			scroll(0,1000);
			new CustomerOnboarding_UpdateCustomerPage(driver).select_SeasonalityBusiness("No");
			Thread.sleep(500);
			new CustomerOnboarding_UpdateCustomerPage(driver).select_NewtoCredit("No");
			Thread.sleep(500);
			new CustomerOnboarding_UpdateCustomerPage(driver).select_CapitalMarketExposure("No");
			Thread.sleep(500);
			new CustomerOnboarding_UpdateCustomerPage(driver).select_CreditRating("CARE A");
			scroll(0,300);
			Thread.sleep(4500);
			new CustomerOnboarding_UpdateCustomerPage(driver).click_OtherinfoSave(customerType);
			logger.info("Otherinformation saved successfully");
			
			
		}
	}
	
	}
	
}