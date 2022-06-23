package Company;


public class Employee {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        if (salarios == null){
            return;
        }
        System.out.println("Idade: " + this.idade);
        System.out.println("Nome: " + this.nome);
        System.out.println("Salarios: ");
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
    }

    public void imprimeMedia() {
        if (salarios == null){
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\n Média salarial: R$ " + (String.format("%.2f", media)));
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double[] getSalarios() {
        return salarios;
    }
    public double getMedia() {
        return media;
    }
}




