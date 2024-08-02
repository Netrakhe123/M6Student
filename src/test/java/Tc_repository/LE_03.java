package Tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtility.Baseclass;
import genericLibOrUtility.ExcelUtility;
import objectRepository.CreatingNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadPage;

public class LE_03 extends Baseclass
{
	@Test
	public void le03Tc() throws Exception
	{
		ExcelUtility EUTIL = new ExcelUtility();
		String FNAME = EUTIL.readDataFromExcel("Leads", 8, 1);
		String LNAME = EUTIL.readDataFromExcel("Leads", 8, 2);
		String CNAME = EUTIL.readDataFromExcel("Leads", 8, 3);
		String Title = EUTIL.readDataFromExcel("Leads", 8, 4);
		String Phone = EUTIL.readDataFromExcel("Leads", 8, 5);
		String Mobile = EUTIL.readDataFromExcel("Leads", 8, 6);
		String Email = EUTIL.readDataFromExcel("Leads", 8, 7);
		String NOE = EUTIL.readDataFromExcel("Leads", 8, 8);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadPage lp = new LeadPage(driver);
		lp.clickOnCreateLeadButton();
		
		CreatingNewLeadPage CNL = new CreatingNewLeadPage(driver);
		CNL.createLead(FNAME, LNAME, CNAME, Title, Phone, Mobile, 
				Email, NOE);
		System.out.println("LE03 execution successfull!!");
		Thread.sleep(3000);
}
}