package advancedSeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandlingExample {
	
	static WebDriver driver;
	
	@Test
	public void frameHandleEx()
	{
	
	System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver new\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Handling Frame");
	
	driver.switchTo().defaultContent();
//	driver.switchTo().frame(2);

	int size = driver.findElements(By.tagName("iframe")).size();
	System.out.println("return iframe count is : "+size);
	List<WebElement> text_iframe = driver.findElements(By.tagName("iframe"));
	text_iframe.size();
//	WebElement value = driver.findElement(By.xpath("//div[contains(text(),\"Form Filling Demo Page\")]"));
//	System.out.println("Frame inside Frame Text Value is :  " +value);
	
	
	
	}
}
