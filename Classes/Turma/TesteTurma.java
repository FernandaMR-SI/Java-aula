package Turma;

import java.util.Scanner;

public class TesteTurma {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nomeAluno = entrada.nextLine();
        System.out.print("Digite o RG do Aluno: ");
        String rgAluno = entrada.nextLine();
        System.out.print("Digite o RA do Aluno: ");
        String ra = entrada.nextLine();
        System.out.print("Digite o Curso do Aluno: ");
        String curso = entrada.nextLine();
        Aluno aluno=  new Aluno(nomeAluno, rgAluno, ra, curso);
        System.out.println(aluno.nome + " com RA" +aluno.rg +"está matriculado no curso de "+aluno.getCurso());
        entrada.close();


    }
}
