package CPL.menu;

import CPL.style.Write;

public class Menu {
    
    public static void simpleMenu(String title, String options[]){
        String separator = Menu.generateSeparator(title, options);

        //Gera o titulo do menu :)
        System.out.println(separator);
        System.out.println(Menu.generateCenterTitle(separator, title));
        System.out.println(separator);

        for(int i = 0; i < options.length; i++){
            System.out.println((i + 1)+"- "+options[i]);
        }

        System.out.println(separator);

    }

    public static void simpleTypeMenu(String title, String options[], int delay){
        String separator = Menu.generateSeparator(title, options);

        //Gera o titulo do menu :)
        Write.write(separator, delay);
        Write.write(Menu.generateCenterTitle(separator, title), delay);
        Write.write(separator, delay);

        for(int i = 0; i < options.length; i++){
            Write.write((i + 1)+"- "+options[i], delay);
        }

        Write.write(separator, delay);

    }

    public static String generateSeparator(String title, String options[]){
        int maiorString = title.length();

        for(int i = 0; i < options.length; i++){
            if(options[i].length() > maiorString) maiorString = options[i].length();
        }

        maiorString *= 2;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < maiorString; i++){
            sb.append('=');
        }

        return sb.toString();
    }

    public static String generateCenterTitle(String separator, String title){

        StringBuilder sb = new StringBuilder();

        int espacoBranco = separator.length()/2 - title.length()/2;

        for(int i = 0; i < espacoBranco; i++){
            sb.append(" ");
        }

        for(int i = 0; i < title.length(); i++){
            sb.append(title.charAt(i));
        }

        return sb.toString();

    }

}
