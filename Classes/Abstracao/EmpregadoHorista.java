package Abstracao;

public class EmpregadoHorista extends Empregado{
    //atributos
    private double valor;
    private double horas;

    //construtor
    public EmpregadoHorista(String nome,String sobrenome,String documento,double valor, double horas){
        super(nome,sobrenome,documento);
       setEmpregadoHorista(valor,horas);
    }

    //gets e sets
    public void setEmpregadoHorista(double valor, double horas){
        this.valor=valor;
        this.horas=horas;
    }

    //outros metodos
    @Override
    public String toString(){
        return String.format("%s \n %s: %.2f \n %s: %.2f",super.toString(),"Horas Trabalhadas: ",horas,"Valor por hora: ", valor);

    }
    @Override
    public double salario(){
        if (horas<=40){
            return valor*horas;
        }else{
            return 40*valor+(horas-40)*valor*1.5;
        }
    }
}
