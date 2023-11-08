package utility;

import org.testng.annotations.Test;

public class BasicCalculator {

	@Test
	public void sum() {
		
		int a = 5;
		int b = 6;
		int sum = a+b;
		System.out.println("addition of two numbers is "+sum);
	}
}
