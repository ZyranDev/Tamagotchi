package com.maimai.tamagotchi.api.storage.connections.sql;

import java.sql.Connection;

public interface ISQLConnection {
    Connection getConnection();

    void createConnection();
}