package testNGExecution;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class TestMethod3 {
	 @Test
	  public void testMethod5() {
		 long threadid5 = Thread.currentThread().getId();
		 
		 Reporter.log("Thread id of testmethod5 : "+threadid5, true);
		  
	  }
	  @Test
	  public void testMethod6() {
		 long threadid6 = Thread.currentThread().getId();
		 
		 Reporter.log("Thread id of testmethod6 : "+threadid6, true);
		  
	  }
}
