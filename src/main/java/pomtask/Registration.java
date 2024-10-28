package pomtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	
	@FindBy(className =  "ico-register")
	public WebElement register;
    @FindBy(id="small-searchterms")
    public 	WebElement search;
    @FindBy(name="Gender")
    public WebElement gender;
    @FindBy(id="FirstName")
    public WebElement firstname;
    @FindBy(id="LastName")
    public WebElement lastname;
    @FindBy(id="Email")
    public WebElement email ;
    @FindBy(name="Password")
    public WebElement password ;
    @FindBy(name="ConfirmPassword")
    public WebElement  confirmpassword;
    @FindBy(name="register-button")
    public WebElement registerbutton;
    public Registration(WebDriver driver) {
    	PageFactory.initElements( driver,this);
    	
    }
}
