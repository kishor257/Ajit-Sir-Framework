package scripts;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;
public class TestInvalidLogin extends BaseTest{
	@Test
	public void testInvalidLogin(){
		Logger log = LogManager.getLogger(TestInvalidLogin.class.getName());
		log.debug("creating an object of LoginPage pom class");
		LoginPage lp = new LoginPage(driver);
		log.debug("Retrieving the total number of active rows");
		log.debug("Active rows fetched successfully...");
		int rowCount = Lib.getRowCount("InvalidLogin");
		for (int row = 1; row <= rowCount; row++) {
			String username = Lib.getCellValue("InvalidLogin",row, 0);
			lp.setUsername(username);
			String password = Lib.getCellValue("InvalidLogin", row, 1);
			lp.setPassword(password);
			lp.clickLogin();
		}
	}
}
