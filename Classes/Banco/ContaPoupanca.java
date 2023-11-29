package Banco;

public class ContaPoupanca extends Conta{
    static int codPoupança=013;
    int tipoPoupanca;

    public ContaPoupanca ( String titular,int numeroConta, String agencia,double saldo,Data dataDeAbertura,int tipoPoupanca) {
        super(titular,numeroConta,agencia,saldo,dataDeAbertura);
        this.tipoPoupanca=tipoPoupanca;
    
    }
  
     public void gerarTaxa() {
       saldo += saldo * .006;
     }

    public void imprimiPoupanca(){
        System.out.println(dadosParaImpressao());
        System.out.println("Conta código:"+codPoupança+" => Tipo: "+tipoPoupanca);
        System.out.println("-----------------------------");
        System.out.println("");
    }
}
