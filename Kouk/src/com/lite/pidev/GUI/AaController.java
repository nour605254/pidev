/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.GUI;

import com.gn.GNAvatarView;
import com.jfoenix.controls.JFXDrawer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.SVGPath;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class AaController implements Initializable {
    @FXML
    private AnchorPane bpp;
    @FXML
    private AnchorPane ap;
    @FXML
    private JFXDrawer drawer;
    @FXML
    private VBox drawer1;
    @FXML
    private GNAvatarView avatar;
    @FXML
    private VBox info;
    @FXML
    private Label UserName;
    @FXML
    private Circle cStatus;
    @FXML
    private Label status;
    @FXML
    private RadioButton dispo;
    @FXML
    private ToggleGroup group;
    @FXML
    private RadioButton occupé;
    @FXML
    private RadioButton absent;
    @FXML
    private HBox searchBox;
    @FXML
    private TextField search;
    @FXML
    private Button clear;
    @FXML
    private SVGPath searchIcon;
    @FXML
    private ScrollPane scroll;
    @FXML
    private VBox views;
    @FXML
    private Button homeMenu;
    @FXML
    private TitledPane doctorMenu1;
    @FXML
    private Button Viewprofile;
    @FXML
    private Button createprofile;
    @FXML
    private TitledPane paymentMenu;
    @FXML
    private Button ListeDesMatieres;
    @FXML
    private Button about;
    @FXML
    private BorderPane pp;
    @FXML
    private Button affect;
    @FXML
    private Button calcul;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clearText(MouseEvent event) {
    }

    @FXML
    private void dashboard(MouseEvent event) {
       pp.setCenter(ap);
    }

    @FXML
    private void setProfile(MouseEvent event) {
    }

    @FXML
    private void listerLesEvenements(ActionEvent event) {
    }

    @FXML
    private void listeMatieres(MouseEvent event) {
        loadPage("Liste");
    }



    @FXML
    private void navigateMessagerie(MouseEvent event) {
        loadPage("Mailing");
    }


    @FXML
    private void deconnexion(MouseEvent event) {
        
			
	
    
    

    }
    private void loadPage(String page){
        
        Parent root =null;
        try{
        root =FXMLLoader.load(getClass().getResource(page+".fxml"));
    }
    catch(IOException ex){
        Logger.getLogger(AaController.class.getName()).log(Level.SEVERE,null,ex);
                
    }
        
      pp.setCenter(root);
    }

    @FXML
    private void calcul(MouseEvent event) {
        loadPage("AffectationN");
    }

    @FXML
    private void SendSms(MouseEvent event) {
    }
}
