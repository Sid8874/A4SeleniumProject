package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws Exception {
		WebElement element=null;
	 WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		element=driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']"));
		Thread.sleep(4000);
		System.out.println("Login page is verified"+ element.isDisplayed());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		element=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
		Thread.sleep(4000);
		System.out.println("Dashboard page is verified"+ element.isDisplayed());
		element=driver.findElement(By.xpath("//span[text()='Admin']"));
		element.click();
		Thread.sleep(4000);
		element=driver.findElement(By.xpath("//h6[text()='Admin']"));
		System.out.println("Admin page is displayed"+ element.isDisplayed());
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@Placeholder='Type for hints...']")).sendKeys("Sharat");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[@cllass='oxd-userdropdown-name']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(4000);
		element=driver.findElement(By.xpath("//h5[text()='Login']"));
		Thread.sleep(4000);
		System.out.println("After logout again login visible"+ element.isDisplayed());	
	}

}
