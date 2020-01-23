/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

import java.io.File;
import java.util.Optional;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import static javafx.scene.control.ButtonType.OK;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 *
 * @author User
 */
public class Controller {

    boolean flageplayer;
    Random rn = new Random();
    int rnumber;
    int i;
    Label scorex;
    Label scoreo;
    public String win;
    MediaPlayer mediaPlayer;
    protected final BorderPane borderPane;
    public MediaView mediaView;
    public DialogPane PopUpPane;

   
    Button clickedbutton;
    int counter = 0;
    Button[] buttons;
    int numx, numo;

    public Controller(Button[] _buttons, Label x, Label o, DialogPane _PopUpPane, MediaView _mediaView, BorderPane _borderPane,Button Back) {
        buttons = _buttons;
        scorex = x;
        scoreo = o;
        PopUpPane = _PopUpPane;
        mediaView = _mediaView;
        borderPane = _borderPane;
        PopUpPane.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (getwinner()) {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "do you want to play again!!");
                    Optional<ButtonType> response = alert.showAndWait();
                    if (response.get() == ButtonType.OK) {
                        PopUpPane.setVisible(false);
                        mediaPlayer.stop();
                        PopUpPane.setDisable(true);
                        borderPane.setVisible(true);

                        for (i = 0; i < 9; i++) {
                            buttons[i].setText("");

                        }
                        win = "";
                        counter = 0;

                    } else {
                        
                            back();

                        }

                }}});
        Back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                back();
            }
        });
                

                
       

        for (i = 0; i < 9; i++) {
            buttons[i].setOnMouseClicked(new clicked());
        }
        
    }

    public void play() {
        if (getwinner() == false) {
            counter++;
            while (flageplayer == false) {
                rnumber = rn.nextInt(8);
                if (buttons[rnumber].getText().equals("")) {
                    buttons[rnumber].setText("O");
                    // buttons[rnumber].setDisable(true);
                    flageplayer = true;
                }
            }
        }
    }

    public boolean getwinner() {
        if ((buttons[0].getText() == buttons[1].getText()) && (buttons[1].getText() == buttons[2].getText()) && buttons[0].getText() != "") {
            {
                win = buttons[0].getText();
                return true;
            }
        }
        if (buttons[3].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[5].getText()) && buttons[3].getText() != "") {
            {
                win = buttons[3].getText();
                return true;
            }
        }
        if (buttons[6].getText().equals(buttons[7].getText()) && buttons[7].getText().equals(buttons[8].getText()) && buttons[6].getText() != "") {

            {
                win = buttons[6].getText();
                return true;
            }
        }
        if (buttons[0].getText().equals(buttons[3].getText()) && buttons[3].getText().equals(buttons[6].getText()) && buttons[0].getText() != "") {
            {
                win = buttons[0].getText();
                return true;
            }
        }
        if (buttons[1].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[7].getText()) && buttons[1].getText() != "") {
            {
                win = buttons[1].getText();
                return true;
            }
        }
        if (buttons[2].getText().equals(buttons[5].getText()) && buttons[5].getText().equals(buttons[8].getText()) && buttons[2].getText() != "") {
            {
                win = buttons[2].getText();
                return true;
            }
        }
        if (buttons[0].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[8].getText()) && buttons[0].getText() != "") {
            {
                win = buttons[0].getText();
                return true;
            }
        }
        if (buttons[2].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[6].getText()) && buttons[2].getText() != "") {
            {
                win = buttons[2].getText();
                return true;
            }
        }
        if (counter == 9) {
            return true;
        }

        return false;

    }

    public void whowin() {
        if (win == "X") {
            numx++;
            scorex.setText(Integer.toString(numx));
            popVideo();
        } else if (win == "O") {
            numo++;
            scoreo.setText(Integer.toString(numo));
            popVideoloser();

        } else {
            popVideoDraw();
        }

    }

    class clicked implements EventHandler<MouseEvent> {

        @Override
        public void handle(MouseEvent event) {
            Button clicked = (Button) event.getSource();
            if (getwinner() == false && clicked.getText() == "") {
                clicked.setText("X");
                flageplayer = false;
                counter++;
                play();

                if (getwinner()) {
                    whowin();
                }
            }

        }
        //To change body of generated methods, choose Tools | Templates.
    }

    public void popVideoloser() {
        PopUpPane.setVisible(true);
        String path = "E:\\loser.mp4";
        borderPane.setVisible(false);
        Media media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaView.setMediaPlayer(mediaPlayer);
        PopUpPane.setDisable(false);
    }

    public void popVideoDraw() {
        PopUpPane.setVisible(true);
        String path = "E:\\facepalm.mp4";
        borderPane.setVisible(false);
        Media media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaView.setMediaPlayer(mediaPlayer);
        PopUpPane.setDisable(false);
    }

    private void popVideo() {
        PopUpPane.setVisible(true);
        borderPane.setVisible(false);
        String path = "E:\\videoplayback.mp4";

        Media media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaView.setMediaPlayer(mediaPlayer);
        PopUpPane.setDisable(false);

    }
    public void back(){
        XOGame.bth();
                        mediaPlayer.stop();
                        win = "";
                        counter = 0;
                        numx = numo = 0;
                        PopUpPane.setVisible(false);
                        mediaPlayer.stop();
                        PopUpPane.setDisable(true);
                        borderPane.setVisible(true);
                        scoreo.setText("0");
                        scorex.setText("0");
                        for (i = 0; i < 9; i++) {
                            buttons[i].setText("");
    }
}
}