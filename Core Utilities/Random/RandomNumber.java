/*
 * This file is part of SSolutions framework.
 * File creation date: 28-Dec-2017
 */

import java.util.Random;
import java.util.Scanner;

/**
 * @author Sairam Sekhar P
 * @date 28-Dec-2017
 * 
 */
public class RandomNumber
{
	/**
	 * @param args
	 * Random Number Generation
	 */
	public static void main(String[] args)
	{
		// Dynamic input from user
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the maximum range of number : ");
		int length = scanner.nextInt();
		
		//Random number generation
		Random random = new Random();
		
		//Method in Random class to get a random number from the given range
		System.out.println("Random Number generated is : "+random.nextInt(length));
		
		// Closing Scanner
		scanner.close();
	}
}
