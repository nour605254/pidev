/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.GUI;

import com.lite.pidev.Service.EmailService;
import com.lite.pidev.Service.UserService;
import com.lite.pidev.Utils.Section;
import com.lite.pidev.Utils.SectionManager;
import com.lite.pidev.Utils.UserManager;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import com.lite.pidev.entities.Note;
import com.lite.pidev.entities.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class InscriController implements Initializable {
    @FXML
    private AnchorPane anchorMere;
    @FXML
    private MediaView mediaView;
    @FXML
    private Pane pane;
    @FXML
    private JFXTextField nomText;
   
    @FXML
    private JFXTextField emailText;
    @FXML
    private JFXPasswordField passwordText;
    @FXML
    private JFXButton btn_register;
    @FXML
    private JFXPasswordField passwordVerifText;

    @FXML
    private Label labelStatus;
    @FXML
    private Label lblLogin;
    
    @FXML
    private JFXRadioButton roleParent;
    @FXML
    private JFXRadioButton roleAdmin;
    @FXML
    private JFXRadioButton roleEnseignant;
    @FXML
    private JFXRadioButton roleEleve;
    private AnchorPane anchorPanes;
    private AnchorPane anchorPane;
      

    ToggleGroup groupe = new ToggleGroup();
    String role = "";
    @FXML
    private ImageView backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
   
        Media media = new Media("file:///C:/Users/acer/AndroidStudioProjects/Desktop/bf.mp4");
       MediaPlayer player = new MediaPlayer(media);
       mediaView.setMediaPlayer(player);
       player.setVolume(0);
       player.setAutoPlay(true);
       player.setCycleCount(108);
       player.play();
       
       Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher m = p.matcher(emailText.getText());
        
        roleAdmin.setToggleGroup(groupe);

        roleEnseignant.setToggleGroup(groupe);
        roleEleve.setToggleGroup(groupe);
        roleParent.setToggleGroup(groupe);
       
  if  (roleAdmin.isSelected() ) {
            role = "ADMIN";
      }
        if (roleEnseignant.isSelected()) {
            role = "ENSEIGNANT";

        }
        if (roleEleve.isSelected()) {
            role = "ELEVE";

        }
        
      else  if (roleParent.isSelected()) {
            role = "PARENT";

        }
     
        

        if (!nomText.getText().isEmpty()) {
            nomText.getStyleClass().remove("alert-danger");
            nomText.setTooltip(null);
        } else {
            RequiredFieldValidator validator = new RequiredFieldValidator();
            validator.setMessage("Saisir un nom valide!");
            nomText.getValidators().add(validator);
            System.out.println("oui");

            nomText.focusedProperty().addListener(new ChangeListener<Boolean>() {
                @Override
                public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                    if (!newValue) {
                        System.out.println("non");
                        nomText.validate();
                    }
                }
            });
        
      
        }
        if (!emailText.getText().isEmpty() && m.find() && m.group().equals(emailText.getText())) {
            emailText.getStyleClass().remove("alert-danger");
            emailText.setTooltip(null);

        } else {
            RequiredFieldValidator validator = new RequiredFieldValidator();
            validator.setMessage("Saisir un email valide!");
            emailText.getValidators().add(validator);

            emailText.focusedProperty().addListener(new ChangeListener<Boolean>() {
                @Override
                public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                    if (!newValue) {
                        emailText.validate();
                    }
                }
            });

        }
        if (!passwordText.getText().isEmpty()) {
            passwordText.getStyleClass().remove("alert-danger");
            passwordText.setTooltip(null);

        } else {
            RequiredFieldValidator validator = new RequiredFieldValidator();
            validator.setMessage("Saisir un mot de passe valide!");
            passwordText.getValidators().add(validator);

            passwordText.focusedProperty().addListener(new ChangeListener<Boolean>() {
                @Override
                public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                    if (!newValue) {
                        passwordText.validate();
                    }
                }
            });
        }

        if ((passwordVerifText.getText().equals(passwordText.getText()) == true) && !passwordVerifText.getText().isEmpty()) {
            passwordVerifText.getStyleClass().remove("alert-danger");
            passwordVerifText.setTooltip(null);
        } else {
            RequiredFieldValidator validator = new RequiredFieldValidator();
            validator.setMessage("Les mots de passe ne correspondent pas!");
            passwordVerifText.getValidators().add(validator);

            passwordVerifText.focusedProperty().addListener(new ChangeListener<Boolean>() {
                @Override
                public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                    if (!newValue) {
                        passwordVerifText.validate();
                    }
                }
            });
        }

    }

    public boolean verifDataEntered(KeyEvent event) {


        return true;
    }

    public boolean verifDataEntered() {
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher m = p.matcher(emailText.getText());
        boolean result;
        if (!nomText.getText().isEmpty()) {
                if (!emailText.getText().isEmpty() && m.find() && m.group().equals(emailText.getText())) {
                    if (!passwordText.getText().isEmpty()) {
                        if ( (passwordVerifText.getText().equals(passwordText.getText()) == true) && !passwordVerifText.getText().isEmpty()) {
                                result= true ;
                        } else {
                           result=  false;
                        }
                  
                } else {
                    result=  false;
                }
            } else {
                result=  false;
            }
        } else {
            result=  false;
        }
        return result;
      

    }
 @FXML
    private void createaccount(MouseEvent event) {
        User user = new User();
        System.out.println("aaaaaaaaa"+verifDataEntered());
        if (verifDataEntered()) {
            labelStatus.setText("Votre compte est créer merci de valider votre compte par email");
            labelStatus.getStyleClass().remove("alert-danger");
            labelStatus.getStyleClass().add("alert-success");
            btn_register.setDisable(false);
            UserService userDAO = new UserService();
            Section section = new Section(true,emailText.getText());
            SectionManager.save(section);
            user.setUsername(nomText.getText());
            user.setUsername(nomText.getText());
            user.setEmail(emailText.getText());

            user.setEmail(emailText.getText());
            user.setPassword(passwordText.getText());
            user.setRoles(role);
            UserManager.save(user);
            if (userDAO.addUser(user, emailText.getText())) {
                EmailService em = new EmailService();
                try {
                    em.SendConfirmationEmail(user);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                labelStatus.setText("Ce compte existe Déja!");
                labelStatus.getStyleClass().add("alert-danger");

               
            }
        } else {
            labelStatus.setText("Verifiez les données saisies!");
            labelStatus.getStyleClass().add("alert-danger");

        }

    }

    @FXML
    private void login(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

        Timeline timeline = new Timeline();
        KeyValue keyvalue = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
        KeyFrame keyframe = new KeyFrame(Duration.seconds(2), keyvalue);

        anchorMere.getChildren().add(root);
        timeline.getKeyFrames().add(keyframe);
        timeline.play();
        timeline.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event5) {
                anchorMere.getChildren().remove(anchorPane);

            }
        });
    
    }

    @FXML
    private void backButton(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

        Timeline timeline = new Timeline();
        KeyValue keyvalue = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
        KeyFrame keyframe = new KeyFrame(Duration.seconds(2), keyvalue);

        anchorMere.getChildren().add(root);
        timeline.getKeyFrames().add(keyframe);
        timeline.play();
        timeline.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event5) {

                anchorMere.getChildren().remove(anchorPanes);

            }
        });
    }
}
