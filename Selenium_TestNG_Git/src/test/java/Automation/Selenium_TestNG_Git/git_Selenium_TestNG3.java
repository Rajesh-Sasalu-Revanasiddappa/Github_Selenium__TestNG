package Automation.Selenium_TestNG_Git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class git_Selenium_TestNG3 {
	
	@BeforeClass
	public void Test_SetUp(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares & Tools\\Java Eclipse\\geckodriver.exe");
	}
	
	public WebDriver d1;
	
	public String URL = "https://www.guru99.com/";
	
	@Test
	public void page_load(){
		
		d1 = new FirefoxDriver();
		
		d1.navigate().to(URL);
	}
	
	@AfterClass
	public void Test_TearDown(){
		
		d1.quit();
	}

}
