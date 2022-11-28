import javax.sound.midi.Soundbank;

public class Exercicio24
{
	public static void main (String arg[])
	{
		System.out.println("\nTrabalhando com Strings:\n");
		String frase;

		frase = "      Eis-me aqui SENHOR, envia-me a miM      ";
		System.out.println("\nFrase base: " + frase);
		System.out.println("\nTransformações com a frase:\n");
		System.out.print("Número de caracteres:");
		System.out.println(frase.length() + "\n");
		System.out.println("MINUSCULA: ");
		System.out.println(frase.toLowerCase() + "\n");
		System.out.print("MAIUSCULA: ");
		System.out.println(frase.toUpperCase() + "\n");
		System.out.print("Qual a letra na POSIÇÃO 10 : ");
		System.out.println(frase.charAt(10) + "\n");
		System.out.print("SUBSTRING: ");
		System.out.println(frase.substring(0,11) + "\n");
		System.out.print("Primeira VEZ que encontrou a LETRA 'O' : ");
		System.out.println(frase.indexOf('O') + "\n");
		System.out.print("Tirando ESPAÇOS EM BRANCO a esquerda e a direita: ");
		System.out.println(frase.trim() + "\n");
		System.out.println("TROCAR LETRA 'm' por 'W");
		System.out.println(frase.replace('m','W') + "\n");
	}
}
