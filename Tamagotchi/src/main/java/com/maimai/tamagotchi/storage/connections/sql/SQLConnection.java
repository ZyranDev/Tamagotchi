package com.maimai.tamagotchi.storage.connections.sql;

import java.sql.Connection;

public interface SQLConnection {

    Connection getConnection();

    void createConnection();
}