package Banco;
public class TesteBanco {
    public static void main(String[] args) {
        //objeto data
        Data dataDeAbertura= new Data(3, 4, 2022);
        //objeto conta 1
        Conta c1 = new Conta(); 
        c1.titular ="Maria";
        c1.numero = 1;
        c1.agencia ="45678-9";
        c1.saldo =50.0;
        c1.dataDeAbertura = dataDeAbertura; 
        c1.deposita(100.0); 
        
        System.out.println("-----------------------------");
        System.out.println("Nome:"+ c1.titular); 
        System.out.println("saldo atual:"+ c1.saldo); 
        System.out.println("rendimento mensal:"+ c1.calculaRendimento());
        System.out.println("-----------------------------");


        //objeto conta2
        Conta c2= new Conta("João", 2, "45678-9", 100, dataDeAbertura);
        c2.deposita(130);
        c2.calculaRendimento();
        c2.saca(25);
        System.out.println("-----------------------------");
        System.out.println(c2.dadosParaImpressao());
        System.out.println("-----------------------------");

        
        //Conta Poupança
        ContaPoupanca[] poupanca= new ContaPoupanca[2];
        poupanca[0]=new ContaPoupanca("Lucas", 2, "45678-9", 100, dataDeAbertura,1);
        poupanca[1]=new ContaPoupanca("Ana", 2, "45678-9", 200, dataDeAbertura,2);
        poupanca[0].gerarTaxa();
        poupanca[1].gerarTaxa();
        poupanca[0].imprimiPoupanca();
        poupanca[1].imprimiPoupanca();

        //Conta Corrente
        ContaCorrente[] corrente= new ContaCorrente[2];
        corrente[0]=new ContaCorrente("Pedro", 2, "45678-9", 100, dataDeAbertura,1);
        corrente[1]=new ContaCorrente("Luzia", 3, "45678-9", 200, dataDeAbertura,2);
        corrente[0].gerarTaxa();
        corrente[1].gerarTaxa();
        corrente[0].imprimiCorrente();
        corrente[1].imprimiCorrente();

    }
}
