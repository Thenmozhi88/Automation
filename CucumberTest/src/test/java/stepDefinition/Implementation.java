package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Implementation {

	
	public static WebDriver driver;
	

@Given("^Setup Browser$")
public void setup_Browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ThenmozhiP\\Desktop\\chromedriver.exe");
	if(driver==null) {
	driver = new ChromeDriver();
	}
}

@When("^go to url$")
public void go_to_url() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://www.testandquiz.com/");
    Thread.sleep(1000);
}

@When("^verify homepage$")
public void verify_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	if(driver.getPageSource().contains("Quizzes")){
		System.out.println("Text is present");
		}else{
		System.out.println("Text is absent");
}
	Thread.sleep(1500);
}

@Then("^Get Links$")
public void get_Links() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    List<WebElement> links=driver.findElements(By.tagName("a"));
    int count=links.size();
    System.out.println("Links Count"+" " +count);
}

@Then("^Close the browser$")
public void close_the_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(2000);
	WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'Sports')]"));
	ele1.click();
	System.out.println("Element identified");
	if(driver.getPageSource().contains("Sports Related Top Played Quiz"))
	{
		System.out.println("Successfully clicked element");
	}else
	{
		System.out.println("Unable to click the element");
	}
	//  driver.close();
}

@When("^click on TextLink$")
public void click_on_TextLink() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Quizzes')]"));
	ele.click();
	Thread.sleep(500);
}

}
