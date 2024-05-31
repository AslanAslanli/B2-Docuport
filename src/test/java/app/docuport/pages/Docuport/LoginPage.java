package app.docuport.pages.Docuport;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DocuportBasePage{

    @FindBy (xpath = "//label[.='Username or email']")
    public WebElement usernamePlaceholder;

    @FindBy (xpath = "//label[.='Password']")
    public WebElement passwordPlaceholder;

}
