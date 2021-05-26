package com.au.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.au.pageObjects.LoginPage;
import com.au.utilities.XLUtils;

public class TC_LoginDDT extends BaseClass {

	
	@Test (priority=1)
	public void baseTest() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(1000);
		lp.clickAdvanced();
		Thread.sleep(1000);
		lp.clickProceed();
		Thread.sleep(1000);
	}
	
	@Test(dataProvider = "LoginData", priority=2)
	public void loginTest(Object user, Object pwd) throws IOException, InterruptedException {

		LoginPage lp = new LoginPage(driver);
		Thread.sleep(1000);
		lp.setUsername(user.toString());
		logger.info("User provided"); // logger msg
		Thread.sleep(1000);
		lp.setPassword(pwd.toString());
		logger.info("Password provided");	 // logger msg
		Thread.sleep(1000);
		lp.selectProduct(product);
		logger.info("Product selected"); // logger msg
		Thread.sleep(1000);
		lp.clickLogin();
		Thread.sleep(1000);
		

		System.out.println("Title: " + driver.getTitle());
		if (driver.getTitle().equalsIgnoreCase("Loan Applications")) {
			Assert.assertTrue(true);

		} else {
			// captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login Failed"); // logger msg
			Thread.sleep(1000);
		}
	}

	@DataProvider(name = "LoginData")
	public Object[][] getData() throws IOException {

		String path = System.getProperty("user.dir") + "\\src\\test\\java\\com\\au\\testData\\LoginData.xlsx";
		//int rowCount = XLUtils.getRowCount(path, "Sheet1");
		int rowCount = XLUtils.getRowCount(path, "login");
		System.out.println("rowCount" + rowCount); 
		//int colCount = XLUtils.getCellCount(path, "Sheet1", 1);
		int colCount = XLUtils.getCellCount(path, "login", 1);
		System.out.println("ColumCount" + colCount);

		Object logindata[][] = new Object[rowCount][colCount];

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				//logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
				logindata[i - 1][j] = XLUtils.getCellData(path, "login", i, j);
			}
		}

		return logindata;
	}
}




