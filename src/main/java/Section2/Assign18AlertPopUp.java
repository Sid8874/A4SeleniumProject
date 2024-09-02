package Section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign18AlertPopUp {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		String altmsg=alt.getText();
		System.out.println(altmsg);
//		alt.accept();
		alt.dismiss();
		Thread.sleep(3000);
		driver.close();
	}

}
