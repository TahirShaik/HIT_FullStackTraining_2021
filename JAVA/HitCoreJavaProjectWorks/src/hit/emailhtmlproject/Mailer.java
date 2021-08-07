package hit.emailfinalproject;

import java.util.HashMap;
import java.util.Map;

public class Mailer {
	public static void main(String[] args) {
		// SMTP info & mailer Details (From Mail & Auth)
		String host = "smtp.gmail.com";
		String port = "587";
		String mailFrom = "tahir.fullstack@gmail.com";
		String password = "Tahir1920!";

		// Subject & Main Message(in HTML)
		String subject = "Hurray!!! Grab the offer only for Rs.350/Month. Complete FullStack Web Development Course !!!";
	
		StringBuffer body = new StringBuffer("<html><body style=\"border: 5px solid rgb(73, 67, 67) ;margin-left: 5%;margin-right: 5%;text-align: center;align-items: center;\">"
				+ "<h1 style=\"color:rgb(251, 250, 255);background-color:rgb(3, 3, 63);border-left:20px;\" >Welcome to <br>Haaris Infotech Pvt. Ltd.</h1><br>");
		body.append("<img src=\"cid:image1\" width=\"100%\" height=\"100%\" />");
		body.append("<h1 style=\"color:rgb(255, 21, 0);\" >Want to become a Full Stack Web Developer?</h1>"
						+ "<p style=\"margin-left: 10%;margin-right: 10%;text-align: center;\">Here we are, World's most demand Fullstack Web Development Course. Join us to fullfill your dreams. At the end of the course, you will create your own wesites from scratch. We will guide you to fullfill your dreams.India's one of the Top 10 Institute, Haaris Infotech Pvt. Ltd..</p>"
						+ "<h1 style=\"color:rgb(255, 0, 221);\" >Full Stack Development Course</h1><p style=\"margin-left: 10%;margin-right: 10%;text-align: center;\"> <strong>Full Stack Development Course = Front-End Development + Back-End Development</strong><br>"
						+ "<table style=\"width:100%\"><tr><th>Front-End Development</th><th>Back-End Development</th></tr><tr><td>HTML5</td> <td>Java</td></tr><tr><td>CSS</td><td>NodeJS</td></tr><tr><td>JavaScript</td><td>ExpressJS</td></tr><tr><td>Bootstrap</td><td>MySQL</td></tr><tr><td>ReactJs</td><td>MongoDB</td></tr><tr><td>AngularJS</td><td>PostgreSQL</td></tr></table></p>");
		body.append("<img src=\"cid:image2\" width=\"100%\" height=\"100%\" />");
		body.append("<p style=\"margin-left: 10%;margin-right: 10%;text-align: center;\"> <br><br><br>© 2021 Haaris Infotech Inc. All rights reserved. Haaris Infotech and the Coursera Haaris Infotech are registered trademarks of Haaris Infotech, Inc. All other trademarks are property of their respective owners. Log in to manage all your notification preferences in Email Settings.<br><strong>Address:</strong> Haaris Infotech, Twin Courtz, B-30, 600096, Perungudi, Chennai, Tamil Nadu 600096</p>"
						+ "<p style=\"margin-left: 10%;margin-right: 10%;text-align: center;\"><table style=\"width:100%;\"><tr><th> <br><a href=\"http://haarisinfotech.com/team-members/#service\">Visit Us</a><br><br></th><th><a href=\"http://haarisinfotech.com/about-us/\">About Us</a><br><br> </th></tr><tr><th> <a href=\"http://haarisinfotech.com/team-members/\">Meet our Team</a></th><th><a href=\"http://haarisinfotech.com/services-version-one/\">Our Services</a></th></tr></table></p></body>"
						+ "</html>");
			
		
		// Add in-line images
		Map<String, String> inlineImages = new HashMap<String, String>();
		inlineImages.put("image1", "attach1.gif");
		inlineImages.put("image2", "attach2.gif");

		try {
			SendEmail.send(host, port, mailFrom, password, subject, body.toString(), inlineImages);
		} catch (Exception ex) {
			System.out.println("Unable to Send email.");
			ex.printStackTrace();
		}
	}
}
