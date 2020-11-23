package calculator;

public class PerformCalculations 
{
	public static void CalculatorOptions() // Give User arithmetic options
	{
		System.out.println("1. [ Addition ]");
		System.out.println("2. [ Subtraction ]");
		System.out.println("3. [ Multiplication ]");
		System.out.println("4. [ Division ]");
		System.out.println("5:) Close application");
	}
	
	public static double Addition(double x, double y) //Addition Method
	{
		double result = 0;
		
		result = x + y;
		
		return result;
	}
	public static double Subtraction(double x, double y) //Subtraction Method
	{
		double result = 0;
		
		result = x - y;
		
		return result;
	}
	public static double Multiplication(double x, double y) //Multiplication Method
	{
		double result = 0;
		
		result = x * y;
		
		return result;
	}
	public static double Division(double x, double y) //Division Method
	{
		double result = 0;
		
		result = x / y;
		
		return result;
	}

}
