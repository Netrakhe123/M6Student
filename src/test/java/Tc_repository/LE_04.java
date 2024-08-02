package Tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtility.Baseclass;
import genericLibOrUtility.ExcelUtility;
import objectRepository.CreatingNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadPage;

public class LE_04 extends Baseclass
{

	@Test(groups = {"smoke","regression"})
	public void le04Tc() throws Exception
	{
		ExcelUtility EUTIL = new ExcelUtility();
		String FNAME = EUTIL.readDataFromExcel("Leads", 11, 1);
		String LNAME = EUTIL.readDataFromExcel("Leads", 11, 2);
		String CNAME = EUTIL.readDataFromExcel("Leads", 11, 3);
		String ST = EUTIL.readDataFromExcel("Leads", 11, 4);
		String POBOX = EUTIL.readDataFromExcel("Leads", 11, 5);
		String PCode = EUTIL.readDataFromExcel("Leads", 11, 6);
		String City = EUTIL.readDataFromExcel("Leads", 11, 7);
		String Country = EUTIL.readDataFromExcel("Leads", 11, 8);
		String State = EUTIL.readDataFromExcel("Leads", 11, 8);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadPage lp = new LeadPage(driver);
		lp.clickOnCreateLeadButton();
		
		CreatingNewLeadPage CNL = new CreatingNewLeadPage(driver);
		CNL.createLead(FNAME, LNAME, CNAME, ST, POBOX, PCode, City, Country, State);
		System.out.println("LE04 execution successfull!!");
		Thread.sleep(3000);
}
}

