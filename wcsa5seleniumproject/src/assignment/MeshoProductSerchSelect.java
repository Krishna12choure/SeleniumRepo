package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeshoProductSerchSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.ajio.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class=\"react-autosuggest__input react-autosuggest__input--open\"]")).sendKeys("sneaker");
		driver.findElement(By.xpath("//button[@class=\"rilrtl-button\"]")).click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//label[@class=\"facet-linkname facet-linkname-genderfilter facet-linkname-Boys\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[contains(@class,\"facet-linkname facet-linkname-l\")]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/ul/li[4]/div/div/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
//	driver.findElement(By.xpath("")).click();
	}

}
