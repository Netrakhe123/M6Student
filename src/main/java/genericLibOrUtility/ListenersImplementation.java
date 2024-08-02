package genericLibOrUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListenersImplementation implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"execution starts!!");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"execution successfull!!");	
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
	/*	try {
			sutil.captureScreenshot("\\ScreenshotFolder", methodName + ".png");
		}
		catch (Exception e) 
		{
			
		}*/
	
TakesScreenshot ts = (TakesScreenshot) Baseclass.driver;
 File src = ts.getScreenshotAs(OutputType.FILE);
File dest = new File("\\ScreenshotFolder", methodName + ".png");
 try
 {
 Files.copy(src, dest);
 } 
 catch (IOException e) 
 {
   //TODO auto - generated catch block
   e.printStackTrace();
 }
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName + " execution skip");
	}

}
