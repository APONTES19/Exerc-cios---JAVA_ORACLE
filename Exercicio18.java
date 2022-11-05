public class Exercicio18
{
	public static void main(String arg[])
	{
		int lin;
		int col;
		int cont;
		int mtrz[][];
		int c;
		int l;

		lin = 5;
		col = 5;
		cont = 1;
		mtrz = new int[lin][col];
		System.out.println("Tamanho da Matriz = " + mtrz.length);
		System.out.println("------------------------------------------------\n");
		for(l = 0; l < lin; l++)
		{
			for(c = 0; c < col; c++)
			{
				mtrz[l][c] = cont++;
			}
		}
		for(l = 0; l < lin; l++)
		{
			for(c = 0; c < col; c++)
			{
				System.out.println("O valor na posição [" + l + "] linha e [" + c + "] coluna : = " + mtrz[l][c]);
			}
			System.out.println("------------------------------------------------");
		}
	}
}
