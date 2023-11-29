
public class Pessoa{
	public String nome, rg;

	//construtor
    public Pessoa(){
        this.nome = "";
        this.rg = "";
	}
	public Pessoa(String nome, String rg){
		this.nome = nome;
		this.rg = rg;
	}

	//gets
	public String getNome(){
	    return this.nome;
	}
	public String getRg(){
		return this.rg;
	}
	//sets
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setRg(String rg){
		this.rg = rg;
	}
    // métodos
    public void imprimir(){
        System.out.println("Pessoa com o nome: "+this.nome+" e com o RG: " + this.rg);
    }
}
