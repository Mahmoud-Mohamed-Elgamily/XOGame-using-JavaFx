package xogame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Start extends AnchorPane {

    protected final ImageView imageView;
    protected final Button singleuser;
    protected final InnerShadow innerShadow;
    protected final Button multiuser;
    protected final InnerShadow innerShadow0;
    protected final ImageView XO;
    public final Button multiuser1;
    protected final InnerShadow innerShadow1;
    protected final Button replay;
    protected final InnerShadow innerShadow2;

    public Start(Stage stage) {

        imageView = new ImageView();
        singleuser = new Button();
        innerShadow = new InnerShadow();
        multiuser = new Button();
        innerShadow0 = new InnerShadow();
        XO = new ImageView();
        multiuser1 = new Button();
        innerShadow1 = new InnerShadow();
        replay = new Button();
        innerShadow2 = new InnerShadow();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(622.0);

        imageView.setFitHeight(400.0);
        imageView.setFitWidth(622.0);
        imageView.setPickOnBounds(true);
        imageView.setImage(new Image(getClass().getResource("/img/Background.jpg").toExternalForm()));

        singleuser.setCenterShape(false);
        singleuser.setLayoutX(210.0);
        singleuser.setLayoutY(105.0);
        singleuser.setMnemonicParsing(false);
        singleuser.setPrefHeight(62.0);
        singleuser.setPrefWidth(202.0);
        singleuser.setText("Single User");
        singleuser.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        singleuser.setTextFill(javafx.scene.paint.Color.valueOf("#eb1515"));
        singleuser.setFont(new Font("Forte", 25.0));

        innerShadow.setChoke(0.71);
        innerShadow.setHeight(83.02);
        innerShadow.setRadius(20.255);
        innerShadow.setWidth(0.0);
        singleuser.setEffect(innerShadow);

        multiuser.setCenterShape(false);
        multiuser.setLayoutX(210.0);
        multiuser.setLayoutY(175.0);
        multiuser.setMnemonicParsing(false);
        multiuser.setPrefHeight(62.0);
        multiuser.setPrefWidth(202.0);
        multiuser.setText("Multi User");
        multiuser.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        multiuser.setTextFill(javafx.scene.paint.Color.valueOf("#eb1515"));
        multiuser.setFont(new Font("Forte", 25.0));

        innerShadow0.setChoke(0.71);
        innerShadow0.setHeight(83.02);
        innerShadow0.setRadius(20.255);
        innerShadow0.setWidth(0.0);
        multiuser.setEffect(innerShadow0);

        XO.setFitHeight(82.0);
        XO.setFitWidth(86.0);
        XO.setLayoutX(270.0);
        XO.setLayoutY(14.0);
        XO.setPickOnBounds(true);
        XO.setPreserveRatio(true);
        XO.setImage(new Image(getClass().getResource("/img/XOLOGO.jpg").toExternalForm()));

        multiuser1.setCenterShape(false);
        multiuser1.setLayoutX(210.0);
        multiuser1.setLayoutY(245.0);
        multiuser1.setMnemonicParsing(false);
        multiuser1.setPrefHeight(62.0);
        multiuser1.setPrefWidth(202.0);
        multiuser1.setText("Online");
        multiuser1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        multiuser1.setTextFill(javafx.scene.paint.Color.valueOf("#eb1515"));
        multiuser1.setFont(new Font("Forte", 25.0));
       

        innerShadow1.setChoke(0.71);
        innerShadow1.setHeight(83.02);
        innerShadow1.setRadius(20.255);
        innerShadow1.setWidth(0.0);
        multiuser1.setEffect(innerShadow1);

        replay.setCenterShape(false);
        replay.setLayoutX(210.0);
        replay.setLayoutY(316.0);
        replay.setMnemonicParsing(false);
        replay.setPrefHeight(62.0);
        replay.setPrefWidth(202.0);
        replay.setText("Replay");
        replay.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        replay.setTextFill(javafx.scene.paint.Color.valueOf("#eb1515"));
        replay.setFont(new Font("Forte", 21.0));

        innerShadow2.setChoke(0.71);
        innerShadow2.setHeight(83.02);
        innerShadow2.setRadius(20.255);
        innerShadow2.setWidth(0.0);
        replay.setEffect(innerShadow2);

        getChildren().add(imageView);
        getChildren().add(singleuser);
        getChildren().add(multiuser);
        getChildren().add(XO);
        getChildren().add(multiuser1);
        getChildren().add(replay);

    }
}
