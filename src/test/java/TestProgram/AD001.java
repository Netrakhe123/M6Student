package TestProgram;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ecomerce.predator.Baseclass;
import com.ecomerce.predator.ExcelUtility;

public class AD001 extends Baseclass
{
@Test
public void Tc01() throws Exception 
{
	/*read data from excel*/
	ExcelUtility EUTIL = new ExcelUtility();
	String TcUsername  = EUTIL.getDataFromExcel("Admin",1,1);
	String EMPNAME     = EUTIL.getDataFromExcel("Admin",1,2);
	driver.findElement(By.xpath("//span[text()='Admin']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[contains(@class,'oxd')])[2]")).sendKeys(TcUsername);
	driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(EMPNAME);
	driver.findElement(By.xpath("//button[.=' Search ']")).click();
	System.out.println("Tc01 executed successfully!!");
	}
}

