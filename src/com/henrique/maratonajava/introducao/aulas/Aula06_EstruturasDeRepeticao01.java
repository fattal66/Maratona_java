package com.henrique.maratonajava.introducao.aulas;

public class Aula06_EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10) {
            System.out.println("contador: " + contador++);
            //Outras formas de incrementar o contador
            //contador = contador + 1;
            //contador++;
            //++contador; (mesma coisa que contador = contador + 1)  
            //contador += 1;
        }
        contador = 0;
        do{
            System.out.println("contador: " + ++contador);
        
        }while(contador < 10);
       

        for(int i =0; i <=15; i++){
            System.out.println("i: " + i);
        }
        
      
    }
    
}
