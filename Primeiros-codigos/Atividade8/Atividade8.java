package Atividade8;
public class Atividade8 {
    public static void main(String[] args) {
        Funcionario funcionarios1 = new Funcionario(1, 40, 24, "122.222.222.22", "Maria", "1222", "11.111-12", "20/09/1968", "01/01/1990", "maria@gmail.com", "Rua A, nº 1, Bairro Centro,Cidade Muzambinho", "Graduação", "Desenvolvedor", "BancoX, 345.33");
        Funcionario funcionarios2= new Funcionario(2, 30, 24, "122.211.222.22", "João", "1223", "11.111-32", "20/09/1988", "01/01/2000", "joao@gmail.com", "Rua B, nº 1, Bairro Centro,Cidade Muzambinho", "Graduação", "Administrador", "BancoX, 325.33");
        
        Cliente cliente= new Cliente("Maria Rita", "22222", "322.211.222.22", "Maria.Rita", "20/09/2000", "mariarita@gmail.com", "Rua C, nº 1, Bairro Centro,Cidade Muzambinho", "03/05/2023");

        double despesaSalario=funcionarios1.getSalario()+funcionarios2.getSalario();
        System.out.println("--------------------------");
        System.out.println("Despesa com salario:" + despesaSalario);
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        funcionarios1.imprimiFuncionario();
        funcionarios2.imprimiFuncionario();
        System.out.println("--------------------------");
        cliente.imprimirCliente();
        System.out.println("--------------------------");


    }
}
