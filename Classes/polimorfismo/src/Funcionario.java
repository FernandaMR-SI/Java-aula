public class Funcionario extends Pessoa{

    //construtor
    public Funcionario (String nome, String endereco){
        super(nome,endereco);
    }

   @Override 
    public void associaPessoaClube(String clube){
        System.out.println("Estou associando um Funcionario ao clube: "+ clube);
        this.clube=clube;
    }

    @Override 
    public int calculaTempoAssociado(int anoAssociado){
        return (2023 - anoAssociado);
    }

    //  @Override
    // public int calculaIdadePessoa(int anoNascimento){
    //     return (2023 - anoNascimento);
    // } 

    
}
