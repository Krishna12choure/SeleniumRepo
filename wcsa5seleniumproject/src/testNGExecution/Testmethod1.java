package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testmethod1{
  @Test
  public void testMethod1() {
	 long threadid1 = Thread.currentThread().getId();
	 
	 Reporter.log("Thread id of testmethod1 : "+threadid1, true);
	  
  }
  @Test
  public void testMethod2() {
	 long threadid2 = Thread.currentThread().getId();
	 
	 Reporter.log("Thread id of testmethod2 : "+threadid2, true);
	  
  }
  
}
