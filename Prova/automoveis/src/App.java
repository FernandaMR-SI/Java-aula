public class App {
    public static void main(String[] args) throws Exception {
        //pneu
        pneu pneus=new pneu(12,"fire");

       // Crie o  objeto motoHonda  da classe carro

       moto motaHonda= new moto(12, "fiat", 2, pneus);

       //crie o objeto carrofiat
       carro carrofiat=new carro(120, "palio", 4, pneus);

       
       // imprima os atributos do objeto motoHonda
       motaHonda.imprimirmoto();

       //imprimia os atributis do objeto carroFiat
       carrofiat.imprimircarro();





    }
}
