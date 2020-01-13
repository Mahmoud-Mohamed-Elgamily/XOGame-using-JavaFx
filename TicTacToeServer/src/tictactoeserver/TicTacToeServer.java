package tictactoeserver;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

class Player {
    private String userName, password, avatar;
    private boolean passwordBool;

    public Player(String _userName, String _password, String _avatar) {
        userName = _userName;
        avatar = _avatar;
        password = _password;
    //        ip = _ip;
    //        score = _score;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return userName;
    }

    public String getAvatar() {
        return avatar;
    }

    void setName(String _userName) {
        userName = _userName;
    }

    void setPassBool(boolean _passwordBool) {
        passwordBool = _passwordBool;
    }

    void setPassword(String _password) {
        password = _password;
    }

    void setAvatar(String _avatar) {
        avatar = _avatar;
    }
}

class DataBaseConnection {

    PreparedStatement stmt;
    ResultSet rs;
    Connection conn;

    public DataBaseConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tictactoe", "root", "asd123asd");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected ResultSet refreshQuery() {
        try {
            stmt = conn.prepareStatement("select * from player");
            rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    protected void Register(Player gamer) {
        try {
            stmt = conn.prepareStatement("insert into player(user_name,pass,avatar) values(? ,?,?)");
            stmt.setString(1, gamer.getUserName());
            stmt.setString(2, gamer.getPassword());
            stmt.setString(3, gamer.getAvatar());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Dublicated user please choose other name");
        }
    }

    protected Player signIn(String name , String password) {
        try {
            stmt = conn.prepareStatement("select * from player where user_name=?");
            stmt.setString(1, name);
            ResultSet signRs;
            signRs = stmt.executeQuery();
            if (signRs.next()) {
                    Player playerX = new Player(signRs.getString(1), signRs.getString(2), signRs.getString(4));
                if (signRs.getString(2) == password)
                    return playerX;
                else{
                    playerX.setPassBool(false);
                    return playerX;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;    
    }
}

public class TicTacToeServer {

    ServerSocket SS;
    Socket S;
    
    public static void main(String[] args) {
        DataBaseConnection dbc = new DataBaseConnection();
        ResultSet innerRs = dbc.refreshQuery();
        
        new TicTacToeServer();
    }
    
    public TicTacToeServer(){
        try {
            SS = new ServerSocket(6000);
            while (true) {
                S = SS.accept();
                new PlayerHandler(S);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private static class PlayerHandler extends Thread {

        DataInputStream dis;
        PrintStream ps;
        String chatData = "";
        static Vector<PlayerHandler> Clients = new Vector<PlayerHandler>();

        public PlayerHandler(Socket S) {
            try {
                dis = new DataInputStream(S.getInputStream());
                ps = new PrintStream(S.getOutputStream());
                Clients.add(this);
                start();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public void run() {
            while (true) {
                try {
                    chatData = dis.readLine();
                    sendMessageToAll(chatData);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

        private void sendMessageToAll(String chatData) {
            for (PlayerHandler ch : Clients) {
                ch.ps.println(chatData);
            }
        }
    }

}
