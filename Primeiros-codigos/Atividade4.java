package Primeira;
/*Fazer um programa que leia o número de um funcionário, 
seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário.Armazenando cada funcionário em um vetor 
A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int tamanho=2;//tamanho do vetor
        int[] codigo = new int[tamanho];
        int[] quantidade = new int[tamanho];
		double[] preco = new double[tamanho];; 
        double total=0;

        int cont=0;
       
        while(cont<2){
            System.out.println("Digite o Codigo do Funcionario "+ (cont+1));
            codigo[cont] = sc.nextInt();
            System.out.println("Funcionario: horas trabalhadas");
            quantidade[cont] = sc.nextInt();
            System.out.println("Funcionario: valor hora");
            preco[cont] = sc.nextDouble();
            cont++;
        }
	    //funiconario
        //impressão e soma
        for (int i=0;i<=cont;i++) {
            double calculo=quantidade[i]*preco[i];
            System.out.printf("Funcionario: %d => VALOR A PAGAR: R$ %.2f%n", codigo[i], calculo);
            total = total +calculo;
        }
	    System.out.printf("VALOR A PAGAR a Funcionarios: R$ %.2f%n", total);
		
		sc.close();
	}
}