package Primeira;
import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A, B;
        int operacao;

        do{
            System.out.println("Digite 1 para Soma ");
            System.out.println("Digite 2 para Subtração ");
            System.out.println("Digite 3 para Multiplicação ");
            System.out.println("Digite 4 para Divisão ");
            System.out.println("Digite 0 para Sair ");
            operacao = sc.nextInt();

            if (operacao==0){
                System.out.println("Caulculadora finalizada ");
            }else{
                System.out.println("Digite o primeiro Valor ");
                A = sc.nextInt();
                System.out.println("Digite o segundo Valor ");
                B = sc.nextInt();

                Calculadora calculo= new Calculadora(A,B);
                calculo.opcaoImpressao(operacao);

            }
        }while(operacao>0);
        
        sc.close();
    }
}