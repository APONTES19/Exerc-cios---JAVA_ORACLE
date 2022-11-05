public class Exercicio17
{
	public static void main(String arg[])
	{
		int larg;
		int vtr[];
		int i;
		int cont;

		larg = 30;
		vtr = new int[larg];
		cont = 0;

		System.out.println("O tamanho do vetor eh: "+vtr.length);
		for (i = 0; i < vtr.length; i++)
		{
			cont = cont + 2;
			vtr[i] = cont;
		}
		for (i = 0; i < vtr.length; i++)
		{
			System.out.println("Vetor no local "+i+" tem valor "+vtr[i]);
		}
	}

}
