/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject14;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Mavenproject14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scan.nextInt();

    
       for (int i = 0; i <= num; i++){
           for (int j=1; j<i; j++){
               System.out.print(" ");
           }
        for (int j = 1; j<=num;j++){
            System.out.print("*");
        }
       
System.out.println();
    }
    
       
        for (int i = num - 1; i >= 1; i--) {
            
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
           
            for (int j = i; j <= num; j++) {
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
