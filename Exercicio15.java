import java.util.Scanner;

public class Exercicio15
{
	public static void main (String arg[])
	{
		int valor;
		Scanner ler;
		String comando;

		ler = new Scanner(System.in);
		while (true)
		{
			System.out.print("Entre com o valor inteiro para verificar se é Par e ou Impar! :");
			valor = ler.nextInt();
			if ((valor % 2) != 0)
				System.out.println("O valor " + valor + " é Impar");
			else
				System.out.println("O valor " + valor + " é Par" );
			System.out.print("digite 'exit' para sair ou 'c' para continuar:");
			comando = ler.next();
			if (comando.equals("exit"))
				break;
		}
		System.out.println("Fim do Programa!");
	}
}
