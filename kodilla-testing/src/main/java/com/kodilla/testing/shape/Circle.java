package com.kodilla.testing.shape;

public class Circle implements Shape{
    String name;

    public Circle(String name) {
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public void getField() {
        int radius = 6;
        double field = Math.PI * (radius * radius);
        System.out.println(field);
    }
}
