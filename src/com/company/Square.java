package com.company;

public class Square extends Figure implements IPrint{

    public double side;


    public Square(double side) {
        this.side = side;
    }

    public Square(){

    }

    @Override
    public void print(){
        System.out.println("                Square                ");
        System.out.println("Side : " + this.side);
        System.out.println("Calculated Area for Square: " + calculateArea());
        System.out.println("Calculated Perimeter for Square: " + calculatePerimeter());
        System.out.println("");
        System.out.println("");
    }

    @Override
    public double calculateArea() {

        return (this.side*this.side);
    }

    @Override
    public double calculatePerimeter() {

        return (4*side);
    }
}