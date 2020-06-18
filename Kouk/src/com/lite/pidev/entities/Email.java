/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.entities;


import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class Email {
    
    final String username = "ssarra608@gmail.com";
    final String password = "Lool@123456789";
    Properties props = System.getProperties();
    String host = "smtp.gmail.com";
 
    public Email()throws NoSuchProviderException, MessagingException{
        
        
        props.put("mail.smtp.starttls.enable","true");
        /* mail.smtp.ssl.trust is needed in script to avoid error "Could not convert socket to TLS"  */
        props.setProperty("mail.smtp.ssl.trust", host);
        props.put("mail.smtp.auth", "true");      
        props.put("mail.smtp.user", username);
        props.put("mail.smtp.password", password);
        props.put("mail.smtp.port", "587");
    
        System.out.println(props.getProperty("mail.smtp.password"));
    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }                            
});

    try {
        
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("ssarra608@gmail.com"));//ur email
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("sarra.ismaili@esprit.tn"));//u will send to
        message.setSubject("Subject");    
        message.setText("PFA");
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        Multipart multipart = new MimeMultipart();


     
     
    //attached 1 --------------------------------------------
        String file = "E:\\Doc1";
        String fileName = "Doc1";
    messageBodyPart = new MimeBodyPart();   
    DataSource source = new FileDataSource(file);      
    messageBodyPart.setDataHandler(new DataHandler(source));
    messageBodyPart.setFileName(fileName);
    multipart.addBodyPart(messageBodyPart);
    //------------------------------------------------------    
     
     //attached 2 --------------------------------------------  
       String file2="E:\\Doc2";
       String fileName2 = "Doc2";
    messageBodyPart = new MimeBodyPart();   
    DataSource source2 = new FileDataSource(file2);      
    messageBodyPart.setDataHandler(new DataHandler(source2));
    messageBodyPart.setFileName(fileName2);
    multipart.addBodyPart(messageBodyPart);
  //attached 3------------------------------------------------
       
       String file3="E:\\Doc3";
       String fileName3 = "Doc3";
    messageBodyPart = new MimeBodyPart();   
    DataSource source3 = new FileDataSource(file3);      
    messageBodyPart.setDataHandler(new DataHandler(source3));
    messageBodyPart.setFileName(fileName3);
    multipart.addBodyPart(messageBodyPart);
    //attached 4------------------------------------------------
    String file4="E:\\Doc4";
       String fileName4 = "Doc4";
    messageBodyPart = new MimeBodyPart();   
    DataSource source4 = new FileDataSource(file4);      
    messageBodyPart.setDataHandler(new DataHandler(source4));
    messageBodyPart.setFileName(fileName4);
    multipart.addBodyPart(messageBodyPart);
    //>>>>>>>>
   
    
    
        message.setContent(multipart);

       
        System.out.println("sending");
        Transport.send(message);
        System.out.println("Done");
        
   

            
}catch (MessagingException e) {
        e.printStackTrace();
    }
  }


    public Properties getProps() {
        return props;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getHost() {
        return host;
    }
    

}

