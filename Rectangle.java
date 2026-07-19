public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void print() {
        System.out.println("Rectangle: Length = " + length + ", Width = " + width);
        System.out.println("Area = " + (length * width));
    }
}
