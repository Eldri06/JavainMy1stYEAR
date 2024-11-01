/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity10;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Activity10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int choiceInput = input.nextInt();

        int num_1 = 1; 
        int num_2 = 2; 

        if (choiceInput == 1) {
            System.out.println("Odd numbers from 1 to 10 are: ");
            do {
                if (num_1 % 2 != 0) { 
                    System.out.println(num_1);
                }
                num_1 += 2; 
            } while (num_1 <= 10);
        } else if (choiceInput == 2) {
            System.out.println("Even numbers from 1 to 10 are: ");
            do {
                if (num_2 % 2 == 0) { 
                    System.out.println(num_2);
                }
                num_2 += 2; 
            } while (num_2 <= 10);
        } else {
            System.out.println("Invalid choice! Please enter either 1 or 2.");
        }
        
        }
    
    }
    

