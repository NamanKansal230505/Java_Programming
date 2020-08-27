package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of the square = ");
        float a=s.nextFloat();
        float p = (4*a);
        System.out.println("Perimeter of square is "+p);

    }

}
