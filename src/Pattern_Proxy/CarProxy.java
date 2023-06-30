package Pattern_Proxy;

public class CarProxy implements Car {

Car car = new BMW();
    @Override
    public void Povorotnic() {
        System.out.println("proxxxxxxyyyyy");
        car.Povorotnic();
    }
}
