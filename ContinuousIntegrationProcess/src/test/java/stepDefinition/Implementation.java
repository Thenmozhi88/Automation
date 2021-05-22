package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import cucumber.api.DataTable;
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
	
	
	@Given("^enter email address and password$")
	public void enter_email_address_and_password(DataTable credentials) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    List<List<String>> data=credentials.raw();
	    WebElement email=driver.findElement(By.id("reg_email"));
	    email.sendKeys(data.get(0).get(0));
	    WebElement pwd=driver.findElement(By.id("reg_password"));
	    pwd.sendKeys(data.get(0).get(1));
	   
	}

	@When("^click on Register$")
	public void click_on_Register() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement register=driver.findElement(By.name("register"));
		 register.click();
	}

	@Then("^close driver$")
	public void close_driver() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

}
