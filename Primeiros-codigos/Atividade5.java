package Primeira;
/*Fazer um programa que leia o número de um funcionário, 
seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário.Armazenando cada funcionário em um vetor 
A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double despesaSalario=0;

        System.out.println("Digite o Codigo do Funcionario ");
        int codigo= sc.nextInt();
        System.out.println("Funcionario: horas trabalhadas");
        int horas = sc.nextInt();
        System.out.println("Funcionario: valor hora");
        double preco = sc.nextDouble();

        Funcionario funcionarios = new Funcionario(codigo, horas, preco);
        
        despesaSalario=funcionarios.getSalario();

        System.out.printf("VALOR A PAGAR a Funcionarios: R$ %.2f%n",despesaSalario);
		
		sc.close();
    } 
		
}