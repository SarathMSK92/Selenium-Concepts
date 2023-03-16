package basicSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RadioButtonExample {
	
static WebDriver driver;
	
	@Test
	public void radioButtonEx() throws InterruptedException
	{
		driverlaunch();
		
		WebElement unCheckedRadio = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/div/div[2]"));
		WebElement checkedRadio = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[2]/div/div[2]/span"));
		
		boolean status1 = unCheckedRadio.isSelected();
		boolean status2 = unCheckedRadio.isSelected();
		
		System.out.println("Status 1 : " + status1);
		System.out.println("Status 2 : " + status2);
		
		
}
	
	public void driverlaunch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.navigate().to("");
		driver.manage().window().maximize();
	}

	
	
	
	
}
