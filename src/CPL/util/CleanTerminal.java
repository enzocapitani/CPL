package CPL.util;

public class CleanTerminal {
	
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

}
