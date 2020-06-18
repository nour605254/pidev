/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.entities;

/**
 *
 * @author acer
 */
public class User {
     private int idUser;
    private String username;
    private String password;
    private String email;
    private String roles;
    private int enabled;

   
    public User(int idUser, String username, String password, String email, String roles,int enabled) {
        this.idUser = idUser;
        this.username= username;
        this.password = password;
this.enabled=enabled;
        this.roles = roles;
    }

    public User(String username, String password, String email, String roles) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.roles = roles;
    }
    

    public User() {
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUsername() {
        return username;
    }

  

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }



    public String getRoles() {
        return roles;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setUsername(String username) {
        this.username = username;
    }

  

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    public void setRoles(String roles) {
        this.roles = roles;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public int getEnabled() {
        return enabled;
    }
    
    
    @Override
    public String toString() {
        return "User{" + "idUser=" + idUser + ", username=" + username + ", password=" + password + ", email=" + email + ", enabled=" + enabled + ", roles=" + roles + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.idUser != other.idUser) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

    

