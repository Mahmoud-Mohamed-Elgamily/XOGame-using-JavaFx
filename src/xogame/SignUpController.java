/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SignUpController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Button ssign;
    @FXML
    private Button back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   Socket Soso;
    PrintStream ps;
    public SignUpController ()
    {
        Soso=ipBase.mySocket;
    }
   
   
              
  /*  public boolean passwordvalidation() {
    
      
      String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        return password.getText().matches(pattern);
   }
    
    public boolean usernamevalidation(){
       String pattern="[a-zA-Z0-9.\\-_]{3,}";
       return username.getText().matches(pattern);
    
    }*/
       
    

    @FXML
    private void Back(ActionEvent event) {
    }
    @FXML
    private void signup(ActionEvent event) {
    //    if(passwordvalidation()&&usernamevalidation())
           //     {
                try {
                       ps = new PrintStream(Soso.getOutputStream());
                    } catch (IOException ex) {
                        Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    ps.println("su"+"."+username.getText()+"."+password.getText());
             //   }
            //    else
             /*   {
                    Alert alert = new Alert(Alert.AlertType.WARNING, "Invalid username or password!!");
                    Optional<ButtonType> response=alert.showAndWait();
                }
*/
                username.clear();
                password.clear();
        
    }

   
    
}
