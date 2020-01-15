package com.company;

class Triangle extends Figure {
    private double side2;
    private double side3;

    Triangle(double side, double side2, double side3) {
        super(side);
        this.side2 = side2;
        this.side3 = side3;
    }

    double getPerimeter() {
        return this.side + this.side2 + this.side3;
    }
}