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
public class UIDGenerator
{

	/**
	 * @Unique ID Generator
	 */

	public static void main(String[] args)
	{
		// To read input dynamically from the user
		Scanner scanner = new Scanner(System.in);

		System.out.println("......... Press any key to generate a unique id .........");
		scanner.nextLine();

		// closing the input stream of scanner
		scanner.close();

		// Generating a unique id
		System.out.println("Generated Unique id is : " + UIDGenerator.generateId());
	}

	public static String generateId()
	{
		// Unique key generation block
		UUID uid = UUID.randomUUID();
		StringBuffer buffer = new StringBuffer();
		buffer.append(uid.toString());
		return (buffer.toString());
	}
}
