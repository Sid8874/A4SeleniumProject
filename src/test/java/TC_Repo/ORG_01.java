package TC_Repo;

import org.objectRepository.CreateNewLeadsPage;
import org.objectRepository.CreateNewOrgPage;
import org.objectRepository.HomePage;
import org.objectRepository.LeadsHomePage;
import org.objectRepository.OrgHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic_Utility.BaseClass;
import generic_Utility.Excel_Utility;
import generic_Utility.JavaUtility;

public class ORG_01 extends BaseClass {
	
	@Test
	public void org_01Case() throws Exception{
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		Excel_Utility EUTIL=new Excel_Utility();
		
		String ORGNAME=EUTIL.getIndividualTestDate("Organization",1,1);
		String WEBSITE=EUTIL.getIndividualTestDate("Organization",1,2);
		String EMPLOYEE=EUTIL.getIndividualTestDate("Organization",1,3);
		
		HomePage hp =new HomePage(driver);
		hp.clickOnOrg();
		OrgHomePage ohp=new OrgHomePage(driver);
		ohp.clickOnNeworgBtn();
		CreateNewOrgPage cop=new CreateNewOrgPage(driver);
		cop.createOrganization(ORGNAME+num, WEBSITE, EMPLOYEE);
		Thread.sleep(3000);
		
		System.out.println("Organization TestCase-->01 done successfully!!");
		
		
		
	}

}
