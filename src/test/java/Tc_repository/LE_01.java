package Tc_repository;
import org.testng.annotations.Test;
import genericLibOrUtility.Baseclass;
import genericLibOrUtility.ExcelUtility;
import objectRepository.CreatingNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadPage;
public class LE_01 extends Baseclass 
{
    @Test(groups = {"smoke"})
	public void le01Tc() throws Exception
	{
		ExcelUtility EUTIL = new ExcelUtility();
		String FNAME = EUTIL.readDataFromExcel("Leads", 2, 1);
		String LNAME = EUTIL.readDataFromExcel("Leads", 2, 2);
		String CNAME = EUTIL.readDataFromExcel("Leads", 2, 3);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadPage lp = new LeadPage(driver);
		lp.clickOnCreateLeadButton();
		
		CreatingNewLeadPage CNL = new CreatingNewLeadPage(driver);
		CNL.createLead(FNAME, LNAME, CNAME);
		System.out.println("LE01 execution successfull!!");
		Thread.sleep(4000);
		}
}
