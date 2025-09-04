package com.henrique.maratonajva.Exercicios;

public class Aula06_ExercicioBreak {
    public static void main(String[] args) {
        //imprima os primeiros 25 números da um dado valor
        int valor = 50;
        for (int i = 0; i <valor; i++){
            System.out.println(i);
            if (i==25){
                break;
            }            
        }
    }
}
