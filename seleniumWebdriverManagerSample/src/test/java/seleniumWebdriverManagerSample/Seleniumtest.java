package seleniumWebdriverManagerSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumtest {
	
  static String browser;
  static WebDriver driver;
  public static void setBrowser()
  {
	  
	  browser="Firefox";
  }

  public static void setBrowerConfig()
  {
	  if(browser.contains("Firefox"))
	  {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  }
	  else if(browser.contains("Chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver(); 
	  }
  }

  public static void runTest()
  {
	  
		 driver.get("https://google.com");
		 driver.close();
		 driver.quit();
  }

  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	     setBrowser();
		setBrowerConfig();
		runTest();
	
	}

}
