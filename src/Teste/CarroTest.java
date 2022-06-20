package Teste;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Lambo", 320);
        Carro c3 = new Carro("Corsa", 500);
        System.out.println("troca");
        Carro[] carros = {c1,c2,c3};
        for (Carro cars: carros){
            cars.imprime();
            System.out.println("++++");
        }
        System.out.println();
        Carro.velLim = 250;

//        c1.imprime();
//        c2.imprime();
//        c3.imprime();

    }
}
