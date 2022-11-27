public class Exercicio23
{
	public static void main (String arg[])
	{
		System.out.println("\nClasse Math\n");
		double f;
		double g;
		double h;

		f = 2;
		g = 1.34;
		h = 9;
		System.out.println("\nCalculando:\n\nValor de SENO Var f(" + f +
			") = " + Math.sin(f));
		System.out.println("\nValor do COSSENO var f(" + f +
			") = "+ Math.cos(f));
		System.out.println("\nValor da TANGENTE var f(" + f +
			") = "+ Math.tan(f));
		System.out.println("\nValor do MÍNIMO entre as vars f("+
			f + ") g("+ g + ") eh:" + Math.min(f,g));
		System.out.println("\nValor MÁXIMO entre as vars f("+
			f + ") g("+ g + ") eh:" + Math.max(f,g));
		System.out.println("\nValor ARREDONDADO da var g(" + g +
			") eh: " + Math.round(g));
		System.out.println("\nValor ARREDONDADO pra cima da var g(" +
			g + ") eh: " + Math.ceil(g));
		System.out.println("\nValor ARREDONDADO pra Baixo da var g(" +
			g + ") eh: " + Math.floor(g));
		System.out.println("\nValor da RAIZ da var h(" + h +
			") = " + Math.sqrt(h));
		System.out.println("\nVariavel f(" + f + ") ELEVADO a varriavel h("+
			h + ") eh: " + Math.pow(f, h));
		System.out.println("\nValor ABSOLUTO da var g(" + g +
			") eh: " + Math.abs(g));
		System.out.println("\nValor PI eh: " + Math.PI);
		System.out.println("Gerando Valor ALEATÓRIO entre 0 e 1:" +
		+ Math.random());
		System.out.println("\n\nOPERADOR MÓDULO resto da divisão entre as" +
			" vars h(" + h + ") % f(" + f + ") = " + (f%h) +"\n\n");
	}
}
