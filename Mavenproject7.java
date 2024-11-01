/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Mavenproject7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        int temp = input.nextInt();
        
       
       
        switch ((int)temp) {
            
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9:
            System.out.println("It`s freezing cold. You should wear warm coat, layered jackets, more jackets! Don`t forget your gloves. " );
                break;
            
            case 10, 11, 12, 13, 14, 15:
                System.out.println("It`s cold. You should wear jackets and pants ");
            break; 
            
            case 20: 
                
                System.out.println("It`s warm. T-shirt and shorts would be comfortable ");
                break;
            case 30, 31, 32, 33, 34, 35, 36 ,37 ,38, 39, 40:
                 System.out.println("It`s really hot! Wear thin clothes, drink plenty of water and stay in cool areas.  ");
           break;
            default:
                System.out.println("TEMPERATURE IS NOT ON THE LIST! ");
                
            
        }
    }
    
}
