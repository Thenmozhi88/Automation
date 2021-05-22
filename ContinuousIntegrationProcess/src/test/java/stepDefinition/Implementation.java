package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Implementation {

	public static WebDriver driver;
	
	@BeforeClass
	@Given("^Do BrowserSetup$")
	public void do_BrowserSetup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ThenmozhiP\\Desktop\\chromedriver.exe");
		if(driver==null) {
		driver = new ChromeDriver();
		}
	}

	@When("^Go to URL$")
	public void go_to_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("http://practice.automationtesting.in/");
	}

	@When("^Enter user credentials$")
	public void enter_user_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement ele= driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	    ele.click();
	}

	@Then("^click Login$")
	public void click_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
}
