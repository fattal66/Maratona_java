package com.henrique.maratonajva.Aulas.Aulas04;

public class Aula04_EstruturasCondicionais03 { 
     public static void main(String[] args) {
        // Doar se salário for maior que 5k
        double salary = 800;
        String mensagemDoar = "Vou doar 50 reais para o projeto social";
        String mensagemNaoDoar = "Ainda não tenho condições";
        // (condição) ? verdadeiro : falso;
        String resultado = salary > 750 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
