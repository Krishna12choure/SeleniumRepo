package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {

	@Test
	public void Login() throws InterruptedException {

//	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://desktop-6pv51og/login.do");
		String actualTitle = driver.getTitle();
//		non-critical features

//		if (driver.getTitle().equalsIgnoreCase(actualTitle)) {
//
//			driver.findElement(By.name("username")).sendKeys("admin");
//			driver.findElement(By.name("pwd")).sendKeys("admin");
//			
//			driver.findElement(By.id("loginButton")).click();
//			System.out.println("title Matched Test case is passed!!");
//
//		} 
//		
//		else {
//			System.out.println("Title not match test case fail");
//
//		}
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), actualTitle);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin");
		
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Title Matched Test case is passed!!");
//		
		
// critical Features 
//		if (driver.getTitle().equalsIgnoreCase("tcdml")) {
//			
//			System.out.println("Home page title match test case is pass");
//		}
//
//		else {
//			
//			System.out.println("Title not match test case is fail.");
//		}

		String actualTitleofHomePage = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), actualTitleofHomePage);
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		
		

	}
}

