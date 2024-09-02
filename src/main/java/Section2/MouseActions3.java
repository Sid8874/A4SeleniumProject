package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions3 {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		 
		WebElement mobCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mobCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement laptopcharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement laptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		
		WebElement mobAccessories = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
		WebElement laptopAccessories = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
		
		
		act.dragAndDrop(mobCharger, mobAccessories).perform();
		act.dragAndDrop(mobCover, mobAccessories).perform();
		act.dragAndDrop(laptopcharger, laptopAccessories).perform();
		act.dragAndDrop(laptopCover, laptopAccessories).perform();
		
	}

}
