package OOP.Foundtion.day5;

public class Salary {
    final String description = "aa";
    final Car car = new Car();

    public Salary() {
        car.model = "Malibu";
        car.price = 22000;
        System.out.printf("Model: %s\nPrice: %s",car.model,car.price);
    }
}
