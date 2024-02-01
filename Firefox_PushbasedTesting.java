package CBT_Pushbasedtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox_PushbasedTesting 
{
	public static void main(String[] args)
	{
		
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://auth.ambeedata.com/users/login?redirectUrl=https://webhooks.ambeedata.com");
		    driver.manage().window().maximize();
		    driver.findElement(By.id("email")).sendKeys("vaishnavi@getambee.com");
		    driver.findElement(By.id("password")).sendKeys("Ambee@2023");
		    driver.findElement(By.id("submit-btn")).click();
		    driver.close();
	      
	}

}
