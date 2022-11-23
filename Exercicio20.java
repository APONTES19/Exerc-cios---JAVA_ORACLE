import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio20
{
	public static void main(String arg[])
	{
		int	i;
		int	sizeVet;
		int	vetorInt[];

		sizeVet = GetValueInt("\nEntre com o Tamanho do vetor:\t");
		vetorInt = new int[sizeVet];
		i = 0;
		while(i < sizeVet)
		{
			vetorInt[i] = GetValueInt("\tDefina o valor para a posição " + (i +1) + ": ");
			i++;
		}
		i--;
		System.out.println("\n\n Valor informados para o Vetor foram:");
		while(i >= 0)
		{
			System.out.println("\t\tValor de VetorInt[" + (i + 1) + "] = " + vetorInt[i]);
			i--;
		}
	}

	public static int GetValueInt(String t)
	{
		InputStreamReader	c;
		BufferedReader	cd;
		String	s;
		int	w;

		c = new InputStreamReader(System.in);
		cd = new BufferedReader(c);
		s = "";
		w = -1;
		try
		{
			while (w == -1)
			{
				System.out.print(t);
				s = cd.readLine();
				if (s.isEmpty())
					w = -1;
				else if (s.matches("[0-9]*"))
					w = Integer.parseInt(s);
				else
					System.out.println("\t-Permitido somente Números Inteiro!");
			}
		}
		catch(IOException e)
		{
			System.out.println("Erro de entrada");
		}
		return (w);
	}
}
