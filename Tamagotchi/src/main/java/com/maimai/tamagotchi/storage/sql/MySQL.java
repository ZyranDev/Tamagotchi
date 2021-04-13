package com.maimai.tamagotchi.storage.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {
    public MySQL(String host, String database, String username, String password, short port, Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) return;

            Class.forName("com.mysql.jbdc.Driver");
            connection = DriverManager.getConnection("jbdc:mysql://" + host + ":" + port + "/" + database, username, password);

        } catch (SQLException | ClassNotFoundException throwable) {
            throwable.printStackTrace();
        }
    }
}
