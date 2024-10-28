package pomtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="Email")
	public WebElement email;
    @FindBy(id="Password")
    public 	WebElement password;
    @FindBy(name="RememberMe")
    public WebElement remember;
    @FindBy(css="input[value='Log in']")
    public WebElement loginbutton;
    
	
	
	
	
	
    public LoginPage (WebDriver driver) {
    	PageFactory.initElements( driver,this);
         }
	
	
	
	}
