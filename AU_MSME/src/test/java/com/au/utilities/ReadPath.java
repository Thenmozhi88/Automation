package com.au.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPath {

	Properties pro;
	
	public ReadPath() {
		
		File src=new File("./Configuration/commonPath.properties");
		
		try {
			
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e){
			
			System.out.println("Exception is" + " " + e.getMessage());
		}
	}
	
	
	
	public String get_BrowserPath() {
		String path=pro.getProperty("chromepath");
		return path;
	}
	
	public String get_customerTablepath() {
		String cust_tablePath=pro.getProperty("customerTablePath");
		return cust_tablePath;
		
	}
	
	public String get_RCU_uploadDocumentPath() {
		String upload_doc=pro.getProperty("RCUdocumentUploadPath");
		return upload_doc;
	}
	
	public String get_BSADropdownPath() {
		String BSAdropdownpath=pro.getProperty("BSA_MemberDetails_DropDownPath");
		return BSAdropdownpath;
		
	}
	
	public String get_BSATablePath() {
		String path=pro.getProperty("BSATablePath");
		return path;
	}
	
	
	public String get_RTRDropdownPath() {
		String path=pro.getProperty("RTR_MemberDetails_DropDownPath");
		return path;
	}
	public String get_CollateralTablePath() {
		String path=pro.getProperty("collateralTablePath");
		return path;
	}
	
	public String get_LegalTablePath() {
		String path=pro.getProperty("legalTablePath");
		return path;
	}
	
	public String get_valuationTablePath() {
		
		String path=pro.getProperty("valuationTablePath");
		return path;
	}
	
	public String get_LoanDetailsTablePath() {
		String path=pro.getProperty("loanDetailTabelPath");
		return path;
	}
}
