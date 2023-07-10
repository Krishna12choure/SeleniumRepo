package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersstackLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/article/div[2]/button ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("krishna961999@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Krishna@96");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/article/div[2]/div/input")).sendKeys("Pumma Shoes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();

	}

}
