package Domain;
public class Student {
    private String nome;
    private Seminar seminar;
    public Seminar getSeminar() {return seminar;}
    public void setSeminar(Seminar seminar) {this.seminar = seminar;}
    private int idade;
    public Student(String nome, int idade) {this.nome = nome;this.seminar = seminar;this.idade = idade;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}}