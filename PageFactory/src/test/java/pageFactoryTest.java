import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pageFactoryTest {

	WebDriver driver;
	login objLogin;
	loginPage objhomePage;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "B:/下载软件/火狐/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.testfire.net/bank/main.jsp");
	}

	@Test
	public void test() {
		objLogin = new login(driver);
		String loginPageTitle = objLogin.getLoginTitle();
		Assert.assertTrue(loginPageTitle.contains("Online Banking Login"));
		objLogin.oPlogin("admin", "admin");
		objhomePage = new loginPage(driver);
		Assert.assertTrue(objhomePage.getHomePageUsername().contains("Hello Admin User"));
	}

}
