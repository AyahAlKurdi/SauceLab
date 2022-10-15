package Saucelab2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	
	@Test(priority = 1)
	public void navigate()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\aykurdi\\Desktop\\old data D\\backup-aya\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
	
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 2)
	public void credentials()
	{
		

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("problem_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
	}
	
	
	@Test(priority = 3)
	public void close()
	{
		

	  driver.quit();	
	}

}
