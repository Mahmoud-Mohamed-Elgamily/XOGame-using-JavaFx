/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

/*import client.FXMLDocumentBase;*/
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import static xogame.ipBase.mySocket;

/**
 *
 * @author User
 */
public class XOGame extends Application {

    public static Stage window, stage1;
    public static Scene scene, scene2, scene3, scene4,scene5,scene6,scene7,scene8 , scene9;
    Parent root2;
    Start root;
    
    playersnameBase pn; 

    public static Stage mystage;

   @FXML
    private void goToHome(ActionEvent event) {
        window.setScene(scene);
       window.show();
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        pn=new playersnameBase();
        
        root = new Start(window);
        scene = new Scene(root);
        root2 = new Singlee();
        scene2 = new Scene(root2);

        scene4 = new Scene(FXMLLoader.load(getClass().getResource("ReplayUi.fxml")));
        scene6 =new Scene(FXMLLoader.load(getClass().getResource("SignInn.fxml")));
        
        scene8=new Scene(FXMLLoader.load(getClass().getResource("SignInOrUp.fxml")));

        stage.setScene(scene);
        stage.show();

        root.singleuser.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(scene2);
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
        root.multiuser.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                 
                stage1 = new Stage();
                stage1.initModality(Modality.APPLICATION_MODAL);
                Scene _scene3 = new Scene(pn);
                stage1.setScene(_scene3);
                stage1.show();
                
                
                
    }});
        pn.button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
             @Override
             public void handle(MouseEvent event) {
                stage.setScene(scene3);
              
                  
                stage.show(); //To change body of generated methods, choose Tools | Templates.
             
         
         }});
        root.multiuser1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage=new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                ipBase ip=new ipBase();
                Scene _scene3=new Scene(ip);
                stage.setScene(_scene3);
                stage.show();
                ip.button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                       if (ip.validate(ip.textField.getText()))
                        {
       
                   
                           try {
                               ip.mySocket = new Socket(ip.textField.getText(), 5005);                              
                                stage.setScene(scene8);
                               stage.show();
                               scene7 =new Scene(FXMLLoader.load(getClass().getResource("SignUp.fxml")));
                               mystage = stage;
                           } catch (IOException ex) {
                               Logger.getLogger(XOGame.class.getName()).log(Level.SEVERE, null, ex);
                           }
                    }
                        }});
        
                //scene
            }});
        
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
    static void SignU() {
        
        mystage.setScene(scene7);
        mystage.show();
    }
    static void SignI() {
        
        mystage.setScene(scene6);
        mystage.show();
    }
  }
