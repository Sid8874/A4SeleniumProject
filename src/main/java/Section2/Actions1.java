package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.xpath("//span[text()='Login']"));
		//act.click(element).perform();
		act.moveToElement(element).click().perform();
		Boolean b=driver.findElement(By.xpath("//span[text()='Login']")).isDisplayed();
		System.out.println(b);
		}

}
