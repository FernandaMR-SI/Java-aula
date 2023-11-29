package Primeira;
/*Fazer um programa que leia o número de um funcionário, 
seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. 
A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;

	    System.out.println("Funcionário I: codigo");
        cod1 = sc.nextInt();
        System.out.println("Funcionário I: horas trabalhadas");
	    qte1 = sc.nextInt();
        System.out.println("Funcionário I: valor hora");
	    preco1 = sc.nextDouble();
	    
        System.out.println("Funcionário II: codigo");
        cod2 = sc.nextInt();
        System.out.println("Funcionário II: horas trabalhadas");
	    qte2 = sc.nextInt();
        System.out.println("Funcionário II: valor hora");
	    preco2 = sc.nextDouble();

        //funiconario
         System.out.printf("Funcionário: %d => VALOR A PAGAR: R$ %.2f%n", cod1, qte1*preco1);
         System.out.printf("Funcionário: %d => VALOR A PAGAR: R$ %.2f%n", cod2, qte2*preco2);

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("VALOR A PAGAR a Funcionários: R$ %.2f%n", total);
		
		sc.close();
	}
}