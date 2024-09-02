package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment20 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("Iphone 14");
		element.submit();
		
//		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[1]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[23]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[24]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[@class='RCafFg -3yGLs']")).click();
//		Thread.sleep(4000);
//		driver.close();         
		List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Add to Compare']"));
		for(int i=0;i<=elements.size()-1; i++)
		{
			if(i==0||i==1||i==22||i==23)
			{
				elements.get(i).click();
				Thread.sleep(2000);
			}
		}
		
	}

}
