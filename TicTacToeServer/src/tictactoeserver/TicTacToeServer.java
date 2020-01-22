package tictactoeserver;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

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

//    protected ResultSet refreshQuery() {
//        try {
//            stmt = conn.prepareStatement("select * from player");
//            rs = stmt.executeQuery();
//            return rs;
//        } catch (SQLException ex) {
//            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
    protected boolean Register(String userName, String password) {
        try {
            stmt = conn.prepareStatement("insert into player(user_name,pass) values(? ,?)");
            stmt.setString(1, userName);
            stmt.setString(2, password);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    protected void updateScore(String name, int score) {
        try {

            stmt = conn.prepareStatement("update player set win_score=? where user_name=?");
            stmt.setString(1, "" + score);
            stmt.setString(2, name);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected String getScore(String name) {
        try {
            stmt = conn.prepareStatement("select win_score from player where user_name=?");
            stmt.setString(1, name);
            ResultSet signRs;
            signRs = stmt.executeQuery();
            signRs.next();
            return signRs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    protected String signIn(String name, String password) {
        try {
            stmt = conn.prepareStatement("select * from player where user_name=?");
            stmt.setString(1, name);
            ResultSet signRs;
            signRs = stmt.executeQuery();
            if (signRs.next()) {
                if (signRs.getString(2).equals(password)) {
                    return "pass";
                } else {
                    return "wrongPass";
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "wrongName";
    }
}

public class TicTacToeServer {

    static DataBaseConnection dbc;
//    static ResultSet innerRs;
    static ServerSocket serverHandler;
    Socket playerHandler;

    private static void getIP() {
        String ip = null;
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface iface = interfaces.nextElement();
                // filters out 127.0.0.1 and inactive interfaces
                if (iface.isLoopback() || !iface.isUp()) {
                    continue;
                }

                Enumeration<InetAddress> addresses = iface.getInetAddresses();

                while (addresses.hasMoreElements()) {
                    InetAddress addr = addresses.nextElement();

                    // *EDIT*
                    if (addr instanceof Inet6Address) {
                        continue;
                    }

                    ip = addr.getHostAddress();
                    String[] arr = new String[4];
                    arr = ip.split("\\.");
                    if (!"1".equals(arr[3])) {
                        System.out.println(ip + " ");
                    }
                }
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        dbc = new DataBaseConnection();
//        innerRs = dbc.refreshQuery();
        try {
            serverHandler = new ServerSocket(3786);
            System.out.printf("Server is running on ip ");
            getIP();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        new TicTacToeServer();
    }

    public TicTacToeServer() {
        try {
            while (true) {
                playerHandler = serverHandler.accept();
                new PlayerHandler(playerHandler);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static class PlayerHandler extends Thread {

        DataInputStream dis;
        PrintStream ps;
        private ObjectInputStream ois;

        String chatData = "";
        static Vector<PlayerHandler> loggedUsers = new Vector<>();
        static Vector<String> returnNames;
        static LinkedHashMap<String, String> returnData;
        static String player1name, player2name;
        Socket playerSocket;
        String currentPlayerName, currentPlayerScore, handle;

        private void sendNames() throws SQLException {
//            returnNames = new Vector<>();
//            returnData = new LinkedHashMap<>();
            String returnNames="names.";
            for (PlayerHandler thisPlayer : loggedUsers) {
                if (!thisPlayer.currentPlayerName.equals(currentPlayerName)) {
                    returnNames +=thisPlayer.currentPlayerName+".";
//                    returnNames.add(thisPlayer.currentPlayerName);
//                    returnData.put(thisPlayer.currentPlayerName, thisPlayer.currentPlayerScore);
                }
            }

            ps.println(returnNames);
        }
        public PlayerHandler(Socket S) {
            try {
                dis = new DataInputStream(S.getInputStream());
                ps = new PrintStream(S.getOutputStream());
                playerSocket = S;
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
                    System.out.println(chatData);
                    String switchable = chatData.split("\\.")[0];

                    switch (switchable) {
                        case "su":
                            signUpHandler(chatData);
                            break;
                        case "si":
                            signInHandler(chatData);
                            break;
                        case "invite":
                            invitation(chatData);
                            break;
                        case "names":
                            sendNames();
                            break;
                        case "exit":
                            loggedUsers.remove(this);
                            stop();
                            break;
                        case "reply":
                            handleRequest(chatData.split("\\.")[1]);
                            break;
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        public void signUpHandler(String data) {
            String[] cleanedData = stripData(data);
            try {
                if (dbc.Register(cleanedData[1], cleanedData[2])) {
                    ps.println("done.");
                    this.currentPlayerName = cleanedData[1];
                    this.currentPlayerScore = dbc.getScore(this.currentPlayerName);
                    loggedUsers.add(this);
//                    Thread.sleep(100);
//                    sendNames();
                } else {
                    ps.println("failed.");
                }
            } catch (ArrayIndexOutOfBoundsException AI) {
                ps.println("wrongName.");
            } 
//            catch (SQLException ex) {
//                Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }

        private void signInHandler(String data) {
            String[] cleanedData = stripData(data);
            try {
                if (loggedUsers.isEmpty()) {
                    handle = dbc.signIn(cleanedData[1], cleanedData[2]);
                } else {
                    for (PlayerHandler pp : loggedUsers) {
                        if (!pp.currentPlayerName.equals(cleanedData[1])) {
                            handle = dbc.signIn(cleanedData[1], cleanedData[2]);
                        } else {
                            handle = "dublicated";
                        }
                    }
                }
                switch (handle) {
                    case "pass":
                        ps.println("pass.");
                        this.currentPlayerName = cleanedData[1];
                        this.currentPlayerScore = dbc.getScore(this.currentPlayerName);
                        loggedUsers.add(this);
//                        Thread.sleep(100);
//                        sendNames();
                        break;
                    case "wrongPass":
                        ps.println("wrongPass.");
                        break;
                    case "dublicated":
                        ps.println("dublicated.");
                        break;
                    case "wrongName":
                        ps.println("wrongName.");
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException AI) {
                ps.println("wrongName.");
            } 
//            catch (SQLException ex) {
//                Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }

        private String[] stripData(String data) {
            String[] receivedData = data.split("\\.");
            return receivedData;
        }

        private void invitation(String data) throws IOException {
            String[] receivedData = data.split("\\.");
            player1name = receivedData[1];
            player2name = receivedData[2];
            sendRequest(player1name, player2name);
        }

        private void sendRequest(String pn1, String pn2) {
            for (PlayerHandler pp : loggedUsers) {
                if (pp.currentPlayerName.equals(pn2)) {
                    pp.ps.println("request.");
                }
            }
        }

        private void handleRequest(String req) {
            switch (req) {
                case "ok":
                    for (PlayerHandler pp : loggedUsers) {
                        if (pp.currentPlayerName.equals(player1name)) {
                            pp.ps.println("start.");
                        }
                    }
                    startMatch();
                    break;
                case "refused":
                    ps.println("refused.");
                    break;
            }
        }

//        private void stopThisPlayer() {
//
//        }
        private void startMatch() {
            Game game = new Game();
            Socket elZeftElSocket1 = null;
            for (PlayerHandler pp : loggedUsers) {
                if (pp.currentPlayerName.equals(player1name)) {
                    elZeftElSocket1 = pp.playerSocket;
                }
            }
            Game.Player playerX = game.new Player(elZeftElSocket1, 'X');
            Socket elZeftElSocket2 = null;
            for (PlayerHandler pp : loggedUsers) {
                if (pp.currentPlayerName.equals(player2name)) {
                    elZeftElSocket2 = pp.playerSocket;
                }
            }
            Game.Player playerO = game.new Player(elZeftElSocket2, 'O');
            playerX.setOpponent(playerO);
            playerO.setOpponent(playerX);
            game.currentPlayer = playerX;
            playerX.start();
            playerO.start();
        }
    }

}
