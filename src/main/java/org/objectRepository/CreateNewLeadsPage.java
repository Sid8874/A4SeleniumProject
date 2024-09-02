package org.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadsPage {
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement title;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement no_of_employee;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement street;
	
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement poBox;
	
	@FindBy(xpath="//input[@name='code']")
	private WebElement postalCode;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement state;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement saveBtn;

	/**
	 * constructor for initialization
	 * @param driver
	 */
	public CreateNewLeadsPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getNo_of_employee() {
		return no_of_employee;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getPoBox() {
		return poBox;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	/**
	 * Business Library for TC-01
	 * @param fname
	 * @param lname
	 * @param comp
	 */
	public void createLeads(String fname,String lname,String comp)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		saveBtn.click();
	}
	
	/**
	 * Business Library for TC-02
	 */
	
	public void createLeads(String fname,String lname,String comp,String desg,String phno,String mob,String mailID,String noe,String strt,String postalBox,String pCode,String cty,String cntry,String st)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		title.sendKeys(desg);
		phone.sendKeys(phno);
		mobile.sendKeys(mob);
		email.sendKeys(mailID);
		no_of_employee.sendKeys(noe);
		street.sendKeys(strt);
		poBox.sendKeys(postalBox);
		postalCode.sendKeys(pCode);
		city.sendKeys(cty);
		country.sendKeys(cntry);
		state.sendKeys(st);
		saveBtn.click();
	}
	
	/**
	 * Business logic for TC-03
	 */
	public void createLeads(String fname,String lname,String comp,String desg,String phno,String mob,String mailID,String noe)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		title.sendKeys(desg);
		phone.sendKeys(phno);
		mobile.sendKeys(mob);
		email.sendKeys(mailID);
		no_of_employee.sendKeys(noe);
		saveBtn.click();
	}
	
	/**
	 * Business logic for TC-04
	 */
	
	public void createLeads(String fname,String lname,String comp,String strt,String postalBox,String pCode,String cty,String cntry,String st)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		street.sendKeys(strt);
		poBox.sendKeys(postalBox);
		postalCode.sendKeys(pCode);
		city.sendKeys(cty);
		country.sendKeys(cntry);
		state.sendKeys(st);
		saveBtn.click();
	}
		
}
