package advancedSeleniumConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DataTableExample {
	
	static WebDriver driver;
	
	@Test
	public void dataTableEx() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.navigate().to("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		driver.manage().window().maximize();
		
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columnsCount = columns.size();
		System.out.println("Number of Columns Count :  "+columnsCount);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowsCount = rows.size();
		System.out.println("Number of Rows Count :  "+rowsCount);
		
		WebElement getBurnoAge = driver.findElement(By.xpath("//td[normalize-space()='Bruno Nash']/following::td[3]"));
		String burnoAge = getBurnoAge.getText();
		System.out.println("Burno Age is : " +burnoAge);
		
		List<WebElement> allAges = driver.findElements(By.xpath("//td[5]"));

		List<Integer> ageList = new ArrayList<Integer>();
		
		for (WebElement webElement : allAges) {
			String indivitualAge = webElement.getText();
			ageList.add(Integer.parseInt(indivitualAge));		
		}
		System.out.println("Indivitual Readed Age is : " +ageList);
		
		int smallAge = Collections.min(ageList);
		System.out.println("Small Age is : " +smallAge);
		
		

}
}