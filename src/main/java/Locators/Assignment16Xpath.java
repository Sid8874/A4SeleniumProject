package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment16Xpath {

	public static void main(String[] args) throws Exception {
		WebElement element=null;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		element=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		element.sendKeys("Iphone 14");
		element.submit();
		
		List<WebElement> allPnames=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> allPrice=driver.findElements(By.xpath("//div[@class='KzDlHZ']/../following-sibling::div/div[@class='cN1yYO']/div[@class='hl05eU']/div[@class='Nx9bqj _4b5DiR']"));
		Thread.sleep(3000);
		for(int i=0;i<=allPnames.size()-1;i++)
		{
			System.out.println(allPnames.get(i).getText()+"-------->"+allPrice.get(i).getText());
			Thread.sleep(3000);
			
		}
	}

}
