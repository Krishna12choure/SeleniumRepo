package flags;

import org.testng.annotations.Test;

public class Flag5 {
//  @Test(priority = 0)
//  public void LoginMethod() {
//	  System.out.println("It is use to perform Login");
//  }
//  
//  @Test(priority = 1)
//  public void CreateUserMethod() {
//	  
//	  System.out.println("It use To create User");
//	  
//  }
//  
//  @Test(priority = 2)
//  public void LogoutMethod() {
//	  
//	  System.out.println("It use To logout");
//	  
//  }
	
	 @Test()
	  public void LoginMethod() {
		  System.out.println("It is use to perform Login");
	  }
	  
	  @Test(dependsOnMethods = "LoginMethod")
	  public void CreateUserMethod() {
		  
		  System.out.println("It use To create User");
		  
	  }
	  
	  @Test(dependsOnMethods ="CreateUserMethod")
	  public void LogoutMethod() {
		  
		  System.out.println("It use To logout");
		  
	  }
}
