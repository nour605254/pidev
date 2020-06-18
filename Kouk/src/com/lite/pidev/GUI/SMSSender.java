/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.GUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class SMSSender {
    // Declare the security credentials to use
    String username = "StudyNet";
    String password = "esp";

    // Set the attributes of the message to send
    String message  = " 3 absences de votre enfant dans cette semaine";
    String type     = "1-way";
    String senderid = "XYZCorp";
    String to       = "61400000000";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSenderid() {
        return senderid;
    }

    public void setSenderid(String senderid) {
        this.senderid = senderid;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
    
    
    public SMSSender() {
    }
    

    


    public void SMSsend(String username,String password,String message,String type,String senderid,String to) throws MalformedURLException{

      // Build URL encoded query string
      String encoding = "UTF-8";
      String queryString;
        try {
            queryString = "username=" + URLEncoder.encode(username, encoding)
                    + "&password=" + URLEncoder.encode(password, encoding)
                    + "&message=" + URLEncoder.encode(message, encoding)
                    + "&senderid=" + URLEncoder.encode(senderid, encoding)
                    + "&to=" + URLEncoder.encode(to, encoding)
                    + "&type=" + URLEncoder.encode(type, encoding);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(SMSSender.class.getName()).log(Level.SEVERE, null, ex);
        }

      // Send request to the API servers over HTTPS
      URL url = new URL("https://api.directsms.com.au/s3/http/send_message?");
      URLConnection conn;
        try {
            conn = url.openConnection();
             BufferedReader rd = new BufferedReader(
        new InputStreamReader(conn.getInputStream()));
      String result = rd.readLine();
    
      rd.close();
       if(result == null) {
        System.out.println("No response received");
      }
      else if(result.startsWith("id:")) {
        System.out.println("Message sent successfully");
      } 
      else {
        System.out.println("Error - " + result);
      }
   

        } catch (IOException ex) {
            Logger.getLogger(SMSSender.class.getName()).log(Level.SEVERE, null, ex);
        }
     

      // The response from the gateway is going to look like this:
      // id: a4c5ad77ad6faf5aa55f66a
      // 
      // In the event of an error, it will look like this:
      // err: invalid login credentials
     
     
  }
    
}
