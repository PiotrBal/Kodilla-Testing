package com.kodilla.testing.shape;

import java.util.ArrayList;

    public class ShapeCollector {
        Shape shape;
        ArrayList<Shape> shapeCollectorList = new ArrayList<Shape>();

        public ShapeCollector(Shape shape) {

            this.shape = shape;

            Shape circle = new Circle("Circle");
            Shape triangle = new Triangle("Triangle");
            Shape square = new Square("Square");
        }

        public Shape getShape() {
            return shape;
        }

            public void addFigure(Shape shape){
                shapeCollectorList.add(shape);
             }

            public boolean removeFigure(Shape shape){
                boolean result = false;
                if (shapeCollectorList.contains(shape)){
                    shapeCollectorList.remove(shape);
                    result = true;
                }
                return result;
            }

            public Shape getFigure(int figureNumber){
                Shape shape = null;
                if (figureNumber >= 0 && figureNumber < shapeCollectorList.size()) {
                    shape = shapeCollectorList.get(figureNumber);
                }
                return shape;
            }

            public void showFigures(){
                System.out.println(shapeCollectorList);
            }
            public int getFigureQuantity() {
                return shapeCollectorList.size();
            }
        }