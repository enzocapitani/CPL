package style;

/*
 * Interface para o polimorfismo na classe Write, ou de forma mais simples,
 * para que a função tenha o mesmo nome, porém faça coisas diferentes
 */

public interface WriteInterface {
	public static void write(String phrase) {}
	public static void write(String phrase, int delay) {}
}
