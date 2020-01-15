package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберете фигуру для расчета периметра:\n1.-Круг;\n2.-Квадрат;\n3.-Треугольник.");
        int num = scan.nextInt();
        double side;
        if (num == 1) {
            System.out.println("Введите радиус:");
            side = (double)scan.nextInt();
            Circle cir = new Circle(side, 3.141592653589793D);
            System.out.println(cir.getPerimeter());
        } else if (num == 2) {
            System.out.println("Введите сторону:");
            side = (double)scan.nextInt();
            Square sq = new Square(side);
            System.out.println(sq.getPerimeter());
        } else if (num == 3) {
            System.out.println("Введите 3 стороны:");
            side = (double)scan.nextInt();
            double side2 = (double)scan.nextInt();
            double side3 = (double)scan.nextInt();
            Triangle tri = new Triangle(side, side2, side3);
            System.out.println(tri.getPerimeter());
        } else {
            System.out.println("Введите предлагаемый номер фигуры");
        }

    }
}
