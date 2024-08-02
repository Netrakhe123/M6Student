package Tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtility.Baseclass;
import genericLibOrUtility.ExcelUtility;
import genericLibOrUtility.JavaLibrary;
import objectRepository.CreateOrganizationPage;
import objectRepository.HomePage;
import objectRepository.OrgranizationPage;

public class ORG_03 extends Baseclass
{
@Test
public void org_03() throws Exception
{	
JavaLibrary JUTIL = new JavaLibrary();
int num = JUTIL.generateRandomNumber(10000);
ExcelUtility EUTIL = new ExcelUtility();
String ORGNAME = EUTIL.readDataFromExcel("Organization", 8, 1);
String WEBSITE = EUTIL.readDataFromExcel("Organization", 8, 2);
String BILLADD = EUTIL.readDataFromExcel("Organization", 8, 3);
String BILLCITY = EUTIL.readDataFromExcel("Organization", 8, 4);
String STATE = EUTIL.readDataFromExcel("Organization", 8, 5);

HomePage HP = new HomePage(driver);
HP.clickOnorg();

OrgranizationPage OP = new OrgranizationPage(driver);
OP.clickOnCreateOrgButton();

CreateOrganizationPage COP = new CreateOrganizationPage(driver);
COP.createOrganization(ORGNAME+num, WEBSITE, BILLADD, BILLADD, BILLCITY, STATE);

System.out.println("org_03 passed!!");
Thread.sleep(4000);

}
}
