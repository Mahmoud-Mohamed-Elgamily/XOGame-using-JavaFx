package xogame;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import xogame.Controller;

public  class singlehh extends BorderPane {
    
    protected final Pane pane;
    protected final Pane pane0;
    protected final Pane pane1;
    protected final ToggleButton record;
    protected final AnchorPane anchorPane;
    protected final Label label;
    protected final Label label0;
    public  Label scorex;
    protected final Label label1;
    protected final Label label2;
    public final Label scoreo;
    protected  GridPane gridPane;
   /* protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
   */
    protected  Button[] Buttons=new Button[9];
    public singlehh(Stage stage) {

        pane = new Pane();
        pane0 = new Pane();
        pane1 = new Pane();
        record = new ToggleButton();
        anchorPane = new AnchorPane();
        label = new Label();
        label0 = new Label();
        scorex = new Label();
        label1 = new Label();
        label2 = new Label();
        scoreo = new Label();
        gridPane = new GridPane();
        //columnConstraints = new ColumnConstraints();
       /* columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();*/
        Buttons[0] = new Button();
        Buttons[3] = new Button();
        Buttons[2] = new Button();
        Buttons[1] = new Button();
        Buttons[4] = new Button();
        Buttons[6] = new Button();
        Buttons[7] = new Button();
        Buttons[5] = new Button();
        Buttons[8] = new Button();

        setPrefHeight(424.0);
        setPrefWidth(622.0);

        BorderPane.setAlignment(pane, javafx.geometry.Pos.CENTER);
        pane.setPrefHeight(247.0);
        pane.setPrefWidth(141.0);
        setLeft(pane);

        BorderPane.setAlignment(pane0, javafx.geometry.Pos.CENTER);
        pane0.setPrefHeight(247.0);
        pane0.setPrefWidth(172.0);
        setRight(pane0);

        BorderPane.setAlignment(pane1, javafx.geometry.Pos.CENTER);
        pane1.setPrefHeight(119.0);
        pane1.setPrefWidth(622.0);

        record.setLayoutX(538.0);
        record.setLayoutY(60.0);
        record.setMnemonicParsing(false);
        record.setText("Record");
        setBottom(pane1);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(58.0);
        anchorPane.setPrefWidth(622.0);

        label.setLayoutX(518.0);
        label.setLayoutY(17.0);
        label.setText("Computer");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#e32619"));
        label.setFont(new Font(18.0));

        label0.setLayoutX(128.0);
        label0.setLayoutY(17.0);
        label0.setText("X");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#17a1e5"));
        label0.setFont(new Font(18.0));

        scorex.setLayoutX(189.0);
        scorex.setLayoutY(22.0);
        scorex.setPrefHeight(16.0);
        scorex.setPrefWidth(38.0);
        scorex.setText("0");
        scorex.setTextFill(javafx.scene.paint.Color.valueOf("#17a1e5"));

        label1.setLayoutX(473.0);
        label1.setLayoutY(16.0);
        label1.setText("O");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#e32619"));
        label1.setFont(new Font(17.0));

        label2.setLayoutX(33.0);
        label2.setLayoutY(17.0);
        label2.setPrefHeight(17.0);
        label2.setPrefWidth(58.0);
        label2.setText("Player1");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#17a1e5"));
        label2.setFont(new Font(18.0));

        scoreo.setLayoutX(416.0);
        scoreo.setLayoutY(22.0);
        scoreo.setText("0");
        scoreo.setTextFill(javafx.scene.paint.Color.valueOf("#e32619"));
        setTop(anchorPane);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);
        gridPane.setPrefHeight(132.0);
        gridPane.setPrefWidth(222.0);

        /*columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
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
*/
        Buttons[0].setMnemonicParsing(false);
        Buttons[0].setPrefHeight(88.0);
        Buttons[0].setPrefWidth(103.0);
       

