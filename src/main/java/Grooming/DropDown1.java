package Grooming;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		WebElement select = null;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		select=driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
		Select sel = new Select(select);
		sel.selectByVisibleText("Books");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("books");
		search.submit();
		select = driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']"));
		Thread.sleep(3000);
		sel.deselectByVisibleText("Price: High to Low");
		String bookname = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]")).getText();
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
		System.err.println(bookname+" ----> "+price);
		
		
	}

}
