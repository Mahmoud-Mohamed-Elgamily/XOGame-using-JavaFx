/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alaa
 */
public class Clienthandler implements Runnable {

    DataInputStream ois;
    ObjectInputStream ob;
    static String msg;
    Socket mySocket;
    static Thread th;

    public Clienthandler(Socket _mySocket) {

        mySocket = _mySocket;
        th = new Thread(this);
        th.start();

    }

    @Override
    public void run() {

        try {

            ois = new DataInputStream(mySocket.getInputStream());

            while (true) {

                msg = ois.readLine();
                System.out.println(msg);
//                Thread.sleep(1000);
               
                
            }

        } catch (IOException ex) {
            Logger.getLogger(Clienthandler.class.getName()).log(Level.SEVERE, null, ex);
        } 
//        catch (InterruptedException ex) {
//            Logger.getLogger(Clienthandler.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }

}
