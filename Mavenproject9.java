/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject9;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Mavenproject9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to JAVA Calculator! ");
        System.out.println("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = input.nextInt();
        System.out.println("Press 1 to add ");
        System.out.println("Press 2 to subtract ");
        System.out.println("Press 3 to multiply ");
        System.out.println("Press 4 to divide ");
        int UserInput = input.nextInt();

        if (UserInput == 1) {
            System.out.println("Addition: " + (num1 + num2));
        } else if (UserInput == 2) {
            System.out.println("Subtraction: " + (num1 - num2));
        } else if (UserInput == 3) {
            System.out.println("Multiplication: " + (num1 * num2));
        } else if (UserInput == 4) {
            if (num2 != 0) {
                System.out.println("Division: " + (num1 / (double) num2));
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Invalid operation");
        }
    }
}