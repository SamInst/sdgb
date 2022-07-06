package Classroom.two;

public class Developer extends Employee{
    public Developer(String name, double wage ) {
        super(name,wage);
    }

    @Override
    public void CalcBonus() {
        this.wage = this.wage + (this.wage*0.05);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", wage=" + wage +
                '}';
    }
}
