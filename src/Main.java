import Pattern_Adapter.CardReader;
import Pattern_Adapter.MemoryCard;
import Pattern_Adapter.USB;

public class Main {
    public static void main(String[] args) {
        USB cardReader = new CardReader(new MemoryCard());
        cardReader.connectWithUsbCable();
        }
    }
