package Automation.Selenium_TestNG_Git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class git_Selenium_TestNG {
	
	@BeforeClass
	public void Test_SetUp(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares & Tools\\Java Eclipse\\geckodriver.exe");
	}
	
	public WebDriver d1;
	
	public String URL = "http://toolsqa.com";
	
	public String pageTitle;
	
	@Test
	public void page_load() throws Exception{
		
		d1 = new FirefoxDriver();
		
		d1.navigate().to(URL);
		
		Thread.sleep(3000);
		
		pageTitle = d1.getTitle();
		
		System.out.println("The page title is : "+pageTitle);
	}
	
	@AfterClass
	public void Test_TearDown(){
		
		d1.quit();
	}

}
