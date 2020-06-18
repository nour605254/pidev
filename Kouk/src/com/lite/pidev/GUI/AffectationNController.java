/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.GUI;

import com.lite.pidev.entities.Matiere;
import com.lite.pidev.entities.Note;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class AffectationNController implements Initializable {
    @FXML
    private AnchorPane ap;
    @FXML
    private TextField idField;
    @FXML
    private TableView<?> TableView;
    @FXML
    private TableColumn<?, ?> idColumn;
    @FXML
    private TableColumn<?, ?> ModuleColumn;
    @FXML
    private Button affectButton;
    @FXML
    private TextField ccField;
    @FXML
    private TextField testField;
    @FXML
    private TextField examenField;
    @FXML
    private TextField MoyenneGeneralField;
    @FXML
    private TextField NomEleveField;
    @FXML
    private TextField PrenomEleveField;
    @FXML
    private TextField NameMatiereField;
    @FXML
    private TableColumn<Note, Integer> CcColumn;
    @FXML
    private TableColumn<Note, Integer> TestColumn;
    @FXML
    private TableColumn<Note, Integer> ExamenColumn;
    @FXML
    private TableColumn<Note, String> NomEleveColumn;
    @FXML
    private TableColumn<Note, String> PrenomEleveColumn;
    @FXML
    private TableColumn<Note, String> NomMatiereColumn;

    /**
     * Initializes the controller class.
     */
  
    private void insertButton() {
        String query = "insert into note values("+idField.getText()+",'"+ccField.getText()+"','"+testField.getText()+"',"+examenField.getText()+"',"+MoyenneGeneralField.getText()+"',"+NomEleveField.getText()+"',"+PrenomEleveField.getText()+"',"+NomMatiereColumn.getText()+"',"+MoyenneGeneralField.getText()+")";
    	executeQuery(query);
    	showNote();
    }
    
    
    
    public void executeQuery(String query) {
    	Connection conn = getConnection();
    	Statement st;
    	try {
			st = conn.createStatement();
			st.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	showNote();
    }
    
    public Connection getConnection() {
    	Connection conn;
    	try {
    		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lite","root","");
    		return conn;
    	}
    	catch (Exception e){
    		e.printStackTrace();
    		return null;
    	}
    }
    
    public ObservableList<Note> getNoteList(){
    	ObservableList<Note> NoteList = FXCollections.observableArrayList();
    	Connection connection = getConnection();
    	String query = "SELECT * FROM Note ";
    	Statement st;
    	ResultSet rs;
    	
    	try {
			st = connection.createStatement();
			rs = st.executeQuery(query);
			Note note;
			while(rs.next()) {
			
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return NoteList;
    }
    
    // I had to change ArrayList to ObservableList I didn't find another option to do this but this works :)
    public void showNote() {
    	ObservableList<Note> list = getNoteList();
    	
   

    

        

    }

    
    
  




    @FXML
    private void AffectButton(MouseEvent event) {
    }
    
}
