package xogame;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import static xogame.XOGame.scene;
import static xogame.XOGame.scene9;

public  class onlinePlayersUiBase extends AnchorPane {

    protected final ListView nameLView;
    protected final Button button;
    protected final Button button0;
    protected final ListView scoreLView;
    protected final Label label;
    protected final Label label0;
    protected final Button button1;

    public onlinePlayersUiBase() {

        nameLView = new ListView();
        button = new Button();
        button0 = new Button();
        scoreLView = new ListView();
        label = new Label();
        label0 = new Label();
        button1 = new Button();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        nameLView.setLayoutX(100.0);
        nameLView.setLayoutY(100.0);
        nameLView.setPrefHeight(200.0);
        nameLView.setPrefWidth(200.0);

        button.setLayoutX(395.0);
        button.setLayoutY(131.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::requestGame);
        button.setText("Request Match");

        button0.setLayoutX(419.0);
        button0.setLayoutY(251.0);
        button0.setMnemonicParsing(false);
        button0.setOnAction(this::takeMeHome);
        button0.setText("Home");

        scoreLView.setLayoutX(66.0);
        scoreLView.setLayoutY(100.0);
        scoreLView.setPrefHeight(200.0);
        scoreLView.setPrefWidth(34.0);

        label.setLayoutX(65.0);
        label.setLayoutY(74.0);
        label.setText("Score :");

        label0.setLayoutX(114.0);
        label0.setLayoutY(74.0);
        label0.setText("Player Name");

        button1.setLayoutX(415.0);
        button1.setLayoutY(188.0);
        button1.setMnemonicParsing(false);
        button1.setOnAction(this::refreshOnlinePlayers);
        button1.setText("Refresh");

        getChildren().add(nameLView);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(scoreLView);
        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(button1);

    }

    protected  void requestGame(javafx.event.ActionEvent actionEvent){
        try {
            scene9 = new Scene(FXMLLoader.load(getClass().getResource("OnlinePlayersBoardUi.fxml")));
            
            XOGame.window.setScene(scene9);
            XOGame.window.show();
        } catch (IOException ex) {
            Logger.getLogger(onlinePlayersUiBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected  void takeMeHome(javafx.event.ActionEvent actionEvent)
    {  XOGame.bth();}

    protected  void refreshOnlinePlayers(javafx.event.ActionEvent actionEvent){
        SignInnController.ps.println("names.");
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(OnlinePlayersUiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        XOGame.Check();}

}
