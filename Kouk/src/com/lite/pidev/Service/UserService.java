/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.Service;

import com.lite.pidev.Utils.MyConnection;
import com.lite.pidev.Utils.BCrypt;
import com.lite.pidev.entities.User;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.lite.pidev.interfaces.IUserService;


/**
 *
 * @author ASUS
 */
public class UserService implements IUserService {

    private Connection connection;
    private FileInputStream fis;
    private File file;

    public UserService() {
        this.connection = MyConnection.getInstance().getCnx();
    }

    public boolean addUser(User user, String email) {

        String query = "select * from fos_user where email='" + email + "';";
        String passdb = "";
        try {
            System.out.println("email saisi " + email);
            PreparedStatement prep = connection.prepareStatement(query);
            ResultSet result = prep.executeQuery();
            while (result.next()) {
                passdb = result.getString("email");
                System.out.println("email de la base " + passdb);

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        if (passdb.equals(email) == false) {

            try {

                String req = "insert into fos_user(username,username_canonical,email,email_canonical,password,enabled,roles) values (?,?,?,?,?,?,?)";
                PreparedStatement ps = connection.prepareStatement(req);
                ps.setString(1, user.getUsername());
                ps.setString(2, user.getUsername());

                ps.setString(3, user.getEmail());
                ps.setString(4, user.getEmail());

                String pw = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(13));
                                ps.setString(5, pw);

                 ps.setInt(6, user.getEnabled());

                ps.setString(7, user.getRoles()
                );
                ps.executeUpdate();
                System.out.println("user ajouté avec succès");
                return true;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        }

        return false;

    }

    public int authentification(String username, String password, String roles) {
        int exist = 3;

        try {
            String query = "select * from fos_user  where email =? and roles=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, roles);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            if (!rs.next()) {
                return 1;
            } else {
                query = "select * from fos_user  where email =? and enabled=1 and roles=?";
                ps = connection.prepareStatement(query);
                ps.setString(1, username);
                ps.setString(2, roles);
                rs = ps.executeQuery();
                i = 0;
                if (!rs.next()) {
                    return 2;
                } else {
                    query = "select password from fos_user  where email =? and enabled=1 and roles=?";
                    ps = connection.prepareStatement(query);
                    ps.setString(1, username);
                    ps.setString(2, roles);
                    rs = ps.executeQuery();
                    i = 0;

                    while (rs.next()) {
                        System.out.println(rs.getString(1));
                        System.out.println(BCrypt.hashpw(password, BCrypt.gensalt(13)));
                        if (BCrypt.checkpw(password, rs.getString(1)) == true) {
                            return 4;
                        } else {
                            return 3;
                        }
                    }
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return exist;
    
    
    }

}