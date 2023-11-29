package Atividade8;

public class Cliente {
     //parametros
     String CPF;
     String nome;
     String login;
     String email;
     String RG;
     String dataDeNascimento,dataPrimeiraCompra;
     String endereco;
 
     //construtor
     public Cliente(){
         this.nome = "";
         this.RG = "";
         this.CPF="";
         this.login="";
         this.email="";
         this.endereco="";
         this.dataPrimeiraCompra="";
         this.dataDeNascimento="";
     }
     public Cliente(String nome, String RG,String CPF,String login,String dataDeNascimento,String email,String endereco,String dataPrimeiraCompra){
         this.nome = nome;
         this.RG = RG;
         this.CPF=CPF;
         this.login=login;
         this.dataDeNascimento=dataDeNascimento;
         this.email=email;
         this.endereco=endereco;
         this.dataPrimeiraCompra=dataPrimeiraCompra;
     }
 
     //gets
     public String getNome(){
         return this.nome;
     }
     public String getRg(){
         return this.RG;
     }
     //sets
     public void setNome(String nome){
         this.nome = nome;
     }
     public void setRg(String RG){
         this.RG = RG;
     }
     // métodos
     public void imprimirCliente(){
         System.out.println("-------------------------------------");
         System.out.println("Cliente com o nome: "+this.nome+" e com o RG: " + this.RG);
         System.out.println("CPF: "+this.CPF);
         System.out.println("Data de Nascimento: "+this.dataDeNascimento);
         System.out.println("Primeira Compra em: "+this.dataPrimeiraCompra);
         System.out.println("Login: "+this.login);
         System.out.println("Email: "+this.email);
         System.out.println("Endereço: "+this.endereco);
     }
 
}
