package Class26.Project2;

public class ShapeTester {


        public static void main(String[] args) {
            int count=0;
            Shape[] array= {new Circle(4), new Square(2.5)};
            for (Shape shapes: array) {
                shapes.calculateArea();
                shapes.calculatePerimeter();
            }
        }
    }

