package ru.gb.savilin.polymorthism;

public class Main {


    public static void main(String[] args) {
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape round  = new Round();
        square.draw();
        triangle.draw();
        round.draw();
    }
}
