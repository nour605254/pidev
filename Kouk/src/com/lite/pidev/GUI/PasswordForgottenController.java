/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.GUI;

import com.lite.pidev.Service.EmailService;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.lite.pidev.entities.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class PasswordForgottenController implements Initializable {
    @FXML
    private AnchorPane anchorMere;
    private AnchorPane anchorPanes;
    @FXML
    private MediaView mediaView;
    @FXML
    private Label changerLabel;
    @FXML
    private JFXButton changerPass;
    @FXML
    private JFXTextField emailrecup;
    @FXML
    private ImageView ckButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      }
    @FXML
    private void changerMotDePasse(MouseEvent event) {
 EmailService em=new EmailService();
        User u=new User();
        u.setEmail(emailrecup.getText());
        try {
            em.oublieMotdepasseEmail(u);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
    
    
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
