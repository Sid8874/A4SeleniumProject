package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.name("password"));
	element.sendKeys("admin123");
	Thread.sleep(3000);
	element.submit();
		
	}

}
