package sample_Repo;

import org.testng.annotations.Test;

public class Program2 
{
/*
 * 1. we can pass multiple attributes inside @Test parameters
 *    @Test(priority = 1, invoctionCount = 5)
 * 2. If we want to execute a TC multiple times we have to use "invocationCount = value"
 * 3. Default invocation count is "1"
 * 
 * Ignoring TC from execution : -
 * 1. Keep invocagtionCount = 0; ex: @Test(invocationCount=0)
 * 2. Use an attribute and value ex: @Test(enabled = false)
 * 3. Use "@Ignore" annotation
 */
 @Test(priority =1, invocationCount=5)	
 public void createUser()
 {
	 System.out.println("CU"); 
	 
 }
 
 @Test(priority =2, invocationCount=0)	
 public void ModifyUser()
 {
	 System.out.println("MU");
 }
 
 @Test(priority =3, invocationCount=3)	
 public void DeleteUser()
 {
	 System.out.println("DU");
 }
}
