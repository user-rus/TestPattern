package Pattern_Factoty;

public class Put_Coffee {
    public static void main(String[] args) {
        Coffee coffee = new CoffeeShop(new SimpleCoffeeFactory()).orderCoffee(CoffeeType.AMERICANO);
    }
}
