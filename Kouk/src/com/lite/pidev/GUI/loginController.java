/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.GUI;

import com.lite.pidev.Service.UserService;
import com.lite.pidev.Utils.Section;
import com.lite.pidev.Utils.SectionManager;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class loginController implements Initializable {
    @FXML
    private AnchorPane anchorMere;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private MediaView mediaView;
    @FXML
    private Pane pane;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXPasswordField pass;
    @FXML
    private JFXButton login;
    @FXML
    private JFXButton registerButton;
    @FXML
    private Label forgotpassword;
    @FXML
    private Label lblAdmin;
    @FXML
    private Label lblStatus;
    @FXML
    private Label lblParent;
    @FXML
    private Label erreurLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          Media media = new Media("file:///C:/Users/acer/AndroidStudioProjects/Desktop/bf.mp4");
       MediaPlayer player = new MediaPlayer(media);
       mediaView.setMediaPlayer(player);
       player.setVolume(0);
       player.setAutoPlay(true);
       player.setCycleCount(108);
       player.play();
    
    }    

    @FXML
    private void registerAction(MouseEvent event) {
   
    try {
			FXMLLoader fxmlLoader = new FXMLLoader(
					getClass().getResource("Inscription.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			// stage.initStyle(StageStyle.UNDECORATED);
			stage.setTitle("s'inscrire");
			stage.setScene(new Scene(root1));
			stage.show();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	
    
    
}
    
    @FXML
    private void forgotpass(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PasswordForgotten.fxml"));

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
    private void createaccount(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Inscription.fxml"));

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
    private void loginAdmin(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loginAdmin.fxml"));

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
    private void openEnseignantTab(MouseEvent event) {
        
    
    }

    @FXML
    private void openParentTab(MouseEvent event) {
    }

    @FXML
    private void login(MouseEvent event) throws IOException{
         try {
			FXMLLoader fxmlLoader = new FXMLLoader(
					getClass().getResource("Aa.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			// stage.initStyle(StageStyle.UNDECORATED);
			stage.setTitle("s'inscrire");
			stage.setScene(new Scene(root1));
			stage.show();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	
    
    

    }
        private void redirect(String page) throws IOException {

        login.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader(getClass().getResource(page));
//        Parent root = loader.getController();
        Parent calcRoot = loader.load();
        Scene showCalc = new Scene(calcRoot);
        Stage paranullCalc = new Stage();
        paranullCalc.setScene(showCalc);
        paranullCalc.show();
       Parent root = FXMLLoader.load(getClass().getResource(page));
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

   



    
}

