public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void print() {
        System.out.println("Square: Side = " + side);
        System.out.println("Area = " + (side * side));
    }
}
