/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject11;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Mavenproject11 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        int firstLoop, secondLoop, space = 0;

        System.out.print("Please enter a symbol: ");
        char symbol = input.next().charAt(0);

        for (firstLoop = number; firstLoop > 1; --firstLoop) {
            for (secondLoop = 1; secondLoop <= space; ++secondLoop) {
                System.out.print("  ");
            }
            for (int thirdLoop = 1; thirdLoop <= firstLoop; ++thirdLoop) {
                System.out.print(symbol + " ");
            }
            System.out.println();
            ++space;
        }

        for (firstLoop = 1; firstLoop <= number; ++firstLoop) {
            for (secondLoop = 1; secondLoop <= space; ++secondLoop) {
                System.out.print("  ");
            }
            for (int thirdLoop = 1; thirdLoop <= firstLoop; ++thirdLoop) {
                System.out.print(symbol + " ");
            }
            System.out.println();
            --space;
}
}
}