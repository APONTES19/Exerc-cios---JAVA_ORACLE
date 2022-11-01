public class Exercício4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        int a;
        int c;
        int b;
        
        a = 3;
        b = 4;
        System.out.println("\nValor de a = " + a + "\nValor de b = " + b);
        System.out.println("Soma a + b = " + FunSoma(a, b));
        System.out.println("Multiplicação a * b = " + FunMultiplicacao(a, b));
        System.out.println("Subtração a - b = " + FunSubtracao(a , b));
        System.out.println("Divisão a / b = " + FunDivisao(a , b));
        
    }
    public static int FunSoma (int a, int b)
    {
        return (a + b);
    }
    public static int FunMultiplicacao (int a, int b)
    {
        return (a * b);
    }
    public static int FunSubtracao (int a, int b)
    {
        return (a - b);
    }
    public static int FunDivisao (int a, int b)
    {
        return (a / b);
    }
}
