/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Activity {

    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       
       
       
       int sum = 0;
       int numVal;
       
       do {
            System.out.print("Enter a number (press 0 to stop) : ");
            numVal = input.nextInt();
            sum += numVal;
            numVal--;
        
       } while (numVal >= 0);

        System.out.println("The sum of the values is: " + sum);
    }
}
