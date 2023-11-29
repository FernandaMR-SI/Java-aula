package Abstracao;

public class EmpregadoComissionado extends Empregado{
    //atributos
    private double vendas;
    private double comissao;

    //construtor
    public EmpregadoComissionado(String nome,String sobrenome,String documento,double vendas,double comissao){
        super(nome,sobrenome,documento);
       setEmpregadoComissionado(vendas,comissao);
    }

    //gets e sets
    public void setEmpregadoComissionado(double vendas,double comissao){
        this.vendas=vendas;
        this.comissao=comissao;
    }

    //outros metodos
    @Override
    public String toString(){
        return String.format("%s \n %s: %.2f \n %s: %.2f",super.toString(),"Número de Vendas: ",vendas,"Valor Comissão: ", comissao);

    }

    @Override
    public double salario(){
        return vendas*comissao;
    }
}
