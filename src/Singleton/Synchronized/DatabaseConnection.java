package Singleton.Synchronized;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private DatabaseConnection() {}

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
