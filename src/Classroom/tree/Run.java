package Classroom.tree;

import Classroom.two.Developer;
import Classroom.two.Employee;
import Classroom.two.Manager;

public class Run {
    public static void main(String[] args) {
        Manager mg = new Manager("nami", 2000);
        Developer dev = new Developer("sam",50000);
        System.out.println(mg);
        System.out.println(dev);


    }
}
