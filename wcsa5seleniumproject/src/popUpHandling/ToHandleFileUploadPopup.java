package popUpHandling;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("http://omayo.blogspot.com/");

		Actions act = new Actions(driver);
		WebElement Ubtn = driver.findElement(By.xpath("//input[@id=\"uploadfile\"]"));
		Thread.sleep(2000);
		act.click(Ubtn).perform();

		Runtime.getRuntime().exec("./autoitPrograms/OmayoFileUpload.exe");

//		Thread.sleep(5000);
//		driver.quit();
	}

}
