package CBT_Gspatial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edge_Gspatial
{
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://auth.ambeedata.com/users/login?redirectUrl=https://dashboard.gspatial.ai");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("vaishnavi@getambee.com");
	    driver.findElement(By.id("password")).sendKeys("Vaishnavi@286876");
	    driver.findElement(By.id("submit-btn")).click();
	    driver.close();
	}

}
