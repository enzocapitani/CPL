package cpl.style;

import cpl.util.Terminal;

public class Write {
	
	//Delay pré definido
	private static final int delay = 50;
	
	/**
	 * This function writes character by character within a range predefined by the class,
	 * and inserts a line break at the end.
	 * After writing a character, the program pauses for 50 milliseconds before repeating the cycle.
	 * Essentially, it is a System.out.println() but with a more dynamic animation,
	 * enhancing the console interface and adding a sense of dynamism.
	 *
	 * @param phrase the phrase or word to be written
	 * @param delay the delay in milliseconds between the appearance of each character
	 */
	private static void writeLoop(String phrase, int delay){
		for(int i = 0; i < phrase.length(); i++) {

			System.out.print(
				phrase.charAt(i)
			);

			Terminal.sleep(delay);
			
		}
		System.out.println();
	}

	
	/**
	 * Applies writeLoop, making it accessible to the user with a delay predefined by the class
	 * @param phrase the phrase or word to be written
	*/
	public static void type(String phrase) {
		
		writeLoop(phrase, delay);
		
	}
	
	/**
	 * Same as the first one, but with a user-selected delay
	 *
	 * @param phrase the phrase or word to be written
	 * @param delay the delay in milliseconds between the appearance of each letter
	 */
	public static void type(String phrase, int delay) {
		
		writeLoop(phrase, delay);
		
	}

	/**
	 * Same as the previous implementations, but now it is possible to write using colors defined by the WriteColor enum.
	 * This function may not work in some IDE consoles.
	 * Additionally, the function only applies the color to the string specified within the function scope.
	 *
	 * @param phrase the phrase or word to be written
	 * @param color the color in which to write the phrase or word
	*/
	public static void type(String phrase, WriteColor color){

		setWriteColor(color);

		writeLoop(phrase, delay);
		
		resetWriteColor();

	}

	/**
	* Escrever com cor, mas com delay definido na entrada da função
	*
	* @param phrase frase ou palavra que deseja ser escrita
	* @param color cor que deseja escrever a frase ou palavra
	* @param delay delay em milissegundos que as letras irão aparecer
	*/
	public static void type(String phrase, WriteColor color, int delay){
		setWriteColor(color);

		writeLoop(phrase, delay);
		
		resetWriteColor();
	}
	
	/**
	 * DSets the general color for the program; it also colors System.out.println() output.
	 * When this method is called, all terminal output functions will use this color.
	 *
	 * @param color The color to apply to the terminal.
	 */
	public static void setWriteColor(WriteColor color){
		System.out.print(color.toString());
	}

	/**
	* Resets to the original color of the terminal
	*/
	public static void resetWriteColor(){
		System.out.print(WriteColor.RESET);
	}

}
