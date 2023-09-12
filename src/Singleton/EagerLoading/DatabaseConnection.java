package Singleton.EagerLoading;

import javax.xml.crypto.Data;

public class DatabaseConnection {
    //Eager Initialisation or Early Initialisation
    private static final DatabaseConnection instance = new DatabaseConnection();
    private DatabaseConnection() {}

    //Below method is Singleton but it won't work for Multi threads.
//    public static DatabaseConnection getInstance() {
//        if (instance == null) {
//            instance = new DatabaseConnection();
//        }
//        return instance;
//    }

    public static DatabaseConnection getInstance() {
        return instance;
    }
}
