/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
package com.company;

import java.util.Scanner;
import java.util.Date;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date dt=new Date();
        int year=dt.getYear();

        int current_Year=year+1900;

        System.out.print("What is your current age? ");
        int age1 = input.nextInt();

        System.out.print("At what age would you like to retire? ");
        int age2 = input.nextInt();

        int dif;
        dif = age2 - age1;

        System.out.printf("You have %d years left until you can retire.\n", dif);

        System.out.printf("It's %d, so you can retire in %d.", current_Year, current_Year+dif);
    }
}