package chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver  driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://desktop-6pv51og/login.do");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Login']")).click();


//driver.navigate().to("https://www.hotstar.com/in/mypage#mp-login");
	}

}
