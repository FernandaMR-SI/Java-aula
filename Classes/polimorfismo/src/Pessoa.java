/* 
public class Pessoa {
    private String nome;
    private String endereco;
    public String clube;

    public Pessoa(String nome, String endereco){
        this.nome=nome;
        this.endereco=endereco;
    }

    public void associaPessoaClube(String clube){
        System.out.println("Estou associando uma pessoa ao clube: "+ clube);
        this.clube=clube;
    }

    public int calculaIdadePessoa(int anoNascimento){
        return (2023 - anoNascimento);
    }
  
} */



public abstract class Pessoa {
    private String nome;
    private String endereco;
    public String clube;

    public Pessoa(String nome, String endereco){
        this.nome=nome;
        this.endereco=endereco;
    }

    public abstract void associaPessoaClube(String clube);

    public int calculaIdadePessoa(int anoNascimento){
        return (2023 - anoNascimento);
    }

    public abstract int calculaTempoAssociado(int anoAssociado);

    //public abstract int calculaIdadePessoa(int anoNascimento);
} 