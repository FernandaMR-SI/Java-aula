package Abstracao;

public class EmpregadoComissionadoAssalariado extends EmpregadoComissionado{
    //atributos
    private double salarioMensal;

    //construtor
    public EmpregadoComissionadoAssalariado(String nome,String sobrenome,String documento,double vendas,double comissao,double salarioMensal){
        super(nome,sobrenome,documento,vendas,comissao);
       setSalarioMensal(salarioMensal);
    }

    //gets e sets
    public void setSalarioMensal(double salarioMensal){
        this.salarioMensal=salarioMensal;
    }

    public double getSalarioMensal(){
        return salarioMensal;
    }

    //outros metodos
    @Override
    public String toString(){
        return String.format("%s \n %s: %.2f",super.toString(),"Salario Mensal: ", salarioMensal);

    }
    @Override
    public double salario(){
        return getSalarioMensal()+super.salario();
    }
}
