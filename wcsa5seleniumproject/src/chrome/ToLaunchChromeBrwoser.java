package chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrwoser {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
new ChromeDriver();
Thread.sleep(2000);
		
	}

}
