/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.GUI;

import com.jfoenix.controls.JFXTextField;
import com.lite.pidev.Service.MatiereService;
import com.lite.pidev.entities.Matiere;
import com.lite.pidev.entities.Note;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class listeController implements Initializable {
    @FXML
    private TextField idField;
    @FXML
    private TextField NameField;
    @FXML
    private TextField CoefficientField;
    @FXML
    private TextField ModuleField;
    private Label lbl;
    @FXML
    private Label lbid;
    @FXML
    private TableView<Matiere> TableView;
    @FXML
    private TableColumn<Matiere, Integer> idColumn;
    @FXML
    private TableColumn<Matiere, String> NameColumn;
    @FXML
    private TableColumn<Matiere, Integer> CoefficientColumn;
    @FXML
    private TableColumn<Matiere, String> ModuleColumn;
    @FXML
    private AnchorPane ap;
    @FXML
    private Button insertButton;
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;

    /**
     * Initializes the controller class.
     */
    
        @FXML
    private void insertButton() {
        String query = "insert into matiere values("+idField.getText()+",'"+NameField.getText()+"','"+CoefficientField.getText()+"',"+ModuleField.getText()+")";
    	executeQuery(query);
    	showMatiere();
    }
    
    
    @FXML 
    private void updateButton() {
    String query = "UPDATE matiere SET Name='"+NameField.getText()+"',Coefficient='"+CoefficientField.getText()+"',Module="+ModuleField.getText()+" WHERE ID="+idField.getText()+"";
    executeQuery(query);
	showMatiere();
    }
    
    @FXML
    private void deleteButton() {
    	String query = "DELETE FROM matiere WHERE ID="+idField.getText()+"";
    	executeQuery(query);
    	showMatiere();
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
    	showMatiere();
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
    
    public ObservableList<Matiere> getMatiereList(){
    	ObservableList<Matiere> MatiereList = FXCollections.observableArrayList();
    	Connection connection = getConnection();
    	String query = "SELECT * FROM matiere ";
    	Statement st;
    	ResultSet rs;
    	
    	try {
			st = connection.createStatement();
			rs = st.executeQuery(query);
			Matiere matiere;
			while(rs.next()) {
				matiere = new Matiere(rs.getInt("Id"),rs.getString("Name"),rs.getInt("Coefficient"),rs.getString("Module"));
				MatiereList.add(matiere);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return MatiereList;
    }
    
    // I had to change ArrayList to ObservableList I didn't find another option to do this but this works :)
    public void showMatiere() {
    	ObservableList<Matiere> list = getMatiereList();
    	
    	idColumn.setCellValueFactory(new PropertyValueFactory<Matiere,Integer>("id"));
    	NameColumn.setCellValueFactory(new PropertyValueFactory<Matiere,String>("Name"));
    	CoefficientColumn.setCellValueFactory(new PropertyValueFactory<Matiere,Integer>("Coefficient"));
    	ModuleColumn.setCellValueFactory(new PropertyValueFactory<Matiere,String>("Module"));
    	
    	TableView.setItems(list);
    }

        

    }

    
    
  


