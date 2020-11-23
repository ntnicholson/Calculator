package calculator;
import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) 
	{
		double x = 0;
		double y = 0;
		double answer = 0;
		char choice = 0;
		Scanner userInput = new Scanner(System.in);
		
		while (choice != 5) 
		{
			PerformCalculations.CalculatorOptions(); //Display options to user
			choice = userInput.next().charAt(0);
			
			switch (choice) 
			{
				case '1': //Addition
					x = GetNumbers(userInput);
					y = GetNumbers(userInput);
					answer = PerformCalculations.Addition(x, y);
					System.out.println("The Answer is: " + answer );
			}
			
		}
		userInput.close(); //Close scanner
		System.exit(0); //Shut down application		
	}
	public static double GetNumbers(Scanner userInput) 
	{
		double number = 0;
		boolean validNum = false;
		
		do
		{
			System.out.println("Input Your Number: ");
			
			if (userInput.hasNextDouble()) 
			{
				number = userInput.nextDouble();
				validNum = true;
				
			}
			else 
			{
				userInput.nextLine();
				System.out.println("Input not valid, please re-enter your number");
			}
			
		} while (validNum == false);
		
		return number;
	}

}
/*
 * Project objective: As a developer, write a program to create an arithmetic calculator.
 * 
 * Background of the problem statement:
 * 
 * As a developer, write a Java code to create a calculator to perform the four
 * basic arithmetic operations (addition, subtraction, multiplication, and
 * division).
 * 
 * You must use the following:
 * 
 * Eclipse/IntelliJ: An IDE to code for the application Java: A programming language 
 * Git: To connect and push files from the local system to GitHub
 * GitHub: To store the application code and track its versions 
 * Core Java concepts: Variables, data types, operators, type casting, control statements,
 * class, objects, access specifiers, and core keywords like final, this, and
 * static
 * 
 * Following requirements should be met:
 * The versions of the code should be tracked on GitHub repositories. The
 * calculator should work properly.
 */