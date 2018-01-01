/*
 * This file is part of SSolutions framework.
 * File creation date: 25-Dec-2017
 */
package practice.cryptography;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * @author Sairam Sekhar P
 * @date 25-Dec-2016
 * 
 */
public class MDEncryption
{

	/**
	 * @Cryptography utility
	 * MD5 Encryption is generally used for password storing in database.
	 */
	public static void main(String[] args)
	{
		// To read input dynamically from the user
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter password to encrypt : ");
		String password = scanner.nextLine();

		// closing the input stream of scanner
		scanner.close();

		System.out.println("\n******* MD5 Encryption Process Initiated *******");

		// calling encryption method to encrypt plain text
		password = MDEncryption.getMD5Hash(password);

		System.out.println("\nMD5 password is : " + password);
	}
	
	public static String getMD5Hash(String password)
	{
		String passwordHash = null;

		try
		{
			MessageDigest md = MessageDigest.getInstance("MD5");
			passwordHash = md.digest(password.getBytes()).toString();
		}
		catch (NoSuchAlgorithmException e)
		{
			passwordHash = password;
		}

		return passwordHash;
	}
	
	public static KeyPair generateKeys() throws Exception
	{
		KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
		kpg.initialize(1024);
		return kpg.generateKeyPair();
	}
}
