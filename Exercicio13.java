import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Exercicio13
{
	public static void main (String arg[])
	{
		int	a;
		int	b;
		String	s;

		while (true)
		{
			System.out.println("\nBem vindo a Calculadora de dois Termos");
			a = GetValueInt("Entre com o valor de A: ");
			b = GetValueInt("Entre com o valor de B: ");
			SelectOpt(a, b);
			System.out.print("Para sair dígite 'exit' ou enter para um novo calculo: ");
			s = GetValueStr();
			if (s.equals("exit"))
				break;

		}
		System.out.println("Fim do Programa!");
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

	public static void SelectOpt(int a, int b)
	{
		int i;

		System.out.println("\nMenu de Opção:");
		System.out.println("1 - Somar");
		System.out.println("2 - Multiplicar");
		System.out.println("3 - Subtrair");
		System.out.println("4 - Dividir\n");
		i = GetValueInt("Entre com a opção: ");
		switch(i)
		{
		case 1:
			System.out.println("\n\t-> Resultado da Soma " + a + " + " + b + " = " + (a + b)+"\n");
			break;
		case 2:
			System.out.println("\n\t-> Resultado da Multiplicação " + a + " * " + b + " = " + (a * b)+"\n");
			break;
		case 3:
			System.out.println("\n\t-> Resultado da Subtração " + a + " - " + b + " = " + (a - b)+"\n");
			break;
		case 4:
			if (b == 0)
				System.out.println("\n\t-> Na divisão o b Não pode ser 0");
			else
				System.out.println("\n\t-> Resultado da Divisão " + a + " / " + b + " = " + (a / b)+"\n");
			break;
		default:
			System.out.println("\t-Só aceito Numeros de 1 há 4");
			SelectOpt(a, b);
		}
	}

	public static String GetValueStr()
	{
		InputStreamReader	c;
		BufferedReader	cd;
		String	s;

		c = new InputStreamReader(System.in);
		cd = new BufferedReader(c);
		s = "";
		try
		{
			s = cd.readLine();
			return (s);
		}
		catch(IOException e)
		{
			System.out.println("Erro de entrada");
		}
		return (s);
	}
}

