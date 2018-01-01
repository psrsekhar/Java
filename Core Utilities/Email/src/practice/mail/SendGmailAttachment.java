package practice.mail;

import java.util.Properties;
import java.util.Scanner;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendGmailAttachment
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

			//body and attachment of the mail
			BodyPart messageBodyPart1 = new MimeBodyPart();  
		    messageBodyPart1.setText(body);  
		      
		    //create new MimeBodyPart object and set DataHandler object to this object      
		    MimeBodyPart messageBodyPart2 = new MimeBodyPart();  
		  
		    //enter file path to attach as an attachment
		    String filename = "/home/sairam/Readme.txt";  
		    
		    DataSource source = new FileDataSource(filename);  
		    messageBodyPart2.setDataHandler(new DataHandler(source));  
		    messageBodyPart2.setFileName(filename);  
		     
		     
		    //create Multipart object and add MimeBodyPart objects to this object      
		    Multipart multipart = new MimeMultipart();  
		    multipart.addBodyPart(messageBodyPart1);  
		    multipart.addBodyPart(messageBodyPart2);  
		  
		    //6) set the multiplart object to the message object  
		    message.setContent(multipart );  
		    
			// Sending the mail
			Transport.send(message);
			
			System.out.println("Congratulations! Mail sent successfully");
		}
		catch (MessagingException e)
		{
			System.out.println("OOPS! Problem in sending mail. Reason : \n" + e);
		}
	}
}
