package Grooming;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class MakeMyTripDynamicChange {

	public static void main(String[] args) throws Exception {
		String fromCity="ccu";
		String toCity="hyd";
		String expectedAdult="7";
		String expectedMonth="December 2024";
		String expectedDate="Dec 27 2024";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(fromCity);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='react-autosuggest__suggestion react-autosuggest__suggestion--first']")).click();
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(toCity);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='react-autosuggest__suggestion react-autosuggest__suggestion--first']")).click();
		WebElement monthOfCalendar=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div"));
		WebElement nextMonthArrow=driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
		while(!monthOfCalendar.getText().contains(expectedMonth))
		{
			nextMonthArrow.click();
			Thread.sleep(2000);
		}

		driver.findElement(By.xpath("//div[contains(@aria-label,'"+expectedDate+"')]")).click();
		driver.findElement(By.xpath("//label[@for='travellers']")).click();
		List<WebElement> noOfAdults = driver.findElements(By.xpath("//p[@data-cy='adultRange']/following-sibling::ul[@class='guestCounter font12 darkText gbCounter']/li"));
		for(WebElement adult:noOfAdults)
		{
			if(adult.getText().equals(expectedAdult))
			{
				adult.click();
				Thread.sleep(3000);
			}
		}
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
	}

}
