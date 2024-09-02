package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Program2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className ("ico-register")).click();
		driver.findElement(By.id ("FirstName")).sendKeys("John");
		driver.findElement(By.id ("LastName")).sendKeys("Wick");
		driver.findElement(By.id ("Email")).sendKeys("johnwick@1.com");
		driver.findElement(By.id ("Password")).sendKeys("Johnwick@123456789");
		WebElement element = driver.findElement(By.id ("ConfirmPassword"));
				element.sendKeys("Johnwick@123456789");
		element.submit();
		element.getText();
		
		driver.findElement(By.xpath ("//")).click();
	}

}
