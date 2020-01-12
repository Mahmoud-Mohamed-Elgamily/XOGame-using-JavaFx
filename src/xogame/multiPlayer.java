package xogame;

import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class multiPlayer extends DialogPane {

    protected final Label P1;
    protected final Label PX;
    protected final Label scoreX;
    protected final Label scoreO;
    protected final Label PO;
    protected final Label P2;
    protected final Label label;
    protected final Label PF;
    protected final Separator separator;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button btn0;
    protected final Button btn1;
    protected final Button btn2;
    protected final Button btn3;
    protected final Button btn4;
    protected final Button btn5;
    protected final Button btn6;
    protected final Button btn7;
    protected final Button btn8;
    protected final ToggleButton recordBtn;
    protected final DialogPane PopUpPane;
    protected final AnchorPane anchorPane;
    protected final Label wnr;
    protected final MediaView mediaView;
    protected final Button yesBtn;
    protected final Button noBtn;
    protected final Label label0;

    public multiPlayer(Stage s) {

        P1 = new Label();
        PX = new Label();
        scoreX = new Label();
        scoreO = new Label();
        PO = new Label();
        P2 = new Label();
        label = new Label();
        PF = new Label();
        separator = new Separator();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        btn0 = new Button();
        btn1 = new Button();
        btn2 = new Button();
        btn3 = new Button();
        btn4 = new Button();
        btn5 = new Button();
        btn6 = new Button();
        btn7 = new Button();
        btn8 = new Button();
        recordBtn = new ToggleButton();
        PopUpPane = new DialogPane();
        anchorPane = new AnchorPane();
        wnr = new Label();
        mediaView = new MediaView();
        yesBtn = new Button();
        noBtn = new Button();
        label0 = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(424.0);
        setPrefWidth(622.0);

        P1.setLayoutX(25.0);
        P1.setLayoutY(23.0);
        P1.setPrefHeight(29.0);
        P1.setPrefWidth(58.0);
        P1.setText("Player1");
        P1.setTextFill(javafx.scene.paint.Color.BLUE);
        P1.setFont(new Font(18.0));

        PX.setLayoutX(126.0);
        PX.setLayoutY(28.0);
        PX.setText("X");
        PX.setTextFill(javafx.scene.paint.Color.BLUE);
        PX.setFont(new Font(14.0));

        scoreX.setLayoutX(189.0);
        scoreX.setLayoutY(31.0);
        scoreX.setText("0");
        scoreX.setTextFill(javafx.scene.paint.Color.BLUE);

        scoreO.setLayoutX(371.0);
        scoreO.setLayoutY(29.0);
        scoreO.setText("0");
        scoreO.setTextFill(javafx.scene.paint.Color.valueOf("#e53312"));

        PO.setLayoutX(456.0);
        PO.setLayoutY(29.0);
        PO.setText("O");
        PO.setTextFill(javafx.scene.paint.Color.valueOf("#e53312"));
        PO.setFont(new Font(14.0));

        P2.setLayoutX(520.0);
        P2.setLayoutY(24.0);
        P2.setText("Player2");
        P2.setTextFill(javafx.scene.paint.Color.valueOf("#e53312"));
        P2.setFont(new Font(18.0));

        label.setLayoutX(198.0);
        label.setLayoutY(330.0);
        label.setPrefHeight(39.0);
        label.setPrefWidth(166.0);
        label.setText("Current Player: ");
        label.setFont(new Font(18.0));

        PF.setLayoutX(342.0);
        PF.setLayoutY(339.0);
        PF.setPrefHeight(17.0);
        PF.setPrefWidth(58.0);

        separator.setLayoutX(105.0);
        separator.setLayoutY(320.0);
        separator.setPrefHeight(17.0);
        separator.setPrefWidth(395.0);

        gridPane.setLayoutX(114.0);
        gridPane.setLayoutY(78.0);
        gridPane.setPrefHeight(234.0);
        gridPane.setPrefWidth(388.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        btn0.setFocusTraversable(false);
        btn0.setMnemonicParsing(false);
        btn0.setOnAction(this::set0);
        btn0.setPrefHeight(76.0);
        btn0.setPrefWidth(131.0);
        btn0.setFont(new Font(36.0));

        GridPane.setColumnIndex(btn1, 1);
        btn1.setFocusTraversable(false);
        btn1.setMnemonicParsing(false);
        btn1.setOnAction(this::set0);
        btn1.setPrefHeight(76.0);
        btn1.setPrefWidth(131.0);
        btn1.setFont(new Font(36.0));

        GridPane.setColumnIndex(btn2, 2);
        btn2.setFocusTraversable(false);
        btn2.setMnemonicParsing(false);
        btn2.setOnAction(this::set0);
        btn2.setPrefHeight(67.0);
        btn2.setPrefWidth(131.0);
        btn2.setFont(new Font(36.0));

        GridPane.setRowIndex(btn3, 1);
        btn3.setFocusTraversable(false);
        btn3.setMnemonicParsing(false);
        btn3.setOnAction(this::set0);
        btn3.setPrefHeight(76.0);
        btn3.setPrefWidth(131.0);
        btn3.setFont(new Font(36.0));

        GridPane.setColumnIndex(btn4, 1);
        GridPane.setRowIndex(btn4, 1);
        btn4.setFocusTraversable(false);
        btn4.setMnemonicParsing(false);
        btn4.setOnAction(this::set0);
        btn4.setPrefHeight(76.0);
        btn4.setPrefWidth(131.0);
        btn4.setFont(new Font(36.0));

        GridPane.setColumnIndex(btn5, 2);
        GridPane.setRowIndex(btn5, 1);
        btn5.setFocusTraversable(false);
        btn5.setMnemonicParsing(false);
        btn5.setOnAction(this::set0);
        btn5.setPrefHeight(76.0);
        btn5.setPrefWidth(131.0);
        btn5.setFont(new Font(36.0));

        GridPane.setRowIndex(btn6, 2);
        btn6.setFocusTraversable(false);
        btn6.setMnemonicParsing(false);
        btn6.setOnAction(this::set0);
        btn6.setPrefHeight(76.0);
        btn6.setPrefWidth(131.0);
        btn6.setFont(new Font(36.0));

        GridPane.setColumnIndex(btn7, 1);
        GridPane.setRowIndex(btn7, 2);
        btn7.setFocusTraversable(false);
        btn7.setMnemonicParsing(false);
        btn7.setOnAction(this::set0);
        btn7.setPrefHeight(76.0);
        btn7.setPrefWidth(131.0);
        btn7.setFont(new Font(36.0));

        GridPane.setColumnIndex(btn8, 2);
        GridPane.setRowIndex(btn8, 2);
        btn8.setFocusTraversable(false);
        btn8.setMnemonicParsing(false);
        btn8.setOnAction(this::set0);
        btn8.setPrefHeight(76.0);
        btn8.setPrefWidth(131.0);
        btn8.setFont(new Font(36.0));

        recordBtn.setLayoutX(526.0);
        recordBtn.setLayoutY(367.0);
        recordBtn.setMnemonicParsing(false);
        recordBtn.setOnAction(this::switchRecordOption);
        recordBtn.setText("Record");

        PopUpPane.setLayoutX(26.0);
        PopUpPane.setLayoutY(51.0);
        PopUpPane.setMinHeight(350.0);
        PopUpPane.setPrefHeight(350.0);
        PopUpPane.setPrefWidth(568.0);
        PopUpPane.setVisible(false);

        anchorPane.setPrefHeight(354.0);
        anchorPane.setPrefWidth(568.0);

        wnr.setLayoutX(131.0);
        wnr.setLayoutY(1.0);
        wnr.setPrefHeight(17.0);
        wnr.setPrefWidth(292.0);
        wnr.setText("Label");
        wnr.setFont(new Font(18.0));

        mediaView.setFitHeight(250.0);
        mediaView.setFitWidth(300.0);
        mediaView.setLayoutX(134.0);
        mediaView.setLayoutY(28.0);

        yesBtn.setLayoutX(177.0);
        yesBtn.setLayoutY(309.0);
        yesBtn.setMnemonicParsing(false);
        yesBtn.setOnAction(this::playAgain);
        yesBtn.setText("Yes");
        yesBtn.setFont(new Font(18.0));

        noBtn.setLayoutX(333.0);
        noBtn.setLayoutY(309.0);
        noBtn.setMnemonicParsing(false);
        noBtn.setOnAction(this::goToHome);
        noBtn.setText("No");
        noBtn.setFont(new Font(18.0));

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setLayoutX(138.0);
        label0.setLayoutY(278.0);
        label0.setPrefHeight(17.0);
        label0.setPrefWidth(292.0);
        label0.setText("Wanna Play again ?");
        label0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label0.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);
        label0.setFont(new Font(18.0));
        PopUpPane.setHeader(anchorPane);

        getChildren().add(P1);
        getChildren().add(PX);
        getChildren().add(scoreX);
        getChildren().add(scoreO);
        getChildren().add(PO);
        getChildren().add(P2);
        getChildren().add(label);
        getChildren().add(PF);
        getChildren().add(separator);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(btn0);
        gridPane.getChildren().add(btn1);
        gridPane.getChildren().add(btn2);
        gridPane.getChildren().add(btn3);
        gridPane.getChildren().add(btn4);
        gridPane.getChildren().add(btn5);
        gridPane.getChildren().add(btn6);
        gridPane.getChildren().add(btn7);
        gridPane.getChildren().add(btn8);
        getChildren().add(gridPane);
        getChildren().add(recordBtn);
        anchorPane.getChildren().add(wnr);
        anchorPane.getChildren().add(mediaView);
        anchorPane.getChildren().add(yesBtn);
        anchorPane.getChildren().add(noBtn);
        anchorPane.getChildren().add(label0);
        getChildren().add(PopUpPane);

    }

    protected void set0(javafx.event.ActionEvent actionEvent){
        
    }

    protected void switchRecordOption(javafx.event.ActionEvent actionEvent){
        
    }

    protected void playAgain(javafx.event.ActionEvent actionEvent){
        
    }

    protected void goToHome(javafx.event.ActionEvent actionEvent){
        
    }

}
