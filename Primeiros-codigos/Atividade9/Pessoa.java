package Atividade9;

public class Pessoa {
    String CPF,nome,RG;
    String dataDeNascimento;
    String email,endereco;

	//construtor
    public Pessoa(){
        this.nome = "";
        this.RG = "";
		this.CPF="";
		this.dataDeNascimento="";
		this.email="";
		this.endereco="";
	}
	public Pessoa(String nome, String RG,String CPF, String dataDeNascimento,String email,String endereco){
		this.nome = nome;
        this.RG = RG;
		this.CPF=CPF;
		this.dataDeNascimento=dataDeNascimento;
		this.email=email;
		this.endereco=endereco;
	}

	//gets
	public String getNome(){
	    return this.nome;
	}
	public String getRg(){
		return this.RG;
	}
	//sets
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setRg(String RG){
		this.RG = RG;
	}
    // métodos
    public void imprimirPessoa(){
		System.out.println("-------------------------------------");
        System.out.println("Pessoa com o nome: "+this.nome+" e com o RG: " + this.RG);
		System.out.println("CPF: "+this.CPF);
		System.out.println("Data de Nascimento: "+this.dataDeNascimento);
		System.out.println("Email: "+this.email);
		System.out.println("Endereço: "+this.endereco);
    }
}
