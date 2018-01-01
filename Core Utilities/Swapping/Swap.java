/**
 * Swapping two numbers
 */
package practice.swap;

import java.util.Scanner;

/**
 * @author Sairam Sekhar P
 *
 */
public class Swap
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Dynamically read input from user
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter source value to swap : ");
		int source = scanner.nextInt();
		
		System.out.println("\nEnter destination value to swap : ");
		int destination = scanner.nextInt();
		
		//closing the scanner input stream
		scanner.close();
		
		//Actual swap process
		int temp = source;
		source = destination;
		destination = temp;
		
		System.out.println("\nValue in source after swap : "+source);
		System.out.println("\nValue in destination after swap : "+destination);
	}
}
