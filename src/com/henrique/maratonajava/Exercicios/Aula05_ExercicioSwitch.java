package com.henrique.maratonajava.Exercicios;

public class Aula05_ExercicioSwitch {
    public static void main(String[] args) {
        
        // Utilizando Swtich e dado os valores de 1 a 7, imprima se é dia util ou fim de semana
        // Considerando 1 como domingo
        
        int dia = 7;
        switch (dia) {
            case 1:
            System.out.println("Domingo: Fim de semana");
            break;
            case 2:
            System.out.println("Segunda: Dia útil");
            break;
            case 3:
            System.out.println("Terça: Dia útil");
            break;
            case 4:
            System.out.println("Quarta: Dia útil");
            break;
            case 5:
            System.out.println("Quinta: Dia útil");
            break;
            case 6:
            System.out.println("Sexta: Dia útil");
            break;
            case 7:
            System.out.println("Sábado: Fim de semana");
            break;
            default:
            System.out.println("Dia inválido");
                
        }
         
        // Opção mais SIMPLES, levando em conta que o case não para sem o break.
       
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
    
}
