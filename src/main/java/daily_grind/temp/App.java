package daily_grind.temp;

import daily_grind.temp.model.Car;
import daily_grind.temp.model.Sedan;

public class App {

    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.setCarNumber("TN00A1323");
        sedan.setWheelNumber(4);

        System.out.println(sedan);

        Car car = (Car) sedan;
        System.out.println(car);

        Car carMust = new Car();
        carMust.setCarNumber("TN007");

        System.out.println(carMust);

        Sedan sedan1 = (Sedan) carMust;

        System.out.println(sedan1);
    }
}
