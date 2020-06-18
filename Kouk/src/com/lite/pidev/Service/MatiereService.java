/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.Service;

import com.lite.pidev.interfaces.Inote;
import com.lite.pidev.Utils.MyConnection;
import com.lite.pidev.entities.Matiere;
import com.lite.pidev.entities.Note;
import com.lite.pidev.interfaces.Imatiere;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author acer
 */
public class MatiereService implements Imatiere{ 
    private Connection connection;
     private Statement st ;
    private ResultSet rs ;
    private PreparedStatement pst;


    public MatiereService() {
        this.connection = MyConnection.getInstance().getCnx();
    }

    public void addMatiere(Matiere m) {

        String req = "INSERT INTO matiere (id,Name,Coefficient,Module) VALUES (?,?,?,?) ";
        //pour executer req Statement et PreparedStatement
        try {
            PreparedStatement st = connection.prepareStatement(req);
            st.setInt(1, m.getId());
            st.setString(2, m.getName());
                        st.setInt(3, m.getCoefficient());

            st.setString(4, m.getModule());

            st.executeUpdate();
            System.out.println("matiere ajoutée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public void modifMatiere(Matiere m, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteMatiere(Matiere m) {
        try {
        String requete =
                "DELETE FROM matiere where matiere.id='"
                +m.getId()
                +"'";
                st =connection.createStatement();
                st.executeUpdate(requete);
                System.out.println("matiere supprimée");
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        } 
    }

    

    public Note getMatieresParId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void updateName(Matiere m) {
             String requete = "update matiere  set   Name=? "
                     + "  where id= ?";
       try {
            pst= connection.prepareStatement(requete);
            
            pst.setString(1 , m.getName());
            pst.setInt(2, m.getId());            
                     
            pst.executeUpdate();
            System.out.println("indemnite Modifier avec succé: "); 
            
        } catch (SQLException ex) {
          
        }
        
        
    }
    
    public String getFileByIdMatiere(int id)
    { 
        String s="";
         String requete = "select file from matiere where id="+id;
        try {
            st =connection.createStatement();
            rs= st.executeQuery(requete);
            while(rs.next()){
              s=rs.getString("file");
               
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return s ;
    }

   

    @Override
    public ObservableList getAllMatieres() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update(Note m, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

                                                                                                                                                                                            

    @Override
    public void update(Matiere m, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    @Override
    public Matiere getMatiereParId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
   
}
