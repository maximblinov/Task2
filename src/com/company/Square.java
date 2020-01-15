package com.company;

class Square extends Figure {
    Square(double side) {
        super(side);
    }

    double getPerimeter() {
        return this.side * 4.0D;
    }
}
