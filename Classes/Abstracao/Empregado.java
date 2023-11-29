package Abstracao;

public abstract class Empregado {
    //atributos
    private String nome;
    private String sobrenome;
    private String documento;

    //construtor
    public Empregado(String nome,String sobrenome,String documento){
        setEmpregado(nome,sobrenome,documento);
    }

    //gets e sets
    public void setEmpregado(String nome,String sobrenome,String documento){
        this.documento=documento;
        this.nome=nome;
        this.sobrenome=sobrenome;
    }

    //outros metodos
    public String toString(){
        return String.format("\n %s: %s \n %s: %s \n %s: %s","Nome: ", nome,"Sobrenome: ",sobrenome,"Dcoumento: ",documento);

    }

    public abstract double salario();

}
