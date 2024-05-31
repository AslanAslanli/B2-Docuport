package app.docuport.pages.Docuport;

import app.docuport.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

import javax.print.Doc;

public class DocuportBasePage {

    public DocuportBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
