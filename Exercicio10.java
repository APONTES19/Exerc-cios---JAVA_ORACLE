public class Exercicio10
{
	public static void main (String arg[])
	{
		int	a;
		int	c;
		int	valor;
		float	b;

		a = 0;
		c = 0;
		b = 15;
		valor = 15;
		for (c = 0; a <= b; a++)
		{
			valor--;
			c++;
			if (c <= (b/2) && c <= valor)
			{
				System.out.println("C é MENOR que a metade de B 'E' MENOR IGUAL a VALOR");
				System.out.println("C vale..........:" + c);
				System.out.println("B / 2 vale......:" + (b / 2));
				System.out.println("VALOR vale...:" + valor);
			}
			else if (c >= (b/2) || (c <= valor))
			{
				System.out.println("C é MAIOR que a metade de B 'OU' MAIOR IGUAL a VALOR");
				System.out.println("C Vale......." + c);
				System.out.println("B / 2 vale....:" + (b/2));
				System.out.println("VALOR vale...:" + valor);
			}
		}
	}
}
