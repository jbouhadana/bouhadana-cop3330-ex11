/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        double euros = jb.nextDouble();

        System.out.print("What is the exchange rate? ");
        double exchangeRate = jb.nextDouble();

        System.out.printf("%.2f euros at an exchange rate of %f is\n%.2f U.S. dollars",
                euros, exchangeRate, euros*exchangeRate);
    }
}
