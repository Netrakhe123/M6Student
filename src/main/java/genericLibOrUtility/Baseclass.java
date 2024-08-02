package genericLibOrUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class Baseclass 
{
public PropertiesUtility PUTIL=new PropertiesUtility();
public SeleniumUtility SUTIL=new SeleniumUtility();
public static WebDriver driver=null;

@BeforeSuite(alwaysRun=true)
public void CreatedConnection()

{
	System.out.println("Db Connection Successfull!!");
}

@Parameters({"browser"})
@BeforeClass(alwaysRun=true)
public void LaunchingBrowser(String browser) throws Exception
{
 PUTIL = new PropertiesUtility();	
 String URL=PUTIL.getDataFromProperties("url");
 if(browser.equals("chrome"))
 { 
	 driver = new ChromeDriver();
	 System.out.println("chrome started");
 }
 else if(browser.equals("Edge"))
 {
	 driver = new EdgeDriver(); 
	 System.out.println("Edge started");
 }
 SUTIL.implicitWait(driver,10);
 SUTIL.maximizeWindow(driver);
 driver.get(URL);	 
// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.manage().window().maximize();
 System.out.println("Launching Sucessfully!!");
}

@BeforeMethod(alwaysRun=true)
public void loginoperation() throws Exception
{
String USERNAME = PUTIL.getDataFromProperties("Username");
String PASSWORD = PUTIL.getDataFromProperties("Password");
LoginPage LP = new LoginPage(driver);
LP.loginOperation(USERNAME, PASSWORD);
//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(USERNAME,Keys.TAB,PASSWORD,Keys.ENTER);
System.out.println("Login Sucessfully!!");
}

@AfterMethod(alwaysRun=true)
public void logoutoperation()
{
	HomePage hp = new HomePage(driver);
	hp.logoutOperation(driver);
//driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
//driver.findElement(By.xpath("//a[.='logout']")).click();
System.out.println("Logout Sucessfully!!");
}

@AfterClass(alwaysRun=true)
public void closeBrowser()
{
	//driver.quit();
	driver.close();
	System.out.println("Browser closed Sucessfully!!");	
}

@AfterSuite(alwaysRun=true)
public void closedbConnection()
{
	System.out.println("Db connection closed Sucessfully!!");	
}
}
