package com.kodilla.testing.shape;

import java.util.ArrayList;

    public class ShapeCollector<circle, triangle, square> {
        Shape shape;
        ArrayList<Shape> shapeCollectorList = new ArrayList<Shape>();

        public ShapeCollector(Shape shape) {
            this.shape = shape;
        }

        public Shape getShape() {
            return shape;
        }

            Shape circle = new Circle("Circle");
            Shape triangle = new Triangle("Triangle");
            Shape square = new Square("Square");


            shapeCollectorList.add(circle);
            shapeCollectorList.add(triangle);
            shapeCollectorList.add(square);

            public void addFigure(Shape shape){
                ShapeCollector shape = new ShapeCollector(Shape shape);
                shapeCollectorList.add(shape);
             }

            public boolean removeFigure(Shape shape){
                boolean result = false;
                if (shapes.contains(shape)){
                    shapes.remove(shape);
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
        }
    }