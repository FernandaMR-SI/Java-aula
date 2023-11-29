public class moto extends automovel {
    int quantpneus;
    pneu pneus;

    //construtor
    public moto(int velocidade,String modelos, int quantpneus,pneu pneus){
        super(velocidade,modelos);
        this.quantpneus=quantpneus;
        this.pneus=pneus;

    }

    //imprimir
    public void imprimirmoto(){
        imprimir();
        System.out.println("Pneus:"+ quantpneus);
        System.out.println("Pneu aro :"+ pneus.aro);
        System.out.println("Pneus modelo:"+ pneus.modelo);
    }

}
