/*
 * This file is part of SSolutions framework.
 * File creation date: 28-Dec-2017
 */
import java.util.Scanner;

/**
 * @author Sairam Sekhar P
 * @date 28-Dec-2017
 * 
 */
public class Calculator
{

	/* scanner class object to read values */
	public static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int a = 10, b = 20, choice = 0;

		while (true)
		{
			System.out.print("\n1: Addition.\n2: Subtraction.");
			System.out.print("\n3: Multiplication.\n4: Divide.");
			System.out.print("\n5: Remainder.\n6: Power().");
			System.out.print("\n7: SquareRoot().\n8: Sin().");
			System.out.print("\n9: Cos().\n10: Tan().");
			System.out.print("\n11: Exit.");
			// Input from users
			choice = Calculator.readInteger("enter your choice : ");
			if (choice == 11)
			{
				System.out.println("\n .................... Thanks for using our application : Sairam Sekhar P ....................");
			}
			else
			{
				// If user select any Arithmetic operation
				a = Calculator.readInteger("enter your first value : ");
				if(choice <= 6)
				{
					b = Calculator.readInteger("enter your second value : ");
				}				
			}

			switch (choice)
			{
				case 1: System.out.println("\nAddition of two given numbers is : " + (a + b));
						break;
				case 2: System.out.println("\nSubtraction of two given numbers is : " + (a - b));
						break;
				case 3: System.out.println("\nMultiplication of two given numbers is : " + (a * b));
						break;
				case 4: System.out.println("\nDivision of two given numbers is : " + (a / b));
						break;
				case 5:	System.out.println("\nRemainder of two given numbers is : " + (a % b));
						break;
				case 6:	System.out.println("\nPower of given value is : " + Math.pow(a, b));
						break;
				case 7:	System.out.println("\nSquare root of given value is : " + Math.sqrt(a));
						break;
				case 8:	System.out.println("\nSin value of given angle is : " + Math.sin(a));
						break;
				case 9:	System.out.println("\nCos value of given angle is : " + Math.cos(a));
						break;
				case 10:System.out.println("\nTan value of given angle is : " + Math.tan(a));
						break;
				case 11:// closing the scanner input stream
						scanner.close();
						System.exit(0);
						break;
				default:System.out.println("An Invalid Choice!!!\n");
						break;
			}
		}
	}

	public static int readInteger(String input)
	{
		// read an integer value
		System.out.println("\n" + input);
		int number = scanner.nextInt();
		return number;
	}
}
