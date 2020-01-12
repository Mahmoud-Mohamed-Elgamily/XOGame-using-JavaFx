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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class XOGame extends Application {

    public static Stage window;
    public static Scene scene, scene2, scene3;
    Parent root2, root3;
    Start root;
    
//    @FXML
//    private Button noBtn;

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
        root3 = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        scene3 = new Scene(root3);

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
//        root3.noBtn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                stage.setScene(scene3);
//                stage.show();
//            }
//        });
    }

    // create method to switch theme and call it in the go home method
//    public static void checkOutMain() {
//        
//    }
//
//    public void innerCheckOutMain() {
//        window.setScene(scene);
//        window.show();
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
