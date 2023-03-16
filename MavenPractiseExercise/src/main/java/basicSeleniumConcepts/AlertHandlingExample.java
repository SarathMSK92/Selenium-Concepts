package basicSeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AlertHandlingExample {
	static WebDriver driver;
	
	@Test
	public void alertHandlingEx() throws InterruptedException
	{
		driverlaunch();
		
		WebElement clickAlert = driver.findElement(By.name("alertbox"));
		clickAlert.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();			
		
		WebElement confirmAlert = driver.findElement(By.name("confirmalertbox"));
		confirmAlert.click();
		Alert confirmAlertBox = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAlertBox.dismiss();
		
		WebElement promptAlertBox = driver.findElement(By.name("promptalertbox1234"));
		promptAlertBox.click();
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		promptAlert.sendKeys("Yes");
		Thread.sleep(3000);
		promptAlert.accept();
		
	}
	
	public void driverlaunch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.navigate().to("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
	}
}
