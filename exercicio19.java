import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercicio19
{
	public static void main (String arg[])
	{
		String	string;
		InputStreamReader	sr;
		BufferedReader	br;
		char	c;
		int	number;
		int	position;

		string = "";
		c = 0;
		sr = new InputStreamReader(System.in);
		br = new BufferedReader(sr);
		try
		{
			System.out.print("Entre com a frase a ser analizada:");
			string = br.readLine();
			if (string.isEmpty())
				string = "";
			System.out.print("Agora entre com um caracter: ");
			c = (char)System.in.read();
		}
		catch(IOException e)
		{
			System.out.println("Erro de entrada!");
		}
		c = Character.toLowerCase(c);
		string = string.toLowerCase();
		number = ContChar(string, c);
		position = string.indexOf(c);
		if (number == 0)
			System.out.println("O caracter '" + c + "' não existe na frase!");
		else
			System.out.println("\nO Caracter: '" + c + "' foi encontrado " + number +
				 " vezes!\nApartir do index " + position + "!\n");
	}
	public static int ContChar(String str, char c)
	{
		int	i;
		int	count;

		count = 0;
		for(i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == c)
				count++;
		}
		return (count);
	}
}
