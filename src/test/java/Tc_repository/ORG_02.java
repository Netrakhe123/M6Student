package Tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtility.Baseclass;
import genericLibOrUtility.ExcelUtility;
import genericLibOrUtility.JavaLibrary;
import objectRepository.CreateOrganizationPage;
import objectRepository.HomePage;
import objectRepository.OrgranizationPage;

public class ORG_02 extends Baseclass
{
    @Test(groups = {"sanity"})
	public void org_02() throws Exception
	{	
	JavaLibrary JUTIL = new JavaLibrary();
	int num = JUTIL.generateRandomNumber(10000);
	ExcelUtility EUTIL = new ExcelUtility();
	String ORGNAME = EUTIL.readDataFromExcel("Organization", 5, 1);
	String WEBSITE = EUTIL.readDataFromExcel("Organization", 5, 2);
	String EMP = EUTIL.readDataFromExcel("Organization", 5, 3);
	String PHN = EUTIL.readDataFromExcel("Organization", 5, 1);
	String OTHPHN = EUTIL.readDataFromExcel("Organization", 5, 2);
	String EMAIL = EUTIL.readDataFromExcel("Organization", 5, 3);
	

	HomePage HP = new HomePage(driver);
	HP.clickOnorg();

	OrgranizationPage OP = new OrgranizationPage(driver);
	OP.clickOnCreateOrgButton();

	CreateOrganizationPage COP = new CreateOrganizationPage(driver);
	COP.createOrganization(ORGNAME+num, WEBSITE, EMP, PHN, OTHPHN, EMAIL);
	System.out.println("org_02 passed!!");
	Thread.sleep(4000);
}
}