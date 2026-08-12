package cpl.menu;

import cpl.style.Write;

public class Header {

    //TODO : Verificar essa classe, ta meio esquisita
    //TODO : adicionar metodo de efeito de digitação com cabeçalho pré definido
    //TODO : fazer métodos não estáticos, onde o usuário muda apenas uma vez o delay e o separador

    /**
     * Writes a simplified header to the terminal; dividers are generated based on the title length,
     * The divider is approximately twice the length of the title
     *
     * @param title the header title
     */
    public static void header(String title){
        String separator = Separator.generateSeparator(title);

        System.out.println(separator);
        System.out.println(Title.generateCenterTitle(separator, title));
        System.out.println(separator);
    }

    /**
     * Writes a simplified header to the terminal; the user have to instance the separator on this function.
     *
     * @param title the header title
     * @param separator the separator
     */
    public static void header(String title, String separator){
        System.out.println(separator);
        System.out.println(Title.generateCenterTitle(separator, title));
        System.out.println(separator);
    }

    /**
     * Writes a simplified header to the terminal; dividers are generated based on the title length,
     * and the divider is approximately twice the length of the title.
     *
     * @param title the header title
     * @param delay the typing effect delay
     */
    public static void typeHeader(String title, int delay){
        String separator = Separator.generateSeparator(title);

        Write.type(separator, delay);
        Write.type(Title.generateCenterTitle(separator, title), delay);
        Write.type(separator, delay);
    }

    /**
     * Writes a simplified header to the terminal with effect of typing
     * and the divider is approximately twice the length of the title.
     *
     * @param title the header title
     * @param delay the typing effect delay
     */
    public static void typeHeader(String title, int delay, String divider){
        Write.type(divider, delay);
        Write.type(Title.generateCenterTitle(divider, title), delay);
        Write.type(divider, delay);
    }

    /**
     * Writes a simplified header to the terminal; dividers are generated based on the title length,
     * and the divider is approximately twice the length of the title.
     *
     * The typing effect has the delay based on the WriteClass const
     *
     * @param title the header title
     */
    public static void typeHeader(String title){
        String separator = Separator.generateSeparator(title);

        Write.type(separator);
        Write.type(Title.generateCenterTitle(separator, title));
        Write.type(separator);
    }

}
