package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		WebElement element=driver.findElement(By.xpath("//input[@name='password']"));
		element.sendKeys("admin123");
		element.submit();
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sharat");
		driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Rendale");
		WebElement employee=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active oxd-input--error']"));
		employee.sendKeys("1986");
		employee.submit();
	}

}
