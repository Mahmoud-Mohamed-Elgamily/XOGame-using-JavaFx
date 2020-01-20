/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

/**
 *
 * @author Alaa
 */
public class Clienthandler implements Runnable{
    
    DataInputStream dis ;
   
    Socket mySocket;
    Thread th;
    public Clienthandler(Socket _mySocket ){
      
      mySocket=_mySocket;
       
    }
        
    public void read()
    {Thread th= new Thread(this);
      th.start();}
    
    @Override
      public void run(){
        
        try {
            
            dis = new DataInputStream(mySocket.getInputStream());
            
            while(true)
            {
                String msg = dis.readLine();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Clienthandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
 }
    
}
