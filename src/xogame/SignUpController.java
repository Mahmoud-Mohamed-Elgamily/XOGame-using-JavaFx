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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

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
    Stage sosa,window;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    static Socket Soso;
    static PrintStream ps;

    public SignUpController() {
        try {
            sosa = XOGame.mystage;
            Soso = ipBase.mySocket;
            window=XOGame.window;
            ps = new PrintStream(Soso.getOutputStream());
            
            
        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        XOGame.bth();
        sosa.close();
    }

    @FXML
    private void signup(ActionEvent event) {
        //    if(passwordvalidation()&&usernamevalidation())
        //     {
//       name=username.getText(); 
        ps.println("su" + "." + username.getText() + "." + password.getText());
        sosa.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                ps.println("exit.");
            }
        });
        
        window.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
               // if(!SignUpController.Soso.equals(null))
                    ps.println("exit.");
            }
        });
        
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
