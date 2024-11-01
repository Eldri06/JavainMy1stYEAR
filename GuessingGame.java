/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GuessingGame {
 
public class GuessingGameFinalOutput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("I've selected a random number between 1 - 10. Can you guess it?");

        int guess = 0;
        int randomNumber = random.nextInt(10) + 1;
        int attempt = 0;

        do 
        {
            System.out.print("\t\nEnter your guess: ");

            if (input.hasNextInt())
            {
                guess = input.nextInt();

                if (guess < randomNumber) 
                {
                    System.out.print("\n\tToo low\n");
                } 
                else if (guess > randomNumber && guess < 11 ) {
                    System.out.print("\n\tToo high\n");
                } 
                else if (guess > 10)
                {
                	System.out.print("\n\tThe guess should be below 10\n");
                }
                else 
                {
                    System.out.print("\n\tCorrect! Congratulations, you guessed the number in " + attempt + " attempt(s).\n");
                }
            }
         else
            {
                input.next();
                System.out.print("\n\tInvalid input. Please enter a valid number.\n");
            }

            attempt++;
        } while (guess != randomNumber);

        
    }
}

}
