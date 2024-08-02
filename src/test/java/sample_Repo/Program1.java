package sample_Repo;

import org.testng.annotations.Test;

public class Program1
{
@Test(priority = 1)
public void CreateUser()
{
	System.out.println("CU");
}

@Test(priority = 2)
public void ModifyUser()
{
	System.out.println("MU");
}

@Test(priority = 3)
public void DeleteUser()
{
	System.out.println("DU");
}

}
