/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balloonprank;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BalloonPrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the width of the bedroom (in feet):");
        double WIDTH = keyboard.nextDouble();
        
        System.out.println("Enter the length of the bedroom (in feet):");
        double LENGTH = keyboard.nextDouble();
        
        System.out.println("Enter the height of the bedroom (in feet):");
        double HEIGHT = keyboard.nextDouble();
        
        final double INCHES_TO_FEET = 12.0;
        
        System.out.println("Enter a balloon radius (in inches):");
        double balloonRadius = keyboard.nextDouble() / INCHES_TO_FEET;
        
        double balloonVolume = Sphere.volume(balloonRadius);
        double bedroomVolume = Box.volume(LENGTH, WIDTH, HEIGHT);
        
        double balloonsRequired = bedroomVolume / balloonVolume;
        
        System.out.printf("Using balloons of radius %.0f inches, you will need %.0f balloons.\n", balloonRadius * INCHES_TO_FEET, balloonsRequired);
        
    }
}