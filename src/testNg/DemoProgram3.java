package testNg;

import org.testng.annotations.Test;

public class DemoProgram3 {
	
	@Test
	public void modulo()
	{
		int a=3;
		int b=5;
		int c=a%b;
		
		System.out.println("Modulo value is     " +c);
	}
	
	@Test(groups= {"mobile"})
	public void arithmetic()
	{
		int d=3;
		int e=5;
		int f=(e+d)*e;
		
		System.out.println("arithmetic value is     " +f);
	}
}
