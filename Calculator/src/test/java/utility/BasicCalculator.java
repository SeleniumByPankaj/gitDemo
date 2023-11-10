package utility;

import org.testng.annotations.Test;

public class BasicCalculator {

	@Test (priority = 1)
	public void sum() {
		
		int a = 5;
		int b = 6;
		int sum = a+b;
		System.out.println("addition of two numbers is "+sum);
	}
	

	@Test (priority = 2)
	public void subtraction() {
		
		int a = 15;
		int b = 6;
		int sub = a-b;
		System.out.println("subtraction of two numbers is "+sub);
	}
	
	@Test (priority = 3)
	public void multiplication() {
		
		int a = 15;
		int b = 6;
		int mul = a*b;
		System.out.println("multiplication of two numbers is "+mul);
	}
}
