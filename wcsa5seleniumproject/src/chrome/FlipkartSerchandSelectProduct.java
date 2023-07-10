package chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSerchandSelectProduct {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Hp laptops");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[4]/div[2]/div[1]/div[1]/div/label")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[11]/div/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[11]/div[2]/div/div[6]/div/label/div[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),\"HP Core i5\")]/../..//div[text()=\"₹54,999\"]")).click();
	Thread.sleep(2000);
	}
}

