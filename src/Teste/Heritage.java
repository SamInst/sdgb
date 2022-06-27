package Teste;
import TestToUp.Address;
import TestToUp.Employee;
import TestToUp.People;
public class Heritage {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Street Pineapple -");
        address.setCep("12345-67");
        People people = new People();
        people.setName("Hatsune Miku");
        people.setCpf(123456789);
        people.setAddress(address);
        people.print();

        Employee employee = new Employee();
        employee.setName("koko");
        employee.setCpf(123456789);
        employee.setAddress(address);
        employee.setWage(5000);
        System.out.println("-----------------");
        employee.print();
    }}
