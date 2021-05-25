package stepDefinition;

import org.openqa.selenium.WebDriver;
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
    driver.get("http://www6.toolssqa.com/");
    Thread.sleep(1000);
}

@When("^verify homepage$")
public void verify_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	if(driver.getPageSource().contains("This domain toolssqa.com may be for sale. Click here for more information.")){
		System.out.println("Text is present");
		}else{
		System.out.println("Text is absent");
}
	Thread.sleep(1500);
}

@Then("^Close the browser$")
public void close_the_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(2000);
	System.out.println("Browser close");
    driver.close();
}

}
