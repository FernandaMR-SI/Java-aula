package Atividade9;

public class Cliente extends Pessoa{
    //parametros
    String login;
    String dataPrimeiraCompra;

    //construtor
    public Cliente(){
        super();
        this.login="";
        this.dataPrimeiraCompra="";
    }
    public Cliente(String nome, String RG,String CPF,String login,String dataDeNascimento,String email,String endereco,String dataPrimeiraCompra){
        super(nome, RG,CPF, dataDeNascimento,email,endereco);
        this.login=login;
        this.dataPrimeiraCompra=dataPrimeiraCompra;
    }

  
    // métodos
    public void imprimirCliente(){

        super.imprimirPessoa();
        System.out.println("Primeira Compra em: "+this.dataPrimeiraCompra);
        System.out.println("Login: "+this.login);
        System.out.println("---------------------");
    }


}
