package com.au.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadFinancialAnalysis {

	Properties pro;
	
	public ReadFinancialAnalysis() {
		
		File src=new File("./Configuration/FinancialAnalysis.properties");
		
		try {
			pro=new Properties();
			FileInputStream fis=new FileInputStream(src);
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}
	
	public String get_accSummaryStartXpath() {
		String startXpath=pro.getProperty("startXpath");
		return startXpath;
	}
	
	public String get_accSummaryLastXpath() {
		String lastXpath=pro.getProperty("lastXpath");
		return lastXpath;
	}
	
	
}
