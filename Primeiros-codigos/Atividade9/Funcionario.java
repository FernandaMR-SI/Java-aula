package Atividade9;

public class Funcionario extends Pessoa{
    int codigo, horas;
    double preco, salario;
    String nis;
    String entradaEmpresa;
    String escolaridade,cargo,contaBanco;

    public Funcionario(int codigo, int horas, double preco,String CPF, String nome,String nis,String RG, String dataDeNascimento, String entradaEmpresa,String email,String endereco,String escolaridade, String cargo,String contaBanco){
        super(nome, RG,CPF, dataDeNascimento,email,endereco);
        this.codigo=codigo;
        this.horas=horas;
        this.preco=preco;
        this.salario=horas*preco;
        this.nis=nis;
        this.entradaEmpresa=entradaEmpresa;
        this.escolaridade=escolaridade;
        this.cargo=cargo;
        this.contaBanco=contaBanco;
    }

    
    
    public double getSalario(){
        return salario;
    }
    
    public void imprimiFuncionario(){
         System.out.println("-------------------------------------");
         super.imprimirPessoa();
         System.out.printf("Funcionario: %d => VALOR A PAGAR: R$ %.2f%n", codigo, salario);
         System.out.println("Entrou na empresa: "+this.entradaEmpresa);
         System.out.println("Nis: "+this.nis);
         System.out.println("Escolaridade: "+this.escolaridade);
         System.out.println("Cargo: "+this.cargo);
         System.out.println("Conta Bancaria para Deposito: "+this.contaBanco);
    }
}
