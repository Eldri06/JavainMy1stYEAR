/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject19;

//import java.util.Collections;
//import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Administrator
 */
public class Mavenproject19 {

   
  

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a list of numbers separated by spaces: ");
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                                       .map(Integer::parseInt)
                                       .collect(Collectors.toList());

        System.out.print("Enter shift key value: ");
        int shift = sc.nextInt();

        // Encrypt and sort numbers
        List<Integer> encrypted = numbers.stream()
                                          .map(n -> n + shift)
                                          .sorted()
                                          .toList();

        // Output results
        System.out.println("Encrypted numbers: " + encrypted);
        System.out.println("Sorted numbers: " + encrypted);
        System.out.println("Sum of the first and last number: " + (encrypted.get(0) + encrypted.get(encrypted.size() - 1)));
        
        if (encrypted.size() > 2) {
            System.out.println("Sum of the 2nd and 3rd numbers: " + (encrypted.get(1) + encrypted.get(2)));
        } else {
            System.out.println("Not enough numbers for 2nd and 3rd sum.");
        }
        
        System.out.println("Sum of all numbers: " + encrypted.stream().mapToInt(Integer::intValue).sum());
    }
}