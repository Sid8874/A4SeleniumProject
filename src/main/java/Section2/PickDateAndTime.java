package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PickDateAndTime {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new  ChromeDriver();
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Time Picker Clock']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Pick Time']")).click();
		Thread.sleep(3000);
		WebElement hour=driver.findElement(By.xpath("//span[text()='10']"));
		act.click(hour).perform();	
		Thread.sleep(3000);
		WebElement min=driver.findElement(By.xpath("//span[text()='30']"));
		act.click(min).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.close();
		
		
	}

}
