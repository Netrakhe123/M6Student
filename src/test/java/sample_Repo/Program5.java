package sample_Repo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// SoftAssert 
public class Program5 
{

	@Test
		public void strictLevelComparison()
		{
			String expectedValue = "raja";
			String actualValue = "raja";  //Raja
			SoftAssert sf = new SoftAssert();
			sf.assertEquals(actualValue, expectedValue);
			System.out.println("assertion passed!!");
			sf.assertAll();
		}
		
		@Test
		public void containsLevel() 
		{
			String expectedValue = "raja";
			String actualValue = "Maharaja";    //MahaRaja
			SoftAssert sf = new SoftAssert();
			sf.assertTrue(actualValue.contains(expectedValue));
			System.out.println("contains passed!!");
			sf.assertAll();
		}
}
