package Class26.Project2;



    public interface Shape {
        void calculateArea();
        void calculatePerimeter();
    }

    class Circle implements Shape {
        public static final double pi= 3.14;
        public double radius;

        public Circle(double radius) {

            this.radius= radius;
        }
        @Override
        public void calculateArea() {
            double areaOfCircle= pi* radius*radius;
            System.out.println("Area of Circle: "+areaOfCircle);
        }

        @Override
        public void calculatePerimeter() {
            double perimeter= 2* pi* radius;
            System.out.println("Perimeter of Circle: "+perimeter);
        }

    }

    class Square implements Shape {
        double side;
        Square(double side){

            this.side= side;
        }

        @Override
        public void calculateArea() {
            double areaOfSquare= side* side;
            System.out.println("Area of Square: "+areaOfSquare);
        }

        @Override
        public void calculatePerimeter() {
            double perimeterOfSquare= 4 * side;
            System.out.println("Perimeter of Square: "+perimeterOfSquare);
        }
    }

