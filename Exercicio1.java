public class Exercicio1
{
    public static void main(String[] args)
    {
        String[] frases1 = new String[6];
        frases1[5] = ";-)";
        frases1[0] = "Meu Primeiro";
        frases1[1] = "Programa em Java";
        frases1[2] = "Utilizando um Loop For";
        frases1[3] = "Para monstar na saida";
        frases1[4] = "do Terminal";

        int i;
        for(i = 0; i < frases1.length; i++)
            System.out.println(frases1[i]);
    }
}
