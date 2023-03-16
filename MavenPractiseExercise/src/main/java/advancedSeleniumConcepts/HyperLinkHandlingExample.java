package advancedSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HyperLinkHandlingExample {
	
	static WebDriver driver;
	
	@Test
	public void linkHandleEx() throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	
	driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
	driver.manage().window().maximize();
	
	// Goto Home Page
	WebElement homePage = driver.findElement(By.linkText("This is a link"));
	homePage.click();
	System.out.println("HomePage launched");
	Thread.sleep(3000);
	driver.navigate().back();
	
	// Find Where am supposed to go without Clicking Me ?
	WebElement whereToGo = driver.findElement(By.linkText("This is a link"));
	String  where = whereToGo.getAttribute("href");
	System.out.println("2. Where to Go : " +where);
	
	//Verify am i broken ?
	WebElement brokenLink = driver.findElement(By.linkText("This is a link"));
	brokenLink.click();
	String title = driver.getTitle();
	if(title.contains("404"))
	{
		System.out.println("Link is Broken");
	}else
	{
		System.out.println("Link is not Broken");
	}
	driver.navigate().back();
	
	// Goto Homepage ( interact with same link name )
	WebElement homePage1 = driver.findElement(By.linkText("This is a link"));
	homePage1.click();
	driver.navigate().back();
	System.out.println("driver ");
	}
}
