package annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationClass {
	@Test
	public void Method1() {
		Reporter.log("TestAnnnotaion method1", true);

	}

	@AfterMethod
	public void method2() {
		Reporter.log("AfterMethodAnnotation method2", true);
	}

	@BeforeMethod
	public void method3() {
		Reporter.log("BeforeMethodAnnotaion method3", true);
	}

	@BeforeClass
	public void method4() {
		Reporter.log("BeforeclassAnnotaion method4", true);
	}

	@AfterClass
	public void method5() {
		Reporter.log("AfterclassAnnotaion method5", true);
	}

	@BeforeSuite
	public void method6() {
		Reporter.log("BeforeSuiteAnnotaion method6", true);
	}
	
	@AfterSuite
	public void method7() {
		Reporter.log("AfterSuiteAnnotaion method7", true);
	}
	
	@BeforeTest
	public void method8() {
		Reporter.log("BeforetestAnnotaion method8", true);
	}
	@AfterTest
	public void method9() {
		Reporter.log("AfterTesteAnnotaion method9", true);
	}
	
	@Test
	public void method10()
	{
		Reporter.log("TestAnnotation method 10", true);
	}

}
