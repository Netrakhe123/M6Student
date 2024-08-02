package genericLibOrUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
/*
 * this class will only run if any test case is fail.
 * we intentionally failed contact TC  by giving wrong path in contact class.
 */
public class RetryAnalyzerImplementation implements IRetryAnalyzer
{
int count=1;
int retryCount=3;
@Override
public boolean retry(ITestResult result)
{
	while(count<=retryCount)
	{
		count++;
		return true;
	}
	return false;
}
}
