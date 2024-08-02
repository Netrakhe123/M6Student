package TestProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.ecomerce.predator.Baseclass;
import com.ecomerce.predator.ExcelUtility;

public class PI001 extends Baseclass
{
	@Test
	public void pi001() throws Exception 
	{
		/*read data from excel*/
		ExcelUtility EUTIL = new ExcelUtility();
		String EMPNAME  = EUTIL.getDataFromExcel("PIM",1,1);
		String EMPID    = EUTIL.getDataFromExcel("PIM",1,2);
		String SUPERNAME= EUTIL.getDataFromExcel("PIM",1,3);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@placeholder=\"Type for hints...\"])[1]")).sendKeys(EMPNAME,Keys.TAB,EMPID);
		/*(//input[@class='oxd-input oxd-input--active'])[2]----> empid*/
		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[2]")).sendKeys(SUPERNAME);
		System.out.println("PI001 executed successfully!!");
	}
}
