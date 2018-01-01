/*
 * This file is part of SSolutions framework.
 * File creation date: 25-Dec-2016
 */
package practice.cryptography;

import java.util.Scanner;

/**
 * @author Sairam Sekhar P
 * @date 25-Dec-2016
 */
public class Cryptography
{

	/**
	 * @Cryptography utility
	 */
	public static void main(String[] args)
	{
		// To read input dynamically from the user
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter plain text to encrypt : ");
		String text = scanner.nextLine();

		System.out.println("Enter key to encrypt : ");
		String key = scanner.nextLine();

		// closing the input stream of scanner
		scanner.close();

		System.out.println("\n******* Encryption Process Initiated *******");

		// calling encryption method to encrypt plain text
		text = Cryptography.cryptography(text, key);

		System.out.println("\nEncrypted text is : " + text);

		// calling decryption method to decrypt the encrypted text
		System.out.println("\n\n******* Decryption Process Initiated *******");
		text = Cryptography.cryptography(text, key);

		System.out.println("\nPlain text after decryption is : " + text);

	}

	public static String cryptography(String text, String key)
	{
		// Same method to encrypt/decrypt the plain text
		StringBuilder output = new StringBuilder();

		for (int i = 0; i < text.length(); i++)
		{
			output.append((char) (text.charAt(i) ^ (i % key.length())));
		}

		return output.toString();
	}
}
