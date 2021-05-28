package com.au.practiceProgram;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	static WebDriver driver;
	
	@Test
	public void doLogin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ThenmozhiP\\Desktop\\Files\\chromedriver.exe"); 
		 WebDriver driver=new ChromeDriver(); 
		 driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			
			
	
		 
	WebElement table=driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table"));
	List<WebElement> trows=table.findElements(By.tagName("tr"));
	int rowCount=trows.size();
	System.out.println("Rows" + rowCount);
	List<WebElement> tcols=trows.get(rowCount-1).findElements(By.tagName("td"));
	int colCount=tcols.size();
	System.out.println("Cols" + colCount);
	
	
	
	String startXpath, midXpath, endXpath;
	startXpath="//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/tbody/tr[";
	midXpath="]/td[";
	endXpath="]";
	

	
	for(int i=1; i<rowCount-1;i++){
		for(int j=1;j<colCount;j++) {
			
			
			String data=driver.findElement(By.xpath(startXpath+i+midXpath+j+endXpath)).getText();
			
			System.out.print(data);
			
		}
	}
	

	} 
	

}
