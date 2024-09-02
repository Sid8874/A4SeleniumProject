package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartXPath {

	public static void main(String[] args) throws Exception {
		WebElement element=null;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		element=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		element.sendKeys("iphone 15");
		element.submit();
		
		String pname=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).getText();
		String price=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/.."+"/following-sibling::div[@class='col col-5-12 BfVC2z']/div[@class='cN1yYO']/div[@class='hl05eU']"+"/div[@class='Nx9bqj _4b5DiR']")).getText();
		System.out.println(pname+"the price is"+price);
	}

}
