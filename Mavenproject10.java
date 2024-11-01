/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject10;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Mavenproject10 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("How many values do you want to compare? ");
      int Count = input.nextInt();
      
      if (Count <= 0) {
          System.out.println("IVALID NUMBER INPUT ");
      }
      System.out.println("Enter number 1: ");
      int num = input.nextInt();
      int min = num;
      int max = num;
      
      
      for (int i = 2; i <= Count; i++) {
          System.out.println("Enter number "+ i + ": ");
          num = input.nextInt();
          
         if (num < min) {
             min = num;
             
         }
          if (num > max) {
              max = num;
              
              
          }
           
    }
    
      System.out.println("Minimum value is: "+ min);
      System.out.println("Minimum value is: "+ max);
    }
}
