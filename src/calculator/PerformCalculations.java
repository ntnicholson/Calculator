package calculator;

public class PerformCalculations 
{
	public static void CalculatorOptions() // Give User arithmetic options
	{
		System.out.println("1. [ Addition ]");
		System.out.println("2. [ Subtraction ]");
		System.out.println("3. [ Multiplication ]");
		System.out.println("4. [ Division ]");
		System.out.println("5: { Close Application }");
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
		
		result = x*y;
		
		return result;
	}
	public static double Division(double x, double y) //Division Method
	{
		double result = 0;
		
		try 
		{
			result = x/y;
		}
		catch (ArithmeticException e) //Double type can be divided by zero, returns Infinity
		{
			System.out.println("Error: " + e.getLocalizedMessage());
			result = 0;
		}
			
		return result;
	}
	public static String AnswerString(double x, double y, double z, char type) 
	{
		String answer = "ANSWER: " + x + " " + type + " " + y + " = " + z;
		
		return answer;
	}

}
