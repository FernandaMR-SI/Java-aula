package Atividade8;

public class Funcionario {
    int codigo, horas;
    double preco, salario;
    String CPF,nome,nis,RG;
    String dataDeNascimento, entradaEmpresa;
    String email,endereco;
    String escolaridade,cargo,contaBanco;

    public Funcionario(int codigo, int horas, double preco,String CPF, String nome,String nis,String RG, String dataDeNascimento, String entradaEmpresa,String email,String endereco,String escolaridade, String cargo,String contaBanco){
        this.codigo=codigo;
        this.horas=horas;
        this.preco=preco;
        this.salario=horas*preco;
        this.nome = nome;
        this.RG = RG;
        this.CPF=CPF;
        this.nis=nis;
        this.dataDeNascimento=dataDeNascimento;
        this.entradaEmpresa=entradaEmpresa;
        this.email=email;
        this.endereco=endereco;
        this.escolaridade=escolaridade;
        this.cargo=cargo;
        this.contaBanco=contaBanco;
    }

    
    
    public double getSalario(){
        return salario;
    }
    
    public void imprimiFuncionario(){
         System.out.println("-------------------------------------");
         System.out.println("Cliente com o nome: "+this.nome+" e com o RG: " + this.RG);
         System.out.println("CPF: "+this.CPF);
         System.out.println("Data de Nascimento: "+this.dataDeNascimento);
         System.out.printf("Funcionario: %d => VALOR A PAGAR: R$ %.2f%n", codigo, salario);
         System.out.println("Entrou na empresa: "+this.entradaEmpresa);
         System.out.println("Nis: "+this.nis);
         System.out.println("Escolaridade: "+this.escolaridade);
         System.out.println("Cargo: "+this.cargo);
         System.out.println("Conta Bancaria para Deposito: "+this.contaBanco);
         System.out.println("Email: "+this.email);
         System.out.println("Endereço: "+this.endereco);
    }
}
