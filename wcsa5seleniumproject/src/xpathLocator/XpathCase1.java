package xpathLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase1 {
	public static void main(String[] args) throws InterruptedException {


	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("");
		Thread.sleep(2000);
		}
}
