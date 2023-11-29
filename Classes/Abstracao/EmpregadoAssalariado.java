package Abstracao;

/**
 * EmpregadoAssalariado
 */
public class EmpregadoAssalariado extends Empregado{
    //atributos
    private double salarioSemanal;

    //construtor
    public EmpregadoAssalariado(String nome,String sobrenome,String documento,double salarioSemanal){
        super(nome,sobrenome,documento);
       setEmpregadoAssalariado(salarioSemanal);
    }

    //gets e sets
    public void setEmpregadoAssalariado(double salarioSemanal){
        this.salarioSemanal=salarioSemanal;
    }

    //outros metodos
    @Override
    public String toString(){
        return String.format("%s \n %s: %s",super.toString(),"Salario Semanal: ",salarioSemanal);

    }
    @Override
    public double salario(){
        return salarioSemanal;
    }
    
}