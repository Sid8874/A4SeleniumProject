package Section2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClik {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.xpath("//span[text()='Login']"));
		act.moveToElement(element).contextClick().build().perform();
		Thread.sleep(3000);
		WebElement element1=driver.findElement(By.xpath("//input[@name='q']"));
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(3000);

		WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("iphone 14");
		search.submit();
		
		WebElement scrollele=driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[24]"));
		Thread.sleep(3000);
		act.scrollToElement(scrollele).perform();

	}

}
