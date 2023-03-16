package basicSeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownHanldingExample {
	
	static WebDriver driver;
	
	@Test
	public void dropDownEx() throws InterruptedException
	{
		driverlaunch();
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select select = new Select(country);
		select.selectByIndex(5);
		Thread.sleep(3000);
		select.selectByValue("DZA");
		Thread.sleep(3000);
		select.selectByVisibleText("Benin");
}
	
	public void driverlaunch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
	}
	
}
