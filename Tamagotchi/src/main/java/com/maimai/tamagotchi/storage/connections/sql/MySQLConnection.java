package com.maimai.tamagotchi.storage.connections.sql;

import com.maimai.tamagotchi.api.storage.connections.sql.ISQLConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection implements ISQLConnection {

    private Connection connection;

    private final String host, database, user, password;
    private final int port;

    public MySQLConnection(String host, String database, String user, String password, int port) {
        this.host = host;
        this.database = database;
        this.user = user;
        this.password = password;
        this.port = port;
        createConnection();
    }

    @Override
    public void createConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection
                    ("jdbc:mysql://" + host + ":" + port + "/" + database, user, password);

            //connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port +
            // "/" + database +"user=" + user + "&" + "password=" + password);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("SQlConnection: " + e.getMessage());

            // ClassNotFoundException | SQLException e
        }
    }

    @Override
    public Connection getConnection() {
        return connection;
    }
}