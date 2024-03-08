package edu.uob;

public class Triangle {

    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // TODO implement me!
    public double calculateArea() {
        return 0;
    }

    // TODO implement me!
    public int calculatePerimeterLength() {
        return 0;
    }


    public int getLongestSide() {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    @Override
    public String toString() {
        return "This is a Triangle with sides of length " + a + "," + b + "," + c;
    }
}
