package pl.lokw.zastepstwa.services;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailService {
    
    protected String mailSmtpAuth = "true";
    protected String mailSmtpHost = "smtp.gmail.com";
    protected String mailSmtpPort = "587";
    protected String mailSmtpStarttlsEnable = "true";
    protected String mailEmailFrom = "zastepstwa@lokw.pl";
    protected String username = "zastepstwa@lokw.pl";
    protected String password = "!zAst#E3";
    
    public boolean sendEmail(String recipientEmail, String subject, String content) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", mailSmtpAuth);
        props.put("mail.smtp.starttls.enable", mailSmtpStarttlsEnable);
        props.put("mail.smtp.host", mailSmtpHost);
        props.put("mail.smtp.port", mailSmtpPort);
        props.put("mail.smtp.ssl.trust", mailSmtpHost);
        Session session = Session.getInstance(
            props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            }
        );

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(mailEmailFrom));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject(subject);
            message.setText(content);
            Transport.send(message);
            return true;
        } catch (MessagingException e) {
            //wyjątek
        }
        return false;
    }
}
