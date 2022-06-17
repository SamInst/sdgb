package Empresa;
public class Metodo1 {
    public static void main(String[] args) {
        Funcionario a = new Funcionario();
        a.setNome("Sam");
        a.setIdade(22);
        a.setSalarios(new double[]{1200, 987.35, 2000 });
        a.imprime();
        a.imprimeMedia();
        System.out.println("________________________________________");
     Funcionario b = new Funcionario();
        b.setNome("Samuelson");
        b.setIdade(20);
        b.setSalarios(new double[]{2200, 1987.35, 5000 });
        b.imprime();
        b.imprimeMedia();
        System.out.println("________________________________________");
    }
}
