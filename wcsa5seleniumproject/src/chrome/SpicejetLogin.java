package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpicejetLogin {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeOptions co=new ChromeOptions();
co.addArguments("--disable-notifications");
WebDriver  driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.spicejet.com/");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[text()='Login']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9325245579");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcef6");
Thread.sleep(5000);
driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/div[7]/div[1]")).click();
//
//driver.findElement(By.xpath("button[class*='_acan _acap _acas _aj1-']")).click();


//driver.navigate().to("https://www.hotstar.com/in/mypage#mp-login");
	}

}
