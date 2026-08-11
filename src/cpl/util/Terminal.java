package cpl.util;

public class Terminal {
	
	/**
	 * This method only works if your Java program is running in the terminal;
     * it usually does not work in an IDE console.
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
     * This method pauses the main thread's processing for a moment.
     * It handles the need for repetitive try-catch blocks.
     *
     * @param milisec the duration of the pause in milliseconds.
    */
    public static void sleep(int milisec){
        try{
            Thread.sleep(milisec);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
