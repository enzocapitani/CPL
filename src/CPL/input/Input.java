package CPL.input;

import java.util.Scanner;

public class Input {
    
    public static Scanner scr = new Scanner(System.in);

    public static boolean catchBoolean(){
        boolean finalBool = scr.nextBoolean();
        scr.nextLine();

        return finalBool;
    }

    public static double catchDouble(){
        double finalValue = scr.nextDouble();
        scr.nextLine();

        return finalValue;
    } 

    public static int catchInt(){
        int finalValue = scr.nextInt();
        scr.nextLine();

        return finalValue;
    }

    public static String catchString(){
        String finalString = scr.nextLine();
        return finalString;
    }

}
