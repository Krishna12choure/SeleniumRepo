package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SonyLivSignup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.sonyliv.com/");
driver.manage().window().maximize();

driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/header/div[1]/div/div[2]/div/img ")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class=\"sigin_content_wrapper\"]")).click();
Thread.sleep(2000);

	}

}
