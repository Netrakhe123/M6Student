package Tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtility.Baseclass;
import genericLibOrUtility.ExcelUtility;
import genericLibOrUtility.JavaLibrary;
import objectRepository.CreateOrganizationPage;
import objectRepository.HomePage;
import objectRepository.OrgranizationPage;


public class ORG_04 extends Baseclass
{
    @Test(groups = {"smoke","sanity"})
	public void org_04() throws Exception
	{	
	JavaLibrary JUTIL = new JavaLibrary();
	int num = JUTIL.generateRandomNumber(10000);
	ExcelUtility EUTIL = new ExcelUtility();
	String ORGNAME = EUTIL.readDataFromExcel("Organization", 11, 1);
	String WEBSITE = EUTIL.readDataFromExcel("Organization", 11, 2);
	String EMP = EUTIL.readDataFromExcel("Organization", 11, 3);
	String PHN = EUTIL.readDataFromExcel("Organization", 11, 4);
	String OTHPHN = EUTIL.readDataFromExcel("Organization", 11, 5);
	String EMAIL = EUTIL.readDataFromExcel("Organization", 11, 6);
	String BILLADD = EUTIL.readDataFromExcel("Organization", 11, 7);
	String BILLCITY = EUTIL.readDataFromExcel("Organization", 11, 8);
	String BILLSTATE = EUTIL.readDataFromExcel("Organization", 11, 9);
	
	HomePage HP = new HomePage(driver);
	HP.clickOnorg();

	OrgranizationPage OP = new OrgranizationPage(driver);
	OP.clickOnCreateOrgButton();

	CreateOrganizationPage COP = new CreateOrganizationPage(driver);
	COP.createOrganization(ORGNAME+num, WEBSITE,EMP, PHN, OTHPHN, EMAIL,BILLADD, BILLCITY, BILLSTATE);
	System.out.println("org_04 passed!!");
	Thread.sleep(3000);
	}
}
