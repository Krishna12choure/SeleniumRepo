package FireFox;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFirefoxBrwoser {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		new FirefoxDriver();
	}

}
