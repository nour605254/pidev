
package event.crud;

import event.DB.ConnexionSingleton;
import event.Ievent.Ievent;
import event.entities.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Usercrud {

    private static Usercrud instance;
    //read data from a database query
    private Statement st;
    //view data in a result set
    private ResultSet rs;

    public Usercrud() {
        //Get the only object available
        ConnexionSingleton cs = ConnexionSingleton.getInstance();
        try {
            st = cs.getCnx().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Usercrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Usercrud getInstance() {
        if (instance == null) {
            instance = new Usercrud();
        }
        return instance;
    }
    ConnexionSingleton myc = ConnexionSingleton.getInstance();
    Connection cnx = myc.getCnx();

    public void ajouteruser(User e) {
        int stat = 0;

        String req = "INSERT INTO fos_user (id, username, username_canonical, email, email_canonical, enabled, password, roles) VALUES (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, e.getId());
            pst.setString(2, e.getUsername());
            pst.setString(3, e.getUsername());
            pst.setString(4, e.getEmail());
            pst.setString(5, e.getEmail());
            pst.setInt(6, e.getEnabled());
            pst.setString(7, e.getPassword());
            pst.setString(8, e.getRoles());
            pst.executeUpdate();
            System.out.println("Ajout Complete");
        } catch (SQLException ex) {
            System.out.println("erreur d'insertion");
            System.out.println(ex.getMessage());

        }
    }

  
   
}
