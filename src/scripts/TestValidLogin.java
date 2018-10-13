package scripts;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseTest;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest {
	@Test
	public void testValidLogin(){
		
		Logger log = LogManager.getLogger(TestValidLogin.class.getName());
		log.debug("creating an object of LoginPage pom class");
		LoginPage lp = new LoginPage(driver);
		log.info("LoginPage pom class object created successfully..");
		//enter username
		log.debug("Enter user name as admin");
		lp.setUsername("admin");
		log.info("Username admin entered successfully..");
		//enter password
		lp.setPassword("manager");
		//click on Login button
		lp.clickLogin();
		
		WebDriverWait   wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		
		String actHomePageTitle= driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actHomePageTitle, "actiTIME - Enter Time-Track");
		sa.assertAll();
	}
}
