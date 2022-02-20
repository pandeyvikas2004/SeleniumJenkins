package SeleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstSection {
	
	WebDriver driver;
	
	public FirstSection(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "RESULT_TextField-1")
	WebElement FirstName;
	
	@FindBy(id = "RESULT_TextField-2")
	WebElement LastName;
	
	
	@FindBy(id = "RESULT_TextField-3")
	WebElement Phone;
	
	@FindBy(id = "RESULT_TextField-4")
	WebElement Country;
	
	@FindBy(id = "RESULT_TextField-5")
	WebElement City;
	
	@FindBy(id = "RESULT_TextField-6")
	WebElement EmailAddress;
	
	
	
	
	public void setFirstName(String firstname) {
		FirstName.sendKeys(firstname);
		}

	public void setLastName(String lastname) {
		LastName.sendKeys(lastname);
		}

	public void setPhone(String phone) {
		Phone.sendKeys(phone);
		}
	
	public void setCountry(String country) {
		Country.sendKeys(country);
		}
	
	public void setCity(String city) {
		City.sendKeys(city);
		}
	
	public void setEmailAddress(String email) {
		EmailAddress.sendKeys(email);
		}
	
	
	
	
}
