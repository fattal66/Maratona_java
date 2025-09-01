package com.henrique.maratonajva.Exercicios;

public class Aula04_ExercicioSalarioEtruturaCondicional {
    public static void main(String[] args) {
        double salary = 5600.00;
        double segundaFaixa = 7.50/100;
        double terceiraFaixa = 15/100;
        double quartaFaixa = 22.50/100; 
        double quintaFaixa = 27.50/100;
        double impostoDeRenda;
        if (salary <= 3036.00) {
            System.out.println("Isento de imposto de renda");
        } else if (salary >= 3036.01 && salary <= 3513.00) {
            impostoDeRenda = salary * segundaFaixa;
            double salaryReal = salary - impostoDeRenda;
            System.out.println("O valor do imposto "+impostoDeRenda +"| e o salário real é "+salaryReal);
        } else if (salary >= 3514 && salary <= 4688.00) {
            impostoDeRenda = salary * terceiraFaixa;
            double salaryReal = salary - impostoDeRenda;
            System.out.println("O valor do imposto "+impostoDeRenda +"| e o salário real é "+salaryReal);
        } else if (salary >= 4689.01 && salary <= 5830.00) {
            impostoDeRenda = salary * quartaFaixa;
            double salaryReal = salary - impostoDeRenda;
            System.out.println("O valor do imposto "+impostoDeRenda +"| e o salário real é "+salaryReal);
        } else {
            impostoDeRenda = salary * quintaFaixa;
            double salaryReal = salary - impostoDeRenda; 
            System.out.println("O valor do imposto "+impostoDeRenda +"| e o salário real é "+salaryReal);                  
        }        
    }    
}
