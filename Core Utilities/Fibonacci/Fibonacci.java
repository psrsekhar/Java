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
public class Fibonacci
{
	/**
	 * @param args
	 *            Fibonacci Series Generation
	 */
	public static void main(String[] args)
	{
		// Dynamic input from user
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the length of series : ");
		int length = scanner.nextInt();

		int pre = 0;
		int post = 1;
		int temp = 0;
		
		System.out.print("\n-----------Start of Series-----------");
		
		System.out.print("\n\nFibonacci Series is : " + pre + " " + post);

		if (length >= 0)
		{
			while(length>0)
			{
				temp = pre + post;
				System.out.print(" "+temp);
				pre = post;
				post = temp;
				length--;
			}
		}
		System.out.print("\n\n-----------End of Series-----------");
		
		// Closing Scanner
		scanner.close();
	}
}
