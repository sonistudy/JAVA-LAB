abstract class Shape {
    protected int dimension1; // could represent length, base, or radius
    protected int dimension2; // could represent width or height, or could be unused for Circle

    // Abstract method to print area
    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        this.dimension1 = length;
        this.dimension2 = width;
    }

    @Override
    public void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int base, int height) {
        this.dimension1 = base;
        this.dimension2 = height;
    }

    @Override
    public void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        this.dimension1 = radius; // Only one dimension is needed for Circle
    }

    @Override
    public void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        rectangle.printArea();

        Shape triangle = new Triangle(4, 6);
        triangle.printArea();

        Shape circle = new Circle(7);
        circle.printArea();
    }
}