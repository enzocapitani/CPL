package cpl.menu;

public class Separator {

    /**
     * Gera automaticamente a linha separadora do menu.
     *
     * O tamanho da linha é baseado no maior texto encontrado entre
     * o título e as opções do menu.
     *
     * @param title Título do menu.
     * @param options Vetor contendo as opções.
     * @param character o caractere do separador
     * @return Uma String composta apenas pelo caractere '='.
     */
    public static String generateSeparator(String title, String options[], char character){
        int maiorString = biggestElement(title, options);

        // Multiplica o tamanho para gerar uma margem visual maior
        maiorString *= 2;

        StringBuilder sb = new StringBuilder();

        // Cria a linha separadora
        for(int i = 0; i < maiorString; i++){
            sb.append(character);
        }

        return sb.toString();
    }

    /**
     * Gera uma string que serve de divisória, o tamanho dela é gerada comparada ao titulo
     *
     * @param title o titulo que vai ser comparado
     * @return retorna em string um separador relativo ao titulo
     */
    public static String generateSeparator(String title){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < title.length()*2; i++){
            sb.append('=');
        }

        return sb.toString();

    }

    /**
     * Procura o maior elemento entre o titulo e as opções
     *
     * @param title o titulo do menu
     * @param options as opcoes do menu
     * @return o maior elemento entre o titulo e as opçoes
     */
    protected static int biggestElement(String title, String[] options){
        int maiorString = title.length();

        // Procura o maior texto entre as opções
        for(int i = 0; i < options.length; i++){
            if(options[i].length() > maiorString) maiorString = options[i].length();
        }

        return maiorString;
    }

}
