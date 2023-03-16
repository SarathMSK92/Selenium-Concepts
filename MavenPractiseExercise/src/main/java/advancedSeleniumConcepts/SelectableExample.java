package advancedSeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SelectableExample {
	static WebDriver driver;
	@Test
	public void selectableEx()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Selectable.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),\"Serialize \")]")).click();
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@class=\"SerializeFunc\"]/li"));
		int listSize = selectable.size();
		System.out.println("Total List Size : " +listSize);
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
				.click(selectable.get(0))
				.click(selectable.get(1))
				.click(selectable.get(2)).build().perform();
		
	// Another Way	
	//		Actions actions = new Actions(driver);
	//		actions.clickAndHold(selectable.get(0));
	//		actions.clickAndHold(selectable.get(1));
	//		actions.clickAndHold(selectable.get(2)).build().perform();
		

	}

}
