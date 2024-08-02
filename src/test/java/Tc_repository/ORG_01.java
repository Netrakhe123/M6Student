package Tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtility.Baseclass;
import genericLibOrUtility.ExcelUtility;
import genericLibOrUtility.JavaLibrary;
import objectRepository.CreateOrganizationPage;
import objectRepository.HomePage;
import objectRepository.OrgranizationPage;

public class ORG_01 extends Baseclass
{
	@Test(groups = {"regression","sanity"})
public void org_01() throws Exception
{	
JavaLibrary JUTIL = new JavaLibrary();
int num = JUTIL.generateRandomNumber(10000);
ExcelUtility EUTIL = new ExcelUtility();
String ORGNAME = EUTIL.readDataFromExcel("Organization", 2, 1);
String WEBSITE = EUTIL.readDataFromExcel("Organization", 2, 2);
String EMP = EUTIL.readDataFromExcel("Organization", 2, 3);

HomePage HP = new HomePage(driver);
HP.clickOnorg();

OrgranizationPage OP = new OrgranizationPage(driver);
OP.clickOnCreateOrgButton();

CreateOrganizationPage COP = new CreateOrganizationPage(driver);
COP.createOrganization(ORGNAME+num, WEBSITE, EMP);
System.out.println("org_01 passed!!");
Thread.sleep(4000);
}
}
