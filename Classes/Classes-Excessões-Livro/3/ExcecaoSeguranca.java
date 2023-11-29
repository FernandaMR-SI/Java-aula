package programacao_orientada_a_objetos.aula13;

public class ExcecaoSeguranca extends Exception{

    String mensagem;
    public ExcecaoSeguranca(String msg) {
        mensagem = msg;
    }
}
