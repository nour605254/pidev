/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.Service;

import com.lite.pidev.Utils.MyConnection;
import com.lite.pidev.entities.Note;
import com.lite.pidev.interfaces.Imatiere;
import com.lite.pidev.interfaces.Inote;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.ObservableList;

/**
 *
 * @author acer
 */
public class NoteService implements Inote{ 
    private Connection connection;
     private Statement st ;
    private ResultSet rs ;
    private PreparedStatement pst;


    public NoteService() {
        this.connection = MyConnection.getInstance().getCnx();
    }

    public void addNote(Note m) {

        String req = "INSERT INTO note (id,cc,test,examen,MoyenneGeneral,NomEleve,PrenomEleve,NameMatiere) VALUES (?,?,?,?,?,?,?,?) ";
        //pour executer req Statement et PreparedStatement
        try {
            PreparedStatement st = connection.prepareStatement(req);
                        st.setInt(1, m.getIdNote());

            st.setInt(2, m.getCc());
            st.setInt(3, m.getTest());
                        st.setInt(4, m.getExamen());

            st.setInt(5, m.getMoyenneGeneral());
                        st.setString(6, m.getNomEleve());

            st.setString(7, m.getPrenomEleve());
                        st.setString(8, m.getNameMatiere());


            st.executeUpdate();
            System.out.println("Note ajoutée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

   
}

}
