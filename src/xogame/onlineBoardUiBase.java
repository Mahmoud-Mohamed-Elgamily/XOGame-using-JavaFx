package xogame;

import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;

public class onlineBoardUiBase extends DialogPane {

    protected final Line line;
    protected final Line line0;
    protected final Line line1;
    protected final Line line2;
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

    public onlineBoardUiBase() {

        line = new Line();
        line0 = new Line();
        line1 = new Line();
        line2 = new Line();
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
        setStyle("-fx-background-color: #eac387;");

        line.setEndX(354.0);
        line.setEndY(300.0);
        line.setLayoutX(20.0);
        line.setLayoutY(20.0);
        line.setStartX(354.0);
        line.setStartY(86.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#964b00"));
        line.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        line.setStrokeWidth(6.0);

        line0.setEndX(502.0);
        line0.setEndY(173.0);
        line0.setStartX(114.0);
        line0.setStartY(173.0);
        line0.setStroke(javafx.scene.paint.Color.valueOf("#964b00"));
        line0.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        line0.setStrokeWidth(6.0);

        line1.setEndX(492.0);
        line1.setEndY(237.0);
        line1.setLayoutX(10.0);
        line1.setLayoutY(10.0);
        line1.setStartX(106.0);
        line1.setStartY(237.0);
        line1.setStroke(javafx.scene.paint.Color.valueOf("#964b00"));
        line1.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        line1.setStrokeWidth(6.0);

        line2.setEndX(224.0);
        line2.setEndY(301.0);
        line2.setLayoutX(20.0);
        line2.setLayoutY(20.0);
        line2.setStartX(224.0);
        line2.setStartY(88.0);
        line2.setStroke(javafx.scene.paint.Color.valueOf("#964b00"));
        line2.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        line2.setStrokeWidth(6.0);

        P1.setLayoutX(26.0);
        P1.setLayoutY(46.0);
        P1.setPrefHeight(30.0);
        P1.setPrefWidth(111.0);
        P1.setText("Player1");
        P1.setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        P1.setFont(new Font("Felix Titling", 18.0));

        PX.setLayoutX(161.0);
        PX.setLayoutY(51.0);
        PX.setText("X");
        PX.setFont(new Font(14.0));

        scoreX.setLayoutX(219.0);
        scoreX.setLayoutY(42.0);
        scoreX.setText("0");
        scoreX.setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        scoreX.setFont(new Font(28.0));

        scoreO.setLayoutX(545.0);
        scoreO.setLayoutY(41.0);
        scoreO.setText("0");
        scoreO.setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        scoreO.setFont(new Font(28.0));

        PO.setLayoutX(489.0);
        PO.setLayoutY(51.0);
        PO.setText("O");
        PO.setFont(new Font(14.0));

        P2.setLayoutX(352.0);
        P2.setLayoutY(47.0);
        P2.setPrefHeight(30.0);
        P2.setPrefWidth(111.0);
        P2.setText("Player2");
        P2.setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        P2.setFont(new Font("Felix Titling", 18.0));

        label.setLayoutX(33.0);
        label.setLayoutY(348.0);
        label.setPrefHeight(65.0);
        label.setPrefWidth(129.0);
        label.setText("Current Player: ");
        label.setFont(new Font("Forte", 18.0));

        PF.setLayoutX(169.0);
        PF.setLayoutY(366.0);
        PF.setPrefHeight(30.0);
        PF.setPrefWidth(74.0);
        PF.setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        PF.setFont(new Font("Forte", 18.0));

        separator.setLayoutX(130.0);
        separator.setLayoutY(331.0);
        separator.setPrefHeight(17.0);
        separator.setPrefWidth(370.0);
        separator.setVisible(false);

        gridPane.setLayoutX(116.0);
        gridPane.setLayoutY(115.0);
        gridPane.setPrefHeight(195.0);
        gridPane.setPrefWidth(385.0);
        gridPane.setStyle("-fx-border-color: #eac387;");

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
        btn0.setStyle("-fx-background-color: none;");
        btn0.setFont(new Font(36.0));

        GridPane.setColumnIndex(btn1, 1);
        btn1.setFocusTraversable(false);
        btn1.setMnemonicParsing(false);
        btn1.setOnAction(this::set0);
        btn1.setPrefHeight(76.0);
        btn1.setPrefWidth(131.0);
        btn1.setStyle("-fx-background-color: none;");
        btn1.setFont(new Font(36.0));

        GridPane.setColumnIndex(btn2, 2);
        btn2.setFocusTraversable(false);
        btn2.setMnemonicParsing(false);
        btn2.setOnAction(this::set0);
        btn2.setPrefHeight(67.0);
        btn2.setPrefWidth(131.0);
        btn2.setStyle("-fx-background-color: none;");
        btn2.setFont(new Font(36.0));

        GridPane.setRowIndex(btn3, 1);
        btn3.setFocusTraversable(false);
        btn3.setMnemonicParsing(false);
        btn3.setOnAction(this::set0);
        btn3.setPrefHeight(76.0);
        btn3.setPrefWidth(131.0);
        btn3.setStyle("-fx-background-color: none;");
        btn3.setFont(new Font(36.0));

        GridPane.setColumnIndex(btn4, 1);
        GridPane.setRowIndex(btn4, 1);
        btn4.setFocusTraversable(false);
        btn4.setMnemonicParsing(false);
        btn4.setOnAction(this::set0);
        btn4.setPrefHeight(76.0);
        btn4.setPrefWidth(131.0);
        btn4.setStyle("-fx-background-color: none;");
        btn4.setFont(new Font(36.0));

        GridPane.setColumnIndex(btn5, 2);
        GridPane.setRowIndex(btn5, 1);
        btn5.setFocusTraversable(false);
        btn5.setMnemonicParsing(false);
        btn5.setOnAction(this::set0);
        btn5.setPrefHeight(76.0);
        btn5.setPrefWidth(131.0);
        btn5.setStyle("-fx-background-color: none;");
        btn5.setFont(new Font(36.0));

        GridPane.setRowIndex(btn6, 2);
        btn6.setFocusTraversable(false);
        btn6.setMnemonicParsing(false);
        btn6.setOnAction(this::set0);
        btn6.setPrefHeight(76.0);
        btn6.setPrefWidth(131.0);
        btn6.setStyle("-fx-background-color: none;");
        btn6.setFont(new Font(36.0));

        GridPane.setColumnIndex(btn7, 1);
        GridPane.setRowIndex(btn7, 2);
        btn7.setFocusTraversable(false);
        btn7.setMnemonicParsing(false);
        btn7.setOnAction(this::set0);
        btn7.setPrefHeight(76.0);
        btn7.setPrefWidth(131.0);
        btn7.setStyle("-fx-background-color: none;");
        btn7.setFont(new Font(36.0));

        GridPane.setColumnIndex(btn8, 2);
        GridPane.setRowIndex(btn8, 2);
        btn8.setFocusTraversable(false);
        btn8.setMnemonicParsing(false);
        btn8.setOnAction(this::set0);
        btn8.setPrefHeight(76.0);
        btn8.setPrefWidth(131.0);
        btn8.setStyle("-fx-background-color: none;");
        btn8.setFont(new Font(36.0));

        recordBtn.setLayoutX(483.0);
        recordBtn.setLayoutY(361.0);
        recordBtn.setMnemonicParsing(false);
        recordBtn.setOnAction(this::switchRecordOption);
        recordBtn.setPrefHeight(40.0);
        recordBtn.setPrefWidth(111.0);
        recordBtn.setStyle("-fx-background-color: #964b00;");
        recordBtn.setText("Record");
        recordBtn.setTextFill(javafx.scene.paint.Color.valueOf("#eac387"));
        recordBtn.setFont(new Font("Forte", 24.0));

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

        getChildren().add(line);
        getChildren().add(line0);
        getChildren().add(line1);
        getChildren().add(line2);
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

    protected void set0(javafx.event.ActionEvent actionEvent) {
    }

    protected void switchRecordOption(javafx.event.ActionEvent actionEvent) {
    }

    protected void playAgain(javafx.event.ActionEvent actionEvent) {
    }

    protected void goToHome(javafx.event.ActionEvent actionEvent) {
    }

}
