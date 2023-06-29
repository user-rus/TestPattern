package Pattern_Singleton.Simple_Solution;

public class Simple_singleton {
    private static Simple_singleton simpleSingleton = new Simple_singleton();
    private Simple_singleton(){
        
    }

    public static Simple_singleton getInstance() {
        return simpleSingleton;
    }
}
