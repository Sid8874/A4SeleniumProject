import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopUpHandling {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
//		Thread.sleep(3000);
//		Alert alt=driver.switchTo().alert();
//		String altmsg=alt.getText();
//		System.out.println(altmsg);
//		alt.dismiss();
//		
	}

}
