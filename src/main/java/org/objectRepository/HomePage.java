package org.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_Utility.SeleniumUtility;

public class HomePage {
	
	@FindBy(xpath="(//a[text()='Leads'])[1]")
	private WebElement leads;
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement org;
	
	@FindBy(xpath="(//td[@class='small'])[2]")
	private WebElement preferences;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutOption;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getPreferences() {
		return preferences;
	}

	public WebElement getSignoutOption() {
		return signoutOption;
	}
	
	/**
	 * this is business library to click on leads
	 */
	public void clickOnOnLeads()
	{
		leads.click();
	}
	public void clickOnOrg()
	{
		org.click();
	}
	
	/**
	 * this is a business library to logout
	 * @throws Exception 
	 */
	public void logoutOperation(WebDriver driver) throws Exception
	{
		SeleniumUtility sutil=new SeleniumUtility();
		sutil.moveCursorToElement(driver,preferences);
		Thread.sleep(3000);
		sutil.moveCursorToElement(driver,signoutOption);
	}
	

}
