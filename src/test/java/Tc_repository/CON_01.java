package Tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtility.Baseclass;
import genericLibOrUtility.ExcelUtility;
import genericLibOrUtility.JavaLibrary;
import objectRepository.ContactPage;
import objectRepository.CreateNewContact;
import objectRepository.HomePage;
//import objectRepository.OrgranizationPage;

public class CON_01 extends Baseclass
{
	@Test
public void con_01() throws Exception
{
	JavaLibrary JLIB = new JavaLibrary();
	int num = JLIB.generateRandomNumber(10000);
	ExcelUtility EUTIL = new ExcelUtility();
	String FNAME = EUTIL.readDataFromExcel("Contact", 2, 1);
	String LNAME = EUTIL.readDataFromExcel("Contact", 2, 2);
	String TITLE = EUTIL.readDataFromExcel("Contact", 2, 3);

	HomePage HP = new HomePage(driver);
	HP.clickOnContacts();

	ContactPage CP = new ContactPage(driver);
	CP.clickOnCreatecontactButton();
	
	CreateNewContact CNC = new CreateNewContact(driver);
	CNC.createContact(FNAME+num, LNAME, TITLE);
	Thread.sleep(3000);
}
}
