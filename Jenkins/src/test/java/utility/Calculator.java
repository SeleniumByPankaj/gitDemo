package utility;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		System.out.println(c.add(5, 6));
	}

	public int add (int a, int b)
	{
		return a+b;
	}
}

