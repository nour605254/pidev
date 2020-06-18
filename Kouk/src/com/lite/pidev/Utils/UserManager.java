/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.Utils;

import com.lite.pidev.entities.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author acer
 */
public class UserManager {
    
    public static User get(String name){
        try {
            File file = new File("user/" + name + ".properties");
            Properties properties = new Properties();

            FileInputStream inputStream = new FileInputStream(file);
            properties.load(inputStream);
            User user = new User();

            user.setEmail(properties.getProperty("email"));
            return user;
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
        public static String getUserConnected(){
        try {
            File file = new File("lite.properties");
            Properties properties = new Properties();

            FileInputStream inputStream = new FileInputStream(file);
            properties.load(inputStream);
            User user = new User();
            return properties.getProperty("userLogged");
    
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    public static void save(User user) {
        try {
            File file = new File("user/" + user.getUsername()+ ".properties");
            Properties properties = new Properties();
            FileInputStream inputStream = new FileInputStream(file);
            properties.load(inputStream);
            FileOutputStream outputStream = new FileOutputStream(file);
            properties.setProperty("email", user.getEmail());
            properties.store(outputStream, "Update Section");
            properties.clear();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    



    
}
