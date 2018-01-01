/*
 * This file is part of SSolutions framework.
 * File creation date: 25-Dec-2016
 */
package practice.uid.generator;

import java.util.Scanner;
import java.util.UUID;

/**
 * @author Sairam Sekhar P
 * @date 25-Dec-2016
 * 
 */
public class KeyGenerator
{

	/**
	 * @Unique Key Generator
	 */
	
	// array with 64+2 digits
	private final static char[] DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
			'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
			'-', '.', '_', '~' };

	public static void main(String[] args)
	{
		// To read input dynamically from the user
		Scanner scanner = new Scanner(System.in);

		System.out.println("......... Press any key to generate a unique key .........");
		scanner.nextLine();

		// closing the input stream of scanner
		scanner.close();

		// Generating a unique id
		System.out.println("Generated Unique key is : " + KeyGenerator.generateId());
	}

	public static String generateId()
	{
		// Unique key generation block
		UUID uid = UUID.randomUUID();
		StringBuffer buffer = new StringBuffer();
		buffer.append(uid.toString());
		return (toIDString(uid.getMostSignificantBits()) + toIDString(uid.getLeastSignificantBits()));
	}

	private static String toIDString(long uid)
	{
		// Actual key generation starts here
		char[] buffer = new char[32];
		int characters = 64;
		int currentPosition = 32;
		long digit = characters - 1;
		do
		{
			buffer[--currentPosition] = DIGITS[(int) (uid & digit)];
			uid >>>= 6;
		} while (uid != 0);
		return new String(buffer, currentPosition, (32 - currentPosition));
	}
}
