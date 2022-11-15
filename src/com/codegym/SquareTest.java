package com.codegym;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        square = new Square(3.0, "red", false);
        System.out.println(square);
        System.out.println(square.howToColor());
    }
}
