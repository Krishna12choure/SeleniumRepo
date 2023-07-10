package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableButtonHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/selenium%20data/HtmlDropdownsSelenium/Scroll.html");

		driver.findElement(By.id("i1")).sendKeys("Krishna");
		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(2000);
//alert popup
		jse.executeScript("alert('Hello')");

		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		jse.executeScript("document.getElementById('i2').value='Krishna'");//disabled element handling

		Thread.sleep(7000);
		driver.close();

	}
}
