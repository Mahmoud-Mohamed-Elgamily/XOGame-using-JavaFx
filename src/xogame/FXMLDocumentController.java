/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {

    String saveMap, winner;
    @FXML
    private Label P1;
    @FXML
    private Label wnr;
    @FXML
    private Label PX;
    @FXML
    private Label scoreX;
    @FXML
    private Label scoreO;
    @FXML
    private Label P2;
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
    //@FXML 
    LinkedHashMap<String, String> hm = new LinkedHashMap<>();

    @FXML
    private ToggleButton recordBtn;

    private boolean isGameEnds, record = false;
    private int XOCounter, isFirstPlayerTurn;
    private Button[] boardButtons;
    @FXML
    private Label PO;
    @FXML
    private MediaView mediaView;
    @FXML
    private DialogPane PopUpPane;

    int n;
    @FXML
    private Button yesBtn;
    @FXML
    private Button noBtn;
    MediaPlayer mediaPlayer;
    
    public  void setp1(String _p1,String _p2)
    {  
        Label a= (Label)XOGame.mystage.getScene().lookup("#P1");
        Label b= (Label)XOGame.mystage.getScene().lookup("#P2");
      a.setText(_p1);
      b.setText(_p2);
    } 
    public FXMLDocumentController() {
        this.XOCounter = 0;
        this.isFirstPlayerTurn = 1;
        this.isGameEnds = false;
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

    private void checkIfGameEnds() {

        String t00 = btn0.getText();
        String t01 = btn1.getText();
        String t02 = btn2.getText();
        String t10 = btn3.getText();
        String t11 = btn4.getText();
        String t12 = btn5.getText();
        String t20 = btn6.getText();
        String t21 = btn7.getText();
        String t22 = btn8.getText();

        if (t00.equals(t01) && t00.equals(t02) && !t00.equals("")) {
            isGameEnds = true;
        }

        if (t10.equals(t11) && t10.equals(t12) && !t10.equals("")) {
            isGameEnds = true;
        }

        if (t20.equals(t21) && t20.equals(t22) && !t20.equals("")) {
            isGameEnds = true;
        }

        if (t00.equals(t10) && t00.equals(t20) && !t00.equals("")) {
            isGameEnds = true;
        }

        if (t01.equals(t11) && t01.equals(t21) && !t01.equals("")) {
            isGameEnds = true;
        }

        if (t02.equals(t12) && t02.equals(t22) && !t02.equals("")) {
            isGameEnds = true;
        }

        if (t00.equals(t11) && t00.equals(t22) && !t00.equals("")) {
            isGameEnds = true;
        }

        if (t02.equals(t11) && t02.equals(t20) && !t02.equals("")) {
            isGameEnds = true;
        }

        if (XOCounter >= 9) {
            isGameEnds = true;
            isFirstPlayerTurn = 0;
            XOCounter = 0;
        }
        if (isGameEnds == true) {
            if (isFirstPlayerTurn == 1) {
                scoreX.setText(Integer.valueOf(scoreX.getText()) + 1 + "");
                winner = "player 1";
                wnr.setText(winner + " is winner ");
                wnr.setTextFill(Color.BLUE);
                popVideo();
                if (record) {
                    recordGame();
                    switchRecordOption();
                }

            } else if (isFirstPlayerTurn == 2) {
                scoreO.setText(Integer.valueOf(scoreO.getText()) + 1 + "");
                winner = "player 2";
                wnr.setText(winner + " is winner ");
                wnr.setTextFill(Color.RED);
                popVideo();
                if (record) {
                    recordGame();
                    switchRecordOption();
                }
            } else {
                winner = "there is no winner :( ";
                wnr.setText(winner);
                popVideoDraw();
                if (record) {
                    recordGame();
                    switchRecordOption();
                }
            }
            XOCounter = 0;
        }
    }

    private void setCurrentPlayerSymbol() {
        if (isFirstPlayerTurn == 1) {
            PF.setTextFill(Color.BLUE);
            PF.setText("X");

        } else {
            PF.setTextFill(Color.RED);
            PF.setText("O");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setBackGround();
    }

    @FXML
    protected void set0(ActionEvent e) {
        Button clickedButton = (Button) e.getSource();
        XOCounter++;
        if (isGameEnds == false && clickedButton.getText().equals("")) {
            if (isFirstPlayerTurn == 1) {
                clickedButton.setTextFill(Color.BLUE);
                clickedButton.setText("X");
                hm.put(clickedButton.getId(), "X");
                //insertquery("C:\Users\Developer\Desktop\recordedGames")
            } else {
                clickedButton.setTextFill(Color.RED);
                clickedButton.setText("O");
                hm.put(clickedButton.getId(), "O");
            }
            for (Map.Entry<String, String> entry : hm.entrySet()) {
                System.out.println(entry.getKey() + "  " + entry.getValue());
            }
            checkIfGameEnds();
            setCurrentPlayerSymbol();
            if (isFirstPlayerTurn == 1) {
                isFirstPlayerTurn = 2;
            } else {
                isFirstPlayerTurn = 1;
            }
            setCurrentPlayerSymbol();
        }
    }

    @FXML
    private void switchRecordOption() {
        record = !record;
        recordBtn.setStyle("-fx-background-color:#000");
    }

    private void popVideo() {
        PopUpPane.setVisible(true);
        String path = "E:\\videoplayback.mp4";

        Media media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaView.setMediaPlayer(mediaPlayer);
    }

    private void recordGame() {
        // save to file 
        FileOutputStream fos;
        Path records = Paths.get("C:\\recordedGames");
        try {
            Files.createDirectories(records);
            n = new File("C:\\recordedGames").list().length + 1;
            String selectedFile = "C:\\recordedGames\\game" + n + ".txt";
            saveMap = "";
            saveMap += P1.getText() + "," + scoreX.getText() + "\n";
            saveMap += P2.getText() + "," + scoreO.getText() + "\n";

            for (Map.Entry<String, String> entry : hm.entrySet()) {
                saveMap += entry.getKey() + "," + entry.getValue() + "\n";
            }
            byte[] b = saveMap.getBytes();
            try {
                fos = new FileOutputStream(selectedFile);
                fos.write(b);
                fos.flush();
                fos.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void playAgain() {
        PopUpPane.setVisible(false);
        mediaPlayer.stop();
        isGameEnds = false;
        record = false;
        recordBtn.setSelected(false);
        hm.clear();

        btn0.setText("");
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        checkIfGameEnds();

    }

    @FXML
    private void goToHome(ActionEvent event) {
        PopUpPane.setVisible(false);
        mediaPlayer.stop();
        isGameEnds = false;
        record = false;
        recordBtn.setSelected(false);
        hm.clear();
        scoreO.setText("0");
        scoreX.setText("0");
        // set scene = to main ui scene
        XOGame.bth();
        // ends here ....
        btn0.setText("");
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");

        /*todo*/
        // go to main screen 
    }

    private void popVideoDraw() {
        PopUpPane.setVisible(true);
        String path = "E:\\facepalm.mp4";

        Media media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaView.setMediaPlayer(mediaPlayer);
    }
}
