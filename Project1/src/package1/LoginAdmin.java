package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginAdmin 
{
	@Test
	public void loginAdmin()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");		
	}
}
