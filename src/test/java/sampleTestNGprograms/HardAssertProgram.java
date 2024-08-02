package sampleTestNGprograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertProgram 
{
/*	
@Test
public void hardAsserStrictLevelComparison()
{
 String expercrtedValue = "raja";
 String actualValue = "Raja";
 Assert.assertEquals(actualValue, expecrtedValue);
 System.out.println("hard assertion pass!!");
 }
*/ 
	@Test
public void hardAssertContainsLevelComparison()
{
	 String expercrtedValue = "maharaja";
	 String actualValue = "raja";	
	 Assert.assertTrue(expercrtedValue.contains(actualValue));
	 System.out.println("hard assert contains level pass!!");
}
}