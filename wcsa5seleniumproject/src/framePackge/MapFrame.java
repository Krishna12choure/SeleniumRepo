package framePackge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MapFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//a[@class='gb_d']")).click();
		Thread.sleep(2000);
//
	//WebElement frameElement = driver.findElement(By.id("iframe"));
     	driver.switchTo().frame("app");
	
	   Thread.sleep(4000);
	driver.findElement(By.xpath("//span[@class='MrEfLc' and @style='background-position: 0 -406px;']")).click();
////		driver.switchTo().frame("iframe");
//		WebElement map = driver.findElement(By.xpath("//a[.='Maps']"));
//		map.click();
		
	}

}
