package Grooming;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) throws Exception {
		WebElement search=null;
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Trending']")).click();
		driver.findElement(By.xpath("//div[text()='Music']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[2]")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_F);
		driver.findElement(By.xpath("//div[text()='Skip']")).click();
		Thread.sleep(10000);
		
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,10000)");
		
//		driver.findElement(By.xpath("//div[@class='ytp-timed-markers-container']"));
		Thread.sleep(2000);
	}

}
