package com.henrique.maratonajva.Aulas;

public class Aula03_Operadores {
    public static void main(String[] args) {
        // + - / * %
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 + numero2;
        System.out.println(resultado);

        //Operador de concatenação
        String nome = "Hcode";
        String sobrenome = "Treinamentos";
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println(nomeCompleto);

        //Operadores unários
        int numero = 5;
        numero++; //numero = numero + 1
        System.out.println(numero);
        numero--; //numero = numero - 1
        System.out.println(numero);
        ++numero; //numero = numero + 1
        System.out.println(numero);
        --numero; //numero = numero - 1
        System.out.println(numero);     
        
        //Operadores de atribuição
        int i = 0;
        i += 2; //i = i + 2
        System.out.println(i);
        i -= 2; //i = i - 2
        System.out.println(i);
        i *= 2; //i = i * 2
        System.out.println(i);
        i /= 2; //i = i / 2
        System.out.println(i);
        i %= 2; //i = i % 2
        System.out.println(i);

        //Operadores relacionais (sempre retornam um valor boolean)
        int a = 10;
        int b = 20;
        System.out.println(a == b); //igualdade
        System.out.println(a != b); //diferente
        System.out.println(a > b); //maior que
        System.out.println(a >= b); //maior ou igual a
        System.out.println(a < b); //menor que
        System.out.println(a <= b); //menor ou igual a

        //Operadores lógicos (sempre retornam um valor boolean)
        boolean condicao1 = true;
        boolean condicao2 = false;
        
        System.out.println(condicao1 && condicao2); //AND -> E (só é verdadeiro se as duas condições forem verdadeiras)
        System.out.println(condicao1 || condicao2); //OR -> OU (só é falso se as duas condições forem falsas)
    }

    
}
