package chrome;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Browser name do you want to open : ");
String brwoserValue=sc.next();
if(brwoserValue.equalsIgnoreCase("Chrome"))
{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
}
else if(brwoserValue.equalsIgnoreCase("Firefox"))
{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
	
}
else if(brwoserValue.equalsIgnoreCase("Edge"))
{
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();	
}
else
{
	System.out.println("Enter Valid Browser name!!!");
}
sc.close();
	}

}
