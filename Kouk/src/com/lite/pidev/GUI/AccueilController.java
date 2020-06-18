/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.GUI;

import com.gn.GNAvatarView;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXTextField;
import com.lite.pidev.Service.MatiereService;
import com.lite.pidev.Service.UserService;
import com.lite.pidev.Utils.UserManager;
import com.lite.pidev.entities.Note;
import com.lite.pidev.entities.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TreeTableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.SVGPath;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class AccueilController implements Initializable {
        private Label lbl;
        @FXML
    private JFXTextField nomMatiere;
    @FXML
    private JFXTextField Coefficient;
    @FXML
    private JFXTextField idMatiere;
    @FXML
    private JFXTextField nomModule;
   @FXML
    private TreeTableView<?> tabMat;
    @FXML
    private JFXHamburger hamburger;
    @FXML
    private AnchorPane holderPane;
    @FXML
    private JFXButton edit;
    @FXML
    private JFXButton update;
    @FXML
    private JFXButton delete;
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
    private TitledPane appointmentMenu;
    @FXML
    private TitledPane charts;
    @FXML
    private Button about;
    @FXML
    private Button ListeDesMatieres;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
Note matiere= new Note();
       
    }    
    public void setValue(int id,String titre)
    {
        this.lbl.setText(""+id);
    
    }
Note matiere= new Note();        

@FXML
    private void edit(MouseEvent event) throws IOException{
       
    }
 public void setValue(int id , String nomMatiere, int Coefficient, String nomModule)
    { this.idMatiere.setText(""+id);
    this.nomMatiere.setText(nomMatiere);
    this.Coefficient.setText(""+Coefficient);
   
    this.nomModule.setText(nomModule);
    }

     public void setValuM(int id){
         this.lbl.setText(""+id);
     }

     

    @FXML
    private void delete(MouseEvent event) {
    }


    @FXML
    private void clearText(MouseEvent event) {
    }

    @FXML
    private void dashboard(MouseEvent event) {
    }

    @FXML
    private void setProfile(MouseEvent event) {
    }

    @FXML
    private void listerLesEvenements(ActionEvent event) {
    }



    @FXML
    private void afficherActualites(MouseEvent event) {
    }

    @FXML
    private void navigateForum(MouseEvent event) {
    }

    @FXML
    private void navigateMessagerie(MouseEvent event) {
    }

    @FXML
    private void navigateMesPaiements(MouseEvent event) {
    }

    @FXML
    private void navigateStatistiquePaiement(MouseEvent event) {
    }

    @FXML
    private void navigatelistReclamation(MouseEvent event) {
    }

    @FXML
    private void navigateEffectuerReclamation(MouseEvent event) {
    }

    @FXML
    private void deconnexion(MouseEvent event) {
    }

    

    private void setNode(Button ListeDesMatieres) {
    }

    @FXML
    private void update(MouseEvent event) {
    }

    @FXML
    private void listeLesMatieres(MouseEvent event) {
    }

    @FXML
    private void Affecter(MouseEvent event) {
    }
    
}
