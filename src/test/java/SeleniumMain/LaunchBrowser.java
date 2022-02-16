package SeleniumMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {


	
	
	@Test
	public void openBrowser()

	
	
	{
		System.setProperty("webdriver.chrome.driver","D:\\Personal\\Eclipse\\webdriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
	}
}
