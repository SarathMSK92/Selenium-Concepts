package advancedSeleniumConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WindowHandlingExample {
	
	static WebDriver driver;
	static String new_Window_Title;
	static String parentWindow;
	
	@Test
	public void windowHandling()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		parentWindow = driver.getWindowHandle();
		openfirstWindow();	
		switchToFirstWindow();
		returnBackAndOpenSecondWindow();
		
		int numberOfwindowsopen = driver.getWindowHandles().size();
		System.out.println("Total Window Count is : " +numberOfwindowsopen);
		
		Set<String> newWindowHandles = driver.getWindowHandles();
		for (String allWindows : newWindowHandles) 
		{ 
			if(!allWindows.equals(parentWindow))
			{
				driver.switchTo().window(allWindows);
				driver.close();
			}
	}
		getWindowCount();
	}
		
	
	public void switchToFirstWindow()
	{
		Set<String> handles = driver.getWindowHandles();
		for (String firstWindow : handles) 
		{		
		driver.switchTo().window(firstWindow);
		new_Window_Title = driver.getTitle();
		}
		System.out.println("New Window Title is : "+new_Window_Title);
	}
	public void openfirstWindow()
	{
		WebElement firstWindowOpenButton = driver.findElement(By.xpath("//button[@name=\"newbrowserwindow123\"]"));
		firstWindowOpenButton.click();
	}
	public void openSecondWindow()
	{
		WebElement second_window_message  = driver.findElement(By.xpath("//button[@name=\"123newmessagewindow321\"]"));
		second_window_message.click();
	}
	public void returnbacktoParentWindow()
	{
		driver.switchTo().window(parentWindow);		
	}	
	
	public void returnBackAndOpenFirstWindow()
	{
		returnbacktoParentWindow();
		openfirstWindow();
	}
	
	public void returnBackAndOpenSecondWindow()
	{
		returnbacktoParentWindow();
		openSecondWindow();
	}
	public void returnBackAndOpenThirdWindow()
	{
		returnbacktoParentWindow();
	}
	public void getWindowCount()
	{
		int windowCount = driver.getWindowHandles().size();
		System.out.println("Final Window Count : " +windowCount);
		
	}
	
	
	
}
	
