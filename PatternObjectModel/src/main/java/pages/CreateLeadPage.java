package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		

	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;

	public CreateLeadPage enterCompanyName(String CName) {
		type(eleCompanyName,CName);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;

	public CreateLeadPage enterFirstName(String FName) {
		type(eleFirstName,FName);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;

	public CreateLeadPage enterLastName(String LName) {
		type(eleLastName,LName);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	private WebElement eleSource;

	public CreateLeadPage  selectSource(String Source) {
		type(eleSource,Source);
		return this;
	}

	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLead;
	public ViewLeadPage clickCreateLead() {

		click(eleCreateLead);
		return new ViewLeadPage(driver, test);
	}
}
