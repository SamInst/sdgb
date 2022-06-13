package MaisTestes;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.height = 1.83F;
        pessoa.name = "Sam Helson";
        pessoa.sex = 'M';
        pessoa.weight = 78.3F;
        pessoa.age = 22;
        System.out.println(pessoa.name + "\n" + pessoa.age + "\n" + pessoa.sex + "\n" + pessoa.height + "\n" + pessoa.weight);
        System.out.println("-------------------------------------------------------------");
        Pessoa p1 = new Pessoa();
        p1.name = "sam2";
        p1.age = 22;
        p1.sex = 'M';
        p1.weight = 75.6F;
        p1.height = 1.83F;
        System.out.println(p1.name + "\n" + p1.age + "\n" + p1.sex + "\n" + p1.height + "\n" + p1.weight);
        System.out.println("-------------------------------------------------------------");
        Pessoa p2 = new Pessoa();
        p2.name = "sam3";
        p2.age = 24;
        p2.sex = 'F';
        p2.weight = 70.3F;
        p2.height = 1.53F;
        System.out.println(p2.name + "\n" + p2.age + "\n" + p2.sex + "\n" + p2.height + "\n" + p2.weight);


    }


}
