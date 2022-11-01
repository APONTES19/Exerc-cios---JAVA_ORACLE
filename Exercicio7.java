import java.util.Scanner;

public class Exercicio7
{
    public static void main(String args[])
    {
        int a;
        int b;
        
        a = 0;
        b = 20;
        for (a = 0; a <= b; a++)
        {
            if (a == (b/2))
            {
                System.out.println("O valor de A é igual a metade de B, logo A vale:" + a + " e B vale:" + b);
            }
            else if (a != (b/2))
            {
                System.out.println("O valor de A é diferente a metade de B, logo A vale:" + a + " e B vale:" + b);
            }
        }
        System.out.println(CompValue());
    }
    public static String CompValue()
    {
        int a;
        int b;
        Scanner read;
        
        read = new Scanner(System.in);
        System.out.print("\nAtribua Valor para A : ");
        a = read.nextInt();
        System.out.print("Atrubua Valor para B : ");
        b = read.nextInt();
        if (a == b)
            return("A é igual a B");
        else if (a > b)
            return("A é maior do que B");
        else
            return("A é menor do que B");
    }
}
