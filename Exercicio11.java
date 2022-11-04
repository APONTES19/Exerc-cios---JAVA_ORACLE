import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Exercicio11
{
	public static void main (String arg[])
	{
		InputStreamReader	c;
		BufferedReader	cd;
		String	s;

		c = new InputStreamReader(System.in);
		cd = new BufferedReader(c);
		s = "";
		while (true)
		{
			System.out.print("Entre com um valor: ");
			try
			{
				s = cd.readLine();
			}
			catch(IOException e)
			{
				System.out.println("Erro de entrada");
			}
			System.out.print("\tValor digitado foi: ");
			System.out.println(s);
			if (s.equals("exit"))
				break;
		}
		System.out.println("Fim do Programa!");
	}
}
