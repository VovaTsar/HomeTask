package com.task.object;

import java.util.Objects;

public class Car {
    public String color;
    public String name;
    public String number;

    public Car(String color, String name, String number) {
        this.color = color;
        this.name = name;
        this.number = number;
    }

    public Car() {
        color="Black";
        name="BMW";
        number="AA7777AA";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public boolean equals(Car car) {
        if (this == car) return true;
        if (car == null || getClass() != car.getClass()) return false;
        return color.equals( car.color) &&
                name.equals(car.name) &&
                number.equals(car.number);
    }


    public int hashCode() {
        return (color.length()+name.length()+number.length());
    }
}
