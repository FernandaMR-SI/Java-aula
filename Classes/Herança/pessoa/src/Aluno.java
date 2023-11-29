public class Aluno extends Pessoa{
	private String ra,curso;
    private double mediaGlobal;

	//construtor
	public Aluno(String nome, String rg, String ra, String curso){
		super(nome,rg);
		this.ra = ra;
        this.curso=curso;
        this.mediaGlobal=0;
		}

	//gets
	public String getRa(){
		return this.ra;
	}
	public String getCurso(){
		return this.curso;
	}
	public double getMediaGlobal (){
		return this.mediaGlobal;
	}

	//sets
	public void setRa(String ra){
		this.ra = ra;
	}
	public void setCurso(String curso){
		this.ra = curso;
	}
    public void setMediaGlobal(double mediaGlobal){
		this.mediaGlobal = mediaGlobal;
	}
	public void imprimir(){
		super.imprimir();
		System.out.println("curso: "+this.curso+" e com o RG: " + this.rg);
    }

}
