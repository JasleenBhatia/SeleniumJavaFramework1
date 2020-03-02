package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class TestJasGoogle {
	
	public static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		googleSearch();
	}

	public static  void googleSearch() {
		
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		 
		  GoogleSearchPageObjects pageObject=new GoogleSearchPageObjects(driver);
		  driver.get("https://google.com");
		  pageObject.setTextinSearchBox("Automation");
		  pageObject.Button_Search();
		  
		  driver.close();
	}
	}
	

