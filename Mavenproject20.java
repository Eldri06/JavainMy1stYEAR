/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject20;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Mavenproject20 {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
      
        int[] numbers = new int[n];
        
    
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        

        bubbleSort(numbers);
        
    
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        
        
        System.out.println("Sorted List:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum of all numbers: " + sum);
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
        
        scanner.close();
    }
    
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


