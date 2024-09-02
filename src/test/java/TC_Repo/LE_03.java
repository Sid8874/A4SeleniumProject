package TC_Repo;

import org.objectRepository.CreateNewLeadsPage;
import org.objectRepository.HomePage;
import org.objectRepository.LeadsHomePage;
import org.testng.annotations.Test;

import generic_Utility.BaseClass;
import generic_Utility.Excel_Utility;
import generic_Utility.JavaUtility;

public class LE_03 extends BaseClass {

	@Test
	public void le_03() throws Exception {
	JavaUtility jutil = new JavaUtility();
	int num = jutil.getRandomNumber(1000);
	Excel_Utility eutil = new Excel_Utility();
	
	String FirstName = eutil.getIndividualTestDate("Leads", 8, 1);
	String LastName = eutil.getIndividualTestDate("Leads", 8, 2);
	String Company = eutil.getIndividualTestDate("Leads", 8, 3);
	String Title = eutil.getIndividualTestDate("Leads", 8, 4);
	String Phone = eutil.getIndividualTestDate("Leads", 8, 5);
	String Mobile= eutil.getIndividualTestDate("Leads", 8, 6);
	String Email = eutil.getIndividualTestDate("Leads", 8, 7);
	String NoE = eutil.getIndividualTestDate("Leads", 8, 8);
	
	HomePage hp = new HomePage(driver);
	hp.clickOnOnLeads();
	LeadsHomePage lp = new LeadsHomePage(driver);
	lp.clickOnNewLeadBtn();
	CreateNewLeadsPage cn = new CreateNewLeadsPage(driver);
	cn.createLeads(FirstName+num,LastName, Company, Title, Phone, Mobile, Email, NoE);
	Thread.sleep(3000);
}
}
