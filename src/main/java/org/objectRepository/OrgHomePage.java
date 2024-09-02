package org.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgHomePage {
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement newOrgBtn;

	public OrgHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getNewOrgBtn() {
		return newOrgBtn;
	}
	
	/**
	 * this is the business library to click on new organization btn
	 */
	
	public void clickOnNeworgBtn()
	{
		newOrgBtn.click();
	}
	
	
}
