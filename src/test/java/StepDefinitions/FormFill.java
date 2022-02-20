package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumPages.FirstSection;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormFill {
	WebDriver driver;
	
	@Given("^open the URL of the application$")
	public void open_the_URL_of_the_application() throws Throwable {
	  	System.setProperty("webdriver.chrome.driver","D:\\Personal\\Eclipse\\webdriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		}

	@When("^Enter the details of the first section$")
	public void enter_the_details_of_the_first_section() throws Throwable {
		FirstSection fs = new FirstSection(driver);
		driver.switchTo().frame(0);
		fs.setFirstName("vikas");
		fs.setLastName("pandey");
		fs.setPhone("9873853089");
		
		
	}

	@Then("^Values should br entered$")
	public void values_should_br_entered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Values are entered");
		driver.close();
	}

	
	@When("^Enter the details of the second section$")
	public void enter_the_details_of_the_second_section() throws Throwable {
		FirstSection fs = new FirstSection(driver);
		driver.switchTo().frame(0);
		fs.setCountry("India");
		fs.setCity("Noida");
		fs.setEmailAddress("vikas.pandey@haha.com");
		
		
	}
	
	

}
