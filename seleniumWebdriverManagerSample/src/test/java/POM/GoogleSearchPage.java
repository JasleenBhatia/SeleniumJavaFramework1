package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	public static WebElement element=null;
	
	public static WebElement search(WebDriver driver) {
		
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		element= driver.findElement(By.name("q"));
		return element;
	}
	
    public static WebElement search_button(WebDriver driver) {
		
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		element= driver.findElement(By.name("btnK"));
		return element;
	}
}
