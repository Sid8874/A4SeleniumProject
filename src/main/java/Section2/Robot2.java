package Section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot2 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(4000);
		
		List<WebElement> all=driver.findElements(By.xpath("//button[@class='active:bg-green-400 transition-all duration-300 active:border-green-400 rounded-md mx-1 px-5 py-2 text-black font-bold   bg-orange-300 border border-orange-600']"));
		for(int i=0;i<=all.size()-1; i++)
		{
			if(i==0||i==3||i==7)
			{
				all.get(i).click();
				Thread.sleep(3000);
			}
		}
		
		
//		Robot r = new Robot();
//		
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
////		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//			
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);
//		
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(000);
//		
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(4000);
//		
		driver.close();
		
		
	}

}
