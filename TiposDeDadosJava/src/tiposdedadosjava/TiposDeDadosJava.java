/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposdedadosjava;

/**
 *
 * @author lucas
 */
public class TiposDeDadosJava 
{
    public static void main(String[] args)
    {
        int a;
        int n;
        
        a = 5;
        n = 8;
        Print(a);
        Print(n); 
        System.out.println("\n----------Multiplicação----------");
        n = 5;
        a = 2 * n;
        System.out.print("\nvalor de n = ");
        System.out.println(n); 
        System.out.print("Multiplicação na Atribuição a = 2 * n  = ");
        System.out.println(a);  
        System.out.println("\n----------Incremento----------");
        a = 2;
        System.out.print("\nvalor de a = ");
        System.out.println(a); 
        System.out.print("Incremento na Atribuição a += 4 \nValor de a =  ");
        System.out.println(a += 4);  
        System.out.print("\nIncremento Equivalente na Atribuição  a = a + 4 \nValor de a =  ");
        System.out.println(a = a + 4);
        System.out.print("\nIncremento de mais 1 depois da atribuição a++ \nValor de a =  ");
        System.out.println(a++);
        System.out.println(a);
        System.out.print("\ndepois de rodado o valor é  \nValor de a =  ");        
        System.out.print("\nIncremento de mais 1 antes da atribuição a = ++a \nValor de a =  ");
        System.out.println(a = ++a);
        System.out.println("\n----------Operadores Lógicos----------");
        System.out.println("Operador igual == ( if (5 == 6)) then x coisa");
        if (5 == 6)
        {
            System.out.println("São iguais");
        }
        else
        {
            System.out.println("Não são iguais");
        }
        
        System.out.println("Operador igual == ( if (5 == 5)) then x coisa");
        if (5 == 5)
        {
            System.out.println("São iguais");
        }
        else
        {
            System.out.println("Não são iguais");
        }
        System.out.println("Operador Diferente != ( if (5 != 6)) then x coisa");
        if (5 != 6)
        {
            System.out.println("São Diferentes");
        }
        else
        {
            System.out.println("São iguais");
        }
        System.out.println("Operador Diferente != ( if (5 != 5)) then x coisa");
        if (5 != 5)
        {
            System.out.println("São Diferentes");
        }
        else
        {
            System.out.println("São iguais");
        }
        
        System.out.println("Operador ou | ( if (5 == 6 | 6 == 6) then x coisa");
        if ((5 == 6 || 6 == 6))
        {
            System.out.println("Sim");
        }
        else
        {
            System.out.println("Não");
        }
        System.out.println("Operador && | ( if (5 == 6 && 6 == 6) then x coisa");
        if (5 == 6 && 6 == 6)
        {
            System.out.println("Sim");
        }
        else
        {
            System.out.println("Não");
        }
        
        System.out.println("Valor de s = programa\nValor de t = em java");
        String s = "programa";
        String t = "em java";
        System.out.println("Tamanho da palavra em n utilizando t.length()");
        n = t.length();
        System.out.println(n);
        System.out.println("pegando um parte da string usando a função substring então s = s.substring(0->inicio, 2->fim)");
        s = s.substring(0,2);        
        System.out.println(s);
        
        System.out.println("Comparando duas strings");
        System.out.println("Ao usar s == t o java compara seus ponteiros e não o conteudo!");
        s = "sim";
        t = "sim";
        if (s == t)
            System.out.println("Sim");
        else
            System.out.println("Não");
        System.out.println("Agora para comparar o conteudo use t.equals(s)");
        if (t.equals(s))
            System.out.println("Sim");
        else
            System.out.println("Não");
    }
    
    public static void Print(int x)
    {
        System.out.println("\n----------Divisão e Resto----------");
        System.out.print("Valor de X = ");
        System.out.println(x);
        System.out.print("\nDivisão : x / 2 = ");
        System.out.println(x/2);
        System.out.print("Resto da Divisão : x % 2 = ");
        System.out.println(x%2);
        System.out.print("\nDivisão : x / 3 = ");
        System.out.println(x/2);
        System.out.print("Resto da Divisão : x % 3 = ");
        System.out.println(x%3);
        System.out.println("\n------------------------------------");
    }
    
}
