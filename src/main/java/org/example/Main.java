package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Point second = new Point(3, 1);
        Point first = new Point(3, 1);


        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        //test

    }
}





