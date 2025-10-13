package com.henrique.maratonajava.javacore.introducaoclasses.testes;
import com.henrique.maratonajava.javacore.introducaoclasses.dominio.Estudante;
public class EstudanteAula01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante2.nome = "Henrique";
        estudante2.idade = 19;
        estudante2.sexo = 'M';
        estudante2.matricula = 1815971;
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.matricula);


        estudante.nome = "Seto Kaiba";
        estudante.idade = 22;
        estudante.sexo = 'M';
        System.out.println("Nome: " + estudante.nome + "\n" +
                   "Idade: " + estudante.idade + "\n" +
                   "Sexo: " + estudante.sexo);

    }
    
}
