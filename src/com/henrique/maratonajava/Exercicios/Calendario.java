package com.henrique.maratonajava.Exercicios;

public class Calendario {
    public static void main(String[] args) {
        int[][] semanas = {
            {1, 2, 3, 4, 5, 6, 7},        // semana 1
            {8, 9, 10, 11, 12, 13, 14},   // semana 2
            {15, 16, 17, 18, 19, 20, 21}, // semana 3
            {22, 23, 24, 25, 26, 27, 28}  // semana 4
        };

        int numeroSemana = 1;
        for (int[] semana : semanas) { // percorre cada semana
            System.out.println("Semana " + numeroSemana + ":");
            for (int dia : semana) {    // percorre cada dia da semana
                System.out.print(dia + " ");
            }
            System.out.println("\n");   // quebra de linha
            numeroSemana++;
        }
    }
}