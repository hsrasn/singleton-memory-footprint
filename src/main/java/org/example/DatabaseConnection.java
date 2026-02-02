package org.example;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private byte[] heavyData = new byte[1024 * 1024];

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
