package Pattern_Bridge;

public class CreateProgram {
    public static void main(String[] args) {
        Program[] programs = {new BankSystem(new CppDeveloper()), new StockExchange(new JavaDeveloper()),new BankSystem(new JavaDeveloper())};
        for (Program program : programs) {
            program.developProgram();
        }
    }
}
