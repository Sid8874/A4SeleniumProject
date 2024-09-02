package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog1 {
	public static void main(String[] args) throws Exception {
		String expectedData="search";
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys(" iphone");
		Thread.sleep(3000);
		search.submit();
		WebElement search1=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']"));
	    search1.click();
	    Thread.sleep(4000);
	    driver.quit();
}
}