public class Exercicio9 {
    public static void main(String args[])
    {
        int valor;
        
        valor = (int)(Math.random()*5);
        switch(valor)
        {
            case 0:
                System.out.println("Primeira Opção (Valor igual a Zero)" + valor);
                break;
            case 1:
                System.out.println("Segunda Opção (Valor igual a um)" + valor);
                break;
            default:
                System.out.println("Outras opções (Valor maior que um" + valor);
                break;             
        }
    }
}
