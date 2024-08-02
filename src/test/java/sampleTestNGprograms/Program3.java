package sampleTestNGprograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program3 
{
	@Test(priority=1)
	public void createUser()
	{
		System.out.println("user created Successfully");
	}
	@Test(priority=2)
	public void modifyUser()
	{
		System.out.println("user modified Successfully");	
		Reporter.log("this method depends on createUser!!");
	}
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("user deleted Successfully");	
	}
}
