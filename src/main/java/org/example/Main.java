package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<DatabaseConnection> list = new ArrayList<>();

        for (int i = 0; i < 10_000; i++) {
            list.add(DatabaseConnection.getInstance());
        }

        System.out.println("Singleton - Single instance");
        try {
            Thread.sleep(60_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
