package com.henrique.maratonajava.introducao.aulas;

public class Aula02_TiposPrimitivos {
    public static void main(String[] args) {
        
        //Tipos primitivos
        //int, double, float, char, byte, short, long, boolean   

        /* Casting: Forçar uma variavel a se tornar outra
            long numeroGrande = (long) 155.23;
                Vai imprimir só 155 porque o long não suporte número com decimal

             Tipo primitivo = Guarda um valor simples
             String NÃO é primitivo. É uma classe. Classes começam com letra maiuscula.
        */

        int age = 10;
        long bigNumber = 10000;
        double salaryDouble = 2000;
        float salaryFloat = 2500.0F;
        byte ageByte = 10;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 'M';
        // Str
        String string = "Eu sou o Lucas Montano do canal Lucas Montano, que tinha um podcast chamado Podcast do Lucas Montano";

        System.out.println("Idade: " + age);
        System.out.println("Número Grande: " + bigNumber);
        System.out.println("Salário Double: " + salaryDouble);
        System.out.println("Salário Float: " + salaryFloat);
        System.out.println("Idade Byte: " + ageByte);
        System.out.println("Idade Short: " + ageShort);
        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Falso: " + falso);
        System.out.println("Caractere: " + caracter);
        System.out.println("Nome: " + string);
    }
    
}
