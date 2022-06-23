package MoreTests;

public class PeopleTest {
    public static void main() {
        People people = new People();
        people.height = 1.83F;
        people.name = "Sam Helson";
        people.sex = 'M';
        people.weight = 78.3F;
        people.age = 22;
        System.out.println(people.name + "\n" + people.age + "\n" + people.sex + "\n" + people.height + "\n" + people.weight);
        System.out.println("-------------------------------------------------------------");
        People p1 = new People();
        p1.name = "sam2";
        p1.age = 22;
        p1.sex = 'M';
        p1.weight = 75.6F;
        p1.height = 1.83F;
        System.out.println(p1.name + "\n" + p1.age + "\n" + p1.sex + "\n" + p1.height + "\n" + p1.weight);
        System.out.println("-------------------------------------------------------------");
        People p2 = new People();
        p2.name = "sam3";
        p2.age = 24;
        p2.sex = 'F';
        p2.weight = 70.3F;
        p2.height = 1.53F;
        System.out.println(p2.name + "\n" + p2.age + "\n" + p2.sex + "\n" + p2.height + "\n" + p2.weight);
    }
    }
