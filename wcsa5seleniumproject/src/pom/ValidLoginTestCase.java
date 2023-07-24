package pom;

import java.io.IOException;

import org.openqa.selenium.By;

import keywordDrivenFramework.Flib;

public class ValidLoginTestCase extends BaseTest{
	
	public static void main(String[] args) throws IOException {
		
		
		BaseTest bt = new BaseTest();
		
		Flib flib = new Flib();
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH, "Username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH, "Password"));
		driver.findElement(By.id("loginButton")).click();
		
	}

}