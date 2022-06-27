package CarTest;

import FinalModifier.Car;

public class RunCar {
    public static void main(String[] args) {
        Car car2 = new Car();
        System.out.println(Car.speed_Limit);
        System.out.println(car2.buyer);
        car2.buyer.setNome("Sam ");
        System.out.println(car2.buyer);

    }
}
