package CPL.style;

public class Write {
	
	//Delay pré definido
	private static final int delay = 50;
	
	/*
	 * Essa função escreve caractere por caractere em um intervalo pré definido pela classe,
	 * ao final, quebra a linha.
	 * Ao escrever uma letra, o programa dorme por 50 milissegundos e depois repete o ciclo
	 * Basicamente é um System.out.println() mas com uma animação mais dinâmica, melhorando a
	 * interface no console, trazendo mais dinâmica
	 */
	private static void writeLoop(String phrase, int delay){
		for(int i = 0; i < phrase.length(); i++) {

			System.out.print(
				phrase.charAt(i)
			);
			
			try {
				Thread.sleep(delay);
			}catch(Exception e ) {
				e.printStackTrace();
			}
			
		}
		System.out.println();
	}

	
	/*
	* Aplica o writeLoop, deixa acessível ao usuário com delay pré definido pela classe
	*/
	public static void write(String phrase) {
		
		writeLoop(phrase, delay);
		
	}
	
	/*
	 * Mesma coisa da primeira, porém com um delay escolhido pelo usuário
	 */
	public static void write(String phrase, int delay) {
		
		writeLoop(phrase, delay);
		
	}

	/*
	* Mesma coisa das implementações anteriores, mas agora é possível escrever com cores definidas pelo enum WriteColor
	* em alguns consoles de IDE , essa função pode não funcionar 
	* Além disso, a função só escreve colorido a string defenida no escopo da função 
	*/
	public static void write(String phrase, WriteColor color){

		setWriteColor(color);

		writeLoop(phrase, delay);
		
		resetWriteColor();

	}

	/*
	* Escrever com cor, mas com delay definido na entrada da função
	*/
	public static void write(String phrase, WriteColor color, int delay){
		setWriteColor(color);

		writeLoop(phrase, delay);
		
		resetWriteColor();
	}
	
	/*
	* Define a cor geral do programa, ele colore o System.out.println() também
	* ao chamar esse método, todas as funções de saídas no terminal vão sair com essa cor 
	*/
	public static void setWriteColor(WriteColor color){
		System.out.print(color.toString());
	}

	/*
	* Reinicia para a cor original do terminal
	*/
	public static void resetWriteColor(){
		System.out.print(WriteColor.RESET);
	}

}
