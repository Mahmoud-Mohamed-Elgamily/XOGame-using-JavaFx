/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Me7moD
 */
public class ReplayUiController implements Initializable {

    @FXML
    private ListView<String> recordsList;

    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        recordsList.getItems().add("first");
        recordsList.getItems().add("second");
        recordsList.getItems().add("third");
        recordsList.getItems().add("fourth");
        
    }

    @FXML
    private void getClicked(MouseEvent event) {
        String test = recordsList.getSelectionModel().getSelectedItem();
        System.out.println(test);
    }
}

