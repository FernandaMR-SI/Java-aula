public class automovel {
    int velocidade;
    String modelos;

    public automovel(int velocidade,String modelos){
        this.velocidade=velocidade;
        this.modelos=modelos;
    }
    //imprimir
    public void imprimir(){
        System.out.println("Velocidade:"+ velocidade);
        System.out.println("Modelo"+ modelos);
    }
}
