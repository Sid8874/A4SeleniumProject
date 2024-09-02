package Grooming;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		WebElement element=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		act.moveToElement(element).perform();
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.xpath("//a[text()='Fashion']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",ele1);
		
		
//		WebElement element1=driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']"));
//		act.moveToElement(element1).click().perform();
		
		
		
	}

}
