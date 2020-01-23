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
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import static xogame.SignUpController.ps;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SignInnController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Button login;
    @FXML
    private Button back;
    Stage sosa, window;
    static  String name;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    static Socket Soso;
    static PrintStream ps;

    public SignInnController() {
        try {
            sosa = XOGame.mystage;
            Soso = ipBase.mySocket;
            window = XOGame.window;
            name="";
            ps = new PrintStream(Soso.getOutputStream());

        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void login(ActionEvent event) {
        name=username.getText();
        ps.println("si" + "." + username.getText() + "." + password.getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SignInnController.class.getName()).log(Level.SEVERE, null, ex);
        }
        XOGame.Check();

        username.clear();
        password.clear();
    }

    @FXML
    private void Back(ActionEvent event) {
        XOGame.bth();
        sosa.close();
    }

}
