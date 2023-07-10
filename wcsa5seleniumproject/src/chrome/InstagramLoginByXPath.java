package chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginByXPath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver  driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");

driver.findElement(By.xpath("input[name*='er'")).sendKeys("krishna@gmail.com");
driver.findElement(By.xpath("input[name*='wor']")).sendKeys("abcef6");

driver.findElement(By.xpath("button[class*='_acan _acap _acas _aj1-']")).click();
	}

}
