/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.interfaces;

import com.lite.pidev.entities.User;

/**
 *
 * @author acer
 */
public interface IUserService {
 boolean addUser(User user, String pass);

    int authentification(String username, String password, String roles);

      
}
