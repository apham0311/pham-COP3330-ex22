package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App 
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String userNumOne = in.nextLine();
        System.out.print("Enter the second number: ");
        String userNumTwo = in.nextLine();
        System.out.print("Enter the third number: ");
        String userNumThree = in.nextLine();

        double varOne = Double.parseDouble(userNumOne);
        double varTwo = Double.parseDouble(userNumTwo);
        double varThree = Double.parseDouble(userNumThree);
        double MAX = 0;

        if (varOne == varTwo && varTwo == varThree)
        {
            System.exit(0);
        }

        if(varOne > varTwo && varOne > varThree) {
            MAX = varOne;
        }

        if(varTwo > varOne && varTwo > varThree){
            MAX = varTwo;
        }

        if(varThree > varOne && varThree > varTwo) {
            MAX =varThree;
        }

        String output = "The largest number is " + MAX + ".";
        System.out.print(output);

    }
}
