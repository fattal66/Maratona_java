package com.henrique.maratonajava.introducao.aulas;

public class Aula07_Arrays03 {
    public static void main(String[] args) {
        String[] marcas = new String[3];
        marcas[0] = "nissan";
        marcas[1] = "Peugot";
        marcas[2] = "Hyundai";
        char[] letras = {'a','b','c','d','e'};
        int[] numeros3 = new int[]{1,2,3,4,5};
        for(int i = 0; i<5; i++){
            System.out.println(numeros3[i]);
        }
        for (int i = 0; i < letras.length ; i++) {
            System.out.println(letras[i]);
        }
        for (String carros:marcas) {
            System.out.println(carros);
        }
    }   
}
