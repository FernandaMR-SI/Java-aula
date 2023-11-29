package Primeira;
public class Funcionario {
    int codigo, horas;
    double preco, salario;

    public Funcionario(int codigo, int horas, double preco){
        this.codigo=codigo;
        this.horas=horas;
        this.preco=preco;
        this.salario=horas*preco;
    }

    public double getSalario(){
        return salario;
    }
    
    public void imprimi(){
        System.out.printf("Funcionario: %d => VALOR A PAGAR: R$ %.2f%n", codigo, salario);
    }
}
