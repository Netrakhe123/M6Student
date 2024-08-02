package sample_Repo;

import org.testng.annotations.Test;
/*
* If we want to crate dependency in B/w multiple TC we have to use an attribute called as
*  "dependsOnMethods"
@Test(dependsOnMethods = {"createUser"})
*/
public class Program3 
{
	@Test(priority=1)
	
	public void createUser()
	 {
		 System.out.println("CU"); 
		 
	 }
	 
	@Test(priority =2, dependsOnMethods = {"createUser"})
	public void ModifyUser()
	 {
		 System.out.println("MU"); 
		 
	 }
	 
}
