package Banco;

public class ContaCorrente extends Conta{
    static int codCorrente=011;
    int tipoCorrente;

    public ContaCorrente ( String titular,int numeroConta, String agencia,double saldo,Data dataDeAbertura,int tipoCorrente) {
        super(titular,numeroConta,agencia,saldo,dataDeAbertura);
        this.tipoCorrente=tipoCorrente;
    
    }
  
    public void gerarTaxa() {
        saldo -= 15.90;
    }

    public void imprimiCorrente(){
        System.out.println(dadosParaImpressao());
        System.out.println("Conta código:"+codCorrente+" => Tipo: "+tipoCorrente);
        System.out.println("-----------------------------");
        System.out.println("");
    }
}
