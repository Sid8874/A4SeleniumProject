package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) throws Exception {
		String username="Admin@gmail.com";
		String password="Admin@1234";
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//input[@id='email']"));
		element.sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		Thread.sleep(3000);
		
		
	}

}
