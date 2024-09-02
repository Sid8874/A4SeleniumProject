package TC_Repo;

import org.objectRepository.CreateNewLeadsPage;
import org.objectRepository.HomePage;
import org.objectRepository.LeadsHomePage;
import org.testng.annotations.Test;

import generic_Utility.BaseClass;
import generic_Utility.Excel_Utility;
import generic_Utility.JavaUtility;

public class LE_02 extends BaseClass {

	@Test
	public void  le_02Case() throws Exception {
		JavaUtility jutil = new JavaUtility();
		int num = jutil.getRandomNumber(1000);
		Excel_Utility eutil = new Excel_Utility();
		
		String FirstName = eutil.getIndividualTestDate("Leads", 5, 1);
		String LastName = eutil.getIndividualTestDate("Leads", 5, 2);
		String Company = eutil.getIndividualTestDate("Leads", 5, 3);
		String Title = eutil.getIndividualTestDate("Leads", 5, 4);
		String Phone = eutil.getIndividualTestDate("Leads", 5, 5);
		String Mobile= eutil.getIndividualTestDate("Leads", 5, 6);
		String Email = eutil.getIndividualTestDate("Leads", 5, 7);
		String NoE = eutil.getIndividualTestDate("Leads", 5, 8);
		String Street= eutil.getIndividualTestDate("Leads", 5, 9);
		String Post = eutil.getIndividualTestDate("Leads", 5, 10);
		String PostalCode = eutil.getIndividualTestDate("Leads", 5, 11);
		String City = eutil.getIndividualTestDate("Leads", 5, 12);
		String Country = eutil.getIndividualTestDate("Leads", 5, 13);
		String State = eutil.getIndividualTestDate("Leads", 5, 14);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadsPage cn = new CreateNewLeadsPage(driver);
		cn.createLeads(FirstName+num,LastName, Company, Title, Phone, Mobile,
				Email, NoE, Street, Post, PostalCode, City, Country, State);
		Thread.sleep(3000);
	}
}
