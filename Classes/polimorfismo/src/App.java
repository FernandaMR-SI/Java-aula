public class App {
    public static void main(String[] args) throws Exception {
        //exemplo 1

        // Pessoa p1=new Pessoa("ana","muzambinho");
        // p1.associaPessoaClube("Ouro");
        // System.out.println(p1.calculaIdadePessoa(2010)+"anos de idade");
        // System.out.println("...................................."); 
        Pessoa p;
        p=new Funcionario("Wesley", "Passos");
        p.associaPessoaClube("Prata");
        System.out.println(p.calculaIdadePessoa(1980)+" anos de idade");
        System.out.println(p.calculaIdadePessoa(2005)+" anos de associação ao clube");
        System.out.println("....................................");
        
        Funcionario f=new Funcionario("Valderez","BH");
        f.associaPessoaClube("diamante");
        System.out.println(f.calculaIdadePessoa(1990)+" anos de idade");
        System.out.println(p.calculaIdadePessoa(2020)+" anos de associação ao clube");
        System.out.println("....................................");

    }
}
