package sample_Repo;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibOrUtility.Baseclass;

//go to Listenersimplimentation click on Listenersimplimentation from class right click
//  copy qualified name.

@Listeners(genericLibOrUtility.ListenersImplementation.class)

public class Sample1 extends Baseclass
{
	@Test
	public void loginOperationCrossCheck()
	{
         driver.findElement(By.xpath("hhshjjjjfdd")).click();
	}
}

