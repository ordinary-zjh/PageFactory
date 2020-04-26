import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	WebDriver driver;
	@FindBy(id="uid")
	WebElement username;
	@FindBy(id="passw")
	WebElement userpassword;
	@FindBy(xpath = "/html/body/table/tbody/tr[2]/td[2]/div/h1")
	WebElement titleText;
	@FindBy(name="btnSubmit")
	WebElement login;
	
	public login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String edUsername) {
		username.sendKeys(edUsername);
	}
	
	public void setPssd(String edUerpssd) {
		userpassword.sendKeys(edUerpssd);
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public String getLoginTitle() {
		return titleText.getText();
	}


	public void oPlogin(String edUsername,String edPssd) {
		this.setUsername(edUsername);
		this.setPssd(edPssd);
		this.clickLogin();
	}
}
