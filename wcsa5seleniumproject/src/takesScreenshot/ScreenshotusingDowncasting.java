package takesScreenshot;

//By Typecasting 
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotusingDowncasting {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl");

		// Typecasting fom webdriver to RemoteWebDriver
		RemoteWebDriver ts = (RemoteWebDriver) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/mail.png");// Contains (path/Name.Extension)

		Files.copy(src, dest);
	}
}
