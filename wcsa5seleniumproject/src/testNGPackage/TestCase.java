package testNGPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase extends BaseTest {
	@Test
	public void loginMethod() throws InterruptedException {

		String actualTitle = driver.getTitle();

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), actualTitle);

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Title matched test case is passed!!!");
		sa.assertAll();
		
		String actualTitleOfHomePage = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), actualTitleOfHomePage);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		
	}
}
