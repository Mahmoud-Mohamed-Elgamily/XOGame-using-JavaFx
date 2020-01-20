package xogame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public class playersnameBase extends AnchorPane {

    protected final Label label;
    protected final Label label0;
    protected final TextField player1;
    protected final TextField player2;
    protected final Button button;

    public playersnameBase() {

        label = new Label();
        label0 = new Label();
        player1 = new TextField();
        player2 = new TextField();
        button = new Button();

        setId("AnchorPane");
        setPrefHeight(345.0);
        setPrefWidth(407.0);
        setStyle("-fx-background-color: #eac387;");

        label.setLayoutX(58.0);
        label.setLayoutY(98.0);
        label.setText("Player1 ");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#7c541c"));
        label.setFont(new Font("System Bold Italic", 20.0));

        label0.setLayoutX(262.0);
        label0.setLayoutY(98.0);
        label0.setText("Player2");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#7c541c"));
        label0.setFont(new Font("System Bold Italic", 20.0));

        player1.setLayoutX(21.0);
        player1.setLayoutY(141.0);
        player1.setPrefHeight(25.0);
        player1.setPrefWidth(169.0);

        player2.setLayoutX(214.0);
        player2.setLayoutY(141.0);
        player2.setPrefHeight(25.0);
        player2.setPrefWidth(169.0);

        button.setLayoutX(322.0);
        button.setLayoutY(266.0);
        button.setMnemonicParsing(false);
        button.setStyle("-fx-background-color: #7c541c;");
        button.setText("Ok");
        button.setTextFill(javafx.scene.paint.Color.valueOf("#eac387"));
        button.setFont(new Font("System Bold", 12.0));
        
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (player1.getText()!=""&&player2.getText()!="")
                {
                    FXMLDocumentController setplayersname=new FXMLDocumentController();
                    System.err.println(player1.getText());
                    System.err.println(player2.getText());
                    setplayersname.setp1(player1.getText(), player2.getText());
                }
            }
        });

        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(player1);
        getChildren().add(player2);
        getChildren().add(button);

    }
}
