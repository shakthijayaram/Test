package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class CreateLeadTC extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_Login";
		testDescription = "End to End";
		category= "Smoke";
		authors	="Nesa";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String CName,String FName,String LName,String Source) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmfsa()
		.clicklead()
		.clickCreateLead()
		.enterCompanyName(CName)
		.enterFirstName(FName)
		.enterLastName(LName)
		.clickCreateLead();
		}

}
