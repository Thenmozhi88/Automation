package com.au.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class ReadCollateralProp {

	Properties commonPro;

	// collateral properties

	public ReadCollateralProp() {
		File src1 = new File("./Configuration/collateral.properties");

		try {
			FileInputStream fis = new FileInputStream(src1);
			commonPro = new Properties();
			commonPro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}

	}

	
	public String getStartpath() {
		String start=commonPro.getProperty("startXpath");
		return start;
	}
	
	public String getMidpath() {
		String mid=commonPro.getProperty("midXpath");
		return mid;
	}
	
	public String getEndpath() {
		String end=commonPro.getProperty("endXpath");
		return end;
	}

	public String getValuationConsidered() {
		String valuationConsidered = commonPro.getProperty("valConsidered");
		return valuationConsidered;
	}
	
	public String getLegalStartPath() {
		String start=commonPro.getProperty("startPath");
		return start;
	}
	
	public String getLegalEndPath() {
		String end=commonPro.getProperty("endPath");
		return end;
	}
	
	public String getLegalEndPath1() {
		String end=commonPro.getProperty("endPath1");
		return end;
	}
	public String getLegalEndPath2() {
		String end=commonPro.getProperty("endPath2");
		return end;
		
	}
	
	public String getLegalMidPath() {
		String mid=commonPro.getProperty("midPath");
		return mid;
	}
	
	public String getValuationStartPath() {
		String start=commonPro.getProperty("valStartPath");
		return start;
	}
	
	public String getValuationMidPath() {
		String mid=commonPro.getProperty("calMidPath");
		return mid;
	}
	
	public String getValuationEndPath() {
		String end=commonPro.getProperty("valEndPath");
		return end;
		
	}
	public String getValuationEndPath1() {
		String end=commonPro.getProperty("valEndPath1");
		return end;
		
	}
	
	public String getValuationReportTableStartPath() {
		String start=commonPro.getProperty("reportTableStartPath");
		return start;
	}
	
	public String getValuationReportTableEndPath() {
		String end=commonPro.getProperty("reportTableEndPath");
		return end;
		
	}
	
	
}
