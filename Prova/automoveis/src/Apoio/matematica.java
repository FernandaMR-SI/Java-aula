package Apoio;
public class matematica {
    //atributos da classe
    int resultado;
    
    //metodos da classe
    public void soma (int valor1, int valor2){
        resultado=valor1+valor2;
    }
    public void multiplica (int valor1, int valor2){
        resultado=valor1*valor2;
    }
    public void mostraResultado(){
        System.out.println("Resultado:" + resultado);
    }
}
