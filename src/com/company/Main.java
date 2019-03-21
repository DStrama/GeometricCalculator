package com.company;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        int exit = 1;

        while ( exit ==  1 ){


            System.out.println("--------------------------------------");
            System.out.println("---- Calculate Area or Perimeter: ----");
            System.out.println("--------------------------------------");
            System.out.println("                                      ");
            System.out.println("--------------------------------------");
            System.out.println("Choose Figure : ");
            System.out.println("--------------------------------------");
            System.out.println("1: Square   : ");
            System.out.println("2: Triangle : ");
            System.out.println("3: Circle   : ");
            System.out.println("--------------------------------------");
            System.out.println("4: Exit   : ");

            Scanner scanner = new Scanner(System.in);
            int  choiceMenu= scanner.nextInt();


            switch (choiceMenu) {
                case 1:

                    Square object1 = new Square();
                    object1.print();

                    /*System.out.println("----------------Square----------------");
                    System.out.println("Pass data : ");
                    System.out.println("--------------------------------------");



                    try{
                        System.out.println("Side : ");
                        double dataSide = scanner.nextDouble();


                        if( dataSide > 0 ) {


                            Square object1 = new Square(dataSide);
                            object1.print();

                        }
                        else{
                            System.out.println("Invalid number");
                            break;
                        }
                    }
                    catch ( InputMismatchException e){
                        System.out.println("Exception thrown :" + e);
                    }*/

                    break;
                case 2:

                    System.out.println("----------------Triangle--------------");
                    System.out.println("Press data : ");
                    System.out.println("--------------------------------------");

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
                            break;
                        }
                    }
                    catch ( InputMismatchException e ){
                        System.out.println("Exception thrown :" + e);
                    }
                    catch ( IllegalArgumentException e ) {
                        System.out.println("Exception thrown :" + e);
                    }
                    break;
                case 3:

                    System.out.println("----------------Circle----------------");
                    System.out.println("Pass data : ");
                    System.out.println("--------------------------------------");


                    try {


                        System.out.println("Radius : ");
                        double dataRadius = scanner.nextDouble();

                        if (dataRadius > 0) {


                            Circle object3 = new Circle(dataRadius);

                            object3.print();


                        } else {
                            System.out.println("Invalid number");
                            break;
                        }
                    }
                    catch ( InputMismatchException e){
                        System.out.println("Exception thrown :" + e);
                    }

                    break;
                case 4:
                    System.exit(0);

            }



        }

    }
}