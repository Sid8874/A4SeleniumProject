package generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class GenUtility {
	
	public String getGeneralUtility(String data) throws Exception
	{

		FileInputStream fis=new FileInputStream("C:\\selenium\\vtiger.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(data);
		return value;
		
	}

}
