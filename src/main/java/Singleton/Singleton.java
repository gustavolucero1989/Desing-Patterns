package Singleton;

public class Singleton {
    private static final Singleton instance = new Singleton();
    private String message;

    private Singleton() {
    }

    public static Singleton getInstance(){
        return instance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
