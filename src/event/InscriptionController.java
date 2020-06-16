
package event;

import event.crud.Usercrud;
import event.entities.User;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class InscriptionController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private TextField roles;
    @FXML
    private Button btnsignup;
    @FXML
    private Button btnret;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signup(ActionEvent event) {
        
            String Email = email.getText();
            String Username = username.getText();
            String Password = password.getText();
            String Roles = roles.getText();
  
            User e = new User (Username,Email,Password,Roles);
            Usercrud udao = Usercrud.getInstance();
            udao.ajouteruser(e);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Bienvenu");
            alert.setContentText("Compte ajouté avec succes!");

            alert.showAndWait();
    }

    @FXML
    private void retour(ActionEvent event) {
        
         try {
            Parent root = FXMLLoader.load(getClass().getResource("/event/FXMLDocument.fxml"));
            Stage stage = (Stage) btnret.getScene().getWindow();
            stage.close();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
