package chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTwitter {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver  driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://twitter.com/i/flow/login");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name]")).sendKeys("krishna@gmail.com");
//driver.findElement(By.xpath("input[name*='wor']")).sendKeys("abcef6");
Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
