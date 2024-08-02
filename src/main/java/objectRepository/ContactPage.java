package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this is the POM class for createNewContactButton
 * @author DELL
 */
public class ContactPage 
{
@FindBy(xpath="//img[@title='Create Contact...']")
private WebElement createcontactbutton;

public ContactPage(WebDriver driver)
{
 PageFactory.initElements(driver, this);
}

public WebElement clickOnCreatecontactButton()             //getCreatecontactbutton
{
	return createcontactbutton;
}
}
