package com.au.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadApplicationProp {

	Properties pro;

	public ReadApplicationProp() {

		File src = new File("./Configuration/application.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}

	}

	public String getClearance() {
		String clearanceVal = pro.getProperty("clearance");
		return clearanceVal;

	}
	
	public String getBounceReason() {
		String reason = pro.getProperty("bouncedreason");
		return reason;
	}
	
	public String getOtherReasonBounce() {
		String otherReason=pro.getProperty("otherReason");
		return otherReason;
	}
	
	
	public String getImdRemarks() {
		String remarks = pro.getProperty("Imdremarks");
		return remarks;
	}
	
	public String getRefName() {
		String Rname = pro.getProperty("RefName");
		return Rname;
	}
	
	public String getRefAddress() {
		String addr = pro.getProperty("RefAddress");
		return addr;
	}
	
	public String getRefMobileNo() {
		String number = pro.getProperty("RefMob");
		return number;
	}
	
	public String getEmpName() {
		String ename = pro.getProperty("empName");
		return ename;
	}
	
	public int getEmpId() {
		int eid = Integer.parseInt(pro.getProperty("empId"));
		return eid;
	}
	
	public String getTvrRemarks() {
		String remarks = pro.getProperty("tvrRemarks");
		return remarks;
	}
	
	public String getVendorName() {
		String vName = pro.getProperty("vendorName");
		return vName;
	}
	
	public String getVendorCode() {
		String vCode = pro.getProperty("vendorCode");
		return vCode;
	}
	
	public String getRCUstatus() {
		String status = pro.getProperty("RcuStatus");
		return status;
	}

}
