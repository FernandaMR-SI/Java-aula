package Banco;

public class Conta {
    public String titular;
    public int numero;
    public String agencia;
    public double saldo;
    public Data dataDeAbertura;
    //public String dataDeAbertura;
    
    //construtores
    public Conta(){
        this.titular="";
        this.numero=0;
        this.agencia="0";
        this.saldo=0;
    }
    public Conta(String titular,int numero,String agencia,double saldo,Data dataDeAbertura){
        this.titular=titular;
        this.numero=numero;
        this.agencia=agencia;
        this.saldo=saldo;
        this.dataDeAbertura=dataDeAbertura;
    }
    //gets e sets


    //métodos
    public void saca(double valor){
        this.saldo -= valor;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public double calculaRendimento(){
        //double rendimento= (saldo*10)/100;
        double rendimento= saldo*0.1;
        this.saldo+=rendimento;
        return rendimento;

    }

    //impressão
    public String dadosParaImpressao(){
        String dados ="Titular: "+ this.titular; 
        dados +="\n Número: "+this.numero; 
        dados +="\nAgência: "+this.agencia; 
        dados +="\nSaldo: R$" +this.saldo; 
        //dados +="\nData de abertura: "+this.dataDeAbertura;
        dados +="\nData de abertura: "+this.dataDeAbertura.dia+"/"+this.dataDeAbertura.mes+"/"+this.dataDeAbertura.ano;

        return dados; 
    }
}
