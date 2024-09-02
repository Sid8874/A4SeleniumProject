package Grooming;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public static void main(String[] args) throws Exception {
		String expectedDate="Oct 11 2024";
	WebDriver driver=new ChromeDriver();
	Actions act = new Actions(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	
	driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("BLR");
	Thread.sleep(4000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	driver.findElement(By.xpath("//input[@id='toCity']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("DXB");
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	driver.findElement(By.xpath("//div[contains(@aria-label,'"+expectedDate+"')]")).click();
	
	driver.findElement(By.xpath("//span[@class='lbl_input appendBottom5']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
	driver.findElement(By.xpath("//button[@class='primaryBtn btnApply pushRight']")).click();
	driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
	}

}
