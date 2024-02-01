package Singleton.DoubleCheckLocking;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private DatabaseConnection() {}

    //Double Check Locking.
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                    System.out.println("Added something in Singleton file");
                    System.out.println("Added something else");
                }
            }
        }
        return instance;
    }
}


//Assignment :-

//Create a Singleton class using all the ways discussed in the class.
// and try creating multiple objects of Singleton class from multiple threads.
// and check if it working or not.
