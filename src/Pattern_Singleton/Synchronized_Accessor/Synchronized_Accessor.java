package Pattern_Singleton.Synchronized_Accessor;

import Pattern_Singleton.Lazy_Initialization.Lazy_Initialization;

public class Synchronized_Accessor {
    private static Synchronized_Accessor instance;

    private Synchronized_Accessor(){

    }

    public static synchronized Synchronized_Accessor getInstance() {
        if(instance == null) {
            instance = new Synchronized_Accessor();

        }
        return instance;

    }
}
