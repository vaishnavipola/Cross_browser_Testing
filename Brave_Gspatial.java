package CBT_Gspatial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Brave_Gspatial 
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\polavaishnavi\\Downloads\\ChromeSetup (1).exe\"");
		ChromeOptions options = new ChromeOptions(); 
		options.setBinary("\"C:\\Users\\polavaishnavi\\Downloads\\BraveBrowserSetup-UJW151.exe\"");
		driver = new ChromeDriver(options);
		driver.get("https://auth.ambeedata.com/users/login?redirectUrl=https://dashboard.gspatial.ai");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("vaishnavi@getambee.com");
	    driver.findElement(By.id("password")).sendKeys("Vaishnavi@286876");
	    driver.findElement(By.id("submit-btn")).click();
	    driver.close();
	}

}
