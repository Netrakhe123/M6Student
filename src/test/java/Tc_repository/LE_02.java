package Tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtility.Baseclass;
import genericLibOrUtility.ExcelUtility;
import objectRepository.CreatingNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadPage;

public class LE_02 extends Baseclass 
{
	@Test
	public void le02Tc() throws Exception
	{
		ExcelUtility EUTIL = new ExcelUtility();
		String FNAME = EUTIL.readDataFromExcel("Leads", 5, 1);
		String LNAME = EUTIL.readDataFromExcel("Leads", 5, 2);
		String CNAME = EUTIL.readDataFromExcel("Leads", 5, 3);
		String Title = EUTIL.readDataFromExcel("Leads", 5, 4);
		String Phone = EUTIL.readDataFromExcel("Leads", 5, 5);
		String Mobile = EUTIL.readDataFromExcel("Leads", 5, 6);
		String Email = EUTIL.readDataFromExcel("Leads", 5, 7);
		String NOE = EUTIL.readDataFromExcel("Leads", 5, 8);
		String St = EUTIL.readDataFromExcel("Leads", 5, 9);
		String POBOX = EUTIL.readDataFromExcel("Leads", 5, 10);
		String PCode = EUTIL.readDataFromExcel("Leads", 5, 11);
		String City = EUTIL.readDataFromExcel("Leads", 5, 12);
		String Country = EUTIL.readDataFromExcel("Leads", 5, 13);
		String State = EUTIL.readDataFromExcel("Leads", 5, 14);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadPage lp = new LeadPage(driver);
		lp.clickOnCreateLeadButton();
		
		CreatingNewLeadPage CNL = new CreatingNewLeadPage(driver);
		CNL.createLead(FNAME, LNAME, CNAME, Title, Phone, Mobile, 
				Email, NOE, St, POBOX, PCode, City, Country, State);
		System.out.println("LE02 execution successfull!!");
		Thread.sleep(3000);

	}
}
