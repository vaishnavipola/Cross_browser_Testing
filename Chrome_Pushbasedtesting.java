package CBT_Pushbasedtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Pushbasedtesting 
{
	public static void main(String[] args)
	{
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://auth.ambeedata.com/users/login?redirectUrl=https://webhooks.ambeedata.com");
		    driver.manage().window().maximize();
		    driver.findElement(By.id("email")).sendKeys("vaishnavi@getambee.com");
		    driver.findElement(By.id("password")).sendKeys("Vaishnavi@286876");
		    driver.findElement(By.id("submit-btn")).click();
		    driver.close();
	      
	}
}
