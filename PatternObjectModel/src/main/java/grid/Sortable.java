package grid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Sortable").click();
		
		WebElement demo= driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(demo);
			
		WebElement ele = driver.findElementByXPath("//li[text()='Item 1']");
		
		Actions builder = new Actions (driver);
		builder.dragAndDropBy(ele, 11, 89).perform();
		
		
	}

}
