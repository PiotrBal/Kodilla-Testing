package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
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
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(1, shapeCollector.getFigureQuantity);
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.removeFigure(square);
        //Then
        Assert.assertEquals(0, shapeCollector.getFigureQuantity);
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        //When
        Shape figure;
        figure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(shapeCollector, figure);
    }
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        result = shapeCollector.showFigures();
        //Then
        Assert.assertEquals(result);
    }
}
