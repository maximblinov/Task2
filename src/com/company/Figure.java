package com.company;


abstract class Figure {
    double side;

    Figure(double a) {
        this.side = a;
    }

    abstract double getPerimeter();
}
