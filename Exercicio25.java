public class Exercicio25
{
	int	rg;
	String nome;

	public void insereDados()
	{
		int rg = 1;
		String nome = "Lucas";
		//this.rg = rg;
		//this.nome = nome;
	}
	public void mostrarDados()
	{
		System.out.println("\n RG: " + rg);
		System.out.println("\n Nome: " + nome + "\n");
	}

	public static void main(String args[])
	{
		Exercicio25 p = new Exercicio25();
		p.insereDados();
		p.mostrarDados();
	}
}
