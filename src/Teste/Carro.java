package Teste;

public class Carro {
    private String nome;
    private double velMax;
    public static double velLim = 250;
    public void imprime(){
        System.out.println("___________________________");
        System.out.println("nome : "+this.nome);
        System.out.println("VelLim :"+this.velLim);
        System.out.println("VelMax : "+this.velMax);
    }

    public Carro (String nome, double velMax){
        this.nome = nome;
        this.velMax = velMax;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    public void setVelLim(double velLim) {
        this.velLim = velLim;
    }

    public double getVelLim() {
        return velLim;
    }

    public double getVelMax() {
        return velMax;
    }

    public String getNome() {
        return nome;
    }
}
