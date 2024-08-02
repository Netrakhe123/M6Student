package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage 
{
@FindBy(xpath ="//input[@name='accountname']")
private WebElement orgName;

@FindBy(xpath ="//input[@name='website']")
private WebElement webSite;

@FindBy(xpath ="//input[@name='employees']")
private WebElement empNo;

@FindBy(xpath ="//input[@name='phone']")
private WebElement phnNo;

@FindBy(xpath ="//input[@name='otherphone']")
private WebElement otherPhnNo;

@FindBy(xpath ="//input[@name='email1']")
private WebElement emailId;

@FindBy(xpath ="//textarea[@name='bill_street']")
private WebElement billingAddress;

@FindBy(xpath ="//input[@name='bill_city']")
private WebElement billingCity;

@FindBy(xpath ="//input[@name='bill_state']")
private WebElement billingState;

@FindBy(xpath ="//input[@title='Save [Alt+S]']")
private WebElement saveBtn;

public CreateOrganizationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getOrgName()
{
	return orgName;
}

public WebElement getWebsiteName()
{
	return webSite;
}

public WebElement getEmployees()
{
	return empNo;
}

public WebElement getPhoneno()
{
	return phnNo;
}

public WebElement getotherPhone()
{
	return otherPhnNo;
}

public WebElement getEmail()
{
	return emailId;
}

public WebElement getBillingAdress()
{
	return billingAddress;
}

public WebElement getBillingCity()
{
	return billingCity;
}

public WebElement getBillingState()
{
	return billingState;
}

public WebElement getSaveButton()
{
	return saveBtn;
}

/**
 * Business lib to create new organization with mandatory fields
 * @parm orgname
 * @param website
 * @param employees
 */

public void createOrganization(String orgname, String website, String employees)
{
	orgName.sendKeys(orgname);
	webSite.sendKeys(website);
	empNo.sendKeys(employees);
	saveBtn.click();
}

/**
 * Business lib to create organizatioN
 *  @parm orgname
 * @param website
 * @param phone
 *  @parm otherphone
 * @param mailId
 * @param BAD
 * @param BS
 * @param cty
 */
public void createOrganization(String orgname, String website, String employees, String phno, String ophno, 
		String id, String BAD, String BS, String cty)
{
	orgName.sendKeys(orgname);
	webSite.sendKeys(website);
	empNo.sendKeys(employees);
	saveBtn.click();
	phnNo.sendKeys(phno);
	otherPhnNo.sendKeys(ophno);
	emailId.sendKeys(id);
	billingAddress.sendKeys(BAD);
	billingCity.sendKeys(BS);
	saveBtn.click();
}

/**
* Business lib of the employee shipping address
*  @parm orgname
* @param website
* @param emp
* @param BAD
* @param BS
* @param cty
*/
public void createOrganization(String orgname, String website, String employees, String BAD, String BS, String cty)
{
	orgName.sendKeys(orgname);
	webSite.sendKeys(website);
	empNo.sendKeys(employees);
	billingAddress.sendKeys(BAD);
	billingCity.sendKeys(BS);
	billingState.sendKeys(BS);
	saveBtn.click();
}

/**
 * Business lib to create new organization with e adress
 *  @parm orgname
 * @param website
 * @param phone
 *  @parm otherphone
 * @param mailId
 */
public void createOrganization(String orgname, String website, String phno, String ophno, String id)
{
	orgName.sendKeys(orgname);
	webSite.sendKeys(website);
	phnNo.sendKeys(phno);
	otherPhnNo.sendKeys(id);
	emailId.sendKeys(id);
	saveBtn.click();
	}
}
