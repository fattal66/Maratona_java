package com.henrique.maratonajava.Exercicios;

import java.util.Scanner;

public class Aula06_ExercicioContinue {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n1 = leitor.nextInt();
        for(int n2 = 0; n2 <= n1; n2++){
            if (n2 % 2 == 0) {
                continue;
            }
            System.out.println(n2);
        }
        System.out.println("Esses são todos o numeros impares de 0 ate "+ n1);
        leitor.close();
    }
    
}
