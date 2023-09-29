package kashish.com.practice.designpatterns.singleton;

public class Singleton {
    // Private static instance of the class
    private static Singleton instance;

    // Private constructor to prevent external instantiation
    private Singleton() {
        // Initialization code, if needed
        System.out.println("I am single");
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        // Lazy initialization: create the instance when it's first requested
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and properties of the singleton class
}
