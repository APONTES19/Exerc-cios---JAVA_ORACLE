import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio21
{
	public static void main (String arg[])
	{
		int	x;
		int	y;
		int	MatrizInt[][];
		int	sizeVetX;
		int	sizeVetY;

		sizeVetX = GetValueInt("\n\tEntre com o numero de linhas da Matriz: ");
		sizeVetY = GetValueInt("\tAgora entre com o numero de colunas da matriz: ");
		System.out.println();
		MatrizInt = new int [sizeVetX][sizeVetY];
		x = 0;
		y = 0;
		while(x < sizeVetX)
		{
			y = 0;
			while(y < sizeVetY)
			{
				MatrizInt[x][y] = GetValueInt("\tAtribua o valor da" +
					" posição na Matriz x[" + (x + 1) + "] y[" + (y + 1) + "] : ");
				y++;
			}
			x++;
		}
		PrintMatriz(sizeVetX, sizeVetY, MatrizInt);

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

	public static void PrintMatriz(int sizeVetX, int sizeVetY, int MatrizInt[][])
	{
		int	x;
		int	y;

		x = 0;
		y = 0;
		System.out.println("\n\tValor da Matriz é:\n\t");
		while(x < sizeVetX)
		{
			System.out.print("\t");
			y = 0;
			while(y < sizeVetY)
			{
				System.out.print(MatrizInt[x][y] + "\t");
				y++;
			}
			System.out.println();
			x++;
		}
		System.out.println();
	}
}
