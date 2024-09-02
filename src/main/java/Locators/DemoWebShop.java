package Locators;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		String expectedFirstName="RamSeeta";
		String expectedLastName="Ayodhya";
		for(int i=1;i<=2;i++)
		{
			Random r=new Random();
			int num=r.nextInt();
			
			String expectedEmail=("siyaram"+num+"@gmail.com");
			String expectedPassword="LavaKush"+num;
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[@class='ico-register']")).click();
			driver.findElement(By.xpath("//input[@name='Gender']")).click();
			driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(expectedFirstName);
			driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(expectedLastName);
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(expectedEmail);
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(expectedPassword);
			WebElement ele=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
			ele.sendKeys(expectedPassword);
			ele.submit();
			String actualEmail=driver.findElement(By.xpath("//a[contains(text(),'gmail.com')]")).getText();
			if(actualEmail.equalsIgnoreCase(expectedEmail))
			{
				System.out.println("It is Pass.."+num);
			}
			else
			{
				System.out.println("It is fail..!!"+num);
			}
			driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
			driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			driver.findElement(By.xpath("//input[@class='email']")).sendKeys(actualEmail);
			driver.findElement(By.xpath("//input[@class='password']")).sendKeys(expectedPassword);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			driver.quit();
		}
	}

}
