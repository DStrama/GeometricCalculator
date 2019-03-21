package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle extends Figure implements IPrint{

    public double sidewall_1;
    public double sidewall_2;
    public double base;
    public double area;
    public double perimeter;
    public double halfperimeter;

    public Triangle(double base, double sidewall_1, double sidewall_2){

        this.base = base;
        this.halfperimeter =( (base+sidewall_1+sidewall_2)/2 );
        this.sidewall_1 = sidewall_1;
        this.sidewall_2 = sidewall_2;

    }

    public Triangle (){
        System.out.println("----------------Triangle--------------");
        System.out.println("Press data : ");
        System.out.println("--------------------------------------");
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Base : ");
            double dataBase = scanner.nextDouble();
            System.out.println("Wall first : ");
            double dataWall = scanner.nextDouble();
            System.out.println("Wall second : ");
            double dataWall1 = scanner.nextDouble();

            if( (dataBase + dataBase) <= dataWall1 || (dataBase + dataWall1)  <= dataWall || (dataWall1 + dataWall ) <= dataBase ){
                throw new IllegalArgumentException("Invalid arguments because they can not make Triangle! " );
            }
            if (dataBase > 0 && dataWall > 0 && dataWall1 > 0) {

                Triangle object2 = new Triangle(dataBase, dataWall, dataWall1);
                object2.print();

            }
            else {
                System.out.println("Invalid number, length can not be negative number!");
                System.exit(0);
            }
        }
        catch ( InputMismatchException e ){
            System.out.println("Exception thrown :" + e);
        }
        catch ( IllegalArgumentException e ) {
            System.out.println("Exception thrown :" + e);
        }

    }

    public void print(){
        System.out.println("                Triangle                ");
        System.out.println("Base : " + this.base);
        System.out.println("Side Wall 1 : " + this.sidewall_1);
        System.out.println("Side Wall 2 : " + this.sidewall_2);
        System.out.println("Calculated Area for Triangle: " + calculateArea());
        System.out.println("Calculated Perimeter for Triangle: " + calculatePerimeter());
        System.out.println("");
        System.out.println("");


    }


    @Override
    public double calculatePerimeter() {

        return base+sidewall_2+sidewall_1;
    }

    @Override
    public double calculateArea() {

        return (Math.sqrt( halfperimeter*( halfperimeter-base )*( halfperimeter-sidewall_1 )*( halfperimeter-sidewall_2)));
    }
}