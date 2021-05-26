package com.au.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	
	public ReadConfig(){
		//config properties
		
		File src=new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
		
		
		
		
	}

	
	
	public String getApplicationURL() {
		String url=pro.getProperty("URL");
		return url;
	}
	
	public String getUsername() {
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password=pro.getProperty("password");
		return password;
	}
	
	public String getProduct() {
		String product=pro.getProperty("product");
		return product;
	}
	
	public String getChromePath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}

	public int getApplicationID() {
		int applid=Integer.parseInt(pro.getProperty("applicationid"));
		
		return applid;
	}
	
	//Customer Details readConfig
	
	public String getCustomerTablePath() {
		String tpath=pro.getProperty("customerTablePath");
		return tpath;
	}
	
	public String getCusTypeStartXpath() {
		String start_Xpath=pro.getProperty("customerType_start");
		return start_Xpath;
	}
	public String getCusTypeMiddleXpath() {
		String middle_Xpath=pro.getProperty("customerType_middle");
		return middle_Xpath;
	}
	public String getCusTypeEndXpath() {
		String end_Xpath=pro.getProperty("customerType_end");
		return end_Xpath;
	}
	
	public String getConstTypeStartXpath() {
		String start_Xpath=pro.getProperty("const_start");
		return start_Xpath;
	}
	
	public String getConstTypeMiddleXpath() {
		String middle_Xpath=pro.getProperty("const_middle");
		return middle_Xpath;
	}
	
	public String getConstTypeEndXpath() {
		String end_Xpath=pro.getProperty("const_last");
		return end_Xpath;
	}
	
	public String getCustomerLinkEnd_xpath() {
		String end_Xpath=pro.getProperty("customer_Link_end");
		return end_Xpath;
	}
	
	
}
