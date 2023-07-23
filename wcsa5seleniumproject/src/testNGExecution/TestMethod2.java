package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod2 {
	 @Test
	  public void testMethod3() {
		 long threadid3 = Thread.currentThread().getId();
		 
		 Reporter.log("Thread id of testmethod3 : "+threadid3, true);
		  
	  }
	  @Test
	  public void testMethod4() {
		 long threadid4 = Thread.currentThread().getId();
		 
		 Reporter.log("Thread id of testmethod4 : "+threadid4, true);
		  
	  }
}
