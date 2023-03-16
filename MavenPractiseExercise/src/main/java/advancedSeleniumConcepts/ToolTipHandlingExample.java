package advancedSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTipHandlingExample {
	
	static WebDriver driver;
	
	@Test
	public void toolTipsEx()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://formstone.it/components/tooltip/");
		driver.manage().window().maximize();
		
		WebElement left = driver.findElement(By.xpath("//div[contains(text(),\"Left\")]"));
		String lefttooltip = left.getAttribute("data-title");
		System.out.println("Tooltip text : " +lefttooltip);
	}

}
