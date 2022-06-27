package TestToUp;
public class People  { private String name; private int cpf; private Address address;
    public People() {this.name = name; this.cpf = cpf; this.address = address;}
    public void print(){
        System.out.println("Name: "+this.name);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Address: "+this.address.getStreet()+" "+this.address.getCep());
        System.out.println("");
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getCpf() {return cpf;}
    public void setCpf(int cpf) {this.cpf = cpf;}
    public Address getAddress() {return address;}
    public void setAddress(Address address) {this.address = address;}
}