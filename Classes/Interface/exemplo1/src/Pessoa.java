class Pessoa extends animal implements Professor, cidadao, Contribuinte {
     public void ensina() { System.out.println("pessoa ensina"); }
     public void vota() { System.out.println("pessoa vota"); }
     public int getRG(){ return 12345; }
     public void trabalha() {System.out.println("pessoa trabalha");}
     public boolean pagaIR() { return false; }
     public long getCPF() { return 1234567890; }
}