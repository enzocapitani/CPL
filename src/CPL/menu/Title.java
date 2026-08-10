package CPL.menu;

public class Title {

    /**
     * Centraliza o título do menu em relação ao tamanho da linha
     * separadora.
     *
     * @param separator Linha separadora utilizada como referência.
     * @param title Título do menu.
     * @return O título centralizado.
     */
    public static String generateCenterTitle(String separator, String title){

        StringBuilder sb = new StringBuilder();

        // Calcula a quantidade de espaços necessários
        int espacoBranco = separator.length()/2 - title.length()/2;

        // Adiciona os espaços antes do título
        for(int i = 0; i < espacoBranco; i++){
            sb.append(" ");
        }

        // Adiciona o título
        for(int i = 0; i < title.length(); i++){
            sb.append(title.charAt(i));
        }

        return sb.toString();

    }

    /**
     * Centraliza o título do menu em relação ao tamanho da linha
     * separadora e adiciona ao seu redor o caractere '|'.
     *
     * @param separator Linha separadora utilizada como referência.
     * @param title Título do menu.
     * @param biggestString Maior string entre as opções e o titulo
     * @return O título centralizado e fechado por '|'.
     */
    public static String generateSurroundedTitle(String separator, String title, int biggestString){
        StringBuilder sb = new StringBuilder();

        int espacoBranco = separator.length()/2 - title.length()/2;

        for(int i = 0; i < espacoBranco; i++){
            if(i == 0){
                sb.append("|");
                continue;
            }
            sb.append(" ");
        }

        // Adiciona o título
        for(int i = 0; i < title.length(); i++){
            sb.append(title.charAt(i));
        }

        if(biggestString % 2 != 0) espacoBranco -= 1;

        for(int i = 0; i < espacoBranco; i++){
            if(i == espacoBranco - 1){
                sb.append("|");
                continue;
            }
            sb.append(" ");
        }

        return sb.toString();

    }

}
