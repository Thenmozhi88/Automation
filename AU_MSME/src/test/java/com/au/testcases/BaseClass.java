package com.au.testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.au.pageObjects.LoginPage;
import com.au.utilities.ReadApplicationProp;
import com.au.utilities.ReadCollateralProp;
import com.au.utilities.ReadConfig;
import com.au.utilities.ReadFinancialAnalysis;
import com.au.utilities.ReadLoanDetailsProp;
import com.au.utilities.ReadPath;

public class BaseClass {

	ReadConfig readConfig=new ReadConfig();
	ReadCollateralProp readColl =new ReadCollateralProp();
	ReadPath readPath=new ReadPath();
	ReadApplicationProp readAppl=new ReadApplicationProp(); 
	ReadFinancialAnalysis readFinAnal=new ReadFinancialAnalysis();
	ReadLoanDetailsProp readLoan=new ReadLoanDetailsProp();
	
	public String baseURL = readConfig.getApplicationURL();
	public String username = readConfig.getUsername();
	public String password = readConfig.getPassword();
	public String product = readConfig.getProduct();
	public String browserPath = readPath.get_BrowserPath();
	public int applid= readConfig.getApplicationID();
	
	
	public String cusTablePath=readPath.get_customerTablepath();
	public String cusStartXpath=readConfig.getCusTypeStartXpath();
	public String cusMidXpath=readConfig.getCusTypeMiddleXpath();
	public String cusEndXpath=readConfig.getCusTypeEndXpath();
	public String cusLinkEndXpath=readConfig.getCustomerLinkEnd_xpath();
	
	public String constStartxpath=readConfig.getConstTypeStartXpath();
	public String constMiddlexpath=readConfig.getConstTypeMiddleXpath();
	public String constEndxpath=readConfig.getConstTypeEndXpath();
	
	public String clearance=readAppl.getClearance();
	public String bouncersn=readAppl.getBounceReason();
	public String otherReason=readAppl.getOtherReasonBounce();
	public String imdRemarks=readAppl.getImdRemarks();
	public String refName=readAppl.getRefName();
	public String refAddr=readAppl.getRefAddress();
	public String refMob=readAppl.getRefMobileNo();
	public String empName=readAppl.getEmpName();
	public int empId=readAppl.getEmpId();
	public String tvrRemarks=readAppl.getTvrRemarks();
	public String vendorName=readAppl.getVendorName();
	public String vendorCode=readAppl.getVendorCode();
	public String rcuStatus=readAppl.getRCUstatus();
	
	public String Rcu_uploadDocumentpath=readPath.get_RCU_uploadDocumentPath();
	public String BSA_MemberDropdown=readPath.get_BSADropdownPath();
	public String BSA_accSummaryTablepath=readPath.get_BSATablePath();
	public String BSA_accSummaryStartXpath=readFinAnal.get_accSummaryStartXpath();
	public String BSA_accSummaryLastXpath=readFinAnal.get_accSummaryLastXpath();
	
	public String RTR_MemberDropdown=readPath.get_RTRDropdownPath();
	public String colltablePath=readPath.get_CollateralTablePath();
	public String collStartpath=readColl.getStartpath();
	public String collMidpath=readColl.getMidpath();
	public String collEndpath=readColl.getEndpath();
	public String val_Considered=readColl.getValuationConsidered();
	
	public String legalTablePath=readPath.get_LegalTablePath();
	public String legalStartPath=readColl.getLegalStartPath();
	public String legalMidPath=readColl.getLegalMidPath();
	public String legalEndPath=readColl.getLegalEndPath();
	public String legalEndPath1=readColl.getLegalEndPath1();
	public String legalEndPath2=readColl.getLegalEndPath2();
	
