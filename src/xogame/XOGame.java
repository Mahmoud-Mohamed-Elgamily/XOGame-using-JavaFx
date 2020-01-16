/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

/*import client.FXMLDocumentBase;*/
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class XOGame extends Application {

    public static Stage window;
    public static Scene scene, scene2, scene3, scene4,scene5;
    Parent root2;
    Start root;

    @FXML
    private void goToHome(ActionEvent event) {
        window.setScene(scene);
        window.show();
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;

        root = new Start(window);
        scene = new Scene(root);

        root2 = new singlehh(window);
        scene2 = new Scene(root2);

        scene3 = new Scene(FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")));
        scene4 = new Scene(FXMLLoader.load(getClass().getResource("ReplayUi.fxml")));
        

        stage.setScene(scene);
        stage.show();

        root.singleuser.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(scene2);
                stage.show();

            }
        });
        root.multiuser.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(scene3);
                stage.show();
            }
        });
        root.replay.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(scene4);
                stage.show();
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    static void bth() {
        window.setScene(XOGame.scene);
        window.show();
    }
}
