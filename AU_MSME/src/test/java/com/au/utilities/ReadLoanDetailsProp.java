package com.au.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadLoanDetailsProp {
	
	Properties pro;
	
	public ReadLoanDetailsProp(){
		File src=new File("./Configuration/loanDetails.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is"+" "+e.getMessage());
		}
		
	}
	
	public String get_LoanStartPath() {
		String loanStartPath=pro.getProperty("loanStartPath");
		return loanStartPath;
	}
	
	public String get_LoanMidPath() {
		String loanMidPath=pro.getProperty("loanMidPath");
		return loanMidPath;
	}
	
	public String get_LoanEndPath() {
		String loanEndPath=pro.getProperty("loanEndPath");
		return loanEndPath;
	}

}
