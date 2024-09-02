  package generic_Utility;
import org.objectRepository.HomePage;
import org.objectRepository.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public static WebDriver driver=null;
	SeleniumUtility SUTIL=null;
	Properties_Utility PUTIL=new Properties_Utility();
	
	@BeforeSuite(alwaysRun=true)
	public void createConnection() {
		System.out.println("connection established!!");
	}
	
	@BeforeClass(alwaysRun=true)
	public void launchBrowser() throws Exception {
		String URL=PUTIL.getDataFromProperties("url");
		SUTIL=new SeleniumUtility();
		driver=new ChromeDriver();
		SUTIL.implicitWait(driver,10);
		SUTIL.maximizeWindow(driver,0);
		driver.get(URL);
		System.out.println("launching Successfully!!");
	}
	
	@BeforeMethod
	public void  loginApp() throws Exception {
		String USERNAME = PUTIL.getDataFromProperties("username");
		String PASSWORD = PUTIL.getDataFromProperties("password");
		LoginPage lp = new LoginPage(driver);
		lp.loginOperation(USERNAME, PASSWORD);
		System.out.println("Login Successfully!!");
	}
	
	@AfterMethod(alwaysRun=true)
	public void logoutApp() throws Exception {
		HomePage hp=new HomePage(driver);
		hp.logoutOperation(driver);
		System.out.println("Logout Successfully!!");
	}
	
	@AfterClass(alwaysRun=true)
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser closed Successfully!!");
	}
	
	@AfterSuite(alwaysRun=true)
	public void closeConnection() {
		System.out.println("connection closed Successful!!");
	}
}
