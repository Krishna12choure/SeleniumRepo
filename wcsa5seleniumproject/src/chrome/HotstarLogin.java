package chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotstarLogin {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver  driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.hotstar.com/in/mypage#mp-login");

//driver.findElement(By.xpath("//input[@id='7']")).sendKeys("krishna@gmail.com");
//driver.findElement(By.xpath("input[name*='wor']")).sendKeys("abcef6");
//
driver.findElement(By.xpath("button[class*='_acan _acap _acas _aj1-']")).click();


//driver.navigate().to("https://www.hotstar.com/in/mypage#mp-login");
	}

}
