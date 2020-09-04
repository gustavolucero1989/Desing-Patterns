import Singleton.Singleton;

public class Main {
    public static void main(String[] args){
        //Singleton test = new Singleton();
        // This is a error that since the singleton class can't be instance
        Singleton test1 = Singleton.getInstance();
        test1.setMessage("Test_1");
        System.out.println(test1.getMessage());

        Singleton test2 = Singleton.getInstance();
        System.out.println(test2.getMessage());

        Singleton test3 = Singleton.getInstance();
        test3.setMessage("Test_3");
        System.out.println(test3.getMessage());
    }
}
