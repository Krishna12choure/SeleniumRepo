package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/selenium%20data/HtmlDropdownsSelenium/Multidrop.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("multiple-select"));
		Select sel = new Select(multiSelectDD);
		Thread.sleep(2000);
		//To select Using Index
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		//To select using Visible Text
		sel.selectByVisibleText("Books");
		Thread.sleep(2000);
		
		//To select Using Value
//		sel.selectByValue("5");
		
		// To deselect using Index
//		sel.deselectByIndex(1);
//		Thread.sleep(2000);
		
		// To deselect using Visible Text 
		sel.deselectByVisibleText("Books");
		Thread.sleep(2000);
		
		// To deselect using Value
		sel.deselectByValue("1");
		Thread.sleep(2000);
		
		// To select Multiple options using for loop
		for(int i=0 ; i<=9; i++) 
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		Thread.sleep(3000);
		
		// To deselect Multiple options using for loop
		for(int i=0; i<=9; i++)
		{
			sel.deselectByIndex(i);
			Thread.sleep(1000);
		}
		
		// To deselect all options using deselectAll()
		sel.deselectAll();

	}
	

}