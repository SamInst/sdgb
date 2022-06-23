package Domain;
public class Teacher {
    private String nome;
    private String specialty;
    private Seminar[] seminars;
    public Teacher(String white_beard, String pirate) {}
    public String getSpecialty() {return specialty;}
    public void setSpecialty(String specialty) {this.specialty = specialty;}
    public Seminar[] getSeminars() {return seminars;}
    public void setSeminars(Seminar[] seminars) {this.seminars = seminars;}
    public Teacher (String nome, Seminar[] seminars, String specialty){this.nome = nome; this.seminars = seminars; this.specialty = specialty;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public void print(){
        System.out.println("-------------------");
        System.out.println("Teacher: "+ this.nome);
        System.out.println("### Registered Seminars ###");
        for (Seminar seminar: this.seminars){
            System.out.println("### Address ###");
            System.out.println(seminar.getTitle());
            System.out.println(seminar.getPlace().getAddress());
            System.out.println("** Students **");
            for (Student student : seminar.getStudents()){
                System.out.println("Student: " + student.getNome());
                System.out.println("Age: " + student.getIdade());
                System.out.println("###-------------###");}}}}