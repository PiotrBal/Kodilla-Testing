package com.kodilla.testing.shape;

public class Square implements Shape{
    String name;

    public Square(String name) {
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public void getField() {
        double side = 2;
        double field = side * side;
        System.out.println(field);
    }
}
