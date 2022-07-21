package Question3;

public class ShapeImpl implements Shape2{



    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    @Override
    public double area(double length, double breadth) {
        return length * breadth;
    }

    @Override
    public double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    @Override
    public double perimeter(double length, double breadth) {
        return  2 *(length + breadth);
    }
}
