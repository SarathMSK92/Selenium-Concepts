package dataTable;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DatatablePractiseExample {
	
	static WebDriver driver;
	List<String> companyList;
	
	@Test
	public void dataTableEx()
	{
		getColumnCount();
		getRowcount();
		getCompanyNameDetails();
		getGoogleCompanyName();
		getGoogleCountryName();
	}
	
	public void getColumnCount()
	{
		List<WebElement> totalColumns = driver.findElements(By.tagName("th"));
		int column_count = totalColumns.size();
		System.out.println(column_count);
	}
	
	public void getRowcount()
	{
		List<WebElement> totalRows = driver.findElements(By.tagName("tr"));
		int row_count = totalRows.size();
		System.out.println(row_count);
	}
	
	public void getCompanyNameDetails()
	{
		List<WebElement> companyNames = driver.findElements(By.xpath("//td[1]"));

		companyList = new ArrayList<>();
		for (WebElement details : companyNames) {
			String indivitualCompanyName = details.getText();
			companyList.add(indivitualCompanyName);
		}
		System.out.println(companyList);
	}
	
	public void getGoogleCompanyName()
	{
		String singleCompany = companyList.get(0);
		System.out.println("First company Name :  "+singleCompany);
	}
	
	public void getGoogleCountryName()
	{
		WebElement googleCountry = driver.findElement(By.xpath("//td[normalize-space()='Google']/following::td[2]"));
		String googleCountryName = googleCountry.getText();
		System.out.println("Google Country Name : " +googleCountryName);
	}
	
	
	@BeforeSuite
	public void driverLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");	
	}
}
