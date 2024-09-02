package org.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	
	@FindBy(xpath="name=\"accountname\"")
	private WebElement orgName;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement webSite;
	
	@FindBy(xpath="//input[@id='employees']")
	private WebElement employees;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phn;
	
	@FindBy(xpath="//input[@id='otherphone']")
	private WebElement otherPhn;
	
	@FindBy(xpath="//input[@id='email1']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='bill_street']")
	private WebElement bill_street;
	
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement bill_city;
	
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement billing_state;
	
	@FindBy(xpath="(//input[@class='crmbutton small save'])[2]")
	private WebElement saveBtn;
	
	

	public CreateNewOrgPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getWebSite() {
		return webSite;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getPhn() {
		return phn;
	}

	public WebElement getOtherPhn() {
		return otherPhn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBill_street() {
		return bill_street;
	}

	public WebElement getBill_city() {
		return bill_city;
	}

	public WebElement getBilling_state() {
		return billing_state;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	/**
	 * this is the business library to create an org for Tc-01
	 */
	public void createOrganization(String organization,String website,String employee)
	{
		orgName.sendKeys(organization);
		webSite.sendKeys(website);
		employees.sendKeys(employee);
		saveBtn.click();	
	}
	
	/**
	 * this is the business library to create an org for Tc-02
	 */
	public void createOrganization(String organization,String website,String employee,String phone,String otherphone,String Email)
	{
		orgName.sendKeys(organization);
		webSite.sendKeys(website);
		employees.sendKeys(employee);
		phn.sendKeys(phone);
		otherPhn.sendKeys(otherphone);
		email.sendKeys(Email);
	}
	
	/**
	 *  this is the business library to create an org for Tc-03
	 */
	public void createOrganization(String organization,String website,String billingAddress,String billingcity,String billingState)
	{
		orgName.sendKeys(organization);
		webSite.sendKeys(website);
		bill_street.sendKeys(billingAddress);
		bill_city.sendKeys(billingcity);
		billing_state.sendKeys(billingState);
		saveBtn.click();
		
	}
	
	/**
	 *  this is the business library to create an org for Tc-04
	 */
	public void createOrganization(String organization,String website,String employee,String phone,String otherphone,String Email,String billingAddress,String billingcity,String billingState)
	{
		orgName.sendKeys(organization);
		webSite.sendKeys(website);
		employees.sendKeys(employee);
		phn.sendKeys(phone);
		otherPhn.sendKeys(otherphone);
		email.sendKeys(Email);
		bill_street.sendKeys(billingAddress);
		bill_city.sendKeys(billingcity);
		billing_state.sendKeys(billingState);
		saveBtn.click();
	}


}
