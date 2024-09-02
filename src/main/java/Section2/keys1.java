package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keys1 {
	
	public static void main(String[] args) throws Exception {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin" , Keys.TAB , "admin123" , Keys.ENTER);

	}

}
