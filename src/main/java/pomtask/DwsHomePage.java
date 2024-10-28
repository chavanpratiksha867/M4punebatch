package pomtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsHomePage {
	
	
	
	//links 
		@FindBy(xpath = "//a[text()='Register']")
		public WebElement register_link;
		@FindBy(xpath = "//a[text()='Log in']")
		public WebElement login_link;
		@FindBy(xpath = "//a[text()='Shopping cart']")
		public WebElement Shopping_cart_link;
		@FindBy(xpath = "//a[text()='Wishlist']")
		public WebElement Wishlist_link;
		
		//logo
		@FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']")
		public WebElement logo;
		
		//community poll
		@FindBy(xpath="(//input[@name=\"pollanswers-1\"])[1]")
		public WebElement excellent_radio_btn;
		@FindBy(xpath = "(//input[@name=\"pollanswers-1\"])[2]")
		public WebElement good_radio_btn;
		@FindBy(xpath = "(//input[@name=\"pollanswers-1\"])[3]")
		public WebElement poor_radio_btn;
		@FindBy(xpath = "(//input[@name=\"pollanswers-1\"])[4]")
		public WebElement veryBad_radio_btn;
       

		public DwsHomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}


		
	
	
	
}
