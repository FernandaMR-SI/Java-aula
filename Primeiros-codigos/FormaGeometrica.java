package Primeira;
public class FormaGeometrica {
    double A, B, C;
    double triangulo, circulo, trapezio;
    double quadrado, retangulo;

    public FormaGeometrica(int A,int B,int C){
        this.A=A;
        this.B=B;
        this.C=C;
    }
    public FormaGeometrica(){
        this.A=0;
        this.B=0;
        this.C=0;
    }
    public void setA(int A){
        this.A=A;
    }
    public void setB(int B){
        this.B=B;
    }
    public void setC(int C){
        this.C=C;
    }
		
    public void impressaoForma(int opcao){
        if (opcao==1){
            triangulo = A * C / 2.0;
            System.out.printf("TRIANGULO: %.3f%n", triangulo);
        }
        else if(opcao==2){
            circulo = 3.14159 * C * C;
            System.out.printf("CIRCULO: %.3f%n", circulo);
        }
        else if(opcao==3){
            trapezio = (A + B) / 2.0 * C;
           System.out.printf("TRAPEZIO: %.3f%n", trapezio); 
        }
        else if(opcao==4){
            quadrado = B * B;
            System.out.printf("QUADRADO: %.3f%n", quadrado);
        }
        else{
            retangulo = A * B;
            System.out.printf("RETANGULO: %.3f%n", retangulo);  
		}
    }
		
}
