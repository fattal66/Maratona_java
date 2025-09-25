package com.henrique.maratonajava.introducao.aulas;

public class Aula07_Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        // char = '/0000 ' ' espaço em branco
        // boolean = false
        // String = null

        String[] nomes = new String[3];
        nomes[0] = "DBZ";
        nomes[1] = "NARUTO";
        nomes[2] = "ONE PIECE";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
    
}
