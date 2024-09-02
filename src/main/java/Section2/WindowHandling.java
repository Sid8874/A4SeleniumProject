package Section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws Exception {
		WebElement search=null;
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("I phone 14");
		search.submit();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		Thread.sleep(3000);
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		Thread.sleep(3000);
		for(String ids:allWindowId)
		{
			if(!ids.equals(allWindowId))
			{
				driver.switchTo().window(ids);
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Add Item']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='sBxzFz fF30ZI A0MXnh']")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
