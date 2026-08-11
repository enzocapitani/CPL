package cpl.input;

import java.util.Scanner;

/**
 * Class made to capture data entered by the user in the terminal
 */
public class Input {

    /**
     * Uses the scanner to capture what the user typed into the terminal
     */
    public static Scanner scr = new Scanner(System.in);

    /**
     * Reads the next boolean in the terminal
     */
    public static boolean catchBoolean(){
        boolean finalBool = scr.nextBoolean();
        scr.nextLine();

        return finalBool;
    }

    /**
     * Reads the next double value in the terminal
     */
    public static double catchDouble(){
        double finalValue = scr.nextDouble();
        scr.nextLine();

        return finalValue;
    }


    /**
     * Reads the next integer value in the terminal
     */
    public static int catchInt(){
        int finalValue = scr.nextInt();
        scr.nextLine();

        return finalValue;
    }


    /**
     * Reads the next string value in the terminal
     */
    public static String catchString(){
        String finalString = scr.nextLine();
        return finalString;
    }

}
