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


        System.out.println(Calculator.add(55.88, 66.22));
        System.out.println(Calculator.subtraction(155.88, 66.22));
        System.out.println(Calculator.multiplication(55.88, 4));
        System.out.println(Calculator.division(1155.88, 56.22));
    }
}
