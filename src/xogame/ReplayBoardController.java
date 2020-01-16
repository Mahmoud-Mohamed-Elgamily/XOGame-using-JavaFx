/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Me7moD
 */
public class ReplayBoardController implements Initializable {

    @FXML
    private Label score1;
    @FXML
    private Label score2;
    @FXML
    private Label P1;
    @FXML
    private Label P2;
    @FXML
    private Button btn0;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;

    List<Button> buttonlist = new ArrayList<>();
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        buttonlist.add(btn0);
        buttonlist.add(btn1);
        buttonlist.add(btn2);
        buttonlist.add(btn3);
        buttonlist.add(btn4);
        buttonlist.add(btn5);
        buttonlist.add(btn6);
        buttonlist.add(btn7);
        buttonlist.add(btn8);
        setBackGround();
        playGame();
    }

    public void setBackGround() {
        btn0.setStyle("-fx-background-color:none;-fx-border-width: 2px;-fx-border-style: solid;-fx-border-color: lightgray;");
        btn1.setStyle("-fx-background-color:none;-fx-border-width: 2px;-fx-border-style: solid;-fx-border-color: lightgray;");
        btn2.setStyle("-fx-background-color:none;-fx-border-width: 2px;-fx-border-style: solid;-fx-border-color: lightgray;");
        btn3.setStyle("-fx-background-color:none;-fx-border-width: 2px;-fx-border-style: solid;-fx-border-color: lightgray;");
        btn4.setStyle("-fx-background-color:none;-fx-border-width: 2px;-fx-border-style: solid;-fx-border-color: lightgray;");
        btn5.setStyle("-fx-background-color:none;-fx-border-width: 2px;-fx-border-style: solid;-fx-border-color: lightgray;");
        btn6.setStyle("-fx-background-color:none;-fx-border-width: 2px;-fx-border-style: solid;-fx-border-color: lightgray;");
        btn7.setStyle("-fx-background-color:none;-fx-border-width: 2px;-fx-border-style: solid;-fx-border-color: lightgray;");
        btn8.setStyle("-fx-background-color:none;-fx-border-width: 2px;-fx-border-style: solid;-fx-border-color: lightgray;");

    }

    void playGame() {
        P1.setText(ReplayUiController.rPlayer1);
        P2.setText(ReplayUiController.rPlayer2);
        score1.setText(ReplayUiController.rScore1);
        score2.setText(ReplayUiController.rScore2);
        int counter = 0;
        for (Map.Entry<String, String> record : ReplayUiController.lhmReplay.entrySet()) {
            String currentBtn = record.getKey();
            String currentValue = record.getValue();
            for (Button recordButton : buttonlist) {
                if (recordButton.getId().toString().equals(currentBtn)) {
                    counter += 500;
                    if (currentValue.equals("X")) {
                        recordButton.setTextFill(Color.BLUE);
                    } else {
                        recordButton.setTextFill(Color.RED);
                    }

                    PauseTransition pause = new PauseTransition(Duration.millis(0 + counter));
                    pause.setOnFinished(event -> recordButton.setText(currentValue));
                    pause.play();
                }
            }
        }
    }

    @FXML
    private void BackToHome(ActionEvent event) {
        XOGame.bth();
    }
}
