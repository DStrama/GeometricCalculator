package com.company;



public class Circle extends Figure implements IPrint{


    public double radius;
    public double pi;

    public Circle(double radius) {
        this.radius = radius;
        this.pi = Math.PI;
    }

    @Override
    public double calculateArea() {
        return (pi*radius*radius);
    }

    @Override
    public double calculatePerimeter() {
        return (2*pi*radius);
    }

    @Override
    public void print() {
        System.out.println("                Circle                ");
        System.out.println("Radius : " + this.radius);
        System.out.println("Calculated Area for Circle: " + calculateArea());
        System.out.println("Calculated Perimeter for Circle: " + calculatePerimeter());
        System.out.println("");
        System.out.println("");

    }
}