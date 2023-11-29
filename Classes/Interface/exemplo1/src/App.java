public class App {

     
   public static void main (String[] args) {
      Pessoa joao = new Pessoa();
      Cidade sp = new Cidade();
      sp.contrata(joao); // considera Professor
      sp.contrata((Empregado)joao); // Empregado
      sp.cobraDe(joao); // considera Contribuinte
      sp.registra(joao); // considera Cidadao
      sp.alimenta(joao); // considera Animal
   }
}