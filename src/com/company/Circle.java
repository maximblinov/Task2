package com.company;


class Circle extends Figure {
    private double Pi;

    Circle(double side, double Pi) {
        super(side);
        this.Pi = Pi;
    }

    double getPerimeter() {
        return this.side * this.Pi * 2.0D;
    }
}
