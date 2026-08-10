package CPL.menu;

import CPL.style.Write;

/**
 * Classe responsável pela criação de menus simples para aplicações
 * executadas no terminal.
 *
 * Todos os métodos são estáticos, portanto não é necessário criar
 * uma instância desta classe para utilizá-los.
 */
public class Menu {
    
    /**
     * Exibe um menu simples no terminal.
     *
     * O menu é composto por um título centralizado, uma lista numerada
     * de opções e linhas separadoras.
     *
     * @param title Título do menu.
     * @param options Vetor contendo as opções que serão exibidas.
     */
    public static void simple(String title, String options[]){
        String separator = Separator.generateSeparator(title, options, '=');

        // Gera o cabeçalho do menu
        System.out.println(separator);
        System.out.println(Title.generateCenterTitle(separator, title));
        System.out.println(separator);

        // Exibe todas as opções numeradas
        for(int i = 0; i < options.length; i++){
            System.out.println((i + 1)+"- "+options[i]);
        }

        // Fecha o menu com uma linha separadora
        System.out.println(separator);

    }

    /**
     * Exibe um menu utilizando o efeito de digitação da classe Write.
     *
     * Cada caractere é exibido com um intervalo definido pelo parâmetro
     * delay.
     *
     * @param title Título do menu.
     * @param options Vetor contendo as opções do menu.
     * @param delay Tempo, em milissegundos, entre cada caractere exibido.
     */
    public static void simple(String title, String options[], int delay){
        String separator = Separator.generateSeparator(title, options, '=');

        // Gera o cabeçalho do menu utilizando efeito de escrita
        Write.type(separator, delay);
        Write.type(Title.generateCenterTitle(separator, title), delay);
        Write.type(separator, delay);

        // Exibe todas as opções numeradas com efeito de escrita
        for(int i = 0; i < options.length; i++){
            Write.type((i + 1)+"- "+options[i], delay);
        }

        // Fecha o menu
        Write.type(separator, delay);

    }

    /**
     * Escreve o menu em caixa, cerca o titulo e as opções de caracteres, formando uma caixa
     * 
     * @param title
     * @param options
     */
    public static void box(String title, String options[]){
        String separator = Separator.generateSeparator(title, options, '-');

        System.out.println(separator);
        System.out.println(Title.generateSurroundedTitle(separator, title, Separator.biggestElement(title, options)));
        System.out.println(separator);

        writeOptions(options, separator.length());
        System.out.println(separator);
    }

    /**
     * Escreve a parte de opções do boxMenu
     * 
     * @param options as opções
     * @param separatorSize o tamanho do separador
     */
    private static void writeOptions(String[] options, int separatorSize){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < options.length; i++){
            for(int j = 0; j < separatorSize; j++){
                
                if(j < 4){
                    switch (j) {
                        case 0:
                            sb.append('|');
                            break;
                        case 1: 
                            sb.append(i+1);
                            break;
                        case 2: 
                            sb.append('-');
                            break;
                        case 3: 
                            sb.append(" ");
                            break;
                    }
                    continue;
                }

                if(j >= 4 && j < options[i].length() + 4){
                    sb.append(options[i].charAt(j - 4));
                    continue;
                }

                if(j < separatorSize - 1){
                    sb.append(" ");
                }else{
                    sb.append('|');
                }

            }
            System.out.println(sb.toString());
            sb.delete(0, separatorSize);
        }
    }

}