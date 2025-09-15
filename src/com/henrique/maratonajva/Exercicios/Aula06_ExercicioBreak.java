package com.henrique.maratonajva.Exercicios;

public class Aula06_ExercicioBreak {
    public static void main(String[] args) {
        double valorTotal = 10000;
        for(int parcela = 1; parcela <= valorTotal; parcela++){
        double valorParcela = valorTotal / parcela;
        if (valorParcela < 1000) {
            break;
        } 
        System.out.println("Parcela " + parcela + " Valor da parcela " + valorParcela);
        }
    } 
}
