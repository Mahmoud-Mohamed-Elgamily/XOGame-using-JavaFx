package xogame;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public class ipBase extends AnchorPane {

    protected final Label label;
    protected final TextField textField;
    protected final Button button;
    protected static Socket mySocket ;
    public ipBase() {

        label = new Label();
        textField = new TextField();
        button = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(319.0);
        setPrefWidth(397.0);
        setStyle("-fx-background-color: #eac387;");

        label.setLayoutX(48.0);
        label.setLayoutY(72.0);
        label.setPrefHeight(42.0);
        label.setPrefWidth(57.0);
        label.setText("IP ");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#7c541c"));
        label.setFont(new Font("System Bold Italic", 20.0));

        textField.setLayoutX(109.0);
        textField.setLayoutY(81.0);
        textField.setPrefHeight(25.0);
        textField.setPrefWidth(183.0);
        textField.setPromptText("Please ener ip");

        button.setLayoutX(143.0);
        button.setLayoutY(225.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(34.0);
        button.setPrefWidth(111.0);
        button.setStyle("-fx-background-color: #7c541c;");
        button.setText("Submit");
        button.setTextFill(javafx.scene.paint.Color.valueOf("#dab483"));
        button.setFont(new Font("System Bold", 12.0));
        
    
        getChildren().add(label);
        getChildren().add(textField);
        getChildren().add(button);
}
    public boolean validate(final String ip) {
    String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";

    return ip.matches(PATTERN);
}
}
    