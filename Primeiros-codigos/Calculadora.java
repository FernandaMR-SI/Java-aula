package Primeira;
public class Calculadora {
    int valor1;
    int valor2;

    //construtor
    public Calculadora(int valor1, int valor2){
        this.valor1=valor1;
        this.valor2=valor2;
    }
    //Métodos
    public double soma(){
        return  this.valor1+this.valor2;
    }
    public double subtracao(){
        return  this.valor1-this.valor2;
    }
    public double multiplicacao(){
        return  this.valor1*this.valor2;
    }
    public double divisao(){
        return  this.valor1/this.valor2;
    }

    public void opcaoImpressao(int opcao){
        switch (opcao) {
            case 1:
                System.out.println("Operacao de Soma:");
                System.out.println(valor1+"+"+valor2+"="+soma());
                System.out.println("-----------------");
                System.out.println("");
                break;
            case 2:
                System.out.println("Operacao de Subtração:");
                System.out.println(valor1+"-"+valor2+"="+subtracao());
                System.out.println("-----------------");
                System.out.println("");
                break;
            case 3:
                System.out.println("Operacao de Multiplicação:");
                System.out.println(valor1+"*"+valor2+"="+multiplicacao());
                System.out.println("-----------------");
                System.out.println("");
                break;
            case 4:
                System.out.println("Operacao de Divisão:");
                System.out.println(valor1+"/"+valor2+"="+divisao());
                System.out.println("-----------------");
                System.out.println("");
                break; 
            default:
                System.out.println("Operacao não realizada:");
                break;
        }
    }
}