/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import static xogame.XOGame.scene;
import static xogame.XOGame.scene9;

/**
 * FXML Controller class
 *
 * @author User
 */
public class OnlinePlayersUiController implements Initializable {

    @FXML
    private ListView<?> nameLView;
    @FXML
    private ListView<?> scoreLView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void requestGame(ActionEvent event) throws IOException {
        scene9 = new Scene(FXMLLoader.load(getClass().getResource("OnlinePlayersUi.fxml")));

        XOGame.window.setScene(scene);
        XOGame.window.show();
//        ps.println("invite.player1name.player2name");
    }

    @FXML
    private void takeMeHome(ActionEvent event) {
        XOGame.bth();
    }
    
}
