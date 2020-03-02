package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class TestJasGoogle1 {
	
	 static WebDriver driver=null;
	@BeforeTest
	public void setupTest() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		 
	}
    @Test
	public static  void googleSearch() {
		
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		 
		  GoogleSearchPageObjects pageObject=new GoogleSearchPageObjects(driver);
		  driver.get("https://google.com");
		  pageObject.setTextinSearchBox("Automation");
		  pageObject.Button_Search();
		  
	}
	@AfterTest
	public void tearDownTest() {
		  driver.close();
		  driver.quit();
		  System.out.println("test completed successfully");
		
	}
	
	
	
	}
	