	public String valuationTablePath=readPath.get_valuationTablePath();
	public String valStartPath=readColl.getValuationStartPath();
	public String valMidPath=readColl.getValuationMidPath();
	public String valEndPath=readColl.getValuationEndPath();
	public String valEndPath1=readColl.getValuationEndPath1();
	public String valReportStartPath=readColl.getValuationReportTableStartPath();
	public String valReportEndPath=readColl.getValuationReportTableEndPath();
	
	public String loandetailTablePath=readPath.get_LoanDetailsTablePath();
	public String loanStartxPath=readLoan.get_LoanStartPath();
	public String loanEndxPath=readLoan.get_LoanEndPath();
	
		
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", browserPath);
		if(driver==null) {
		driver = new ChromeDriver();
		logger=Logger.getLogger("AUSmallFinance");
		PropertyConfigurator.configure("Log4j.properties");
		}
		driver.get(baseURL);
	/*	String actualTitle=driver.getTitle();
		String expectedTitle="Privacy error";
		Assert.assertEquals(actualTitle, expectedTitle); */
	
		driver.manage().window().maximize();
		
		
	} 
	
/*	@AfterClass
	public void tearDown() {
		driver.quit(); 
	}*/
	
	
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+ "/screenshots/" + tname + timeStamp +".png");
		FileUtils.copyFile(source,target);
		System.out.println("Screenshot taken");
		
	}
	
	public int getTableRowCount(String tpath) {
		WebElement table=driver.findElement(By.xpath(tpath));
		List<WebElement> trows=table.findElements(By.tagName("tr"));
		int rowcount=trows.size();
		return rowcount;
	}
	
	public int getTableColumnCount(String tpath) {
		WebElement table=driver.findElement(By.xpath(tpath));
		List<WebElement> trows=table.findElements(By.tagName("tr"));
		int rowcount=trows.size();
		List<WebElement> tcol=trows.get(rowcount).findElements(By.tagName("td"));
		int colcount=tcol.size();
		return colcount;
	}
	
	//constitution and Customer type
	
	public String getTableData(String first, String mid,String last,int i,int j) {
		String Data = driver.findElement(By.xpath(first+i+mid+j+last)).getText();
		return Data;
		
	}
	
	public String getTableData(String first,int i,String last) {
		String Data = driver.findElement(By.xpath(first+i+last)).getText();
		return Data;
		
	}
	
	public String clickTableData(String first,int i, String mid,int j,String last) {
		String data=driver.findElement(By.xpath(first+i+mid+j+last)).getText();
		driver.findElement(By.xpath(first+i+mid+j+last)).click();
		return data;
		
	}
	
	public String clickTableData(String first,int i, String last) {
		String data=driver.findElement(By.xpath(first+i+last)).getText();
//		driver.findElement(By.xpath(first+i+last)).click();
		retryingFindClick(By.xpath(first+i+last));
		return data;
		
	}
	
	public boolean retryingFindClick(By by) {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	            driver.findElement(by).click();
	            result = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts++;
	    }
	    return result;
	}
	
	
	
	public void clickCustomerLink(String first,String mid,String last,int i,int j) {
		WebElement Data = driver.findElement(By.xpath(first+i+mid+j+last));
		Data.click();
		
		
	}
	
	//dropdownCount
	
	public int getDropdownCount(String drpdwnXpath) {
		Select dropDown=new Select(driver.findElement(By.xpath(drpdwnXpath)));
		List<WebElement> options=dropDown.getOptions();
		int MemberCount=options.size();
		return MemberCount;
	}
	
	public void clickBSAaccountLink(String first,int i, String last) {
		WebElement Data=driver.findElement(By.xpath(first+i+last));
		Data.click();
	}
	
	public void scroll(long from, long to) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy("+from+","+to+")");
		
	}
	
	public void scrollVisibleElement(String type, String element) {
		if(type.equalsIgnoreCase("Applicant")) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}else if(type.equalsIgnoreCase("Co applicant")) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}else
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);	
	}
	}
	
	public void switchTo_Window(int val) {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(val));

	}

	
}
