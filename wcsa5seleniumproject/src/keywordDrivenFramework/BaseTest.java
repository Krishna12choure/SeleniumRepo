package keywordDrivenFramework;
import java.util.Scanner;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant {
	static WebDriver driver;

	public void openBrowser() throws IOException {

		Flib flib = new Flib();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Brosername: ");
		String browservalue = sc.next();
		String url = flib.readPropertyData(PROP_PATH, "Url");
			
		if (browservalue.equalsIgnoreCase("chrome")) {

			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}

		else if (browservalue.equalsIgnoreCase("edge")) {
			System.setProperty(EDGE_KEY, EDGE_PATH);
			driver = new EdgeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}

		else if (browservalue.equalsIgnoreCase("Firefox")) {
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver = new FirefoxDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}

		else {
			System.out.println("Enter valid Browser value");
		}
	}

	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
