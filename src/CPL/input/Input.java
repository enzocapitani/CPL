package CPL.input;

import java.util.Scanner;

/*
* Classe feita para capturar dados inseridos pelo usuário no terminal
*/
public class Input {
    
    /*
    * Usa o scanner para a captura do que o usuario digitou no terminal
    */
    public static Scanner scr = new Scanner(System.in);

    /*
    * Lê o proximo boolean no terminal
    */
    public static boolean catchBoolean(){
        boolean finalBool = scr.nextBoolean();
        scr.nextLine();

        return finalBool;
    }

    /*
    * Lê o proximo valor double no terminal
    */
    public static double catchDouble(){
        double finalValue = scr.nextDouble();
        scr.nextLine();

        return finalValue;
    } 

    
    /*
    * Lê o proximo valor integer no terminal
    */
    public static int catchInt(){
        int finalValue = scr.nextInt();
        scr.nextLine();

        return finalValue;
    }

    
    /*
    * Lê o proximo valor string no terminal
    */
    public static String catchString(){
        String finalString = scr.nextLine();
        return finalString;
    }

}
