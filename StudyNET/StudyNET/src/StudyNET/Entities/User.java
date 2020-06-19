/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.Entities;

import java.util.ArrayList;



/**
 *
 * @author user
 */
public class User {
   private int id;
   private String username;
   private String username_canonical;
   private String email;
   private String email_canonical;
   private String password;
   private String sexe;
    private ArrayList<String> roles;

   

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getUsername_canonical() {
        return username_canonical;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail_canonical() {
        return email_canonical;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUsername_canonical(String username_canonical) {
        this.username_canonical = username_canonical;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmail_canonical(String email_canonical) {
        this.email_canonical = email_canonical;
    }
    
    public ArrayList<String> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }
    
    
    
    public User() {
    }

 
    @Override
    public String toString() {
        return username;
    }
   
   
   
}
