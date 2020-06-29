package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private Shape shape;
    ShapeCollector shapeCollector = new ShapeCollector(shape);

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testAddFigure() {
        //Given
        //When
        shapeCollector.addFigure(new Square("square"));
        //Then
        Assert.assertEquals(1, shapeCollector.getFigureQuantity());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        Square square = new Square("Square");
        //When
        shapeCollector.removeFigure(square);
        //Then
        Assert.assertEquals(0, shapeCollector.getFigureQuantity());
    }
    @Test
    public void testGetFigure() {
        //Given
        Square square = new Square("Square");
        shapeCollector.addFigure(square);
        //When
        Shape figure;
        figure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(shapeCollector, figure);
    }
    @Test
    public void testShowFigures() {
        System.out.println(shapeCollector);
    }
}
