package grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		

		WebElement ele= driver.findElementByXPath("//span[text()='Electronics']");
		WebElement ele1=driver.findElementByXPath("//span[text()='Apple']");
		
		Actions builders = new Actions (driver);
	    builders.moveToElement(ele).perform();
	    
	    WebDriverWait wait  = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.elementToBeClickable(ele1));
	    builders.click(ele1).perform();
	}

}
