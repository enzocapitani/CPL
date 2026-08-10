package CPL.util;

public class Terminal {
	
	/**
	 * Esse método funciona apenas se o seu programa java está sendo rodado no terminal
	 * em console de IDE costuma não funcionar
	 */
	public static void clean(){
		
        try {
            String os = System.getProperty("os.name");

            if(os.contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
    * Esse método funciona para a thread principal parar de processar por um momento 
    * ele já lida com o problema de ter que ficar colocando o try catch
    * 
    * @param milisec o tempo em milissegundos que vai parar
    */
    public static void sleep(int milisec){
        try{
            Thread.sleep(milisec);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
