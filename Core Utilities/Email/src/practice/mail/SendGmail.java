package practice.mail;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.*;
import javax.mail.internet.*;  

public class SendGmail
{
	// Sending Email in Java through Gmail Server
	public static void main(String[] args)
	{
		// To read input dynamically from the user
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter reciepent mail id : ");
		String to = scanner.nextLine();

		System.out.println("Enter subject of the mail : ");
		String subject = scanner.nextLine();

		System.out.println("Enter message of the mail : ");
		String body = scanner.nextLine();

		// closing the input stream of scanner
		scanner.close();

		//Gmail SMTP Server Connection with our program
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		// Authenticating the Google Account(from address) to use Google SMTP Server
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator()
		{
			protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication("username@gmail.com", "Password");
			}
		});

		// Actual Mail Compose Block
		try
		{
			MimeMessage message = new MimeMessage(session);
			
			//To address for the mail 
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			//Subject of the mail
			message.setSubject(subject);
			
			//Message Body of the mail 
			message.setText(body);

			// Sending the mail
			Transport.send(message);
			
			System.out.println("Congratulations! Mail sent successfully");
		}
		catch (MessagingException e)
		{
			System.out.println("OOPS! Problem in sending mail. Reason : " + e);
		}
	}
}