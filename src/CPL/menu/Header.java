package CPL.menu;

import CPL.style.Write;

public class Header {

    /**
     * Escreve um cabeçalho simplificado no terminal, divisórias são geradas conforme o tamanho do titulo,
     * A divisória possui cerca de 2x o tamanho do titulo
     *
     * @param title o titulo do cabeçalho
     */
    public static void header(String title){
        String separator = Separator.generateSeparator(title);

        System.out.println(separator);
        System.out.println(Title.generateCenterTitle(separator, title));
        System.out.println(separator);
    }

    /**
     * Escreve um cabeçalho simplificado no terminal, divisórias são geradas conforme o tamanho do titulo,
     * A divisória possui cerca de 2x o tamanho do titulo
     *
     * @param title o titulo do cabeçalho
     */
    public static void header(String title, String separator){
        System.out.println(separator);
        System.out.println(Title.generateCenterTitle(separator, title));
        System.out.println(separator);
    }

    /**
     * Escreve um cabeçalho simplificado no terminal, divisórias são geradas conforme o tamanho do titulo,
     * A divisória possui cerca de 2x o tamanho do titulo
     *
     * @param title o titulo do cabeçalho
     */
    public static void typeHeader(String title, int delay){
        String separator = Separator.generateSeparator(title);

        Write.type(separator, delay);
        Write.type(Title.generateCenterTitle(separator, title), delay);
        Write.type(separator, delay);
    }

    /**
     * Escreve um cabeçalho simplificado no terminal, divisórias são geradas conforme o tamanho do titulo,
     * A divisória possui cerca de 2x o tamanho do titulo
     *
     * @param title o titulo do cabeçalho
     */
    public static void typeHeader(String title){
        String separator = Separator.generateSeparator(title);

        Write.type(separator);
        Write.type(Title.generateCenterTitle(separator, title));
        Write.type(separator);
    }

}
