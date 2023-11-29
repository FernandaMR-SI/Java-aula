public class carro extends automovel {
    int quantpneus;
    pneu pneus;

    //construtor
    public carro(int velocidade,String modelos, int quantpneus,pneu pneus){
        super(velocidade,modelos);
        this.quantpneus=quantpneus;
        this.pneus=pneus;

    }

    //imprimir
    public void imprimircarro(){
        imprimir();
        System.out.println("Pneus:"+ quantpneus);
        System.out.println("Pneu aro :"+ pneus.aro);
        System.out.println("Pneus modelo:"+ pneus.modelo);
    }

}
