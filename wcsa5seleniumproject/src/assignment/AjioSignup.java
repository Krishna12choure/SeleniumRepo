package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioSignup {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    
    driver.get("https://www.ajio.com/?gclid=Cj0KCQjwjryjBhD0ARIsAMLvnF84TVJxbbfEQIQ8VZsBPOzXEQeGeHY0kYgLvNmMTMhi10najRHvDZ0aAuO4EALw_wcB");
    driver.manage().window().maximize();
//    Thread.sleep(2000);

    driver.findElement(By.xpath("//span[text()='Sign In / Join AJIO']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("adikapse");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[contains(@class,'logi')]")).click();
    

	}

}
