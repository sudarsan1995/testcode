package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoProgram {
	
	@Parameters({"URL"})
	@Test
	public void add(String urlname)
	{
		int a=3;
		int b=5;
		int c=a+b;
		
		System.out.println("Addition value is     " +c);
		System.out.println(urlname);
	}
	
	@Parameters({"URL1","username"})
	@Test
	public void subtract(String yahoourl,String username)
	{
		int d=3;
		int e=5;
		int f=e-d;
		
		System.out.println("Subtraction value is     " +f);
		System.out.println(yahoourl + username);
	}
	
	@Test(dataProvider="getData")
	public void dataProvider(String username,String age)
	{
		System.out.println(username);
		System.out.println(age);
	
	}
	
	@DataProvider 
	// assume you are going to having 3 combinations and passing 2 values for 2 attributes and going to use to method 
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="sudarsan";
		data[0][1]="17";
		data[1][0]="balaji";
		data[1][1]="25";
		data[2][0]="jaggu";
		data[2][1]="28";
		return data;
	}
	
	
			
}
