package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Krishna");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Krishna");
	
	driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	}

}
