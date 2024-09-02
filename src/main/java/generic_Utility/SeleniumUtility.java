package generic_Utility;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
	WebDriver driver=null;
	Actions act=null;
	Select s=null;
	
	/**
	 * this is a generic method for implicit wait
	 */
	public void implicitWait(WebDriver driver,int particularSeconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(particularSeconds));
	}

	/**
	 * this is a generic method for maximize the  window
	 */
	public void maximizeWindow(WebDriver driver,int particularSeconds) {
		driver.manage().window().maximize();
	}
	/**
	 * this is a generic method for right click on particular Web Element
	 */
	public void rightClickAnElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * this is a generic method for drag and drop operation
	 */
	public void dragAndDropAnElement(WebDriver driver,WebElement src,WebElement target) {
		act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
	/**
	 * this is a generic method for drag and drop operation by using x-ais and y-axis
	 */
	public void dragAndDropPointer(WebDriver driver,WebElement src,int xoffset,int yoffset) {
		act=new Actions(driver);
		act.dragAndDropBy(src, xoffset, yoffset).perform();
	}
	/**
	 * this is a generic method for scroll a particular webElement
	 */
	public void scrollToElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	/**
	 * this is a generic method which helps to control is move to a particular element
	 */
	public void moveCursorToElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * this is a generic method which is hold a particular Web Element
	 */
	public void holdAnElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.clickAndHold(element).perform();
	}
	/**
	 * this method will helps to release a particular element
	 */
	public void releaseAnElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.clickAndHold(element).perform();
	}
	/**
	 * this is a generic method to select element based on index value
	 * 
	 */
	public void selectElementByIndex(WebElement element,int indexNum) {
		s=new Select(element);
		s.selectByIndex(indexNum);
		
	}
	/**
	 * this is a generic method to select element based on visible text
	 * 
	 */
	public void selectElementByVisibleText(WebElement element,String text) {
		s=new Select(element);
		s.selectByVisibleText(text);
	}
	/**
	 *  this is a generic method to select element based on value
	 */
	public void selectElementByValue(WebElement element,String value) {
		s=new Select(element);
		s.selectByValue(value);
	}
	/**
	 *  this is a generic method to deselect element based on index number
	 */
	public void deSelectElementByIndex(WebElement element,int indexNum) {
		s=new Select(element);
		s.deselectByIndex(indexNum);
	}
	/**
	 *  this is a generic method to deselect element based on index number
	 */
	public void deSelectElementByVisibleText(WebElement element,String text) {
		s=new Select(element);
		s.deselectByVisibleText(text);
	}

	/**
	 * this is a generic method to  de-select an option based on value
	 */
	
	public void deselectAnElementByvalue(WebElement element, String value) {
		s=new Select(element);
		s.deselectByValue(value);
	}
	
	/**
	 * this is a generic method to de-select all the options
	 */
	
	public void deselectAllOptions(WebElement element) {
		s=new Select(element);
		s.deselectAll();
		
	}
	/**
	 * this is a generic method to to fetch all the selected option from multi-selected drop
	 */
	
	public List<WebElement>fetchAllSelectedOptons(WebElement element){
		s=new Select(element);
		List<WebElement>all=s.getAllSelectedOptions();
		return all;
		
	}
	
	/**
	 * this is a method to read all the options
	 */
	
	public List<WebElement> fetchAllOptions(WebElement element){
		s=new Select(element);
		List<WebElement>all=s.getOptions();
		return all;
	}
}
