package testNg;

import org.testng.annotations.Test;

public class DemoProgram2 {
	
	@Test
	public void multiply()
	{
		int a=3;
		int b=5;
		int c=a*b;
		
		System.out.println("Mutiplication value is     " +c);
	}
	
	@Test(groups= {"mobile"})
	public void division()
	{
		int d=3;
		int e=5;
		int f=e/d;
		
		System.out.println("Division value is     " +f);
	}
}
