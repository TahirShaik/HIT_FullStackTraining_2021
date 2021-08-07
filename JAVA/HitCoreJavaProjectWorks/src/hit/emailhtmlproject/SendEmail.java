package hit.emailfinalproject;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.validator.routines.EmailValidator;

public class SendEmail {
	public static void send(String host, String port, final String fromMail, final String password,
			String subject, String htmlBody, Map<String, String> mapInlineImages)
			throws AddressException, MessagingException {
		System.out.println("------------ Sending E-Mail -----------");
		System.out.println("Sending From : " + fromMail);
		// Getting To Mails from the User
		Set<String> toMails = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of mails to sent: ");
		// This method reads the number provided using keyboard
		int max = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the mails to sent: ");
		for (int i = 0; i < max; i++) {
			toMails.add(sc.nextLine());
		}
		sc.close();
				
		// sets SMTP server properties
		Properties properties = new Properties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", port);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.user", fromMail);
		properties.put("mail.password", password);
		
		
		//System.out.println("Getting the Session of the Mail (G-Mail)");
		Session session = Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromMail, password);
			}
		});

		try {
			// creates a new e-mail message
			Message msg = new MimeMessage(session);
	
			msg.setFrom(new InternetAddress(fromMail));
			msg.setSubject(subject);
			msg.setSentDate(new Date());
	
			// creates message part
			MimeBodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setContent(htmlBody, "text/html");
	
			// creates multi-part
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);
	
			// adds inline image attachments
			if (mapInlineImages != null && mapInlineImages.size() > 0) {
				Set<String> setImageID = mapInlineImages.keySet();
	
				for (String contentId : setImageID) {
					MimeBodyPart imagePart = new MimeBodyPart();
					imagePart.setHeader("Content-ID", "<" + contentId + ">");
					imagePart.setDisposition(MimeBodyPart.INLINE);
	
					String imageFilePath = mapInlineImages.get(contentId);
					try {
						imagePart.attachFile(imageFilePath);
					} catch (IOException ex) {
						ex.printStackTrace();
					}
	
					multipart.addBodyPart(imagePart);
				}
			}
			msg.setContent(multipart);
	
			for (String toMail : toMails) {

				if (isValidEmailAddress(toMail) == true) {
					String userName = getUserName(toMail);
					msg.setRecipient(Message.RecipientType.TO, new InternetAddress(toMail));
					System.out.println("Sending the Mail to: " + userName);		
					Transport.send(msg);
					System.out.println("Mail Sent Successfully....\n");
				}else {
					System.out.println("Invalid Mail: "+toMail);
				}
			}
				
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}
	
	// Validate E-Mails and return the status as true if valid, otherwise False
	private static boolean isValidEmailAddress(String email) {
		// create the EmailValidator instance
		EmailValidator validator = EmailValidator.getInstance();
		// check for valid email addresses using isValid method
		return validator.isValid(email);
	}

	// Extract and Get the User-Name from the E-Mail
	private static String getUserName(String eMail) {
		int index = eMail.indexOf('@');
		eMail = eMail.substring(0, index);
		return eMail;
	}
}
