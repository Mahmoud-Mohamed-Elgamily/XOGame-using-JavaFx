/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import static xogame.XOGame.scene5;

/**
 * FXML Controller class
 *
 * @author Me7moD
 */
public class ReplayUiController implements Initializable {

    static String rPlayer1, rPlayer2, rScore1, rScore2;
    static LinkedHashMap<String, String> lhmReplay;

    @FXML
    private ListView<String> recordsList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lhmReplay = new LinkedHashMap<>();
        try{
        String[] f = new File("C:\\recordedGames").list();
            for (String s : f) {
                recordsList.getItems().add(s.split("\\.")[0]);
            }
        }catch(NullPointerException ne){
            System.out.println("sorry this folder doesnt exist yet");
        }
    }

    @FXML
    private void getClicked(MouseEvent event) {
        String item = recordsList.getSelectionModel().getSelectedItem();
    }

    @FXML
    private void replayCurrentGame(ActionEvent event) throws FileNotFoundException, IOException {
        File openFile = new File("C:\\recordedGames\\" + recordsList.getSelectionModel().getSelectedItem() + ".txt");
        BufferedReader br = new BufferedReader(new FileReader(openFile));
        String st;
        String[] arr = new String[2];

        arr = br.readLine().split(",");
        rPlayer1 = arr[0];
        rScore1 = arr[1];
        arr = br.readLine().split(",");
        rPlayer2 = arr[0];
        rScore2 = arr[1];
//        lhmReplay = new LinkedHashMap<>();
        while ((st = br.readLine()) != null) {
            lhmReplay.put(st.split(",")[0], st.split(",")[1]);
        }
        scene5 = new Scene(FXMLLoader.load(getClass().getResource("ReplayBoard.fxml")));
        XOGame.window.setScene(XOGame.scene5);
        XOGame.window.show();
    }

    @FXML
    private void BackToHome(ActionEvent event) {
        XOGame.bth();
    }
}
