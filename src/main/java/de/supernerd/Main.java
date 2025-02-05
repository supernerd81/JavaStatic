package de.supernerd;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.incrementInstanceCount();
        Car.incrementTotalCount();
        System.out.println(car1);

        Car car2 = new Car();
        car2.incrementInstanceCount();
        Car.incrementTotalCount();
        System.out.println(car2);

        Car car3 = new Car();
        car3.incrementInstanceCount();
        Car.incrementTotalCount();
        System.out.println(car3);

    }
}
