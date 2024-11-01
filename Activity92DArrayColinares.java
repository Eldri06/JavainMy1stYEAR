/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myclass;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Activity92DArrayColinares {
  

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("How many weeks to be computed ");
        int numberOfWeeks = inputScanner.nextInt();
        
        double[][] weeklyTemperatures = new double[numberOfWeeks][7];
        
        for (int weekIndex = 0; weekIndex < numberOfWeeks; weekIndex++) {
            System.out.println("Enter Temperatures in Week #" + (weekIndex + 1) + ":");
            for (int dayIndex = 0; dayIndex < 7; dayIndex++) {
                double temperature = getUserTemperature(inputScanner, dayIndex);
                weeklyTemperatures[weekIndex][dayIndex] = temperature;
            }
        }
        
        for (int weekIndex = 0; weekIndex < numberOfWeeks; weekIndex++) {
            double weeklyAverage = calculateWeeklyAverage(weeklyTemperatures[weekIndex]);
            System.out.printf("The average temperature in Week #%d is: %.2f%n", (weekIndex + 1), weeklyAverage);
        }
    }
    
    public static double getUserTemperature(Scanner scanner, int day) {
        double temperature;
        do {
            System.out.print("Day  " + (day + 1) + ": ");
            temperature = scanner.nextDouble();
          
            
        } while (temperature < 0 || temperature > 50);
        return temperature;
    }
    
    public static double calculateWeeklyAverage(double[] temperatures) {
        double sum = 0;
        for (double temperature : temperatures) {
            sum += temperature;
        }
        return sum / temperatures.length;
    }
}


