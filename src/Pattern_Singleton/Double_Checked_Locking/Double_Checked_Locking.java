package Pattern_Singleton.Double_Checked_Locking;

public class Double_Checked_Locking {
    private static Double_Checked_Locking instance;

    private Double_Checked_Locking(){

    }

    public static Double_Checked_Locking getInstance() {
        if(instance==null){
            synchronized (Double_Checked_Locking.class){
                if(instance==null){
                    instance= new Double_Checked_Locking();
                }
            }
        }
        return instance;
    }
}
