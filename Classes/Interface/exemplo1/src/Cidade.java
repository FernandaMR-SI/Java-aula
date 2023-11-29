public class Cidade {
    public void contrata(Professor p) {
        p.ensina();
        p.trabalha();
     }
     
     public void contrata(Empregado e) { e.trabalha();}
     
     public void cobraDe(Contribuinte c) { c.pagaIR();}
     public void registra(cidadao c)     { c.getRG();}
     public void alimenta(animal a)      { a.come();}
}
