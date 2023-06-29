package Pattern_Bridge;

public abstract class Program {
    protected Developer developer;
    public Program(Developer developer){
        this.developer=developer;
    }
    public abstract void developProgram();
}
