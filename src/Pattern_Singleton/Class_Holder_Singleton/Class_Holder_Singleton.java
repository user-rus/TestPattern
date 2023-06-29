package Pattern_Singleton.Class_Holder_Singleton;

public class Class_Holder_Singleton {
    private Class_Holder_Singleton (){}
    private static class Singleton_Holder{
        public static final Class_Holder_Singleton INSTANCE = new Class_Holder_Singleton();
    }
    public static Class_Holder_Singleton getInstance(){
        return Singleton_Holder.INSTANCE;
    }
}
