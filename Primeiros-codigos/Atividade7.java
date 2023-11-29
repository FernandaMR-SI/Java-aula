package Primeira;
import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int operacao=0;
        FormaGeometrica formaGeometrica=new FormaGeometrica();
		
        do{
            System.out.println("Digite 1 para Area triangulo ");
            System.out.println("Digite 2 para Area Circulo ");
            System.out.println("Digite 3 para Area Trapezio ");
            System.out.println("Digite 4 para Area quadrado ");
            System.out.println("Digite 5 para Area retangulo ");
            System.out.println("Digite 0 para Sair ");
            operacao = sc.nextInt();

            if (operacao==0){
                System.out.println("Finalizada ");
            }else{
                switch(operacao){
                    case 1:
                        System.out.println("Digite A ");
                        formaGeometrica.setA(sc.nextInt());
                        System.out.println("Digite C ");
                        formaGeometrica.setC(sc.nextInt());
                        formaGeometrica.impressaoForma(operacao);
                        System.out.println("-----------------");
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("Digite C ");
                        formaGeometrica.setC(sc.nextInt());
                        formaGeometrica.impressaoForma(operacao);
                        System.out.println("-----------------");
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("Digite A ");
                        formaGeometrica.setA(sc.nextInt());
                        System.out.println("Digite B ");
                        formaGeometrica.setB(sc.nextInt());
                        System.out.println("Digite C ");
                        formaGeometrica.setC(sc.nextInt());
                        formaGeometrica.impressaoForma(operacao);
                        System.out.println("-----------------");
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("Digite B ");
                        formaGeometrica.setB(sc.nextInt());
                        formaGeometrica.impressaoForma(operacao);
                        System.out.println("-----------------");
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("Digite A ");
                        formaGeometrica.setA(sc.nextInt());
                        System.out.println("Digite B ");
                        formaGeometrica.setB(sc.nextInt());
                        formaGeometrica.impressaoForma(operacao);
                        System.out.println("-----------------");
                        System.out.println("");
                        break;
                    default:
                        System.out.println("-----------------");
                        System.out.println("");
                        break; 
                }
            }
        }while(operacao>0);
        
        sc.close();
    }
}
		


   