package edu.uob;

public class Shapes {

    // TODO use this class as then entry point; play around with your shapes, etc
    public static void main(String[] args) {
        Triangle testTriangle1 = new Triangle(5, 7, 9);
        Triangle testTriangle2 = new Triangle(19, 23, 37);
        Triangle testTriangle3 = new Triangle(43, 30, 49);
        int longestSide = testTriangle1.getLongestSide();
        System.out.println("The longest side of test triangle is " + longestSide);
        System.out.println("The longest side of test triangle 2  is " + testTriangle2.getLongestSide());
        System.out.println("The longest side of test triangle 3 is " + testTriangle3.getLongestSide());
        System.out.println(testTriangle1);
    }
}
