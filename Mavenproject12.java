/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject12;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Mavenproject12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Choose a pattern: ");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");

        int choice = input.nextInt();

        char patternChar = '*'; 

        switch (choice) {
            case 1:
            
                for (int i = 0; i < number; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        System.out.print(patternChar + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
            
                for (int i = 0; i < number; i++) {
                    for (int j = 0; j < number * 2; j++) {
                        System.out.print(patternChar + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
              
                for (int i = 0; i < number; i++) {
                    for (int j = 0; j < number; j++) {
                        System.out.print(patternChar + " ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}