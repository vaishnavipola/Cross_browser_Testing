package CBT_C6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Edge_C6 
{
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://c6-intg-frontend.ambeedata.com/#/");
	    driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("c6-testing-17@mailinator.com");
        driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Abcd1234$");
	    driver.findElement(By.id("submit-btn")).click();
	    driver.close();
	}
}
