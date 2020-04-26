import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	@FindBy(xpath ="/html/body/table[2]/tbody/tr/td[2]/div/h1")
	WebElement homePageUsername;
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageUsername() {
		return homePageUsername.getText();
	}
}
