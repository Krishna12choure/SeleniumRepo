package chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginpage {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver  driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");

driver.findElement(By.cssSelector("input[name*='er'")).sendKeys("krishna@gmail.com");
driver.findElement(By.cssSelector("input[name*='wor']")).sendKeys("abcef6");

driver.findElement(By.cssSelector("button[class*='_acan _acap _acas _aj1-']")).click();
	}

}
