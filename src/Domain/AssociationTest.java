package Domain;
public class AssociationTest {
    public static void main(String[] args) {
        Place place = new Place("Street Pineapple");
        Student student = new Student("jhon", 13);
        Student student20 = new Student("jhon20", 14);
        Student student30 = new Student("jhon30", 15);
        Teacher teacher = new Teacher("White Beard","Pirate");
        Student student3 = new Student("Luffy", 17);
        Student[] StudentToSeminars= {student};
        Seminar seminar = new Seminar("Where find the one piece",StudentToSeminars, place);
        Seminar[]  avaiableSeminars = {seminar};
        teacher.setSeminars(avaiableSeminars);
        teacher.print();}}