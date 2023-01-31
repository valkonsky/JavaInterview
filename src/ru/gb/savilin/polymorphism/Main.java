package ru.gb.savilin.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape round = new Round();
        Shape triangle = new Triange();
        Shape square = new Square();
        round.draw();
        triangle.draw();
        square.draw();
    }
}
