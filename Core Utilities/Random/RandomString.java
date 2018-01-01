/*
 * This file is part of SSolutions framework.
 * File creation date: 28-Dec-2017
 */

import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Sairam Sekhar P
 * @date 28-Dec-2017
 * 
 */
public class RandomString
{

	/**
	 * @param args
	 * Random String generator
	 */
	public static void main(String[] args)
	{
		// Dynamic input from user
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the length of string : ");
		int length = scanner.nextInt();
		
		//Random string generation
	    byte[] array = new byte[length]; 
	    new Random().nextBytes(array);
	    
	  //Method to get a random string from the given range
	    String generatedString = new String(array, Charset.forName("UTF-8"));
	 
	    System.out.println("Random string generated is : "+generatedString);
		
		// Closing Scanner
		scanner.close();
	}
}
