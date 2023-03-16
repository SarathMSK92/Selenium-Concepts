package advancedSeleniumConcepts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFileExample {
	
	static WebDriver driver;
	
	@Test
	public void downloadFileEX()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]")).click();
		
		File fileLocation = new File("C:\\Users\\admin\\Downloads");
		File[] totalFiles = fileLocation.listFiles();
		
		for (File file : totalFiles) {
			
			if(file.getName().equals("samplefile.pdf"))
			{
				System.out.println("File downloaded");
				break;
		
			}
		
		
	}
	}
}
