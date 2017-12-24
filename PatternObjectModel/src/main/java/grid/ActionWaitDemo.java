package grid;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionWaitDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		WebElement demo= driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(demo);
			
		WebElement ele = driver.findElementById("draggable");
		System.out.println("The co-ordinates are"+ele.getLocation());
		
		Actions builder = new Actions (driver);
		builder.dragAndDropBy(ele,100, 100).perform();
		System.out.println("The updated co-ordinated are"+ ele.getLocation());
		
		
		
		

	}

}
