package com.task.object;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("White","BMW","AA7777AA");
        Car car2 = new Car("Black","BMW","AA7777AA");

        System.out.println("Equals= "+ car1.equals(car2));
        boolean hashCode=car1.hashCode()== car2.hashCode();
        System.out.println("HashCode= "+  hashCode );
    }
}
