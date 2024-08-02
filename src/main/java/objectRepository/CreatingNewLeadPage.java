
package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this is createLead class
 * @author Netra
 * @version 7.1.24
 */

public class CreatingNewLeadPage 
{
@FindBy(xpath = "//input[@name='firstname']")
private WebElement firstname;

@FindBy(xpath = "//input[@name='lastname']")
private WebElement lastname;

@FindBy(xpath = "//input[@name='company']")
private WebElement company;

@FindBy(xpath = "//input[@name='designation']")
private WebElement title;

@FindBy(xpath = "//input[@name='phone']")
private WebElement phoneNo;

@FindBy(xpath = "//input[@name='mobile']")
private WebElement mobileNo;

@FindBy(xpath = "//input[@name='email']")
private WebElement email;

@FindBy(xpath = "//input[@name='noofemployees']")
private WebElement noOfEmp;

@FindBy(xpath = "//textarea[@name='lane']")
private WebElement street;

@FindBy(xpath = "//input[@name='pobox']")
private WebElement poBox;

@FindBy(xpath = "//input[@name='code']")
private WebElement postalCode;

@FindBy(xpath = "//input[@name='city']")
private WebElement city;

@FindBy(xpath = "//input[@name='country']")
private WebElement country;

@FindBy(xpath = "//input[@name='state']")
private WebElement state;

@FindBy(xpath ="//input[@title='Save [Alt+S]']")
private WebElement saveBtn;

/**
 * this is constructor 
 * @param driver
 */

public CreatingNewLeadPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

/**
 * these are getters
 * @return
 */
public WebElement getFirstname()
{
	return firstname;
}

public WebElement getLastname()
{
	return lastname;
}

public WebElement getCompany()
{
	return company;
}

public WebElement getEmployees()
{
	return noOfEmp;
}

public WebElement getTitle()
{
	return title;
}

public WebElement getMobNo()
{
	return mobileNo;
}

public WebElement getPhoneno()
{
	return phoneNo;
}

public WebElement getEmail()
{
	return email;
}

public WebElement getStreet()
{
	return street;
}

public WebElement getPostalcode()
{
	return postalCode;
}

public WebElement getCountry()
{
	return country;
}

public WebElement getPobox()
{
	return poBox;
}

public WebElement getCity()
{
	return city;
}

public WebElement getState()
{
	return state;
}

public WebElement getSaveBtton()
{
	return saveBtn;
}

/**
 * Business logic for employee name
 * @param fname
 * @param lname
 * @param comp
 */

public void createLead(String fname, String lname, String comp)
{
	firstname.sendKeys(fname);
	lastname.sendKeys(lname);
	company.sendKeys(comp);
	saveBtn.click();
}

/**
 * this is business library to create lead page with employee email address
 * @param fname
 * @param lname
 * @param comp
 * @param desi
 * @param phono
 * @param mob
 * @param mailid
 * @param employee
 * @param street
 * @param pb
 * @param postcode
 * @param stat
 * @param cty
 * @param cntry
 */
public void createLead(String fname, String lname, String comp, String desg, String phNo, String mob,
		String mailId, String employees, String strt, String pb, String pc, String cty, 
		String st, String cntry )
{
	firstname.sendKeys(fname);
	lastname.sendKeys(lname);
	company.sendKeys(comp);
	title.sendKeys(desg);
	phoneNo.sendKeys(phNo);
	mobileNo.sendKeys(mob);
	email.sendKeys(mailId);
	noOfEmp.sendKeys(employees);
	street.sendKeys(strt);
	poBox.sendKeys(pb);
	postalCode.sendKeys(pc);
	city.sendKeys(cty);
	state.sendKeys(st);
	country.sendKeys(cntry);
	saveBtn.click();
}

/**
 * this is business library to create lead page with e address
 * @param fname
 * @param lname
 * @param desg
 * @param phNo
 * @param mob
 * @param maildId
 * @param employees
 */
public void createLead(String fname, String lname, String desi, String phNo,
		String mob, String mailId, String employee)
{
	firstname.sendKeys(fname);
	lastname.sendKeys(lname);
	title.sendKeys(desi);
	phoneNo.sendKeys(phNo);
	mobileNo.sendKeys(mob);
	email.sendKeys(mailId);
	noOfEmp.sendKeys(employee);
	saveBtn.click();
} 

/** 
 * this is business library to create lead with employee creds
 * @param fname
 * @param lname
 * @param comp
 * @param street
 * @param pb
 * @param postcode
 * @param stat
 * @param cty
 * @param cntry
 */
public void createLead(String fname, String lname, String comp, String strt, String pb, String pc, 
		String cty, String st, String cntry )
{
	firstname.sendKeys(fname);
	lastname.sendKeys(lname);
	company.sendKeys(comp);
	street.sendKeys(strt);
	poBox.sendKeys(pb);
	postalCode.sendKeys(pc);
	city.sendKeys(cty);
	state.sendKeys(st);
	country.sendKeys(cntry);
	saveBtn.click();
}

}













