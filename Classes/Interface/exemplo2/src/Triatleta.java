/**
 * Triatleta
 */
public class Triatleta extends Pessoa implements Ciclista,Corredor,Nadador{
    public Triatleta(String nome){
        super(nome);
    }
    @Override
    public void correrdeBicicleta(){
        System.out.println(super.getNome()+" Está correndo de bicicleta");
    }

    public void correr(){
        System.out.println(this.getNome()+" Está correndo");
    }

    public void aquecer(){
        System.out.println(this.getNome()+" Está aquecendo");
    }

    public void nadar(){
        System.out.println(this.getNome()+" Está nadando");
    }
    
    
}