package TC_Repo;

import org.objectRepository.CreateNewLeadsPage;
import org.objectRepository.HomePage;
import org.objectRepository.LeadsHomePage;
import org.testng.annotations.Test;

import generic_Utility.BaseClass;
import generic_Utility.Excel_Utility;
import generic_Utility.JavaUtility;

public class LE_04 extends BaseClass{
	
	@Test
	public void le_04() throws Exception {
		JavaUtility jutil = new JavaUtility();
		int num = jutil.getRandomNumber(1000);
		Excel_Utility eutil = new Excel_Utility();
		
		String FirstName = eutil.getIndividualTestDate("Leads", 11, 1);
		String LastName = eutil.getIndividualTestDate("Leads", 11, 2);
		String Company = eutil.getIndividualTestDate("Leads", 11, 3);
		String Street= eutil.getIndividualTestDate("Leads", 11, 4);
		String PostBox = eutil.getIndividualTestDate("Leads", 11, 5);
		String PostalCode = eutil.getIndividualTestDate("Leads", 11, 6);
		String City = eutil.getIndividualTestDate("Leads", 11, 7);
		String Country = eutil.getIndividualTestDate("Leads", 11, 8);
		String State = eutil.getIndividualTestDate("Leads", 11, 9);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadsPage cn = new CreateNewLeadsPage(driver);
		cn.createLeads(FirstName+num,LastName,Company,Street,PostalCode,PostBox,City,Country, State);
		Thread.sleep(3000);
	}
}
