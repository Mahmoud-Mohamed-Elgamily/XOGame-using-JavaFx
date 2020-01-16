package xogame;

import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class Singlee extends AnchorPane {

    protected final ImageView imageView;
    protected final BorderPane borderPane;
    protected final Pane pane;
    protected final ImageView imageView0;
    protected final Pane pane0;
    protected final ToggleButton record;
    protected final InnerShadow innerShadow;
    protected final AnchorPane anchorPane;
    protected final Label label;
    protected final Label label0;
    protected final Label scorex;
    protected final Label label1;
    protected final Label label2;
    protected final Label scoreo;
    protected final Pane pane1;
    protected final DialogPane PopUpPane;
    protected final AnchorPane anchorPane0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final ImageView imageView3;
    protected final ImageView imageView4;
    protected final Button Buttons[]=new Button[9];
    protected final Pane pane2;

    public Singlee() {

        imageView = new ImageView();
        borderPane = new BorderPane();
        pane = new Pane();
        imageView0 = new ImageView();
        pane0 = new Pane();
        record = new ToggleButton();
        innerShadow = new InnerShadow();
        anchorPane = new AnchorPane();
        label = new Label();
        label0 = new Label();
        scorex = new Label();
        label1 = new Label();
        label2 = new Label();
        scoreo = new Label();
        pane1 = new Pane();
        PopUpPane = new DialogPane();
        anchorPane0 = new AnchorPane();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();
        imageView4 = new ImageView();
        Buttons[0] = new Button();
        Buttons[8] = new Button();
        Buttons[5] = new Button();
        Buttons[4] = new Button();
        Buttons[6] = new Button();
        Buttons[3] = new Button();
        Buttons[7] = new Button();
        Buttons[1] = new Button();
        Buttons[2] = new Button();
        pane2 = new Pane();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(412.0);
        setPrefWidth(626.0);
        setStyle("-fx-background-color: trasparent;");

        imageView.setFitHeight(433.0);
        imageView.setFitWidth(655.0);
        imageView.setLayoutX(-12.0);
        imageView.setLayoutY(-9.0);
        imageView.setPickOnBounds(true);
        imageView.setSmooth(false);
        imageView.setImage(new Image(getClass().getResource("/img/kisspng-desktop-wallpaper-papyrus-parchment-history-of-pap-banquet-5ac4addba54536.423433351522839003677.png").toExternalForm()));

        borderPane.setLayoutX(-6.0);
        borderPane.setPrefHeight(400.0);
        borderPane.setPrefWidth(608.0);

        BorderPane.setAlignment(pane, javafx.geometry.Pos.CENTER);
        pane.setPrefHeight(222.0);
        pane.setPrefWidth(101.0);

        imageView0.setFitHeight(60.0);
        imageView0.setFitWidth(51.0);
        imageView0.setLayoutX(25.0);
        imageView0.setLayoutY(161.0);
        imageView0.setPickOnBounds(true);
        imageView0.setImage(new Image(getClass().getResource("/img/images.png").toExternalForm()));
        borderPane.setRight(pane);

        BorderPane.setAlignment(pane0, javafx.geometry.Pos.CENTER);
        pane0.setPrefHeight(81.0);
        pane0.setPrefWidth(601.0);

        record.setLayoutX(462.0);
        record.setLayoutY(-21.0);
        record.setMnemonicParsing(false);
        record.setPrefHeight(48.0);
        record.setPrefWidth(132.0);
        record.setStyle("-fx-background-color: none;");
        record.setText("Record");
        record.setTextFill(javafx.scene.paint.Color.valueOf("461212"));
        record.setFont(new Font("French Script MT", 36.0));

        
        borderPane.setBottom(pane0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(100.0);
        anchorPane.setPrefWidth(646.0);

        label.setLayoutX(334.0);
        label.setLayoutY(47.0);
        label.setPrefHeight(63.0);
        label.setPrefWidth(153.0);
        label.setText("Computer");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        label.setFont(new Font("Felix Titling", 24.0));

        label0.setLayoutX(211.0);
        label0.setLayoutY(69.0);
        label0.setText("X");
        label0.setFont(new Font("Forte", 18.0));

        scorex.setLayoutX(247.0);
        scorex.setLayoutY(61.0);
        scorex.setPrefHeight(36.0);
        scorex.setPrefWidth(50.0);
        scorex.setText("0");
        scorex.setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        scorex.setFont(new Font(28.0));

        label1.setLayoutX(482.0);
        label1.setLayoutY(69.0);
        label1.setText("O");
        label1.setFont(new Font("Forte", 17.0));

        label2.setLayoutX(89.0);
        label2.setLayoutY(48.0);
        label2.setPrefHeight(66.0);
        label2.setPrefWidth(115.0);
        label2.setText("Player1");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        label2.setFont(new Font("Felix Titling", 24.0));

        scoreo.setLayoutX(522.0);
        scoreo.setLayoutY(59.0);
        scoreo.setPrefHeight(20.0);
        scoreo.setPrefWidth(32.0);
        scoreo.setText("0");
        scoreo.setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        scoreo.setFont(new Font(28.0));
        borderPane.setTop(anchorPane);

        BorderPane.setAlignment(pane1, javafx.geometry.Pos.CENTER);
        pane1.setPrefHeight(236.0);
        pane1.setPrefWidth(378.0);

        PopUpPane.setLayoutX(-85.0);
        PopUpPane.setLayoutY(-37.0);
        PopUpPane.setMinHeight(USE_PREF_SIZE);
        PopUpPane.setMinWidth(USE_PREF_SIZE);
        PopUpPane.setPrefHeight(358.0);
        PopUpPane.setPrefWidth(574.0);
        PopUpPane.setVisible(false);

        anchorPane0.setLayoutX(47.0);
        anchorPane0.setLayoutY(-6.0);
        anchorPane0.setPrefHeight(246.0);
        anchorPane0.setPrefWidth(309.0);

        imageView1.setFitHeight(237.0);
        imageView1.setFitWidth(126.0);
        imageView1.setLayoutX(129.0);
        imageView1.setLayoutY(-9.0);
        imageView1.setPickOnBounds(true);
        imageView1.setImage(new Image(getClass().getResource("/img/wooden-baton-stick-500x500.png").toExternalForm()));

        imageView2.setFitHeight(235.0);
        imageView2.setFitWidth(131.0);
        imageView2.setLayoutX(47.0);
        imageView2.setLayoutY(-4.0);
        imageView2.setPickOnBounds(true);
        imageView2.setImage(new Image(getClass().getResource("/img/jj.png").toExternalForm()));

        imageView3.setFitHeight(129.0);
        imageView3.setFitWidth(309.0);
        imageView3.setPickOnBounds(true);
        imageView3.setImage(new Image(getClass().getResource("/img/ss.png").toExternalForm()));

        imageView4.setFitHeight(112.0);
        imageView4.setFitWidth(311.0);
        imageView4.setLayoutY(98.0);
        imageView4.setPickOnBounds(true);
        imageView4.setImage(new Image(getClass().getResource("/img/kl.png").toExternalForm()));

        Buttons[0].setLayoutX(2.0);
        Buttons[0].setLayoutY(1.0);
        Buttons[0].setMnemonicParsing(false);
        Buttons[0].setPrefHeight(60.0);
        Buttons[0].setPrefWidth(100.0);
        Buttons[0].setStyle("-fx-background-color: none;");
        Buttons[0].setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        Buttons[0].setFont(new Font("Forte", 40.0));

        Buttons[8].setLayoutX(205.0);
        Buttons[8].setLayoutY(150.0);
        Buttons[8].setMnemonicParsing(false);
        Buttons[8].setPrefHeight(60.0);
        Buttons[8].setPrefWidth(100.0);
        Buttons[8].setStyle("-fx-background-color: none;");
        Buttons[8].setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        Buttons[8].setFont(new Font("Forte", 40.0));

        Buttons[5].setLayoutX(205.0);
        Buttons[5].setLayoutY(78.0);
        Buttons[5].setMnemonicParsing(false);
        Buttons[5].setPrefHeight(60.0);
        Buttons[5].setPrefWidth(100.0);
        Buttons[5].setStyle("-fx-background-color: none;");
        Buttons[5].setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        Buttons[5].setFont(new Font("Forte", 40.0));

        Buttons[4].setLayoutX(104.0);
        Buttons[4].setLayoutY(76.0);
        Buttons[4].setMnemonicParsing(false);
        Buttons[4].setPrefHeight(60.0);
        Buttons[4].setPrefWidth(100.0);
        Buttons[4].setStyle("-fx-background-color: none;");
        Buttons[4].setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        Buttons[4].setFont(new Font("Forte", 40.0));

        Buttons[6].setLayoutX(1.0);
        Buttons[6].setLayoutY(153.0);
        Buttons[6].setMnemonicParsing(false);
        Buttons[6].setPrefHeight(60.0);
        Buttons[6].setPrefWidth(100.0);
        Buttons[6].setStyle("-fx-background-color: none;");
        Buttons[6].setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        Buttons[6].setFont(new Font("Forte", 40.0));

        Buttons[3].setLayoutX(4.0);
        Buttons[3].setLayoutY(78.0);
        Buttons[3].setMnemonicParsing(false);
        Buttons[3].setPrefHeight(60.0);
        Buttons[3].setPrefWidth(100.0);
        Buttons[3].setStyle("-fx-background-color: none;");
        Buttons[3].setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        Buttons[3].setFont(new Font("Forte", 40.0));

        Buttons[7].setLayoutX(104.0);
        Buttons[7].setLayoutY(154.0);
        Buttons[7].setMnemonicParsing(false);
        Buttons[7].setPrefHeight(60.0);
        Buttons[7].setPrefWidth(100.0);
        Buttons[7].setStyle("-fx-background-color: none;");
        Buttons[7].setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        Buttons[7].setFont(new Font("Forte", 40.0));

        Buttons[1].setLayoutX(104.0);
        Buttons[1].setLayoutY(1.0);
        Buttons[1].setMnemonicParsing(false);
        Buttons[1].setPrefHeight(60.0);
        Buttons[1].setPrefWidth(100.0);
        Buttons[1].setStyle("-fx-background-color: none;");
        Buttons[1].setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        Buttons[1].setFont(new Font("Forte", 40.0));

        Buttons[2].setLayoutX(205.0);
        Buttons[2].setLayoutY(1.0);
        Buttons[2].setMnemonicParsing(false);
        Buttons[2].setPrefHeight(60.0);
        Buttons[2].setPrefWidth(100.0);
        Buttons[2].setStyle("-fx-background-color: none;");
        Buttons[2].setTextFill(javafx.scene.paint.Color.valueOf("#964b00"));
        Buttons[2].setFont(new Font("Forte", 40.0));
        borderPane.setCenter(pane1);

        BorderPane.setAlignment(pane2, javafx.geometry.Pos.CENTER);
        pane2.setPrefHeight(236.0);
        pane2.setPrefWidth(114.0);
        borderPane.setLeft(pane2);

        
        getChildren().add(imageView);
        pane.getChildren().add(imageView0);
        pane0.getChildren().add(record);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(scorex);
        anchorPane.getChildren().add(label1);
        anchorPane.getChildren().add(label2);
        anchorPane.getChildren().add(scoreo);
        pane1.getChildren().add(PopUpPane);
        anchorPane0.getChildren().add(imageView1);
        anchorPane0.getChildren().add(imageView2);
        anchorPane0.getChildren().add(imageView3);
        anchorPane0.getChildren().add(imageView4);
        anchorPane0.getChildren().add(Buttons[0]);
        anchorPane0.getChildren().add(Buttons[8]);
        anchorPane0.getChildren().add(Buttons[5]);
        anchorPane0.getChildren().add(Buttons[4]);
        anchorPane0.getChildren().add(Buttons[6]);
        anchorPane0.getChildren().add(Buttons[3]);
        anchorPane0.getChildren().add(Buttons[7]);
        anchorPane0.getChildren().add(Buttons[1]);
        anchorPane0.getChildren().add(Buttons[2]);
        pane1.getChildren().add(anchorPane0);
        getChildren().add(borderPane);
        new Controller(Buttons,scorex,scoreo);
    }
}
