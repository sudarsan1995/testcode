package testNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationConcept {

	
	@Test
	public void subtration() {
		
		System.out.println("sub");
	}
	

	@AfterTest
	public void division() {
		
		System.out.println("division");
	}
	

	@BeforeTest
	public void modulo() {
		
		System.out.println("modulo");
	}
	

	@BeforeTest
	public void percentage() {
		
		System.out.println("percentage");
	}

	
}
