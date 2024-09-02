package Locators;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
	   WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
	   Thread.sleep(3000);
	   element.sendKeys("i phone 14");
		Thread.sleep(3000);
		element.submit();
		Thread.sleep(3000);
		List<WebElement>allprods=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement>allprice=driver.findElements(By.xpath("//div[@class=\"KzDlHZ\"]/../following-sibling::div/div[@class=\"cN1yYO\"]/div[@class=\"hl05eU\"]/div[@class=\"Nx9bqj _4b5DiR\"]"));
		
		Iterator<WebElement>itr=allprods.iterator();
		Iterator<WebElement>itr1=allprice.iterator();
		
		while(itr.hasNext()&& itr1.hasNext()) {
			String Pnames=itr.next().getText();
			String Price=itr1.next().getText();
			System.out.println(Pnames+"------>"+Price);
		}
		
	}
}
