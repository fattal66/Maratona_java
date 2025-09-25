package com.henrique.maratonajava.introducao.aulas;

public class Aula08_ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] array = new int [2][10];
       String[][] arrays = {
    {"janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro"},
    {"31","28/29","31","30","31","30","31","31","30","31"}
       };
       String[][] marcas ={{"Dia 1","Dia 2","Dia 3"},{"Segunda","Terça","Quarta"}}; 
       for (String[] strings : marcas) {
        System.out.println("\n----");
        for (String string : strings) {
            System.out.println(string + " ");
        }
        System.out.println("--------------------");
       }
       
        for(int i = 0; i < arrays[0].length; i++) {
            System.out.println(arrays[0][i] + " tem " + arrays[1][i] + " dias");
        }
        

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;
        array[0][4] = 5;
        array[0][5] = 6;
        array[0][6] = 7;
        array[0][7] = 8;
        array[0][8] = 9;
        array[0][9] = 10;
        array[1][0] = 11;
        array[1][1] = 12;
        array[1][2] = 13;
        array[1][3] = 14;
        array[1][4] = 15;
        array[1][5] = 16;
        array[1][6] = 17;
        array[1][7] = 18;
        array[1][8] = 19;
        array[1][9] = 20;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }   
    }
}
