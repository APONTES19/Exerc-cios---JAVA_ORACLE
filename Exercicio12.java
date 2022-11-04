import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Exercicio12
{
	public static void main (String arg[])
	{
		InputStreamReader	c;
		BufferedReader	cd;
		String	s;
		int	w;

		c = new InputStreamReader(System.in);
		cd = new BufferedReader(c);
		s = "";
		w = 0;
		while (true)
		{
			System.out.print("Entre com um valor: ");
			try
			{
				s = cd.readLine();
				if (s.matches("[0-9]*"))
				{
					System.out.println("\tConvertido em Inteiro");
					w = Integer.parseInt(s);
				}
			}
			catch(IOException e)
			{
				System.out.println("Erro de entrada");
			}
			if (w == 10)
				System.out.println("Parabens o numeor é " + w);
			System.out.print("\tValor digitado foi: ");
			System.out.println(s);
			if (s.equals("exit"))
				break;
		}
		System.out.println("Fim do Programa!");
	}
}
