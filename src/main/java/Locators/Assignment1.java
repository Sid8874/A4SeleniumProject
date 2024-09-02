package Locators;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		String expectedFirstname="Garuda";
		String ExpectedLastname="Suryanarayana";
		for(int i=1;i<=2;i++)
		{
			Random r=new Random();
			int num=r.nextInt(1000);
			String expectedEmail=("Garuda"+num+"@gmail.com");
			String expectedPassword="sample"+num;
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			driver.findElement(By.xpath("//input[@id='gender-male']")).click();
			driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(expectedFirstname + num);
			driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(ExpectedLastname);
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(expectedEmail);
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(expectedPassword);
			WebElement element = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
				element.sendKeys(expectedPassword);
				element.submit();
				String actualmail = driver.findElement(By.xpath("//a[contains(text(),'gmail.com')]")).getText();
				if(actualmail.equalsIgnoreCase(expectedEmail))
				{
					System.out.println("pass");
				}
				else
				{
					System.out.println("fail");
				}
				driver.findElement(By.xpath("//a[text()='Log out']")).click();
				driver.findElement(By.xpath("//a[text()='Log in']")).click();
				driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(actualmail);
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(expectedPassword);
				
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
				driver.quit();
						
					
			}
		}
		
	}


