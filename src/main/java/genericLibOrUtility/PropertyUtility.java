package genericLibOrUtility;

import java.io.FileInputStream;
//import java.io.IOException;
import java.util.Properties;

public class PropertyUtility
{
public static void main(String[] args) throws Exception
{
// FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Desktop\\Selenium\\orange.properties");
//FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Documents\\Selenium\\M5TestCaseData.xlsxs");
	FileInputStream fis=new FileInputStream("C:\\Selenium\\VTigerCommonData.Properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String USERNAME=pobj.getProperty("Username");
	String PASSWORD=pobj.getProperty("Password");
	String URL=pobj.getProperty("url");
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	System.out.println(URL);
	}
}
