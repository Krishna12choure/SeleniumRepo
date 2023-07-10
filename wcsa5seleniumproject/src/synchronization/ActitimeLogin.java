package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://desktop-6pv51og/login.do");
		String actualTitleOfLoginPage = driver.getTitle();
		if (actualTitleOfLoginPage.equals("actiTIME - Login")) {
			System.out.println("Title is mathched,Test case is passed!");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("admin");
			driver.findElement(By.id("loginButton")).click();
		}

		else {
			System.out.println("We will get Exception");
		}

	}

}
