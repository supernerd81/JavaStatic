package de.supernerd;

import java.util.Objects;

public class Car {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public Car() {
    }

    public Car(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return instanceCount == car.instanceCount;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(instanceCount);
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int totalCount) {
        Car.totalCount = totalCount;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "instanceCount=" + instanceCount + " " +
                "totalCount=" + totalCount +
                '}';
    }
}
