package TestProgram;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.ecomerce.predator.Baseclass;
import com.ecomerce.predator.ExcelUtility;

public class CL001 extends Baseclass
{
@Test
public void Cl001() throws Exception 
{
	/*read data from excel*/
	ExcelUtility EUTIL = new ExcelUtility();
	String EMPNAME  = EUTIL.getDataFromExcel("Claim",1,1);
	String EMPID    = EUTIL.getDataFromExcel("Claim",1,2);
	driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[11]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys(EMPNAME);
	/*(//input[@class='oxd-input oxd-input--active'])[2]----> empid*/
	driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[2]")).sendKeys(EMPID);
	System.out.println("CL001 executed successfully!!");
}
}

