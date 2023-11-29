package Abstracao;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        EmpregadoComissionado p1=new EmpregadoComissionado("ana", "d","123", 12, 34);
        System.out.println(p1.toString());

        EmpregadoAssalariado p2=new EmpregadoAssalariado("joao", "d","123", 120);
        System.out.println(p2.toString());

        EmpregadoComissionadoAssalariado p3=new EmpregadoComissionadoAssalariado("poliana", "d","123",123,23,133);
        System.out.println(p3.toString());

        EmpregadoHorista p4=new EmpregadoHorista("antonio", "d","123", 50, 20);
        System.out.println(p4.toString());
    }
}