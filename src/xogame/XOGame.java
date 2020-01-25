/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

/*import client.FXMLDocumentBase;*/
import com.sun.javafx.stage.StageHelper;
import java.io.IOException;
import java.net.Socket;
import java.util.Optional;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import static xogame.SignInnController.ps;
import static xogame.SignUpController.ps;
import static xogame.ipBase.mySocket;

/**
 *
 * @author User
 */
public class XOGame extends Application {

    public static Stage window, stage1;
    public static Scene scene, scene2, scene3, scene4, scene5, scene6, scene7, scene8, scene9, scene10;

    Parent root2;
    Start root;
    static onlinePlayersUiBase opb;
    static Vector<String> playersNames = new Vector<>();
    playersnameBase pn;
    static String name;
    static String message;

    public static Stage mystage;

    @FXML
    private void goToHome(ActionEvent event) {
        window.setScene(scene);
        window.show();
    }

    @Override
    public void start(Stage stage) throws Exception {
//        stage.setResizable(false);
        window = stage;
        pn = new playersnameBase();
        opb = new onlinePlayersUiBase();
        root = new Start(window);
        scene = new Scene(root);
        root2 = new Singlee();
        scene2 = new Scene(root2);
        scene10 = new Scene(opb);
        scene4 = new Scene(FXMLLoader.load(getClass().getResource("ReplayUi.fxml")));
        // scene6 = new Scene(FXMLLoader.load(getClass().getResource("SignInn.fxml")));

        scene8 = new Scene(FXMLLoader.load(getClass().getResource("SignInOrUp.fxml")));
//        scene10 = new Scene(FXMLLoader.load(getClass().getResource("onlinePlayersUi.fxml")));
        scene9 = new Scene(FXMLLoader.load(getClass().getResource("onlineBoardUi.fxml")));
        window.setScene(scene);
        window.show();

        root.singleuser.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.setScene(scene2);
                window.show();

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

            }
        });
        pn.button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                window.setScene(scene3);

                window.show(); //To change body of generated methods, choose Tools | Templates.

            }
        });
        root.multiuser1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                ipBase ip = new ipBase();
                Scene _scene3 = new Scene(ip);
                stage.setScene(_scene3);
                stage.show();
                ip.button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if (ip.validate(ip.textField.getText())) {

                            try {
                                ip.mySocket = new Socket(ip.textField.getText(), 3786);
                                new Clienthandler(mySocket);

                                stage.setScene(scene8);
                                stage.show();
                                mystage = stage;
                                scene7 = new Scene(FXMLLoader.load(getClass().getResource("SignUp.fxml")));
                                scene6 = new Scene(FXMLLoader.load(getClass().getResource("SignInn.fxml")));

                                mystage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                                    @Override
                                    public void handle(WindowEvent event) {

                                        SignUpController.ps.println("exit.");

                                    }
                                });

                                window.setOnCloseRequest(new EventHandler<WindowEvent>() {
                                    @Override
                                    public void handle(WindowEvent event) {
                                        try {
                                            SignInnController.ps.println("exit.");
                                            Clienthandler.th.stop();
                                            ip.mySocket.close();
                                        } catch (IOException ex) {
                                            Logger.getLogger(XOGame.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                });

                            } catch (IOException ex) {
                                Logger.getLogger(XOGame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                });

                //scene
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
        window.setScene(scene);
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

    static void Check() {

        if (Clienthandler.msg != null) {
            message = Clienthandler.msg;
            System.out.println(message.split("\\.")[0]);
            switch (message.split("\\.")[0]) {

                case "done":
                case "pass":
                    name = message.split("\\.")[1];
                    window.setScene(XOGame.scene10);
//                    OnlinePlayersUiController.currentPlayerName.setText(name);
                    mystage.close();
                    window.show();
                    break;
                case "dublicated":
                    Alert alert = new Alert(Alert.AlertType.WARNING, "dublicated login!!");
                    alert.show();
                    break;
                case "wrongPass":
                    Alert alert1 = new Alert(Alert.AlertType.WARNING, "wrongPass!!");
                    alert1.show();
                    break;
                case "wrongName":
                    Alert alert2 = new Alert(Alert.AlertType.WARNING, "wrongName!!");
                    alert2.show();
                    break;
                case "names":
                    for (String mssg : message.split("\\.")) {
                        if (!mssg.equals("names")) {
                            if (!playersNames.contains(mssg)) {
                                playersNames.add(mssg);
                                opb.nameLView.getItems().add(mssg);
                            }
                        }
                    }
                    break;
                case "request":
                    System.out.println("request recieved");
                    ButtonType buttonTypeOk = new ButtonType("OK");
                    ButtonType buttonTypeNo = new ButtonType("NO");
                    Alert a = new Alert(Alert.AlertType.CONFIRMATION,
                            message.split("\\.")[1] + " wants to play with you?");
                    a.getButtonTypes().setAll(buttonTypeOk, buttonTypeNo);
                    Optional<ButtonType> result = a.showAndWait();
                    if (result.get() == buttonTypeOk) {
                        SignInnController.ps.println("reply.ok");
                        OnlineBoardController.setMyMark("O");
                        System.out.println(OnlineBoardController.myMark);

                        window.setScene(scene9);
                        window.show();
                        a.close();
                    } else if (result.get() == buttonTypeNo) {
                        SignInnController.ps.println("reply.refused");
                        a.close();
                    }
                    break;
                case "start":
                    OnlineBoardController.setMyMark("X");
                    System.out.println(OnlineBoardController.myMark);
//                    scene9 = new 
                    window.setScene(scene9);
                    window.show();
                    break;
                case "your":
                    OnlineBoardController.movehandler(message.split("\\.")[1]);
                    break;
                case "your1":
                    OnlineBoardController.movehandler(message.split("\\.")[1]);
                    break;
                default:
                    break;
            }
        }
    }
}