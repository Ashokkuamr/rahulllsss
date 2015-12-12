package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login 
{
	@Test
	public void test1()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		
	}
}
