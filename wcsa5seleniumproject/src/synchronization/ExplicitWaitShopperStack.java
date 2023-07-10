package synchronization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitShopperStack {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver  driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//By implicit wait 
WebDriverWait explicitwait=new WebDriverWait(driver,Duration.ofSeconds(20));
driver.get("https://www.shoppersstack.com/");
driver.findElement(By.xpath("/html/body/div[1]/section[1]/article/div[2]/button ")).click();
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("krishna961999@gmail.com");
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Krishna@96");

driver.findElement(By.xpath("//span[text()='Login']")).click();

	}

}