        GridPane.setRowIndex(Buttons[3], 1);
        Buttons[3].setLayoutX(10.0);
        Buttons[3].setLayoutY(10.0);
        Buttons[3].setMnemonicParsing(false);
        Buttons[3].setPrefHeight(80.0);
        Buttons[3].setPrefWidth(132.0);

        GridPane.setColumnIndex(Buttons[2], 2);
        Buttons[2].setLayoutX(10.0);
        Buttons[2].setLayoutY(10.0);
        Buttons[2].setMnemonicParsing(false);
        Buttons[2].setPrefHeight(88.0);
        Buttons[2].setPrefWidth(103.0);

        GridPane.setColumnIndex(Buttons[1], 1);
        Buttons[1].setLayoutX(10.0);
        Buttons[1].setLayoutY(10.0);
        Buttons[1].setMnemonicParsing(false);
        Buttons[1].setPrefHeight(90.0);
        Buttons[1].setPrefWidth(103.0);

        GridPane.setColumnIndex(Buttons[4], 1);
        GridPane.setRowIndex(Buttons[4], 1);
        Buttons[4].setMnemonicParsing(false);
        Buttons[4].setPrefHeight(80.0);
        Buttons[4].setPrefWidth(132.0);

        GridPane.setRowIndex(Buttons[6], 2);
        Buttons[6].setLayoutX(140.0);
        Buttons[6].setLayoutY(86.0);
        Buttons[6].setMnemonicParsing(false);
        Buttons[6].setPrefHeight(88.0);
        Buttons[6].setPrefWidth(103.0);

        GridPane.setColumnIndex(Buttons[7], 1);
        GridPane.setRowIndex(Buttons[7], 2);
        Buttons[7].setLayoutX(140.0);
        Buttons[7].setLayoutY(86.0);
        Buttons[7].setMnemonicParsing(false);
        Buttons[7].setPrefHeight(85.0);
        Buttons[7].setPrefWidth(103.0);

        GridPane.setColumnIndex(Buttons[5], 2);
        GridPane.setRowIndex(Buttons[5], 1);
        Buttons[5].setLayoutX(140.0);
        Buttons[5].setLayoutY(86.0);
        Buttons[5].setMnemonicParsing(false);
        Buttons[5].setPrefHeight(80.0);
        Buttons[5].setPrefWidth(132.0);

        GridPane.setColumnIndex(Buttons[8], 2);
        GridPane.setRowIndex(Buttons[8], 2);
        Buttons[8].setLayoutX(269.0);
        Buttons[8].setLayoutY(86.0);
        Buttons[8].setMnemonicParsing(false);
        Buttons[8].setPrefHeight(86.0);
        Buttons[8].setPrefWidth(103.0);
        //Button=new Buttons[]{Buttons[0],Buttons[1],Buttons[2],Buttons[3],Buttons[4],Buttons[5],Buttons[6],Buttons[7],Buttons[8]};
        BackgroundImage myBI= new BackgroundImage(new Image("/img/Background.jpg",false),
        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
         BackgroundSize.DEFAULT);
        setCenter(gridPane);
        this.setBackground(new Background(myBI));
        
        pane1.getChildren().add(record);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(scorex);
        anchorPane.getChildren().add(label1);
        anchorPane.getChildren().add(label2);
        anchorPane.getChildren().add(scoreo);
        /*gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);*/
        gridPane.getChildren().add(Buttons[0]);
        gridPane.getChildren().add(Buttons[3]);
        gridPane.getChildren().add(Buttons[2]);
        gridPane.getChildren().add(Buttons[1]);
        gridPane.getChildren().add(Buttons[4]);
        gridPane.getChildren().add(Buttons[6]);
        gridPane.getChildren().add(Buttons[7]);
        gridPane.getChildren().add(Buttons[5]);
        gridPane.getChildren().add(Buttons[8]);
        new Controller(Buttons,scorex,scoreo);
        
        
    }

    
}
