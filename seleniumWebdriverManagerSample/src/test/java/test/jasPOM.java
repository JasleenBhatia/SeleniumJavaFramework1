package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;


	public class jasPOM {
 
		private static WebDriver driver=null;
		public static void main(String[] args) {
			googleSearch();

		}

		public static void googleSearch() {
		
			WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(); 
			driver.get("https://google.com");
			
			
			//driver.findElement(By.name("q")).sendKeys("Automation step by step");
			GoogleSearchPage.search(driver).sendKeys("Automation step by step");
			
			//driver.findElement(By.name("btnK")).click();
			GoogleSearchPage.search_button(driver).sendKeys(Keys.RETURN);
			
			//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
			driver.close();
		    System.out.println("Test run successfully");
	}
	}

