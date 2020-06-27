package com.kodilla.testing.shape;

public class Triangle implements Shape{
    String name;

    public Triangle(String name) {

        this.name = name;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public void getField() {
        double base = 2;
        double height = 10;
        double field = (base * height)/2;
        System.out.println(field);
    }
}
