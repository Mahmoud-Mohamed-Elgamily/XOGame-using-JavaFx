/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

import java.util.Random;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

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

    // singlehh l=new singlehh();
    //ActionEvent event=new ActionEvent();
    Button clickedbutton;
    int counter;
    Button[] buttons;
    int numx,numo;

    public Controller(Button[] _buttons, Label x, Label o) {
        buttons = _buttons;
        scorex = x;
        scoreo = o;

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
        } else {
            numo++;
            scoreo.setText(Integer.toString(numo));
        }

    }

    class clicked implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent event) {
            Button clicked = (Button) event.getSource();
            if (getwinner() == false&&clicked.getText()=="") {
                clicked.setText("X");
                flageplayer = false;
                play();
                //clicked.setDisable(true);
                if (getwinner())
                {whowin();}
            }
               
            
        }
        //To change body of generated methods, choose Tools | Templates.
    }
}
