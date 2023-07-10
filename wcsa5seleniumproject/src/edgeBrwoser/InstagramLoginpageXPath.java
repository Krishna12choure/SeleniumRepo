package edgeBrwoser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InstagramLoginpageXPath {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
WebDriver  driver= new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name]")).sendKeys("krishna@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("input[name*='wor']")).sendKeys("abcef6");
Thread.sleep(2000);
driver.findElement(By.xpath("button[class*='_acan _acap _acas _aj1-']")).click();

	}

}
