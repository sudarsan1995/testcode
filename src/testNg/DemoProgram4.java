package testNg;

import org.testng.annotations.Test;

public class DemoProgram4 {
	
	@Test(enabled=false)
	public void MobileLogin()
	{
		
		
		System.out.println("MobileLogin");
	}
	
	@Test(dependsOnMethods={"MobileSignin"})
	public void MobileSignout()
	{
	
		
		System.out.println("MobileSignout");
	}
	
	@Test//(groups= {"mobile"})
	public void MobileSignin()
	{
	
		
		System.out.println("MobileSignin");
	}
	
	
}
