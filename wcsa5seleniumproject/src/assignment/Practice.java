package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
//		WebElement button = driver.findElement(By.xpath("//button[@id='but2']"));
//		System.out.println(button.getText());
//		button.click();
//		driver.findElement(By.id("ta1")).sendKeys("Tiger");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Dropdown']"));
		
//		Point poi = button.getLocation();
//		int x=poi.getX();
//		int y = poi.getY();
//		JavascriptExecutor ts = (JavascriptExecutor)driver;
//		ts.executeScript("window.scrollBy("+x+","+y+")");
		
		JavascriptExecutor ts = (JavascriptExecutor)driver;
		ts.executeScript("document.getElementById('ta1').value='Someshwar'");
		
		

		
	}
}
