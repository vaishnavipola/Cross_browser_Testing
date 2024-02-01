package CBT_C6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_C6 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://auth.ambeedata.com/users/login?redirectUrl=https://c6-beta.ambeedata.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("vaishnavi@getambee.com");
	    driver.findElement(By.id("password")).sendKeys("Vaishnavi@286876");
	    driver.findElement(By.id("submit-btn")).click();
	    Thread.sleep(2000);
	    driver.close();
	}

}
