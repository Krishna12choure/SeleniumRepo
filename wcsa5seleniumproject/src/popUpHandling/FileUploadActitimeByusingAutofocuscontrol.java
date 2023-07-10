package popUpHandling;

import java.io.IOException;
import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadActitimeByusingAutofocuscontrol {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriiver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("http://desktop-6pv51og/login.do");

		driver.findElement(By.name("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("admin");

		driver.findElement(By.id("loginButton")).click();

		WebElement set = driver.findElement(By.xpath("//div[text()='Settings']/.."));
		set.click();

		WebElement col = driver.findElement(By.xpath("//a[.='Logo & Color Scheme']"));
		col.click();

		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

		Actions act = new Actions(driver);
		WebElement fup = driver.findElement(By.xpath("//input[@type='file']"));
		act.click(fup).perform();

		Runtime.getRuntime().exec("./autoitPrograms/ActitimebyControlMethods.exe");

	}

}
