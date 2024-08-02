package TestProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ecomerce.predator.PropertiesUtility;

public class LoginActitimeByUsingPropertiesData 
{

public static void main(String[] args) throws Exception
{
	/*fetch data from Properties utility*/
	PropertiesUtility PUTIL=new PropertiesUtility();
	String USERNAME = PUTIL.getValueFromProperties("Username");
	String PASSWORD = PUTIL.getValueFromProperties("Password");
	String URL      = PUTIL.getValueFromProperties("url");
	/*launch the browser*/
    WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(URL);
	driver.manage().window().maximize();
	/*login to the application by using the properties file data*/
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(USERNAME,Keys.TAB,PASSWORD,Keys.ENTER);
	}
}
