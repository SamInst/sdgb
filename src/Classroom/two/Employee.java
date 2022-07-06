package Classroom.two;
public abstract class Employee {
    protected String name;
    protected double wage;

    public Employee(String name, double wage) {
        this.name = name;
        this.wage = wage;
        CalcBonus();
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", wage=" + wage +
                '}';
    }
    public void CalcBonus(){
        this.wage = wage + (wage * 0.1);
    }
}
