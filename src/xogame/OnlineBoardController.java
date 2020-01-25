/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

import com.sun.javafx.stage.StageHelper;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.WindowEvent;
import javafx.util.Duration;
import static xogame.XOGame.message;
import static xogame.XOGame.window;

/**
 * FXML Controller class
 *
 * @author User
 */
public class OnlineBoardController implements Initializable {

    @FXML
    public static Label P1;
    @FXML
    private Label PX;
    @FXML
    private Label scoreX;
    @FXML
    private Label scoreO;
    @FXML
    private Label PO;
    @FXML
    public static Label P2;
    @FXML
    private Label PF;
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
    @FXML
    private ToggleButton recordBtn;
    @FXML
    private DialogPane PopUpPane;
    @FXML
    private Label wnr;
    @FXML
    private MediaView mediaView;
    @FXML
    private Button yesBtn;
    @FXML

    String movement;
    private Button noBtn;
    static String player1 = "";
    static String player2 = "";
    static String myMark;
    static List<Button> buttonlist = new ArrayList<>();

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

    }
    
    static void setMyMark(String mark){
        myMark = mark;
    }
    
    @FXML
    private void set0(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String number = clickedButton.getId().toString();
//        System.out.println(number.charAt(3));
        clickedButton.setText(myMark);
        SignInnController.ps.println(" move." + number.charAt(3));
    }

    /*
    if(myMark=="X"){
                        clickedButton.setText("X");
                    } else if(myMark=="O"){
                        clickedButton.setText("X");
                    }}
     */
    @FXML
    private void switchRecordOption(ActionEvent event) {
    }

    @FXML
    private void playAgain(ActionEvent event) {
    }

    @FXML
    private void goToHome(ActionEvent event) {
        XOGame.bth();
    }

    public static void movehandler(String movement) {
        for (Button recordButton : buttonlist) {
            if (recordButton.getId().toString().equals("btn" + movement)) {
                if (myMark == "X") {
                    recordButton.setText("O");
                } else if (myMark == "O") {
                    recordButton.setText("X");
                }
            }
        }
    }

}
