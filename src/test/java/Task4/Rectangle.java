package Task4;

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    public Rectangle(double side) {
        this(side, side);
    }
    @Override
    public void area() {
        double area = length * width;
        System.out.println("Area of " + name + " is " + area);
    }
}