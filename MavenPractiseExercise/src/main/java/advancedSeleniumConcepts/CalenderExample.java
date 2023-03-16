package advancedSeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CalenderExample {
	
	static WebDriver driver;
	
	@Test
	public void calender() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.navigate().to("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		WebElement firstCalender = driver.findElement(By.id("first_date_picker"));
		firstCalender.click();
		
		WebElement nextButton = driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();
		//WebElement nextmonthDateButton = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a"));
		
		WebElement nextmonthDateButton = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		nextmonthDateButton.click();
}
}
