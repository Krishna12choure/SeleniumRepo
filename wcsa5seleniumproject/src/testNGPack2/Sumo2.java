package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo2 {
	 @Test
	  public void m1() {
		  
		  Reporter.log("Demo1 TestNG class from Demo1",true);
		  
	  }
	  
	  @Test
	  public void m2()
	  {
		int a=2;
		int b=1;
		int div=a/b;
		System.out.println(div);
	  }
	  }
