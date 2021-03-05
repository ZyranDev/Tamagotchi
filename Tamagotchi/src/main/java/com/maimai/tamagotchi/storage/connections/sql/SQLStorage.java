package com.maimai.tamagotchi.storage.connections.sql;

import com.maimai.tamagotchi.entities.UserEntity;
import com.maimai.tamagotchi.storage.Storage;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class SQLStorage implements Storage {

    private final SQLConnection sqlConnection;

    public SQLStorage(SQLConnection sqlConnection) {
        this.sqlConnection = sqlConnection;
        createTable();
    }

    @Override
    public UserEntity loadUser(UUID uuid) {
        return null;
    }

    @Override
    public void saveUser(UserEntity userEntity) {
    }

    void createTable() {
        Connection connection = sqlConnection.getConnection();
        if (connection == null) return;

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate
                    ("CREATE TABLE IF NOT EXISTS Tamagotchi (uuid VARCHAR(36) PRIMARY KEY NOT NULL, data LONGTEXT)");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("SqlException: " + throwables.getMessage());
            System.out.println("SqlState:" + throwables.getSQLState());
            System.out.println("VendorError: " + throwables.getErrorCode());
        }
    }
}