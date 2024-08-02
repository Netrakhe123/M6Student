package genericLibOrUtility;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * This class is for properties utility
 * @Dell Ramya
 */

public class PropertiesUtility
{
	/**
	 * This method is generic method to fetch data from properties file
	 * @param data
	 * @return
	 * @throws Exception
	 */

	public String getDataFromProperties(String data) throws Exception
	{
		FileInputStream fis=new FileInputStream(IconstantUtility.propertiesPath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(data);
		return value;
}
}
